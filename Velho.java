
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
public class Velho extends Imovel{
    private float desconto;

    public float getDesconto() {
        return desconto;
    }

    public void setDesconto(float desconto) {
        this.desconto = desconto;
        
    }
    
    public void acessDesconto(){
        float preco = (getPreco()- getDesconto());
     JOptionPane.showInputDialog("O valor do seu Imovel é",preco);
}
    
}
