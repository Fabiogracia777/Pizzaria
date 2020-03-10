/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzaria;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Menu2 {
     Scanner opcao = new Scanner(System.in);
    public int exibirTipos() {
        System.out.println("Antes de realizarmos sua compra, escolha uma das opções:");
        System.out.println("1 - Pizzaria São Paulo  \n2 - Pizzaria Rio de Janeiro");
        int escolha = opcao.nextInt();
        return escolha;

    }
     public int exibirPizza() {
        System.out.println("1 - Calabresa  \n2 - Quatro Queijos");
        int escolha = opcao.nextInt();
        return escolha;

    }
    
}
