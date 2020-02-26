package com.latienda.store.repository;

import com.latienda.store.domain.ElementoLista;

import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data  repository for the ElementoLista entity.
 */
@SuppressWarnings("unused")
@Repository
public interface ElementoListaRepository extends JpaRepository<ElementoLista, Long>, JpaSpecificationExecutor<ElementoLista> {

}
