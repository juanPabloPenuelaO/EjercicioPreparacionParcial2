package Problema1;

public class MainEnum {
    public static void main(String[] args) {
        EnumJuegos juegoDeportivo = EnumJuegos.DEPORTIVO;

        EnumJuegos juegoEstrategia = EnumJuegos.ESTRATEGIA;

        EnumJuegos juegoMusical = EnumJuegos.MUSICAL;

        EnumJuegos juegoAventura = EnumJuegos.AVENTURA;

        EnumJuegos juegoSimulacion = EnumJuegos.SIMULACION;

        juegoDeportivo.metergol();
        juegoDeportivo.ganarpartido();

        juegoEstrategia.tumbartorre();
        juegoEstrategia.ganarpartida();

        juegoMusical.nuevaGuitarra();
        juegoMusical.pasaNivel();

        juegoAventura.morir();
        juegoAventura.vencerabowser();

        juegoSimulacion.crearPersonaje();
        juegoSimulacion.SubirNivel();

    }
}
