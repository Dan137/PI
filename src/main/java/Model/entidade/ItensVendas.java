/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.entidade;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Daniel
 */
@Entity
@Table(name = "itenVenda")
public class ItensVendas implements Serializable {


    @Id
    @GeneratedValue
    private int id;
    private int quantidade;
    private double valorTot;
    @OneToMany (mappedBy="itemVenda")
    private List<Produto> produtos;
    @OneToMany (mappedBy="itemVenda")
    private List<Vendas> vendas;
   
    
     
    public ItensVendas() {
    }

    public ItensVendas(int id, int quantidade, double valorTot, List<Produto> produtos, List<Vendas> vendas) {

        this.id = id;
        this.quantidade = quantidade;
        this.valorTot = valorTot;
        this.produtos=produtos;
        this.vendas =vendas;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getValorTot() {
        return valorTot;
    }

    public void setValorTot(double valorTot) {
        this.valorTot = valorTot;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public List<Vendas> getVendas() {
        return vendas;
    }

    public void setVendas(List<Vendas> vendas) {
        this.vendas = vendas;
    }

   
    

}
