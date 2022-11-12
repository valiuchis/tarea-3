/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package progra3;

/**
 *
 * @author valeriacarolinaramos
 */
public class Expendedora {
    
    private int cantBebidas;
    private int precioBebidas;
    
    private DepositoBebidas CocaCola;
    private DepositoBebidas Sprite;
    private DepositoBebidas Fanta;
   
    private int cantidadPagar;
    private DepositoMoneda CajaRegistradora;
    private int vuelto;
    
    public Expendedora (int numBebida, int precioBebida) {
        
        cantBebidas = numBebida;
        precioBebidas = precioBebida;
        
        CocaCola = new DepositoBebidas ();
        Sprite = new DepositoBebidas ();
        Fanta = new DepositoBebidas ();
        
        for (int i = 0; i < cantBebidas; i++) {
            
            CocaCola.agregaBebida (new CocaCola(100 + i));
            Sprite.agregaBebida (new Sprite (200 + i));
            Fanta.agregaBebida (new Fanta (300 + i));
            
        }
    }
    
    public Bebida ventaBebida (Moneda coin, int codigoID) throws NoHayBebidaException, PagoIncorrectoException, PagoInsuficienteException {
        
        cantidadPagar = coin.getValor();
        
        if (coin.getValor() >= precioBebidas) {
            
            switch (codigoID) {
                case 1 -> {
                    if (CocaCola.cantidadBebida() > 0) {
                        return CocaCola.getBebida(); 
                    } else {
                        throw new NoHayBebidaException ("Producto agotado.");
                    }
                }
                    
                case 2 -> {
                    if (Sprite.cantidadBebida() > 0) {
                        return Sprite.getBebida();
                    } else {
                        throw new NoHayBebidaException ("Producto agotado.");
                    }
                }
                    
                case 3 -> { 
                    if (Fanta.cantidadBebida() > 0) {
                        return Fanta.getBebida();
                    } else {
                        throw new NoHayBebidaException ("Producto agotado.");
                    }
                }
                
                default -> {    
                    return null;
                }
            } 
        }
        
        if (coin.getValor() < precioBebidas) {
            throw new PagoInsuficienteException ("Fondo insuficiente. Por favor, intente de nuevo.");
                }
        
        if (coin == null) {
            throw new PagoIncorrectoException ("Transacción no permitida. Por favor, intente de nuevo");
        }
        
        return null;
        
    }
        
    public int calcularVuelto () {
        vuelto = cantidadPagar - precioBebidas;
        return vuelto;
    }
    
    public void devolverVuelto () {
        
        for (int i = vuelto; i >= 0; i--) {
            vuelto = vuelto - 100;
            MonedaCien cambio = new MonedaCien();
            CajaRegistradora.agregarMoneda(cambio);
        }
    }
    
    public Moneda vueltoFinal () {
        if (vuelto == 0) {
            return null;
        } else {
            return CajaRegistradora.getMoneda();
        }
        
    }
}

