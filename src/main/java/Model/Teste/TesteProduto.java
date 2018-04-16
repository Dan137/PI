/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Teste;

import Model.entidade.ItensVendas;
import controller.Controler;

import Model.entidade.Produto;
import Model.entidade.Vendas;
import controller.ControlerItemVenda;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Maycon
 */
public class TesteProduto {

    public static void main(String[] args) {

        ControlerItemVenda ctrl = new ControlerItemVenda();
        Controler c = new Controler();
        TesteProduto.cadItemVend(ctrl);
//      CADASTRA PRODUTO

        Produto produto = new Produto(0, "arroz", 1.25, 20, "serial", ctrl.findIDitemVenda(19));
        c.inserir(produto);

//        produto2 = new Produto(0, "macarrão", 2.4, 20);
//        produtoControlle.inserir(produto2);
//       ATUALIZA PRODUTO
        /*
        produto = new Produto(2, "Daniel", 2.00, 200);
        produtoControlle.alterar(produto);
         */
//        produto = new Produto(3, "açucar", 7.5, 5);
//        produtoControlle.alterar(produto);
//        Relatorios de Produtos
//
//        List<Produto> produtos = produtoControlle.listarProdutos();
//        for(int i=0; i<produtos.size(); i++){
//            System.out.println("codigo ="+produtos.get(i).getCodigo());
//            System.out.println("nome ="+produtos.get(i).getNome());
//            System.out.println("preco ="+produtos.get(i).getPreco());
//            System.out.println("quantidade ="+produtos.get(i).getQuantidade());
//            System.out.println("============================================");
//        }
//       EXCLUI UM PRODUTO
/*
        List<Produto> produtos = produtoControlle.listarProdutos();
        for (Produto p: produtos) {
            if(p.getCodigo() ==1){
                produtoControlle.excluir(p);
            }
        }

         */
//produto = produtoControlle.findId(3);
//String str = " "; 
//str+= "codigo: "+ produto.getCodigo()+"\n nome: " + produto.getNome()+"\n preço: " + produto.getPreco()+ "\n quantidade: " + produto.getQuantidade();
//System.out.println(str);
    }

    public static void cadItemVend(ControlerItemVenda ctrl) {
        ItensVendas iv = new ItensVendas(0, 2, 12.5, TesteProduto.listaDeProdVendidos(), TesteProduto.listaDeVendas());
        ctrl.cadastrarItemVenda(iv);
    }

    public static List<Produto> listaDeProdVendidos() {
        List<Produto> lstProd;
        lstProd = new ArrayList();
        Produto p = new Produto();

        lstProd.add(p);


        return lstProd;
    }

    public static List<Vendas> listaDeVendas() {
        List<Vendas> vendas = new ArrayList();
        Vendas iv = new Vendas();
//        ItensVendas iv2 = new ItensVendas();
//        ItensVendas iv3 = new ItensVendas();
//        ItensVendas iv4 = new ItensVendas();

//        itvendas.add(iv);
//        itvendas.add(iv2);
//        itvendas.add(iv3);
        vendas.add(iv);

        return vendas;
    }

}
