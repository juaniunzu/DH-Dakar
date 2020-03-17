package com.company;

public abstract class Vehiculo {

  private Integer velocidad;
  private Integer aceleracion;
  private Integer anguloDeGiro;
  private String patente;
  protected Integer peso;
  protected Integer ruedas;

  public Vehiculo(Integer velocidad, Integer aceleracion, Integer anguloDeGiro, String patente) {
    this.velocidad = velocidad;
    this.aceleracion = aceleracion;
    this.anguloDeGiro = anguloDeGiro;
    this.patente = patente;
  }

  public Integer getVelocidad() {
    return velocidad;
  }

  public Integer getAceleracion() {
    return aceleracion;
  }

  public Integer getAnguloDeGiro() {
    return anguloDeGiro;
  }

  public String getPatente() {
    return patente;
  }

  public Integer getPeso() {
    return peso;
  }

  public Integer getRuedas() {
    return ruedas;
  }
}
