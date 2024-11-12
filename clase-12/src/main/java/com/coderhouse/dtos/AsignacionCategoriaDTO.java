package com.coderhouse.dtos;

public class AsignacionCategoriaDTO {

	//recibe cursoid y categoriaid
	private Long categoriaId;
	private Long cursoId;
	
	//hago getters y setters
	public Long getCategoriaId() {
		return categoriaId;
	}
	public void setCategoriaId(Long categoriaId) {
		this.categoriaId = categoriaId;
	}
	public Long getCursoId() {
		return cursoId;
	}
	public void setCursoId(Long cursoId) {
		this.cursoId = cursoId;
	}
	
	
}
