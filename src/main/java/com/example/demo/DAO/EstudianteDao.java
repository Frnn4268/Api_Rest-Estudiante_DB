package com.example.demo.DAO;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.Entities.Estudiante;

public interface EstudianteDao extends CrudRepository<Estudiante, Long>{

}
