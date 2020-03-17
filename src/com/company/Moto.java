package com.company;

public class Moto extends Vehiculo implements Socorrible {

  public Moto(Integer velocidad, Integer aceleracion, Integer anguloDeGiro, String patente) {
    super(velocidad, aceleracion, anguloDeGiro, patente);
    this.peso = 300;
    this.ruedas = 2;
  }

  @Override
  public void socorrer() {
    //todo
  }
}
