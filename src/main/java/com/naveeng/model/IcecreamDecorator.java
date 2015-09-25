package com.naveeng.model;

abstract class IcecreamDecorator implements Icecream {

  protected Icecream flavoredIcecream;

  public IcecreamDecorator(Icecream flavoredIcecream) {
    this.flavoredIcecream = flavoredIcecream;
  }

  public String makeIcecream() {
    return flavoredIcecream.makeIcecream();
  }
}
