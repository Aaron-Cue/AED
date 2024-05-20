package aed;

import java.util.*;

public class ListaEnlazada<T> implements Secuencia<T> {
    // Completar atributos privados
    private int size;
    private Nodo primero;
    private Nodo ultimo;

    private class Nodo {
        T valor;
        Nodo sig;
        Nodo ant;

        Nodo(T v) {
            valor = v;
        }
    }

    public ListaEnlazada() {
        primero = null;
        ultimo = null;
        size = 0;
    }

    public int longitud() {
        return size;
    }

    public void agregarAdelante(T elem) {
        Nodo nuevo = new Nodo(elem);

        if (primero == null) {  // no hay nodos en la lista
            primero = nuevo;
            ultimo = nuevo;
        } else {                // hay nodos en la lista
            nuevo.sig = primero;
            primero.ant = nuevo;
            primero = nuevo;
        }

        size++;
    }

    public void agregarAtras(T elem) {
        Nodo nuevo = new Nodo(elem);

        if (ultimo == null) { // no hay nodos en la lista
            primero = nuevo;
            ultimo = nuevo;
        } else {             // hay nodos en la lista
            nuevo.ant = ultimo;
            ultimo.sig = nuevo;
            ultimo = nuevo;
        }

        size++;
    }

    public T obtener(int i) {
        Nodo aux = primero;

        for (int j = 0; j < i; j++) {
            aux = aux.sig;
        }

        return aux.valor;
    }

    public void eliminar(int i) {
        if (size == 1) {
            primero = null;
            ultimo = null;
        } else if (i == 0) {   // primero
            primero = primero.sig;
            primero.ant = null;
        } else if (i == size - 1) {  // ultimo
            ultimo = ultimo.ant;
            ultimo.sig = null;
        } else {   // otro
            Nodo aux = primero;
            for (int j = 0; j < i; j++) {
                aux = aux.sig;
            }
            aux.ant.sig = aux.sig;
            aux.sig.ant = aux.ant;
        }

        size--;
    }

    public void modificarPosicion(int indice, T elem) {
        Nodo aux = primero;
        for (int i = 0; i < indice; i++) {
            aux = aux.sig;
        }
        aux.valor = elem;
    }

    public ListaEnlazada<T> copiar() {
        ListaEnlazada<T> copia = new ListaEnlazada<>();
        Nodo actual = primero;
        while (actual != null) {
            copia.agregarAtras(actual.valor);
            actual = actual.sig;
        }
        return copia;
    }

    public ListaEnlazada(ListaEnlazada<T> lista) {
        Nodo actual = lista.primero;
        while (actual != null) {
            agregarAtras(actual.valor); 
            actual = actual.sig;
        }
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Nodo actual = primero;
        while (actual != null) {
            sb.append(actual.valor);
            if (actual.sig != null) {
                sb.append(", ");
            }
            actual = actual.sig;
        }
        sb.append("]");
        return sb.toString();
    }



    
    private class ListaIterador implements Iterador<T> {
        // Completar atributos privados
        private Nodo actual;

        public ListaIterador() {
            actual = primero; 
        }

        public boolean haySiguiente() {
            return actual != null;
        }
        
        public boolean hayAnterior() {
            return actual != primero;
        }

        public T siguiente() {
        
            T valor = actual.valor;
            actual = actual.sig;
            return valor;
        
        }
        

        public T anterior() {
            if (actual == null) { 
                actual = ultimo;
            } else {
                actual = actual.ant;
            }
            return actual.valor;
        }
    }

    public Iterador<T> iterador() {
        return new ListaIterador(); 
    }

}

