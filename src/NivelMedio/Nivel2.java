/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NivelMedio;

import java.util.ArrayList;



/**
 *
 * @author aldav
 */
public class Nivel2 implements IJuego {
    
    
    
    private String opcionSeleccionada;
    
    private int contador1 = 0;
    
    private ArrayList<Integer> botonesSeleccionados = new ArrayList<Integer>();
    
    
     public void aumentarContador(Integer numeroBoton){
        contador1++;
        botonesSeleccionados.add(numeroBoton);
    }
     
      public boolean puedeSeleccionar(){
        return contador1 <= 1;
   
      }
      
      @Override
    public boolean esGanador(){
        try {
            return botonesSeleccionados.contains(3);
        }
        catch(Exception e){
           return false; 
        }
      
      
      
      
    
    }

    
}
