/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package ListArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Nathan Graebin
 */
public class Menu {

    public static void main(String[] args) {

        Scanner Ler = new Scanner(System.in);

        //Prmeiro iniciamos uma Lista do tipo Cliente que charemos de lista_cliste , ela vai ser do tipo ArrayList
        List<Cliente> lista_cliente = new ArrayList();

        int opcaoMenu = -1;
        // enquanto a opçãaoMenu for DIFERENTE ( 1,2,3,4,5,...) de 0, FAÇA
        // quando for 0 o programa finalizara
        while (opcaoMenu != 0) {//FAÇA
                                                               //deixei a visualização do tamanho da lista
                                                               //na parte superior do menu, afim de poder controlar
                                                               // e entender o que esta acontecendo
            System.out.println("===== TAMANHO LISTA CLIENTE " + lista_cliente.size() + " =====");
            System.out.println("==================================");
            System.out.println("[1] CADASTRAR");
            System.out.println("[2] CONSULTAR TODOS");
            System.out.println("[3] BUSCAR UM");
            System.out.println("[4] F5");
            System.out.println("[0] SAIR");
            
            //apos imprimir o menu, devemos escolher uma opção nele
            
            //então vamos solicitar a leitura da opção
            int opcao = Ler.nextInt();
          //ESCOLHA  OPÇÃO 
            switch (opcao) {
                
                
                //caso ESCOLHA A OPÇÃO 1 iremos cadastrar
                case 1:
                    //afim de sempre entender o que cada função faz, deixo o CADASTRAR no topo,
                    //pois depois que ficar grande o codigo, será mais facil encontrar esse local
                    
                    
                    System.out.println("== CADASTRAR ==");
                    
                    // toda vez que escolhermos a opção cadastrar, vamos iniciar um novo local de cadastro na lista_cliente
                    // adicionaremos na lista_cliente um novo Cliente ( que é uma classe )
                    // Cliente vai receber todos os dados nulos, em relação aos atributos indicadados
                    //no metodo construtor da classe Cliente, seguindo a ordem ( verificar classe Cliente )
                    lista_cliente.add(new Cliente(0, "", 0));
                    
                    //Usaremos o loop For Each para olhar para os dados da lista_cliente
                    for (Cliente i : lista_cliente) {
                    
                        
                        
                        //fazemos uma validação de garantir que estamos lidando com o cadastro certo
                        
                        //SE eu COMEÇAR A PROCURAR na lista de cliente . eu pegar o ID e o ID e for IGUAL == a 0
                        if (i.getIdCliente() == 0) {
                            
                            //faremos um cadastro nessa posição aonde o Cliente esta com valores nulos que criamos
                            // ao apertar para cadastrar
                            
                            
                           //na lista_cliente . iniciaremos o metododo cadastrarCliente ( verificar na classe Cliente )
                            i.cadastrarCliente();
                            
                            //em teoria, quando for cadastrar o cliente, é para cadastrar 1 cliente apenas
                            //entamos usamos um break; apos terminar o cadastro para finalizar o loop
                            // e voltar para o menu principal
                            break;

                        }

                    }

                case 2:

                    for (Cliente i : lista_cliente) {
                        i.mostrarTodos();

                    }

                    break;

                case 3:
                    System.out.println("BUSCAR CLIENTE");
                    System.out.println("INFORME UM ID ");
                    int idBuscar = Ler.nextInt();
                    for (Cliente i : lista_cliente) {
                        if (i.getIdCliente() == idBuscar) {

                            i.buscar();
                        }
                    }

                    break;

                case 4:
                    System.out.println("");

                    break;

                case 0:
                    // comentamos la em cima que, quando a opçãoMenu for DIFERENTE de 0, ele vai fazer o menu
                    //então quando a opçãoMenu for 0, ene vai finalizar
                   
                    // logo quando apertar 0 no menu, ele vai vir para esse CASO 0
                    //vai falar que a opçãoMenu é 0 afim de finalizar ele
                    // e um break; 
  
                    
           
                    
                    opcaoMenu = 0;
                    break;
            }
        }
    }

}
