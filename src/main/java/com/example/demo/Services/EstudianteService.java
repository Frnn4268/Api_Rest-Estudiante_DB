package com.example.demo.Services;

import java.util.List;

import com.example.demo.Entities.Estudiante;

public interface EstudianteService {
	
	public List<Estudiante> findAll();
	public Estudiante findById(Long id);
	public void createEstudiante(Estudiante estudiante);
	public void modifyEstudiante(Long id, Estudiante estudiante);
	public void deleteEstudiante(Long id);
	
}
