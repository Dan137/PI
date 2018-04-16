/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Teste;

import Model.entidade.Cliente;
import Model.entidade.ClienteJuridico;
import Model.entidade.Endereco;
import controller.Controler;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Daniel
 */
public class TesteCliente {
    
    public static void main(String[] args) {
        
        Date dataHoje = new Date();
        
        Controler controler = new Controler();
        SimpleDateFormat formataData = new SimpleDateFormat("dd/MM/yyyy");
        String dataAbertura = formataData.format(dataHoje);

//        cadastra um novo endereco (passe um numero diferente no parâmetro do método
//        TesteCliente.cadastraEndereco(3, controler);
//        ----------------- CADASTRA CLIENTE!! ---------------------------
//        Cliente cliente1 = new Cliente(0, "Daniel ", dataHoje, "703.968.604-00", "Oziel Isaias", "Lucinalva de Melo", "daniel.verissimo@gmail.com", "(87) 9.8135-5794", controler.getEndereco(2));
//        controler.inserirCliente(cliente1);

        ClienteJuridico clientJuridico = new ClienteJuridico("121-xxx-2fd-df", 0,"ddaann", dataHoje, "xxx-xxx-xxx-00", "oozzii", "lulu", "dd@dfdkD", "(87)9564564", controler.getEndereco(3));       
        controler.inserirCliente(clientJuridico);

//        ----------------- ATUALIZA CLIENTE!! ---------------------------
//    Cliente upCliente = new Cliente (2, "Maycon Abilio Rego", dataHoje, "father", "mother", "maycon.abilioreg@gmail.com", "(87) xxxx-xxxx");
//    controler.updateCliente(upCliente);
//        ----------------- BUSCAR CLIENTE!! -----------------------------
//        Cliente cliente = controler.findIDCliente(2);
//        String str = " ";
//        str += "nome: " + cliente.getNome() + "\n"
//                + "codigo: " + cliente.getCodigo() + "\n"
//                + "email: " + cliente.getEmail() + "\n"
//                + "data admissão: " + cliente.getDataAbertura() + "\n"
//                + "telefone: " + cliente.getTelefone();
//        System.out.println(str);
//        ----------------- BUSCAR TODOS OS CLIENTE!! ---------------------
//         List<Cliente> clientes = controler.findAllClientes();
//        for(Cliente c: clientes){
//            System.out.println("codigo: "+c.getCodigo());
//            System.out.println("nome: "+c.getNome());
//            System.out.println("email: "+c.getEmail());
//            System.out.println("data de admissão: "+c.getDataAbertura());
//            System.out.println("telefone: "+c.getTelefone());
//            System.out.println("============================================");
//        }
//        ----------------- DELETAR UM CLIENTE--- ---------------------
//        Cliente cliente = controler.findIDCliente(1);
//        controler.deleteCliente(cliente);
    }
    
    public static void cadastraEndereco(int numero, Controler controler) {
        Endereco enderecoCliente = new Endereco("Rua C", numero, "centro", "Paranatama-PE", "55-355-00");
       
        controler.cadEndereco(enderecoCliente);
    }
}
