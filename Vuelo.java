public class Vuelo {
    /*
    Complejidad constante
     */
    private int numeroVuelo;
    private String origen;
    private String destino;

    private String fecha;
    private int hora;
    private int maximoPasajeros;
    /*
  Complejidad constante
   */
    public Vuelo (int numeroVuelo,String origen,String destino,String fecha,int hora,int maximoPasajeros){
        this.numeroVuelo = numeroVuelo;
        this.origen = origen;
        this.destino = destino;
        this.fecha = fecha;
        this.hora = hora;
        this.maximoPasajeros = maximoPasajeros;
    }
    /*
       Complejidad constante
        */
    public void setNumeroVuelo(int numeroVuelo) {
        this.numeroVuelo = numeroVuelo;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public void setMaximoPasajeros(int maximoPasajeros) {
        this.maximoPasajeros = maximoPasajeros;
    }
    /*
       Complejidad constante
        */
    public int getNumeroVuelo() {
        return numeroVuelo;
    }

    public String getOrigen() {
        return origen;
    }

    public String getDestino() {
        return destino;
    }

    public String getFecha() {
        return fecha;
    }

    public int getHora() {
        return hora;
    }

    public int getMaximoPasajeros() {
        return maximoPasajeros;
    }
}
