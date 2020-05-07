package model;

import connection.connectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class FornecedoresDao {

    public void create(Fornecedores p) {
        Connection con = connectionFactory.getConnection();
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement("INSERT INTO Fornecedores(nome,data_cadastro,cpf_cnpj,tipo,telefone,celular,endereco,cidade,bairro,cep,uf,email) values (?,?,?,?,?,?,?,?,?,?,?,?)");
            
            // stmt.setInt(1, p.getcod_for());
            stmt.setString(1, p.getnome());
            stmt.setString(2, p.getdata_cadastro());
            stmt.setString(3, p.getcpf_cnpj());
            stmt.setString(4, p.gettipo());
            stmt.setString(5, p.gettelefone());
            stmt.setString(6, p.getcelular());
            stmt.setString(7, p.getendereco());
            stmt.setString(8, p.getcidade());
            stmt.setString(9, p.getbairro());
            stmt.setString(10, p.getcep());
            stmt.setString(11, p.getuf());
            stmt.setString(12, p.getemail());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Inserido.");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        } finally {
            connectionFactory.closeConnection(con, stmt);
        }
    }

    public void delete(Fornecedores p) {
        Connection con = connectionFactory.getConnection();
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement("delete from Fornecedores where cod_for=?;");
            stmt.setInt(1, p.getcod_for());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Excluido com sucesso");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        } finally {
            connectionFactory.closeConnection(con, stmt);
        }
    }

    public void update(Fornecedores p) {
        Connection con = connectionFactory.getConnection();
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement("update Fornecedores set nome=?,data_cadastro=?,cpf_cnpj=?,tipo=?,telefone=?,celular=?,endereco=?,cidade=?,bairro=?,cep=?,uf=?,email=? where cpf_cnpj=? ");
            //stmt.setInt(1, p.getcod_for());
            stmt.setString(1, p.getnome());
            stmt.setString(2, p.getdata_cadastro());
            stmt.setString(3, p.getcpf_cnpj());
            stmt.setString(4, p.gettipo());
            stmt.setString(5, p.gettelefone());
            stmt.setString(6, p.getcelular());
            stmt.setString(7, p.getendereco());
            stmt.setString(8, p.getcidade());
            stmt.setString(9, p.getbairro());
            stmt.setString(10, p.getcep());
            stmt.setString(11, p.getuf());
            stmt.setString(12, p.getemail());
            stmt.setString(13, p.getcpf_cnpj());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Atualizado com sucesso");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        } finally {
            connectionFactory.closeConnection(con, stmt);
        }
    }

}
