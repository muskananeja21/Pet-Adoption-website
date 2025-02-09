package com.example.demo;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class PetAdoptionDAO {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Pet> getAllPets() {
        String sql = "SELECT * FROM pet";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Pet.class));
    }

    // Other methods (e.g., getPetById, addPet) can be added as needed.
}
