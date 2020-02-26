package com.latienda.store.service.mapper;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class SucursalMapperTest {

    private SucursalMapper sucursalMapper;

    @BeforeEach
    public void setUp() {
        sucursalMapper = new SucursalMapperImpl();
    }

    @Test
    public void testEntityFromId() {
        Long id = 1L;
        assertThat(sucursalMapper.fromId(id).getId()).isEqualTo(id);
        assertThat(sucursalMapper.fromId(null)).isNull();
    }
}
