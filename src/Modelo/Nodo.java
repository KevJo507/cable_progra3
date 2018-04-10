package Modelo;

public class Nodo {
 

private int valor;
private Nodo izq;
private Nodo der;

    public int getValor() {
        return valor;
    }

    public void setValor(int Valor) {
        this.valor = Valor;
    }


//Constructor
    public Nodo(int valor){
    this.valor = valor;
    }
//Para saber el nodo izquierdo
    public Nodo getNodoIzquierdo(){
    return izq;
    }
//Para saber el nodo derecho
    public Nodo getNodoDerecho(){
    return der;
    }
//Se crea nodo derecho

    public void setNodoDerecho(Nodo nodo){
    der = nodo;
    }
//Se crea nodo Izquierdo
    public void setNodoIzquierdo(Nodo nodo){
    izq = nodo;
    }
 
    /**
     * Metodo ingresoProyectado: Este metodo regresa el total
     * proyectado de las ganancias segun el numero de casas (c) que se 
     * estima contrataran el servicio.
     * @param c
     * @return 
     */
    public int ingresoProyectado (int c){
        int respuesta = c * 150;
        return respuesta;
    }    
}
