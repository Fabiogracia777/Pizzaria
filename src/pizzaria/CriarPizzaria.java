
package pizzaria;

public class CriarPizzaria {
    
    public static Fabrica criarPizzaria(int opcao){
        if(opcao==1){
            return new PizzariaPizzaSP();
        }else if(opcao==2){
            return new PizzariaPizzaRJ();
        }else{
            return null;
        }
            
    }
}
