package com.latienda.store.repository;

import com.latienda.store.domain.Sucursal;

import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data  repository for the Sucursal entity.
 */
@SuppressWarnings("unused")
@Repository
public interface SucursalRepository extends JpaRepository<Sucursal, Long>, JpaSpecificationExecutor<Sucursal> {

}
