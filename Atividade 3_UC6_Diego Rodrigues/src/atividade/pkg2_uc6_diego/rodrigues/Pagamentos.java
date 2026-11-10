package atividade.pkg2_uc6_diego.rodrigues;

import java.util.ArrayList;
import java.util.List;

public class Pagamentos {
    private String nomeEmpresa;
    // Lista flexível sem limite de tamanho usando Generics para aceitar o contrato Imposto
    private List<Imposto> listaImpostos;

    // Construtor
    public Pagamentos(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
        this.listaImpostos = new ArrayList<>(); // Inicializando a lista dinâmica
    }

    // Método para adicionar qualquer tipo de imposto na lista
    public void adicionarImposto(Imposto imposto) {
        this.listaImpostos.add(imposto);
    }

    // Getters e Setters para o Encapsulamento
    public String getNomeEmpresa() { 
        return nomeEmpresa; 
    }
    
    public void setNomeEmpresa(String nomeEmpresa) { 
        this.nomeEmpresa = nomeEmpresa; 
    }

    public List<Imposto> getListaImpostos() { 
        return listaImpostos; 
    }
    
    public void setListaImpostos(List<Imposto> listaImpostos) { 
        this.listaImpostos = listaImpostos; 
    }
}