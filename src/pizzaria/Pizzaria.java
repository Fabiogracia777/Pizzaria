package pizzaria;

import java.awt.Menu;

public class Pizzaria {

    public static void main(String[] args) {

        Menu2 mm = new Menu2();
        int local = mm.exibirTipos();
        int escolha = mm.exibirPizza();
        
        Fabrica pizzaria = CriarPizzaria.criarPizzaria(local);
        pizzaria.criarSaborPizza(escolha);
      

    }

}
