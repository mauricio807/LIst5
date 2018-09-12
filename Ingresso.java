/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Quest3;

/**
 *
 * @author stranger
 */
public class abstract Ingresso {
    private float valor;
    
    public void valor(){    
    }
    
    public float getValor(){
        return valor;
    }
    
    public void setValor(float valor){
        this.valor= valor;
    }
      public void imprimevalor(){
       JOptionPane.showMessageDialog("O ingresso custa " + getPreco());
    }
}
