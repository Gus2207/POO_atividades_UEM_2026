package com.example;

public class Empresa {
    private String razaoSocial;
    private String nomeFantasia;
    private CNPJ cnpj;

    public Empresa(CNPJ cnpj, String nomeFantasia, String razaoSocial) {
        this.cnpj = cnpj;
        this.nomeFantasia = nomeFantasia;
        this.razaoSocial = razaoSocial;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public CNPJ getCnpj() {
        return cnpj;
    }

    public void exibirEmpresa(){
        System.out.println("");
        System.out.println("Razão social: " + getRazaoSocial());
        System.out.println("Nome fantasia: " + getNomeFantasia());
        System.out.println("cnpj: " + getCnpj().getNumero());
        System.out.println("Situação: " + getCnpj().getSituacaoCadastral());
    }
    
}
