/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import Repositorio.RepositorioPessoa;
import java.util.ArrayList;
import java.util.List;
import model.Pessoa;

/**
 *
 * @author Robson de Jesus
 */
public class Testes {

   static RepositorioPessoa rp = new RepositorioPessoa();
   
    public static void main(String[] args) {
        
        popularArray();
        listarPessoa();
        
        System.out.println("*******************Teste deletar**********************");
        
        rp.deletarPessoaPorCPF("09527658969");
        listarPessoa();
        
        
        
        System.out.println("**********teste alterar pessoa ******************");
        alterar();
        listarPessoa();
    }
    
    public static void alterar(){
        
        Pessoa pessoa2 = new Pessoa();
        pessoa2.setCpf("323232232323");
        pessoa2.setNome("Luiz de souza pinto");
        pessoa2.setEndereco("Rio do sul fim da rua");
        rp.alterarPessoa(pessoa2);
        
    }
    
    public static void popularArray(){
        Pessoa pessoa1 = new Pessoa();
        pessoa1.setCpf("09527658969");
        pessoa1.setNome("Robson");
        pessoa1.setEndereco("Rua jose wagner");
        rp.salvarPessoa(pessoa1);
        
        Pessoa pessoa2 = new Pessoa();
        pessoa2.setCpf("323232232323");
        pessoa2.setNome("Luiz de souza");
        pessoa2.setEndereco("Rio do sul");
        rp.salvarPessoa(pessoa2);
    }
    
    public static void listarPessoa(){
        
        List<Pessoa> lista = new ArrayList<Pessoa>();
        
        lista = rp.listarPessoa();
        
        for(Pessoa pessoa: lista){
            System.out.println("CPF: " + pessoa.getCpf());
            System.out.println("NOME: " + pessoa.getNome());
            System.out.println("ENDEREÇO: " + pessoa.getEndereco());
            System.out.println("-------------------------------------");
        }
        
    }

}
