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
public class CamaroteSuperior {
  private float caro;
    
    public float getValor(){
        return Valor;
    }
    
    public void setValor(float valor){
        this.Valor = Valor;
    }
    
   @Override
   public void imprimevalor(){
       float valor = (getPreco() + getValorAdicional() + 70);
        JoptionPane.showMessageDialog("O ingresso pra Area Vip custa: " + valor);
    }
    
}
