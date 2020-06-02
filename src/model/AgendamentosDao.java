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
public class AgendamentosDao {
    
 public void create(Agendamentos p) {
        Connection con = connectionFactory.getConnection();
        PreparedStatement stmt = null;
        try {
            String cmd = "INSERT INTO Agendamentos(cod_age,cod_pet,data_agendada) values (?,?,?)";
            stmt = con.prepareStatement(cmd.toLowerCase());
            stmt.setInt(1, p.getcod_age());
            stmt.setInt(2, p.getcod_pet());
            stmt.setString(3, p.getdata_agendada());

            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Inserido.");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        } finally {
            connectionFactory.closeConnection(con, stmt);
        }
    }

    public void delete(Agendamentos p) {
        Connection con = connectionFactory.getConnection();
        PreparedStatement stmt = null;
        try {
            String cmd = "delete from Agendamentos where cod_pet=?";
            stmt = con.prepareStatement(cmd.toLowerCase());
            stmt.setInt(1, p.getcod_pet());
       
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Excluido com sucesso");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        } finally {
            connectionFactory.closeConnection(con, stmt);
        }
    }

    public void update(Agendamentos p) {
        Connection con = connectionFactory.getConnection();
        PreparedStatement stmt = null;
        try {
            String cmd = "update Agendamentos set cod_age=?,cod_pet=?,data_agendada=? where cod_pet=?";
            stmt = con.prepareStatement(cmd.toLowerCase());
            stmt.setInt(1, p.getcod_age());
            stmt.setInt(2, p.getcod_pet());
            stmt.setString(3, p.getdata_agendada());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Atualizado com sucesso");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        } finally {
            connectionFactory.closeConnection(con, stmt);
        }
    }

}
