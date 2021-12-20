/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listas_doblemente_en;

/**
 *
 * @author Erick
 */
public class NodoDoble {
    
    
    public int dato; // nodo 
    
    NodoDoble siguente, anterior ; // punteros 
    
    // contructor  0 datos 
    
    public NodoDoble(int el){
    
        this(el,null,null);
    }
    
    // conbstructor con datos 
    
    
    public NodoDoble(int el, NodoDoble s ,NodoDoble a ){
    
    dato = el; 
    siguente = s; 
    anterior = a ; 
    }
    
    
}
