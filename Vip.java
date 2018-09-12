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
public class Vip {
    
    private float valoradc;
    
    public float getValoradc(){
        return valoradc;
    }
    
    //public void setValoradc(float valoradc){
      //  this.valoradc= valoradc;
    //}
    public void Ingresso(){
        JOptionPane.showMessageDialog(null, "valor e tipo");
    }
    
    public void setValoradc(float valoradc){
    
        this.valoradc= valoradc;
    }

}