
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author stranger
 */
public class Novo extends Imovel{
   
    private float adicionalpreco;
   
   public float getAdicionalPreco(){
   return adicionalpreco;    
   
   }
  
   public void setAdicionalPreco(float adicionalpreco){
      this.adicionalpreco= adicionalpreco;
  
  } 
   public void novoImovel(){
    float preco = (getAdicionalPreco() + getPreco());
     JOptionPane.showInputDialog("O valor do seu Imovel é", preco);
   }
   
   
   
}
