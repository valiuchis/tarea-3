/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package progra3;

/**
 *
 * @author valeriacarolinaramos
 */
public abstract class Moneda {
    
    public int valor;
    
    public Moneda () {
       // super ();
    }
    
    public abstract int getValor ();
      //  return valor; 
    
    public abstract String toString();
}

class MonedaCien extends Moneda {
   
    public MonedaCien () {
        super ();
        valor = 100;
    }
   
    @Override
    public int getValor () {
        return valor;
    }
    @Override    
     public String toString(){
        return "Cancela con: "+ getValor();
     }

}

class MonedaQuinientos extends Moneda {
    
    public MonedaQuinientos () {
        super ();
        valor = 500;
    }
    @Override
    public int getValor () {
        return valor;
    }
    @Override    
     public String toString(){
        return "Cancela con: "+getValor();
    }
}

class MonedaMil extends Moneda {

    public MonedaMil () {
        super ();
        valor = 1000;
    }
    @Override
    public int getValor () {
        return valor;
    }
    @Override
    public String toString(){
    return "Cancela con: "+getValor();    
    }
}
