package Modelo;

/**
 *
 * @author LSOPORTE10
 */
public class Arbol {
    public Nodo A;
    public Nodo B;
    public Nodo C;
    public Nodo D;
    public Nodo E;
    public Nodo F;
    public Nodo G;
    public Nodo H;
    public Nodo I;
    public Nodo J;
    public Nodo K;
    public Nodo L;
    public Nodo M;
    public Nodo N;
    public Nodo O;
    public int [] arbol = new int[15];
    public int contador;
    
    /**
     * Metodo llenarArbol: Metodo que asigna valores a cada
     * uno de los nodos y define parcialmente la estrucutra 
     * del arbol binario.
     */
    
 public void llenarArbol(){

    this.A = new Nodo(0);
    this.B = new Nodo(7);
    this.C = new Nodo(5);
    this.D = new Nodo(3);
    this.E = new Nodo(8);
    this.F = new Nodo(9);
    this.G = new Nodo(10);
    this.H = new Nodo(2);
    this.I = new Nodo(4);
    this.J = new Nodo(0);
    this.K = new Nodo(0);
    this.L = new Nodo(10);
    this.M = new Nodo(6);
    this.N = new Nodo(10);
    this.O = new Nodo(10);
    this.contador = 0;

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
}

/**
 * Metodo preOrden: Este metodo recibe un parametro de tipo
 * Nodo que utiliza como raiz para terminar de armar la estructura
 * del arbol utilizando los resultados del metodo llenarArbol.
 * @param raiz 
 */
public void preOrden(Nodo raiz) {
    if (raiz != null) {
        arbol[contador] = (raiz.getValor());
        contador++;
        preOrden(raiz.getNodoIzquierdo());
        preOrden(raiz.getNodoDerecho());
    }
}

/**
 * Metodo getGanancia: La funcion de este metodo es la de dar el total
 * de la ganancia proyectada a partir de un nodo que recibe mediante el
 * parametro de tipo Nodo "n".
 * @param n
 * @return 
 */
public String getGanancia(Nodo n){
    Reset();
    preOrden(n);
    int total = 0;
    String respuesta;
    for(int i = 0; i<arbol.length; i++){
        total+=arbol[i];
    }
    respuesta = "El ingreso proyectado de este nuevo proyecto es de: Q "+(total*150);
    return respuesta;
}

/**
 * Metodo getPerdida: Este metodo muestra la perdida que se tendiria en el caso
 * de no contar con un nodo determinado, de igual forma recibe un parametro 
 * de tipo Nodo "n".
 * @param n
 * @return 
 */
public String getPerdida(Nodo n){
    Reset();
    preOrden(n);
    int total = 0;
    String respuesta;
    for(int i = 0; i<arbol.length; i++){
        total+=arbol[i];
    }
    respuesta = "Al estar dañado este Nodo, la perdida sera de: Q "+(total*150)+"\n";
    return respuesta;
}

/**
 * Metodo getCasas: devuelve el numero de casas que suman los nodos afectados 
 * por la caida de un nodo que recibe por el mismo parametro que los metodos
 * anteriores.
 * @param n
 * @return 
 */
public String getCasas(Nodo n){
    Reset();
    preOrden(n);
    int total = 0;
    String respuesta;
    for(int i = 0; i<arbol.length; i++){
        total+=arbol[i];
    }
    respuesta = "Las casas afectadas seran: "+total;
    return respuesta;
}

/**
 * Metodo Reset: Este metodo cumple con la funcionalidad de limpiar los datos
 * almacenados en la variable "contador", y en el array "arbol" los cuales
 * son necesarios en cada uno de los calculos.
 */
public void Reset(){
    this.contador = 0;
    for(int i = 0; i<arbol.length; i++){
        this.arbol[i] = 0;
    }
}

}