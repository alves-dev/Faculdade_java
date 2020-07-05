/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula1;

/**
 *
 * @author aluno
 */
public class Dependente extends Funcionario{
    
    String responsavel;
    

    public Dependente(String nome, int idade, String matricula, String responsavel) {
        super(nome, idade, matricula);
        this.responsavel = super.getMatricula();
    }
    
    
}
