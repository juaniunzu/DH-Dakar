package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Carrera {

  private Integer distancia;
  private Double premioEnDolares;
  private String nombre;
  private Integer cantidadVehiculosPermitidos;
  private Map<String, Vehiculo> listaDeVehiculos;

  public Carrera(Integer distancia, Double premioEnDolares, String nombre, Integer cantidadVehiculosPermitidos) {
    this.distancia = distancia;
    this.premioEnDolares = premioEnDolares;
    this.nombre = nombre;
    this.cantidadVehiculosPermitidos = cantidadVehiculosPermitidos;
    this.listaDeVehiculos = new HashMap<String, Vehiculo>();
  }

  public void darDeAltaAuto(Integer velocidad, Integer aceleracion, Integer anguloDeGiro, String patente){
    //todo
    //crea el auto y lo agrega con par de valores patente/vehiculo
  }

  public void darDeAltaMoto(Integer velocidad, Integer aceleracion, Integer anguloDeGiro, String patente){
    //todo
    //crea la moto y la agrega con par de valores patente/vehiculo
  }

  public void eliminarVehiculo(Vehiculo unVehiculo){
    //todo
  }

  public void eliminarVehiculoConPatente(String unaPatente){
    //todo
  }

  public Vehiculo definirGanador(){
    //todo
  }

  public void socorrerAuto(String patente){
    //todo
  }

  public void socorrerMoto(String patente){
    //todo
  }


}
