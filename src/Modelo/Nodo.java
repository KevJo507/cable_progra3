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
    
}
