public class Pasajero {
    /*
   Complejidad constante
    */
    private String nombre;
    private int numeroPasaporte;
    private int edad;
    private String preferenciAlimentaria;
    /*
       Complejidad constante
        */
    public Pasajero ( String nombre,int numeroPasaporte,int edad,String preferenciAlimentaria) {
        this.nombre = nombre;
        this.numeroPasaporte = numeroPasaporte;
        this.edad = edad;
        this.preferenciAlimentaria = preferenciAlimentaria;

    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNumeroPasaporte(int numeroPasaporte) {
        this.numeroPasaporte = numeroPasaporte;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setPreferenciAlimentaria(String preferenciAlimentaria) {
        this.preferenciAlimentaria = preferenciAlimentaria;
    }
/*
   Complejidad constante
    */

    public String getNombre() {
        return nombre;
    }

    public int getNumeroPasaporte() {
        return numeroPasaporte;
    }

    public int getEdad() {
        return edad;
    }

    public String getPreferenciAlimentaria() {
        return preferenciAlimentaria;
    }
}
