package com.latienda.store.repository;

import com.latienda.store.domain.ProductoCategoria;

import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data  repository for the ProductoCategoria entity.
 */
@SuppressWarnings("unused")
@Repository
public interface ProductoCategoriaRepository extends JpaRepository<ProductoCategoria, Long>, JpaSpecificationExecutor<ProductoCategoria> {

}
