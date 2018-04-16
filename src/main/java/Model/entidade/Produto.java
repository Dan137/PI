/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.entidade;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Maycon
 */
@Entity
@Table(name = "produto")
public class Produto implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codProd")
    private Integer codigo;
    @Column(length = 50)
    private String nome;
    private Double preco;
    @Column(length = 20)
    private Integer quantidade;
    private String tipo;

    @ManyToOne
    @JoinColumn(name = "ItemVenda")
    private ItensVendas itemVenda;

    /*@ManyToOne*/
    //private Categoria categoria;
    /*@ManyToMany*/
    //private List<Produto> produtos;
    public Produto(Integer codigo, String nome, Double preco, Integer quantidade, String tipo, ItensVendas itemVenda) {

        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
        this.tipo = tipo;
        this.quantidade = quantidade;
        this.itemVenda = itemVenda;

    }

    public Produto() {

    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public ItensVendas getItemVenda() {
        return itemVenda;
    }

    public void setItemVenda(ItensVendas itemVenda) {
        this.itemVenda = itemVenda;
    }

    

}
