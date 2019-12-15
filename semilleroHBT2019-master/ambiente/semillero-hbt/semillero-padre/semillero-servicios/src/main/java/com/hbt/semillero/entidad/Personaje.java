/**
 * Comic.java
 */
package com.hbt.semillero.entidad;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * <b>Descripción:<b> Clase que determina la entidad que permite representar la
 * tabla "DB_SEMILLERO"."COMIC"
 * 
 * @author Yohan Narvaez 2019
 * @version
 */
@Entity
@Table(name = "PERSONAJE")
public class Personaje implements Serializable {

	/**
	 * Serializar es pasar un Objeto a un array de bytes y viceversa. Atributo que
	 * determina serialVersionUID es el id único que identifica una clase cuando lo
	 * serializamos. ;ediante este id podemos identificar el objeto convertido en un
	 * array de bytes.
	 */
	
	private static final long serialVersionUID = 1L;
	
	
	@Id
	@SequenceGenerator(allocationSize = 1, name = "PERSONAJE_ID_GENERATOR", sequenceName = "SEQ_PERSONAJE")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PERSONAJE_ID_GENERATOR")
	@Column(name = "PERS_ID")	
	private long id;
	
	@Column (name = "PERS_NOMBRE")
	private String nombre;
	
	@ManyToOne (fetch = FetchType.LAZY)
	@JoinColumn(name = "PERS_ID_COMIC")	
	private Comic comic;
	
	@Column(name = "PERS_ESTADO")
	@Enumerated(value = EnumType.STRING)
	private EstadoEnum estado;
	
	@Column (name = "PERS_SUPERPODER")
	private String superPoder;
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Comic getComic() {
		return comic;
	}
	public void setComic(Comic comic) {
		this.comic = comic;
	}
	public EstadoEnum getEstado() {
		return estado;
	}
	public void setEstado(EstadoEnum estado) {
		this.estado = estado;
	}
	public String getSuperPoder() {
		return superPoder;
	}
	public void setSuperPoder(String superPoder) {
		this.superPoder = superPoder;
	}
	
	
	
}
