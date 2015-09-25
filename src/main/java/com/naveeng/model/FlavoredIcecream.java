package com.naveeng.model;


public class FlavoredIcecream extends IcecreamDecorator {

  private String flavorType = "Plain IceCream";
  private double price = 0.0; // price per scoop
  private int quantity = 0; // number of scoops in stock
  
  public FlavoredIcecream(Icecream icecream) {
    super(icecream);
  }

  public String makeIcecream() {
    return flavoredIcecream.makeIcecream() + this.flavorType;
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