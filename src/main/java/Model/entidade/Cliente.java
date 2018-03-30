/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.entidade;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Daniel
 */
@Entity
@Table(name = "cliente")
public class Cliente implements Serializable{
    @GeneratedValue()
    @Id
    private Integer codigo;
    private String nome;
    private Date dataAbertura;
    private String cpf;
    private String pai;
    private String mae;
    private String email;
    private String telefone;

    public Cliente( Integer codigo, String nome, Date dataAbertura, String cpf, String pai, String mae, String email, String telefone) {
       
        this.codigo= codigo;
        this.nome = nome;
        this.dataAbertura = dataAbertura;
        this.pai = pai;
        this.mae = mae;
        this.email = email;
        this.telefone = telefone;
        this.cpf=cpf;
    }

    public Cliente() {
        
    }
    

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    
    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the dataAbertura
     */
    public Date getDataAbertura() {
        return dataAbertura;
    }

    /**
     * @param dataAbertura the dataAbertura to set
     */
    public void setDataAbertura(Date dataAbertura) {
        this.dataAbertura = dataAbertura;
    }

    /**
     * @return the pai
     */
    public String getPai() {
        return pai;
    }

    /**
     * @param pai the pai to set
     */
    public void setPai(String pai) {
        this.pai = pai;
    }

    /**
     * @return the mae
     */
    public String getMae() {
        return mae;
    }

    /**
     * @param mae the mae to set
     */
    public void setMae(String mae) {
        this.mae = mae;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the telefone
     */
    public String getTelefone() {
        return telefone;
    }

    /**
     * @param telefone the telefone to set
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    /**
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
}
