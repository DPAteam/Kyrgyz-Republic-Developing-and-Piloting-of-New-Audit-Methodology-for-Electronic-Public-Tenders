package com.datapath.kg.loader.dao.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class TenderDAOService {

    @Autowired
    private JdbcTemplate template;

    private static final String UPDATE_BAD_QUALITY_QUERY = "update tender set bad_quality = true where id = ?";

    public void markAsBadQuality(Integer id) {
        template.update(UPDATE_BAD_QUALITY_QUERY, id);
    }
}
