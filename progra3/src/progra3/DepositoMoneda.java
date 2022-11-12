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

public class DepositoMoneda {
    
    private ArrayList<Moneda> deposito;
    
    public DepositoMoneda () {
        
        deposito = new ArrayList<Moneda> ();
    }
    
    public void agregarMoneda (Moneda m) {
        
        deposito.add(m);
    }
    
    public Moneda getMoneda () {
        
        if (!deposito.isEmpty()) {
            return deposito.remove(0);
        } else {
            return null;
        }
    }
    
    public int tamaño () {//ver para que ocuparemos este metodo
        
        return deposito.size();
    }
}
