/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author mcajas
 */
public class Main {
     public static void main(String[] args) {
        // TODO code application logic here
    }
    
 private static void llenarArbol(){

    Nodo A = new Nodo(0);
    Nodo B = new Nodo(7);
    Nodo C = new Nodo(5);
    Nodo D = new Nodo(3);
    Nodo E = new Nodo(8);
    Nodo F = new Nodo(9);
    Nodo G = new Nodo(10);
    Nodo H = new Nodo(2);
    Nodo I = new Nodo(4);
    Nodo J = new Nodo(0);
    Nodo K = new Nodo(0);
    Nodo L = new Nodo(10);
    Nodo M = new Nodo(6);
    Nodo N = new Nodo(10);
    Nodo O = new Nodo(10);

A.setNodoIzquierdo(B);
A.setNodoDerecho(C);

B.setNodoIzquierdo(D);
B.setNodoDerecho(E);

C.setNodoIzquierdo(F);
C.setNodoDerecho(G);

D.setNodoIzquierdo(H);
D.setNodoDerecho(I);

E.setNodoIzquierdo(J);
E.setNodoDerecho(K);

F.setNodoIzquierdo(L);
F.setNodoDerecho(M);

G.setNodoIzquierdo(N);
G.setNodoDerecho(O);

//Resultado en pantalla
System.out.println("\nRecorrido Preorden: ");
preOrden(A);
System.out.println("\nRecorrido Inorden: ");
inorden(A);
System.out.println("\nRecorrido PostOrden: ");
posOrden(A);
}

//Metodo Preorden
private static void preOrden(Nodo raiz) {
if (raiz != null) {
System.out.print(raiz.getValor()+ " - ");
preOrden(raiz.getNodoIzquierdo());
preOrden(raiz.getNodoDerecho());
}
}
//Metodo Inorden
private static void inorden(Nodo raiz) {
if (raiz != null) {
inorden(raiz.getNodoIzquierdo());
System.out.print(raiz.getValor()+ " - ");
inorden(raiz.getNodoDerecho());
}
}
//Metodo PostOrden
private static void posOrden(Nodo raiz) {
if (raiz != null) {
posOrden(raiz.getNodoIzquierdo());
posOrden(raiz.getNodoDerecho());

System.out.print(raiz.getValor() + " - ");
}
}


}
