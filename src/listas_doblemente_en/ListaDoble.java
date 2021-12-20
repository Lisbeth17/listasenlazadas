/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listas_doblemente_en;

import javax.swing.JOptionPane;

/**
 *
 * @author Erick
 */
public class ListaDoble {
    
    private NodoDoble inicio,fin; // punteros 
    public  ListaDoble(){  // constructor vacio
    
    
    inicio=fin=null;
    }
    
    public boolean estavacio (){ // sabremos si nuestra lsita esta vacia 
    
    return inicio == null; 
    }
    
    public void agregarAlFinal(int el){
    
    if(!estavacio()){
    
    fin = new NodoDoble(el, null, fin); 
    fin.anterior.siguente=fin; 
    }else{ inicio = fin = new NodoDoble(el);}  
    
    }
    
    
    public void agragarAlInicio(int el){
    
    if(!estavacio()){
    inicio = new NodoDoble(el, inicio, null);
    inicio.siguente.anterior=inicio; 
    }else{ inicio = fin = new NodoDoble(el);}
    }  

public void mostarListaInicioFin(){

if(! estavacio()){

String datos = "<=>";
NodoDoble auxiliar = inicio; 

while(auxiliar!=null){

datos = datos +"["+auxiliar.dato+"]<=>"; 
auxiliar = auxiliar.siguente; 

    JOptionPane.showMessageDialog(null, datos,"mostrar el lsitado de Inicio a Fin",JOptionPane.INFORMATION_MESSAGE);

}}
}


public void mostarListaFinInicio(){

if(! estavacio()){

String datos = "<=>";
NodoDoble auxiliar = fin; 

while(auxiliar!=null){

datos = datos +"["+auxiliar.dato+"]<=>"; 
auxiliar = auxiliar.anterior; 

    JOptionPane.showMessageDialog(null, datos,"mostrar el lsitado de  Fin a Inicio",JOptionPane.INFORMATION_MESSAGE);
}}}



}


    
    
    
    

