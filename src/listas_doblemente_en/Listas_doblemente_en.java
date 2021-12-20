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
public class Listas_doblemente_en {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ListaDoble lista = new  ListaDoble(); 
        int opcion = 0, elemento; 
        
        // menú 
        
        do{
        
            try {
                
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null,""
                +"1) agregar  un nodo al inicio  \n"
                +"2) agregar  un nodo al Final  \n"
                +"3) Mostrar Lista de inicio a fin  \n"
                +"4) Mostrar la lista de Fin a inicio  \n"
                +"5) salir  \n"
                +"Ingrese una Opcion  \n","Menu",JOptionPane.INFORMATION_MESSAGE));
                        
                 switch(opcion){
                 
                 
                     case 1: 
                         
                         elemento = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese un elemnto al incio","se agrego el metodo al final",JOptionPane.INFORMATION_MESSAGE));
                         
                         lista.agragarAlInicio(elemento);
                         break; 
                         
                               case 2: 
                         
                         elemento = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese un elemnto al incio","se agrego el metodo al final",JOptionPane.INFORMATION_MESSAGE));
                         
                         lista.agregarAlFinal(elemento);
                        
                         break; 
                         
                               case 3: 
                                   
                                   if(!lista.estavacio()){
                                   lista.mostarListaFinInicio(); }else{ JOptionPane.showInputDialog(null,"NO hay datos ","Lista vacia",JOptionPane.INFORMATION_MESSAGE);}
                             
                 break;                   
                 
                       case 4: 
                                   
                                   if(!lista.estavacio()){
                                   lista.mostarListaInicioFin(); }else{ JOptionPane.showInputDialog(null,"NO hay datos ","Lista vacia",JOptionPane.INFORMATION_MESSAGE);}
                             
                 break;                     
                     
                 
                       case 5: 
                           
                           JOptionPane.showInputDialog(null,"Gracias ","Fin",JOptionPane.INFORMATION_MESSAGE);
                 
                           break; 
                        
                       default:
                        
                 JOptionPane.showInputDialog(null,"No se encuentra la opcion ","Fin",JOptionPane.INFORMATION_MESSAGE);
                 } 
            } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null,"error"+ e.getMessage());
            }
        
        
        }while(opcion!=5); 
        
    }
    
}
