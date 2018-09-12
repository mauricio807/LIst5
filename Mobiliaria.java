/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author stranger
 */
public class Mobiliaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Novo n= new Novo();
        Velho v= new Velho();
        
        n.setAdicionalPreco(50000);
        n.setPreco(600000);
        n.novoImovel();
        
        v.setDesconto(4000);
        v.setPreco(80000);
        v.acessDesconto();
    }
    
}
