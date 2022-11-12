/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package progra3;

/**
 *
 * @author valeriacarolinaramos
 */
public class Cliente {
    
    private Moneda pago;
    private int id;
    private Expendedora vendingMachine;
    private Bebida bebida;
    
    public Cliente(Moneda moneda, int codigoID, Expendedora exp) {
        
        pago = moneda;
        id = codigoID;
        vendingMachine = exp;
    }
    
    public Bebida compraBebida () {
        
        try { 
            bebida = vendingMachine.ventaBebida(pago, id);
        } catch (NoHayBebidaException exception) {
            System.out.println(exception.getMessage());
            
        } catch (PagoIncorrectoException exception) {
            System.out.println(exception.getMessage());
            
        } catch (PagoInsuficienteException exception) {
            System.out.println(exception.getMessage());
        }
        return bebida;    
    }
    
    public String saborBebida () {
        return bebida.beber();
    }
    
}