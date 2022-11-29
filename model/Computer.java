package com.inventory.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Computer")
public class Computer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	String marca;
	String modelo;
	String serial;
	String procesador;
	String ram;
	String almacenamiento;
	String nombre;
	String responsable;
	String dependencia;
	
	
	public Computer(int id, String marca, String modelo, String serial, String procesador, String ram,
	
	String almacenamiento, String nombre, String responsable, String dependencia) {
		super();
		this.id = id;
		this.marca = marca;
		this.modelo = modelo;
		this.serial = serial;
		this.procesador = procesador;
		this.ram = ram;
		this.almacenamiento = almacenamiento;
		this.nombre = nombre;
		this.responsable = responsable;
		this.dependencia = dependencia;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
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


	public String getSerial() {
		return serial;
	}


	public void setSerial(String serial) {
		this.serial = serial;
	}


	public String getProcesador() {
		return procesador;
	}


	public void setProcesador(String procesador) {
		this.procesador = procesador;
	}


	public String getRam() {
		return ram;
	}


	public void setRam(String ram) {
		this.ram = ram;
	}


	public String getAlmacenamiento() {
		return almacenamiento;
	}


	public void setAlmacenamiento(String almacenamiento) {
		this.almacenamiento = almacenamiento;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getResponsable() {
		return responsable;
	}


	public void setResponsable(String responsable) {
		this.responsable = responsable;
	}


	public String getDependencia() {
		return dependencia;
	}


	public void setDependencia(String dependencia) {
		this.dependencia = dependencia;
	}
	
	
	
}
