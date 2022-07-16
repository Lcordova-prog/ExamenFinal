
package com.mycompany.examenfinal;

class nodo1 {

    String tramites;
    nodo1 siguiente;

    public nodo1(String tra) {
        this.tramites = tra;
    }

    

}
public class PilaTramites {
    
   
    nodo1 top;
    int size;
    boolean vacia() {
        return top == null;
    }

    //Método para insertar los sabores y toppings de el helado
    public void Apilar(String tramite) {
        nodo1 x = new nodo1(tramite);
        x.siguiente = top;
        top = x;
        size++;
    }
        public String pila3() { // Método que muestra el siguiente del siguente del top
        return top.siguiente.siguiente.tramites;
    }

    public String pila2() { // Método que muestra el siguiente del top
        return top.siguiente.tramites;
    }

    public String pila1() { // Método que muestra el top de la pila
        return top.tramites;
    }
     public int tamano() {
        return size;
    }
      public nodo1 Borrar() {
        if (vacia()) {
            return top;
        } else {
            nodo1 aux = top;
            top = top.siguiente;
            aux.siguiente = null;
           size--;
            return aux;

        }

    }
       public void borraRapido(){
        while(!vacia()){
            Borrar();
        }
       }
    
    
    
    
}
