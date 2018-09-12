/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Quest1;

import javax.swing.JOptionPane;

/**
 *
 * @author stranger
 */
public class Funcionario extends Assistente {

      public void exibedados(){
      
     System.out.println(getNmatricula());
    System.out.println(getNome());   
        
        JOptionPane.showMessageDialog(null +getNmatricula());
    }
  
    
  
    
    
}
