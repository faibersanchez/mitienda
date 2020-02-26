package com.latienda.store.service;

import com.latienda.store.domain.Sucursal;
import com.latienda.store.repository.SucursalRepository;
import com.latienda.store.service.dto.SucursalDTO;
import com.latienda.store.service.mapper.SucursalMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

/**
 * Service Implementation for managing {@link Sucursal}.
 */
@Service
@Transactional
public class SucursalService {

    private final Logger log = LoggerFactory.getLogger(SucursalService.class);

    private final SucursalRepository sucursalRepository;

    private final SucursalMapper sucursalMapper;

    public SucursalService(SucursalRepository sucursalRepository, SucursalMapper sucursalMapper) {
        this.sucursalRepository = sucursalRepository;
        this.sucursalMapper = sucursalMapper;
    }

    /**
     * Save a sucursal.
     *
     * @param sucursalDTO the entity to save.
     * @return the persisted entity.
     */
    public SucursalDTO save(SucursalDTO sucursalDTO) {
        log.debug("Request to save Sucursal : {}", sucursalDTO);
        Sucursal sucursal = sucursalMapper.toEntity(sucursalDTO);
        sucursal = sucursalRepository.save(sucursal);
        return sucursalMapper.toDto(sucursal);
    }

    /**
     * Get all the sucursals.
     *
     * @param pageable the pagination information.
     * @return the list of entities.
     */
    @Transactional(readOnly = true)
    public Page<SucursalDTO> findAll(Pageable pageable) {
        log.debug("Request to get all Sucursals");
        return sucursalRepository.findAll(pageable)
            .map(sucursalMapper::toDto);
    }

    /**
     * Get one sucursal by id.
     *
     * @param id the id of the entity.
     * @return the entity.
     */
    @Transactional(readOnly = true)
    public Optional<SucursalDTO> findOne(Long id) {
        log.debug("Request to get Sucursal : {}", id);
        return sucursalRepository.findById(id)
            .map(sucursalMapper::toDto);
    }

    /**
     * Delete the sucursal by id.
     *
     * @param id the id of the entity.
     */
    public void delete(Long id) {
        log.debug("Request to delete Sucursal : {}", id);
        sucursalRepository.deleteById(id);
    }
}
