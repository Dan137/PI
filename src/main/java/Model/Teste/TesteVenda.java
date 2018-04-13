/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Teste;

import Model.entidade.Produto;
import Model.entidade.Vendas;
import controller.ControlerVenda;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Daniel
 */
public class TesteVenda {

    public static void main(String[] args) {

        /*
        DUVIDA:
        será preciso colocar a quantidade de produto na hora da venda?
        2 possíveis soluções:
        fazer uma lógica para que no final da venda o sistema fazer uma contagem de produtos vendidos e adicionar na lista
        ou diminuir um a cada condição satisfeita?
         */
        ControlerVenda cv = new ControlerVenda();
        
//        CADASTRA VENDA
          Date dataVenda = new Date();
          Date dataPagamento = new Date();
          SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
          String datVend = sdf.format(dataVenda);
          String datPagam = sdf.format(dataPagamento);
          
          Vendas vend = new Vendas(0, dataVenda, 10 , dataPagamento);
          cv.cadastrarVenda(vend);
          
                  
          
//        TESTE DO MÉTODO ATUALIZAR QUANTIDADE DE PRODUTOS VENDIDOS
//        List<Produto> produtos = new ArrayList<Produto>();
//
//        Produto produto = new Produto(1, "Arroz", 1.45, 3);
//
//        produtos.add(produto);
//        Vendas venda = new Vendas();
//
//        venda.atualizaQuantidadeProdutos(produtos);
    }
}
