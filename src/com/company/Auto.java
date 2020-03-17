package com.company;

public class Auto extends Vehiculo implements Socorrible {

  public Auto(Integer velocidad, Integer aceleracion, Integer anguloDeGiro, String patente) {
    super(velocidad, aceleracion, anguloDeGiro, patente);
    this.peso = 1000;
    this.ruedas = 4;
  }

  @Override
  public void socorrer() {
    //todo
  }
}
