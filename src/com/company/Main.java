package com.company;

public class Main {

    public static void main(String[] args) {

        //creo socorristas para dps agregarlos a la carrera
        SocorristaAuto unSocorristaDeAutos = new SocorristaAuto("pepe");
        SocorristaMoto unSocorristaDeMotos = new SocorristaMoto("pepo");

        //creo una carrera
        Carrera indianapolis = new Carrera(500, 1000000.0, "500 millas de Indianapolis", 5, unSocorristaDeAutos, unSocorristaDeMotos);

        //le agrego vehiculos a competir
        indianapolis.darDeAltaAuto(100.0, 10.0, 25.0, "kjj008");
        indianapolis.darDeAltaAuto(120.0, 12.0, 30.0, "rli092");
        indianapolis.darDeAltaAuto(130.0, 15.0, 20.0, "lqr241");
        indianapolis.darDeAltaMoto(150.0, 20.0, 15.0, "moto101");
        indianapolis.darDeAltaMoto(135.0, 15.0, 12.0, "moto102");
        indianapolis.darDeAltaAuto(120.0, 11.0, 24.0, "asd123");
        indianapolis.darDeAltaAuto(120.0, 11.0, 24.0, "qwe321");

        //defino ganador
        indianapolis.definirGanador();

        //socorro dos vehiculos
        indianapolis.socorrerAuto("kjj008");
        indianapolis.socorrerMoto("moto102");

        //elimino un vehiculo
        indianapolis.eliminarVehiculoConPatente("rli092");




    }
}
