package com.company;

public class SocorristaAuto {

  private String nombre;

  public SocorristaAuto(String nombre) {
    this.nombre = nombre;
  }

  public void socorrer(Auto unAuto){
    unAuto.socorrer();
  }

  public String getNombre() {
    return nombre;
  }
}
