/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzaria;

/**
 *
 * @author USUARIO
 */
public class PizzariaPizzaSP extends Fabrica{
       void criarSaborPizza(int opcao) {
       if (opcao==1){
           Pizza p = new CalabresaSp();
           p.exibirPizza();
       }else if(opcao == 2){
           Pizza p = new QuatroQueijosSp();
           p.exibirPizza();
       }
    }
    
}
