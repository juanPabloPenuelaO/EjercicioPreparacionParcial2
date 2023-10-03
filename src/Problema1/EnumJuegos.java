package Problema1;

public enum EnumJuegos {
    DEPORTIVO("Fifa", "dos jugadores controlan un equipo cada uno para jugar fútbol", 2006) {
        public void metergol() {
            System.out.println("El usuario ha marcado un gol");
        }
        public void ganarpartido(){
            System.out.println("el usuario ha ganado el partido");
        }
    },
    ESTRATEGIA("Clash royale", "juego dos jugadores donde tienen que ganar la partida tumbando las torres enemigas", 2014){
        public void tumbartorre(){
            System.out.println("El usuario ha conseguido una corona");
        }
        public void ganarpartida(){
            System.out.println("el usuario ha ganado la partida");
        }
    },
    MUSICAL("Guitar Hero", "un jugador sigue unas notas de colores de una guitarra que siguen el ritmo de una canción", 2005){
        public void nuevaGuitarra(){
            System.out.println("El usuario ha comprado una nueva guitarra");
        }
        public void pasaNivel(){
            System.out.println("el usuario ha avanzado de nivel");
        }
    },
    AVENTURA("Mario Bros", "eres Mario y tienes que seguir una historia de aventura para rescatar la princesa", 1985){
        public void morir(){
            System.out.println("Mario ha muerto");
        }
        public void vencerabowser(){
            System.out.println("Has vencido a Bowser");
        }
    },
    SIMULACION("Los Sims", "Simulas controlar personajes en una familia que trabajan, duermen, comen, cocinan, etc", 1990){
        public void crearPersonaje(){
            System.out.println("Has creado un personaje nuevo");
        }
        public void SubirNivel(){
            System.out.println("Has subido de nivel");
        }
    };

    private String nombreJuego;
    private String comoSeJuega;
    private int creacion;

    EnumJuegos(String nombreJuego, String comoSeJuega, int creacion) {
        this.nombreJuego = nombreJuego;
        this.comoSeJuega = comoSeJuega;
        this.creacion = creacion;
    }

    public String getNombreJuego() {
        return nombreJuego;
    }

    public void setNombreJuego(String nombreJuego) {
        this.nombreJuego = nombreJuego;
    }

    public String getComoSeJuega() {
        return comoSeJuega;
    }

    public void setComoSeJuega(String comoSeJuega) {
        this.comoSeJuega = comoSeJuega;
    }

    public int getCreacion() {
        return creacion;
    }

    public void setCreacion(int creacion) {
        this.creacion = creacion;
    }
}
