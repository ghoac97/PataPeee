/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import connection.connectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
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
            stmt.setString(5, p.getvalor());

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
            stmt.setString(5, p.getvalor());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Atualizado com sucesso");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        } finally {
            connectionFactory.closeConnection(con, stmt);
        }
    }

}