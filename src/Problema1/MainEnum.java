package Problema1;

public class MainEnum {
        public static void main(String[] args) {
            for (EnumJuegos juego : EnumJuegos.values()) {
                System.out.println("Nombre del juego: " + juego.getNombreJuego());
                System.out.println("Cómo se juega: " + juego.getComoSeJuega());
                System.out.println("Año de creación: " + juego.getCreacion());
                System.out.println("Acciones específicas del juego:");
                if (juego == EnumJuegos.DEPORTIVO) {
                    juego.metergol();
                    juego.ganarpartido();
                } else if (juego == EnumJuegos.ESTRATEGIA) {
                    juego.tumbartorre();
                    juego.ganarpartida();
                } else if (juego == EnumJuegos.MUSICAL) {
                    juego.nuevaGuitarra();
                    juego.pasaNivel();
                } else if (juego == EnumJuegos.AVENTURA) {
                    juego.morir();
                    juego.vencerabowser();
                } else if (juego == EnumJuegos.SIMULACION) {
                    juego.crearPersonaje();
                    juego.SubirNivel();
                }
                System.out.println("--------------------");
            }
        }
    }