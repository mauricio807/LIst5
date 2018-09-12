/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Quest2;

import java.util.Random;

/**
 *
 * @author stranger
 */
public class TesteAnimal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Cachorro c = new Cachorro();
        Gato g= new Gato();
        
        Animal [] som=new Animal[3];
        som[0]= new Cachorro();
        som[1]= new Gato();
        
        Random seleciona =new Random();
        Animal Animalescolhido;
        for (int i =0; i <4;i++)
            
     Animalescolhido=som[seleciona.nextInt(3)];
        
        Animalescolhido.emitaSom();
    }
    
}
