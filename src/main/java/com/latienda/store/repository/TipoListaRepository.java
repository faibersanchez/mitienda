package com.latienda.store.repository;

import com.latienda.store.domain.TipoLista;

import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data  repository for the TipoLista entity.
 */
@SuppressWarnings("unused")
@Repository
public interface TipoListaRepository extends JpaRepository<TipoLista, Long>, JpaSpecificationExecutor<TipoLista> {

}
