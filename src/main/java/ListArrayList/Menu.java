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

        List<Cliente> lista_cliente = new ArrayList();

        System.out.println(lista_cliente.size());

        int opcaoMenu = -1;
        while (opcaoMenu != 0) {
            System.out.println("===== TAMANHO LISTA CLIENTE " + lista_cliente.size() + " =====");
            System.out.println("==================================");
            System.out.println("[1] CADASTRAR");
            System.out.println("[2] CONSULTAR TODOS");
            System.out.println("[3] BUSCAR UM");
            System.out.println("[4] F5");
            System.out.println("[0] SAIR");

            int opcao = Ler.nextInt();
            switch (opcao) {

                case 1:
                    System.out.println("== CADASTRAR ==");
                    lista_cliente.add(new Cliente(0, "", 0));
                    for (Cliente i : lista_cliente) {

                        if (i.getIdCliente() == 0) {
                            System.out.println("LIVRE PARA CADASTRO");

                            i.cadastrarCliente();
                            break;

                        }

                    }

                case 2:

                    for (int i = 0; i < lista_cliente.size(); i++) {
                        
                        lista_cliente.get(i).cadastrarCliente();
                    }
                    
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
                    opcaoMenu = 0;
                    break;
            }
        }
    }

}
