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
public class Agendamento_servicosDao {
    
 public void create(Agendamento_servicos p) {
        Connection con = connectionFactory.getConnection();
        PreparedStatement stmt = null;
        try {

            stmt = con.prepareStatement("INSERT INTO Agendamento_servicos(cod_age,getcod_serv) values (?,?)");
            stmt.setInt(1, p.getcod_age());
            stmt.setInt(2, p.getcod_serv());

            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Inserido.");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        } finally {
            connectionFactory.closeConnection(con, stmt);
        }
    }

    public void delete(Agendamento_servicos p) {
        Connection con = connectionFactory.getConnection();
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement("delete from Agendamento_servicos where cod_serv=?;");
            stmt.setInt(1, p.getcod_serv());
       
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Excluido com sucesso");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        } finally {
            connectionFactory.closeConnection(con, stmt);
        }
    }

    public void update(Agendamento_servicos p) {
        Connection con = connectionFactory.getConnection();
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement("update Agendamento_servicos set cod_age=?,getcod_serv=? where cod_serv=? ");
            stmt.setInt(1, p.getcod_age());
            stmt.setInt(2, p.getcod_serv());

            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Atualizado com sucesso");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        } finally {
            connectionFactory.closeConnection(con, stmt);
        }
    }

}