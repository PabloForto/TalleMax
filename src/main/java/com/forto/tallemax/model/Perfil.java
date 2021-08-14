package com.forto.tallemax.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "perfil")
public class Perfil {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idPerfil")
	private Long idPerfil;
	private String perfil;
	
	/**
	 * @return the idPerfil
	 */
	public Long getIdPerfil() {
		return idPerfil;
	}
	/**
	 * @param idPerfil the idPerfil to set
	 */
	public void setIdPerfil(Long idPerfil) {
		this.idPerfil = idPerfil;
	}
	/**
	 * @return the perfil
	 */
	public String getPerfil() {
		return perfil;
	}
	/**
	 * @param perfil the perfil to set
	 */
	public void setPerfil(String perfil) {
		this.perfil = perfil;
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idPerfil == null) ? 0 : idPerfil.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Perfil other = (Perfil) obj;
		if (idPerfil == null) {
			if (other.idPerfil != null)
				return false;
		} else if (!idPerfil.equals(other.idPerfil))
			return false;
		return true;
	}
	
	
	

}
