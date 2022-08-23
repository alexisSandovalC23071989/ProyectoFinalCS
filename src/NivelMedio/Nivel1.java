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
public class Nivel1 implements IJuego {
    
    private int contador = 0;
    
    private ArrayList<Integer> botonesSeleccionados = new ArrayList<Integer>();
    
    public void aumentarContador(Integer numeroBoton){
        contador++;
        botonesSeleccionados.add(numeroBoton);
    }
    
    public boolean puedeSeleccionar(){
        return contador < 2;
    }
    
    @Override
    public boolean esGanador(){
        try {
            return ((botonesSeleccionados.contains(21) &&  botonesSeleccionados.contains(4))) || ((botonesSeleccionados.contains(14) && botonesSeleccionados.contains(15)));
        }
        catch(Exception e){
           return false; 
        }
    }
    
    
    
    
    
    
    
}
