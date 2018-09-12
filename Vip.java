/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Quest3;

import javax.swing.JOptionPane;

/**
 *
 * @author stranger
 */
public class Vip extends Ingresso {
    
    private float valoradc;
   
    public float getValorAdc(){
        return valorAdc;
    }
    
    public void setValorAdicional(float valorAdc){
        this.valorAdc = valorAdc;
    }
    
    @Override
   public void imprimevalor(){
       float valor = (getPreco() + getValorAdc());
        System.out.println("O ingresso pra Area Vip " + valor);
    }

}
