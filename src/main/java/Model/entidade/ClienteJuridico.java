/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.entidade;

import java.util.Date;

/**
 *
 * @author Daniel
 */
public class ClienteJuridico extends Cliente{
//    duvida
   
    private String cnpj;

    public ClienteJuridico(String cnpj, Integer codigo, String nome, Date dataAbertura, String cpf, String pai, String mae, String email, String telefone) {
        super(codigo, nome, dataAbertura, cpf, pai, mae, email, telefone);
        this.cnpj = cnpj;
    }

    public ClienteJuridico(String cnpj) {
        this.cnpj = cnpj;
    }

    /**
     * @return the cnpj
     */
    public String getCnpj() {
        return cnpj;
    }

    /**
     * @param cnpj the cnpj to set
     */
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    
    
}
