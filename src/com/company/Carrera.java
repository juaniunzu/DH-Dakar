package com.company;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.HashMap;
import java.util.Map;

public class Carrera {

  private Integer distancia;
  private Double premioEnDolares;
  private String nombre;
  private Integer cantidadVehiculosPermitidos;
  private Map<String, Vehiculo> listaDeVehiculos;
  private SocorristaAuto socorristaAuto;
  private SocorristaMoto socorristaMoto;

  public Carrera(Integer distancia, Double premioEnDolares, String nombre, Integer cantidadVehiculosPermitidos, SocorristaAuto socorristaAuto, SocorristaMoto socorristaMoto) {
    this.distancia = distancia;
    this.premioEnDolares = premioEnDolares;
    this.nombre = nombre;
    this.cantidadVehiculosPermitidos = cantidadVehiculosPermitidos;
    this.listaDeVehiculos = new HashMap<String, Vehiculo>();
    this.socorristaAuto = socorristaAuto;
    this.socorristaMoto = socorristaMoto;
  }

  private Boolean hayCupo(){
    return(this.listaDeVehiculos.size() < this.cantidadVehiculosPermitidos);
  }

  public void darDeAltaAuto(Double velocidad, Double aceleracion, Double anguloDeGiro, String patente){

    if(hayCupo()){
      //si hay cupo, crea el auto y lo agrega con par de valores patente/vehiculo
      Auto autoNuevo = new Auto(velocidad, aceleracion, anguloDeGiro, patente);
      this.listaDeVehiculos.put(patente, autoNuevo);
      System.out.println("Se agrega el auto patente " + autoNuevo.getPatente() + " a la carrera.");
    } else System.out.println("La carrera está completa, no se pueden agregar más vehículos");

  }

  public void darDeAltaMoto(Double velocidad, Double aceleracion, Double anguloDeGiro, String patente){

    if(hayCupo()){
      //crea la moto y la agrega con par de valores patente/vehiculo
      Moto motoNueva = new Moto(velocidad, aceleracion, anguloDeGiro, patente);
      this.listaDeVehiculos.put(patente, motoNueva);
      System.out.println("Se agrega la moto patente " + motoNueva.getPatente() + " a la carrera.");
    } else System.out.println("La carrera está completa, no se pueden agregar más vehículos");


  }

  public void eliminarVehiculo(Vehiculo unVehiculo){
    this.listaDeVehiculos.remove(unVehiculo);
    System.out.println("Se ha eliminado de la carrera el vehículo patente " + unVehiculo.getPatente());
  }

  public void eliminarVehiculoConPatente(String unaPatente){
    try{
      Vehiculo vehiculoAEliminar = this.listaDeVehiculos.get(unaPatente);
      eliminarVehiculo(vehiculoAEliminar);
    } catch (NullPointerException e){
      System.out.println("La patente ingresada es incorrecta");
    }

  }

  public Vehiculo definirGanador(){
    Double valorGanador = 0.0;
    String patenteVehiculoGanador = "";

    for (String s : listaDeVehiculos.keySet()) {
      Vehiculo vehiculo = this.listaDeVehiculos.get(s);
      Double valorParcial = vehiculo.getVelocidad() * 1/2 *
              vehiculo.getAceleracion() / (vehiculo.getAnguloDeGiro() * (vehiculo.peso - vehiculo.getRuedas() * 100));
      if(valorParcial > valorGanador){
        valorGanador = valorParcial;
        patenteVehiculoGanador = vehiculo.getPatente();
      }
    }
    System.out.println("El ganador es el vehículo " + patenteVehiculoGanador);
    return this.listaDeVehiculos.get(patenteVehiculoGanador);
  }

  public void socorrerAuto(String patente){
    Auto autoASocorrer = (Auto) this.listaDeVehiculos.get(patente);
    this.socorristaAuto.socorrer(autoASocorrer);
  }

  public void socorrerMoto(String patente){
    Moto motoASocorrer = (Moto) this.listaDeVehiculos.get(patente);
    this.socorristaMoto.socorrer(motoASocorrer);
  }

  public Map<String, Vehiculo> getListaDeVehiculos() {
    return listaDeVehiculos;
  }
}
