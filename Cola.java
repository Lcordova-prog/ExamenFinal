
package com.mycompany.examenfinal;
class Nodo {

        String nom;
  
       
        Nodo sig;

        public Nodo(String nom) {
            this.nom = nom;
        }

    }

public class Cola {
    Nodo delante;
    Nodo atras;
    
    boolean vacio(){
        return delante == null;
    }
    public void Encolar(String nom){
    Nodo w = new Nodo(nom);
     if (vacio()) {
            delante = w;
            atras = delante;
        } else {
            atras.sig = w;
            atras = w;
        }
    
    }
    
      public String mostrar() {
        String Ver = "";
        if (!vacio()) {
            Nodo aux = delante;
            while (aux != null) {
                Ver += aux.nom +"<--";
                aux = aux.sig;
            }
            return Ver;
        }
        return "No hay clientes";
    }
      
       public String Primero() {
        return delante.nom;
    }
        public String Atender() {
        if (!vacio()) {
            String aux = delante.nom;
            delante = delante.sig;
            return aux;
        }
        System.out.println("No hay más clientes");
        return " ";
    }
      
      
    
    
    
}
