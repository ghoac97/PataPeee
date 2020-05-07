/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import connection.connectionFactory;
import java.awt.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author crisdut
 */
public class ProdutosDao {

    public void create(Produtos p) {
        Connection con = connectionFactory.getConnection();
        PreparedStatement stmt = null;
        try {
            //            stmt= con.prepareStatement("INSERT INTO alunos(ra,nome) values (?,?)");
            // stmt = con.prepareStatement("INSERT INTO produtos(nome,descricao,data_validade,categoria,quantidade,valor,cod_for) values ('TapeteHigienico','tapetesparapets','2021-04-14','v',20,40,2)");

            stmt = con.prepareStatement("INSERT INTO Produtos(nome,cod_prod,cod_for,descricao,data_validade,categoria,quantidade,valor) values (?,?,?,?,?,?,?,?)");
            System.out.println(stmt);
            stmt.setString(1, p.getnome());
            stmt.setInt(2, p.getcod_prod());
            stmt.setInt(3, p.getcod_for());
            stmt.setString(4, p.getdescricao());
            stmt.setString(5, p.getdata_validade());
            stmt.setString(6, p.getcategoria());
            stmt.setInt(7, p.getquantidade());
            stmt.setInt(8, p.getvalor());

            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Inserido.");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        } finally {
            connectionFactory.closeConnection(con, stmt);
        }
    }

    public void delete(Produtos p) {
        Connection con = connectionFactory.getConnection();
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement("delete from produtos where cod_prod=?;");
            stmt.setInt(1, p.getcod_prod());

            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Excluido com sucesso");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        } finally {
            connectionFactory.closeConnection(con, stmt);
        }
    }

    public void update(Produtos p) {
        Connection con = connectionFactory.getConnection();
        PreparedStatement stmt = null;
        try {
            //("INSERT INTO Produtos(nome,cod_prod,cod_for,descricao,"
            //      + "data_validade,categoria,quantidade,valor) values (?,?,?,?,?,?,?,?)");
            stmt = con.prepareStatement("update Produtos set nome=?, cod_prod=?, cod_for=?, descricao=?, data_validade=?, "
                    + "categoria=? ,quantidade=?, valor = ? where cod_prod=?;");
            stmt.setString(1, p.getnome());
            stmt.setInt(2, p.getcod_prod());
            stmt.setInt(3, p.getcod_for());
            stmt.setString(4, p.getdescricao());
            stmt.setString(5, p.getdata_validade());
            stmt.setString(6, p.getcategoria());
            stmt.setInt(7, p.getquantidade());
            stmt.setInt(8, p.getvalor());
            stmt.setInt(9, p.getcod_prod());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Atualizado com sucesso");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        } finally {
            connectionFactory.closeConnection(con, stmt);
        }
    }

     public ArrayList<Produtos> getContatos(){
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        ArrayList<Produtos> Produto = new ArrayList<Produtos>();
        try {
            
            conn = connectionFactory.getConnection();
            stmt = conn.prepareStatement("select * from Produtos");
            rs = stmt.executeQuery();
            while (rs.next()) {
                Produtos Produtos = new Produtos(); 
                
                Produtos.setcod_prod(Integer.parseInt(rs.getString("Código I")));
                Produtos.setcod_for(Integer.parseInt(rs.getString("Código II"))); 
                Produtos.setnome(rs.getString("Nome"));
                Produtos.setdescricao(rs.getString("Descrição"));
                Produtos.setdata_validade(rs.getString("Validade"));
                Produtos.setcategoria(rs.getString("Categoria"));
                Produtos.setvalor(Integer.parseInt(rs.getString("Valor")));
                Produtos.setquantidade(Integer.parseInt(rs.getString("Qtd.")));

                Produto.add(Produtos);
            }
            connectionFactory.closeConnection(conn, stmt, rs);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao listar contatos" + e.getMessage());
        }
        return Produto;
    }

}


