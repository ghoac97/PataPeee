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
public class PetsDao {

    public void create(Pets p) {
        Connection con = connectionFactory.getConnection();
        PreparedStatement stmt = null;
        try {
            String cmd = "INSERT INTO Pets(nome,porte,especie,raca,idade,cor, sexo, cod_cli) values (?,?,?,?,?,?,?,?)";
            stmt = con.prepareStatement(cmd.toLowerCase());
            stmt.setString(1, p.getnome());
            stmt.setString(2, p.getporte());
            stmt.setString(3, p.getespecie());
            stmt.setString(4, p.getraca());
            stmt.setInt(5, p.getidade());
            stmt.setString(6, p.getcor());
            stmt.setString(7, p.getsexo());
            stmt.setInt(8, p.getcod_cli());

            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Inserido.");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        } finally {
            connectionFactory.closeConnection(con, stmt);
        }
    }

    public void delete(Pets p) {
        Connection con = connectionFactory.getConnection();
        PreparedStatement stmt = null;
        try {
            String cmd = "delete from Pets where cod_pet=?";
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

    public void update(Pets p) {
         Connection con = connectionFactory.getConnection();
        PreparedStatement stmt = null;
        try {
            String cmd = "update Pets set cod_pet=?,cod_cli=?,nome=?,porte=?,especie=?,raca=?,sexo=?,idade=?,cor=? where cod_pet=?";
            stmt = con.prepareStatement(cmd.toLowerCase());
            stmt.setInt(1, p.getcod_pet());
            stmt.setInt(2, p.getcod_cli());
            stmt.setString(3, p.getnome());
            stmt.setString(4, p.getporte());
            stmt.setString(5, p.getespecie());
            stmt.setString(6, p.getraca());
            stmt.setString(7, p.getsexo());
            stmt.setInt(8, p.getidade());
            stmt.setString(9, p.getcor());

            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Atualizado com sucesso");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        } finally {
            connectionFactory.closeConnection(con, stmt);
        }
    }

}
