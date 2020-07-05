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
 * @author HP HP
 */
public class EstoqueDAO {

    private Connection cn;

    public EstoqueDAO(Connection cn) {
        this.cn = cn;
    }

    public EstoquePO getEstoqueById(Integer pro_Id) throws Exception {

        EstoquePO estoque = null;

        String strQuery = "SELECT * FROM tb_Produto WHERE pro_Id = "
                + pro_Id.toString();
        Statement st = cn.createStatement();
        ResultSet rs = st.executeQuery(strQuery);

        if (rs.next()) {
            estoque = new EstoquePO(rs.getInt("pro_ID"), rs.getString("pro_Descricao"),
                    rs.getBigDecimal("pro_Preco"), rs.getDate("pro_DataCadastro"),
                    rs.getInt("pro_Estoque"));
        }

        return estoque;
    }

     public ArrayList<EstoquePO> GetEstoqueByQuery(String strQuery) throws Exception{
        ArrayList<EstoquePO> estoques = new ArrayList();
        
        Statement st = cn.createStatement();
        ResultSet rs = st.executeQuery(strQuery);
        EstoquePO estoque = null;

        while (rs.next()) {
            estoque = new EstoquePO(rs.getInt("pro_ID"), rs.getString("pro_Descricao"),
                    rs.getBigDecimal("pro_Preco"), rs.getDate("pro_DataCadastro"),
                    rs.getInt("pro_Estoque"));
            estoques.add(estoque);
        }
        return estoques;
    }

}
