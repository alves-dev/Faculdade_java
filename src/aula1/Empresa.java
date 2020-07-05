/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula1;

import aula1.Dependente;

/**
 *
 * @author aluno
 */
public class Empresa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        
        Dependente dep = new Dependente("igor", 19, "6546m", null);
        
        System.out.println(dep.nome + "  " + dep.idade + "  " + dep.getMatricula() +"  "+ dep.responsavel);
        
        
        
        
        
        
        // TODO code application logic here
    }
    
}
