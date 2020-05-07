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
public class FuncionariosDao {

    public void create(Funcionarios p) {
        Connection con = connectionFactory.getConnection();
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement("INSERT INTO Funcionarios(cod_func,nome,cpf,rg,data_nacimento,nome_pai,nome_mae,"
                    + "estado_civil,titulo_eleitor,nacionalidade,naturalidade,uf_n,cam,telefone,celular,endereco,cidade,bairro"
                    + "cep,uf,email,pis_pasep,ctps,uf_c,cargo,data_admissao,remuneracao,horario_trabalho) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            stmt.setInt(1, p.getcod_func());
            stmt.setString(2, p.getnome());
            stmt.setString(3, p.getcpf());
            stmt.setString(4, p.getrg());
            stmt.setString(5, p.getdata_nacimento());
            stmt.setString(6, p.getnome_pai());
            stmt.setString(7, p.getnome_mae());
            stmt.setString(8, p.getestado_civil());
            stmt.setString(9, p.gettitulo_eleitor());
            stmt.setString(10, p.getnacionalidade());
            stmt.setString(11, p.getnaturalidade());
            stmt.setString(12, p.getuf_n());
            stmt.setInt(13, p.getcam());
            stmt.setString(14, p.gettelefone());
            stmt.setString(15, p.getcelular());
            stmt.setString(16, p.getendereco());
            stmt.setString(17, p.getcidade());
            stmt.setString(18, p.getbairro());
            stmt.setString(19, p.getcep());
            stmt.setString(20, p.getuf());
            stmt.setString(21, p.getemail());
            stmt.setString(22, p.getpis_pasep());
            stmt.setString(23, p.getctps());
            stmt.setString(24, p.getuf_c());
            stmt.setString(25, p.getcargo());
            stmt.setString(26, p.getdata_admissao());
            stmt.setInt(27, p.getremuneracao());
            stmt.setInt(27, p.gethorario_trabalho());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Inserido.");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        } finally {
            connectionFactory.closeConnection(con, stmt);
        }
    }

    public void delete(Funcionarios p) {
        Connection con = connectionFactory.getConnection();
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement("delete from Funcionarios where cod_func=?;");
            stmt.setInt(1, p.getcod_func());
            
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Excluido com sucesso");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        } finally {
            connectionFactory.closeConnection(con, stmt);
        }
    }

    public void update(Funcionarios p) {
        Connection con = connectionFactory.getConnection();
        PreparedStatement stmt = null;
        try {
           stmt = con.prepareStatement("update Funcionarios set cod_func=?,nome=?,cpf=?,rg=?,data_nacimento=?,nome_pai=?,nome_mae=?,"
                    + "estado_civil=?,titulo_eleitor=?,nacionalidade=?,naturalidade=?,uf_n=?,cam=?,telefone=?,celular=?,endereco=?,cidade=?,bairro=?"
                    + "cep=?,uf=?,email=?,pis_pasep=?,ctps=?,uf_c=?,cargo=?,data_admissao=?,remuneracao=?,horario_trabalho=? where cod_func=?;");
            stmt.setInt(1, p.getcod_func());
            stmt.setString(2, p.getnome());
            stmt.setString(3, p.getcpf());
            stmt.setString(4, p.getrg());
            stmt.setString(5, p.getdata_nacimento());
            stmt.setString(6, p.getnome_pai());
            stmt.setString(7, p.getnome_mae());
            stmt.setString(8, p.getestado_civil());
            stmt.setString(9, p.gettitulo_eleitor());
            stmt.setString(10, p.getnacionalidade());
            stmt.setString(11, p.getnaturalidade());
            stmt.setString(12, p.getuf_n());
            stmt.setInt(13, p.getcam());
            stmt.setString(14, p.gettelefone());
            stmt.setString(15, p.getcelular());
            stmt.setString(16, p.getendereco());
            stmt.setString(17, p.getcidade());
            stmt.setString(18, p.getbairro());
            stmt.setString(19, p.getcep());
            stmt.setString(20, p.getuf());
            stmt.setString(21, p.getemail());
            stmt.setString(22, p.getpis_pasep());
            stmt.setString(23, p.getctps());
            stmt.setString(24, p.getuf_c());
            stmt.setString(25, p.getcargo());
            stmt.setString(26, p.getdata_admissao());
            stmt.setInt(27, p.getremuneracao());
            stmt.setInt(27, p.gethorario_trabalho());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Atualizado com sucesso");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        } finally {
            connectionFactory.closeConnection(con, stmt);
        }
    }

}
