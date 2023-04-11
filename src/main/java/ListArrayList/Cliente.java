/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ListArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Nathan Graebin
 */
public class Cliente extends Pessoa {

    List<Cliente> lista_cliente = new ArrayList();
    Scanner Ler = new Scanner(System.in);

    //List
    private int idCliente;

    public Cliente(int telefone, String nome, int idCliente) {
        super(telefone, nome);
        this.idCliente = idCliente;

    }

    public int getIdCliente() {
        return idCliente;

    }

    public interface Imprimivel {

        public void getIdCliente();

    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public void cadastrarCliente() {
        System.out.println("INFOME O NOME");
        setNome(Ler.nextLine());
        System.out.println("INFOME O ID");
        setIdCliente(Ler.nextInt());
        System.out.println("INFOME O TELEFONE");
        setTelefone(Ler.nextInt());
        System.out.println("==== Cadastro Finalizado ====");
    }

    public void buscar() {
        System.out.println("====================");
        System.out.println("ID " + getIdCliente());
        System.out.println("NOME " + getNome());
        System.out.println("TELEFONE " + getTelefone());
        System.out.println("DADOS ENCONTRADOS");
        System.out.println("====================");
    }

    public void mostrarTodos() {
        System.out.println("====================");
        System.out.println("ID " + idCliente);
        System.out.println("NOME " + getNome());
        System.out.println("TELEFONE " + getTelefone());
    }

    
}
