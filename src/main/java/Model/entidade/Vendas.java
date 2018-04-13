/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.entidade;

import controller.Controler;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Daniel
 */
@Entity
@Table(name="venda")
public class Vendas implements Serializable{
    @Id
    @GeneratedValue
    private int codigo;
    private Date dataVenda;
    private double valorTotal;
    private Date dataPagamento;

    public Vendas(int codigo, Date dataVenda, double valorTotal,  Date dataPagamento) {
        this.dataVenda = dataVenda;
        this.valorTotal = valorTotal;
        this.codigo = codigo;
        this.dataPagamento = dataPagamento;

    }

    public Vendas() {

    }

    /**
     * @return the dataVenda
     */
    public Date getDataVenda() {
        return dataVenda;
    }

    /**
     * @param dataVenda the dataVenda to set
     */
    public void setDataVenda(Date dataVenda) {
        this.dataVenda = dataVenda;
    }

    /**
     * @return the valorTotal
     */
    public double getValorTotal() {
        return valorTotal;
    }

    /**
     * @param valorTotal the valorTotal to set
     */
    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    /**
     * @return the codigo
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the dataPagamento
     */
    public Date getDataPagamento() {
        return dataPagamento;
    }

       
    public  void atualizaQuantidadeProdutos(List<Produto> produtos) {
        Controler controler = new Controler();
        List<Produto> produtosBanco = controler.listarProdutos();
        Produto produt = new Produto();

        for (int i = 0; i < produtos.size(); i++) {
            for (int j = 0; j < produtosBanco.size(); j++) {
                if (produtos.get(i).getCodigo() == produtosBanco.get(j).getCodigo()) {
                    produtosBanco.get(j).setQuantidade(produtosBanco.get(j).getQuantidade() - produtos.get(i).getQuantidade());
                    produt = produtosBanco.get(j);
                    controler.alterar(produt);
                }
            }
        }

    }
    public double caclValorTotal(){
//        calcula Valor total da venda
        return this.valorTotal;
    }
}
