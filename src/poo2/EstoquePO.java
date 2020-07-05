
import java.sql.Date;
import java.math.BigDecimal;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author HP HP
 */
public class EstoquePO {

    //PRO_ID int not null primary key,
    //PRO_Descricao varchar(100) not null,
    //PRO_Preco numeric(9,2) not null,
    //PRO_DataCadastro date not null,
    //PRO_Estoque int null
    
    public Integer pro_ID;
    public String pro_Descricao;
    public BigDecimal pro_Preco;
    public Date pro_DataCadastro;
    public Integer pro_Estoque;

    public EstoquePO(Integer pro_ID, String pro_Descricao, BigDecimal pro_Preco, Date pro_DataCadastro, Integer pro_Estoque) {
        this.pro_ID = pro_ID;
        this.pro_Descricao = pro_Descricao;
        this.pro_Preco = pro_Preco;
        this.pro_DataCadastro = pro_DataCadastro;
        this.pro_Estoque = pro_Estoque;
    }


}
