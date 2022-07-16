
package com.mycompany.examenfinal;

class nodo2{
    String dato;
    nodo2 sig;
    
    nodo2(String d){
        this.dato = d;
    }
}

public class ListaRecursivo {
    nodo2 L;
    
    nodo2 GuardarRecursivo(nodo2 n, String nom){
        if (L == null) {
            L = new nodo2(nom);
            return L;
        }else if(n.sig == null){
            n.sig = new nodo2(nom);
            return n.sig;
        }else{
            return GuardarRecursivo(n.sig, nom);
        }
        
    }
    
    String Imprimir(nodo2 a){
        if (a.sig == null) {
            return a.dato;
        }
        return "\n"+ a.dato +"\n"+ Imprimir(a.sig);
    }
    
}
