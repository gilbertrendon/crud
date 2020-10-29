package com.car.crud.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class Car {
	@Id
	private int id;
	private String img;
	private double valor;
	private double aumento;
	private String finsercion;
	private boolean habilitado; 
	
	
	public Car(){
	}
	
	public Car(int id, String img, double valor, double aumento, String finsercion, boolean habilitado){
		super();
		this.id = id;
		this.img = img;
		this.valor = valor;
		this.aumento = aumento;
		this.finsercion = finsercion;
		this.habilitado = habilitado;
	}
	
	
	public boolean isHabilitado() {
		return habilitado;
	}

	public void setHabilitado(boolean habilitado) {
		this.habilitado = habilitado;
	}

	public String getFinsercion() {
		return finsercion;
	}

	public void setFinsercion(String finsercion) {
		this.finsercion = finsercion;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public double getAumento() {
		return aumento;
	}
	public void setAumento(double aumento) {
		this.aumento = aumento;
	}
	
	

}
