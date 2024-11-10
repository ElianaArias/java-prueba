package com.coderhouse.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coderhouse.models.Curso;
import com.coderhouse.repositories.CursoRepository;

import jakarta.transaction.Transactional;

@Service
public class CursoService {
	
	@Autowired
	private CursoRepository cursoRepository;
	
	//metodo para listar todos los cursos
	public List<Curso> getAllCursos(){
		return cursoRepository.findAll();	
		}
	
	//metodo listar por id
	public Curso getCursoById(Long id) {
		return cursoRepository.findById(id)
				.orElseThrow(() -> new IllegalArgumentException("Curso no encontrado"));
	}
	
	//crear curso
	@Transactional
	public Curso createCurso(Curso curso) {
		return cursoRepository.save(curso);
	}
	
	@Transactional
	public Curso saveCurso(Curso curso) {
		return cursoRepository.save(curso);
		
	}
	
	//metodo para modificar curso
	@Transactional //hago una instancia, lo busco, si no lo encuentra me tira la excepcioin, si lo encuentra en funcion de los detalles que le pasé(en mi caso el nombre), tomo el nombre ewnviado por parametro y se lo seteo al curso details-
	public Curso updateCurso(Long id, Curso cursoDetails) {
		Curso curso = cursoRepository.findById(id)
				.orElseThrow(() -> new IllegalArgumentException("Curso no encontrado"));	
		curso.setNombre(cursoDetails.getNombre());//solo puedo setear el nombre
		return cursoRepository.save(curso);
		
	}
	
	//metodo para borrar curso
	public void deleteCurso(Long id) {
		if (cursoRepository.existsById(id)) {
			cursoRepository.deleteById(id);
		} else {
		throw new IllegalArgumentException("Curso no encontrado");
		}
	}
	

}
