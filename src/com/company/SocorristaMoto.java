package com.company;

public class SocorristaMoto {

  private String nombre;

  public SocorristaMoto(String nombre) {
    this.nombre = nombre;
  }

  public void socorrer(Moto unaMoto){
    unaMoto.socorrer();
  }
}
