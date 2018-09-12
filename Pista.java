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
public class Pista extends Ingresso{

     @Override
    public void imprimevalor(){
        JOptionPane.showMessageDialog("O ingresso custa " + getPreco());
    }
}
