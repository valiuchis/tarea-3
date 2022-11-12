/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package progra3;

/**
 *
 * @author valeriacarolinaramos
 */
import java.util.ArrayList;

public class DepositoBebidas {
    
    private ArrayList <Bebida> bodega;
    
    public DepositoBebidas () {
        
        bodega = new ArrayList <Bebida> ();
    }
    
    public void agregaBebida (Bebida b) {
        bodega.add(b);
    }
    
    public Bebida getBebida () {
        
        if (bodega.size() != 0) {
            return bodega.remove(0);
        } else {
            return null; 
        }
    }
    
    public int cantidadBebida () {
            
            return bodega.size();
        }

}
    
