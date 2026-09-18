package proyecto;

public abstract class jugador {

    private int id;
    private String nombre;
    private int edad;
    private int ovr;
    private double precio;
    private int resistencia;
    private String equipo;
    private int dorsal;
    private String posicion;
    private int velocidad;
    private int remate;
    private int fuerza;
    private int pase;
    private int regate;
    private int centros;
    private int marcaje;
    private int definicion;
    private int control;
    private int entradas;

    public jugador() {
    }

    public jugador(String nombre, int edad, int ovr, double precio,int resistencia, String equipo, int dorsal,String posicion, int velocidad, int remate,
                   int fuerza, int pase, int regate, int centros,int marcaje, int definicion, int control, int entradas) {

        this.nombre = nombre;
        this.edad = edad;
        this.ovr = ovr;
        this.precio = precio;
        this.resistencia = resistencia;
        this.equipo = equipo;
        this.dorsal = dorsal;
        this.posicion = posicion;
        this.velocidad = velocidad;
        this.remate = remate;
        this.fuerza = fuerza;
        this.pase = pase;
        this.regate = regate;
        this.centros = centros;
        this.marcaje = marcaje;
        this.definicion = definicion;
        this.control = control;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
   public String getNombre() {
        return nombre;
    }
    public int getEdad() {
        return edad;
    }
    public int getOvr() {
        return ovr;
    }
    public double getPrecio() {
        return precio;
    }
    public int getResistencia() {
        return resistencia;
    }
    public String getEquipo() {
        return equipo;
    }
    public int getDorsal() {
        return dorsal;
    }
    public String getPosicion() {
        return posicion;
    }
    public int getVelocidad() {
        return velocidad;
    }
    public int getRemate() {
        return remate;
    }
    public int getFuerza() {
        return fuerza;
    }
    public int getPase() {
        return pase;
    }
    public int getRegate() {
        return regate;
    }
    public int getCentros() {
        return centros;
    }
    public int getMarcaje() {
        return marcaje;
    }
    public int getDefinicion() {
        return definicion;
    }
    public int getControl() {
        return control;
    }
    public int getEntradas() {
        return entradas;
}
}
