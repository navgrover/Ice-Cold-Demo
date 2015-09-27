package com.naveeng.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@Entity
@Table(name = "icecream")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class IceCream implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	@Column(name = "id")
	private long id;

	@Column(name = "flavor_type")
	private String flavorType = null;

	@Column(name = "price")
	private double price = 0.0; // price per scoop

	@Column(name = "quantity")
	private int quantity = 0; // number of scoops in stock

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setFlavorType(String flavor) {
		this.flavorType = flavor;
	}

	public String getFlavorType() {
		return this.flavorType;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getPrice() {
		return this.price;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getQuantity() {
		return this.quantity;
	}

}