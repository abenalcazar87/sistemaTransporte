/**
 * 
 */
package com.transporte.app.models.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @author abenalcazar
 *
 */
@Entity
@Table(name = "vehiculo")
public class Vehiculo implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id_vehiculo;
	
	private String marca;	
	private String modelo;
	private String anio;
	private Double capacidadTanque;// litros
	private Double capacidadCarga; // kilogramos
	private Integer numPasajeros;
	
	@ManyToOne
	@JoinColumn(name = "id_tipo")
	private TipoVehiculo tipo;

	public Long getId_vehiculo() {
		return id_vehiculo;
	}

	public void setId_vehiculo(Long id_vehiculo) {
		this.id_vehiculo = id_vehiculo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getAnio() {
		return anio;
	}

	public void setAnio(String anio) {
		this.anio = anio;
	}

	public Double getCapacidadTanque() {
		return capacidadTanque;
	}

	public void setCapacidadTanque(Double capacidadTanque) {
		this.capacidadTanque = capacidadTanque;
	}

	public Double getCapacidadCarga() {
		return capacidadCarga;
	}

	public void setCapacidadCarga(Double capacidadCarga) {
		this.capacidadCarga = capacidadCarga;
	}

	public Integer getNumPasajeros() {
		return numPasajeros;
	}

	public void setNumPasajeros(Integer numPasajeros) {
		this.numPasajeros = numPasajeros;
	}

	public TipoVehiculo getTipo() {
		return tipo;
	}

	public void setTipo(TipoVehiculo tipo) {
		this.tipo = tipo;
	}


}
