/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import connection.connectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author blackNite
 */
public class Servico_precosDao {
   public void create(Servicos_precos p) {
        Connection con = connectionFactory.getConnection();
        PreparedStatement stmt = null;
        try {
            String cmd = "INSERT INTO Servicos_precos(cod_preco,cod_serv,porte,tempo,valor) values (?,?,?,?,?)";
            stmt = con.prepareStatement(cmd.toLowerCase());
            stmt.setInt(1, p.getcod_preco());
            stmt.setInt(2, p.getcod_serv());
            stmt.setString(3, p.getporte());
            stmt.setString(4, p.gettempo());
            stmt.setDouble(5, p.getvalor());

            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Inserido.");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        } finally {
            connectionFactory.closeConnection(con, stmt);
        }
    }

    public void delete(Servicos_precos p) {
        Connection con = connectionFactory.getConnection();
        PreparedStatement stmt = null;
        try {
            String cmd = "delete from Servicos_precos where cod_serv=?";
            stmt = con.prepareStatement(cmd.toLowerCase());
           
            stmt.setInt(1, p.getcod_serv());
       
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Excluido com sucesso");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        } finally {
            connectionFactory.closeConnection(con, stmt);
        }
    }

    public void update(Servicos_precos p) {
        Connection con = connectionFactory.getConnection();
        PreparedStatement stmt = null;
        try {
            String cmd = "update Servicos_precos set cod_preco=?,cod_serv=?,porte=?,tempo=?,valor=? where cod_serv=?";
            stmt = con.prepareStatement(cmd.toLowerCase());
            stmt.setInt(1, p.getcod_preco());
            stmt.setInt(2, p.getcod_serv());
            stmt.setString(3, p.getporte());
            stmt.setString(4, p.gettempo());
            stmt.setDouble(5, p.getvalor());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Atualizado com sucesso");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        } finally {
            connectionFactory.closeConnection(con, stmt);
        }
    }
    
    public Servicos_precos getPorPorte(Integer cod_serv, String porte){
        Servicos_precos preco = null;
        try {
            Connection conn = connectionFactory.getConnection();
            
            String query = "select * from servico_precos where cod_serv=? and porte = ?";
            PreparedStatement stmt = conn.prepareStatement(query.toLowerCase());
            stmt.setInt(1, cod_serv);
            stmt.setString(2, porte);
            
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                preco = new Servicos_precos();
                preco.setcod_preco(rs.getInt("cod_preco"));
                preco.setvalor(rs.getDouble("valor"));                
            }
            connectionFactory.closeConnection(conn, stmt, rs);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao listar contatos" + e.getMessage());
        }
        return preco;
    }

}