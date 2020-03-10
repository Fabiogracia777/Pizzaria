
package pizzaria;


public class PizzariaPizzaRJ extends Fabrica {

    @Override
    void criarSaborPizza(int opcao) {
       if (opcao==1){
           Pizza p = new CalabresaRj();
           p.exibirPizza();
       }else if(opcao == 2){
           Pizza p = new QuatroQueijosRj();
           p.exibirPizza();
       }
    }
    
    
    
}
