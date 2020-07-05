
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Pablo Pierre
 */
public class PessoasPO04 {

    /*
create table Pessoas(
id_Pessoa int not null primary key,
nome varchar(100) not null,
rating float,
iniciante bit,
)
     */

    public Integer id_Pessoa;
    public String nome;
    public float rating;
    public Boolean iniciante;

    public PessoasPO04(Integer id_Pessoa, String nome, float rating, Boolean iniciante) {
        this.id_Pessoa = id_Pessoa;
        this.nome = nome;
        this.rating = rating;
        this.iniciante = iniciante;
    }

   

}
