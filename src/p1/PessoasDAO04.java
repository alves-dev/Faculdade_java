/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Pablo Pierre
 */
public class PessoasDAO04 {

    private Connection cn;

    public PessoasDAO04(Connection cn) {
        this.cn = cn;
    }

    public PessoasPO04 GetPessoaById(Integer id_Pessoa) throws Exception {
        PessoasPO04 pessoa = null;

        String strQuery = "SELECT * FROM Pessoas WHERE id_Pessoa = "
                + id_Pessoa.toString();
        Statement st = cn.createStatement();
        ResultSet rs = st.executeQuery(strQuery);

        if (rs.next()) {
            pessoa = new PessoasPO04(rs.getInt("id_Pessoa"), rs.getString("nome"),
                    rs.getFloat("rating"), rs.getBoolean("iniciante"));
        }

        return pessoa;
    }

    public ArrayList<PessoasPO04> GetPessoaByQuery(String strQuery) throws Exception{
        ArrayList<PessoasPO04> pessoas = new ArrayList();
        
        Statement st = cn.createStatement();
        ResultSet rs = st.executeQuery(strQuery);
        PessoasPO04 pessoa = null;

        while (rs.next()) {
            pessoa = new PessoasPO04(rs.getInt("id_Pessoa"), rs.getString("nome"),
                    rs.getFloat("rating"), rs.getBoolean("iniciante"));
            pessoas.add(pessoa);
        }
        return pessoas;
    }
}
