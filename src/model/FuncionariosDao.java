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
import java.util.ArrayList;
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
            String cmd = "INSERT INTO Funcionarios(cod_func,nome,cpf,rg,data_nacimento,nome_pai,nome_mae," 
                        + "estado_civil,titulo_eleitor,nacionalidade,naturalidade,uf_n,cam,telefone,celular,endereco,cidade,bairro,"
                        + "cep,uf,email,pis_pasep,ctps,uf_c,cargo,data_admissao,remuneracao,horario_trabalho) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            stmt = con.prepareStatement(cmd.toLowerCase());
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
            String cmd = "delete from Funcionarios where cod_func=?;";
            stmt = con.prepareStatement(cmd.toLowerCase());
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
            String cmd = "update Funcionarios set cod_func=?,nome=?,cpf=?,rg=?,data_nacimento=?,nome_pai=?,nome_mae=?,"
                    + "estado_civil=?,titulo_eleitor=?,nacionalidade=?,naturalidade=?,uf_n=?,cam=?,telefone=?,celular=?,endereco=?,cidade=?,bairro=?"
                    + "cep=?,uf=?,email=?,pis_pasep=?,ctps=?,uf_c=?,cargo=?,data_admissao=?,remuneracao=?,horario_trabalho=? where cod_func=?";
            stmt = con.prepareStatement(cmd.toLowerCase());            
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
    
    public ArrayList<Funcionarios> getContatos(String nome) {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        ArrayList<Funcionarios> funcionarios = new ArrayList<Funcionarios>();
        try {
            conn = connectionFactory.getConnection();
            stmt = conn.prepareStatement("select * from Funcionarios where nome like ?".toLowerCase());
            stmt.setString(1, '%' + nome + '%');
            rs = stmt.executeQuery();
            while (rs.next()) {
                Funcionarios funcionario = new Funcionarios();
                funcionario.setcod_func(rs.getInt("cod_func"));
                funcionario.setnome(rs.getString("nome"));
                funcionario.setcpf(rs.getString("cpf"));
                funcionario.setrg(rs.getString("rg"));
                funcionario.setdata_nascimento(rs.getString("data_nacimento"));
                funcionario.setnome_pai(rs.getString("nome_pai"));
                funcionario.setnome_mae(rs.getString("nome_mae"));
                funcionario.setestado_civil(rs.getString("estado_civil"));
                funcionario.settitulo_eleitor(rs.getString("titulo_eleitor"));
                funcionario.setnacionalidade(rs.getString("nacionalidade"));
                funcionario.setnaturalidade(rs.getString("naturalidade"));
                funcionario.setuf_n(rs.getString("uf_n"));
                funcionario.setcam(rs.getInt("cam"));
                funcionario.settelefone(rs.getString("telefone"));
                funcionario.setcelular(rs.getString("celular"));
                funcionario.setendereco(rs.getString("endereco"));
                funcionario.setcidade(rs.getString("cidade"));                
                funcionario.setbairro(rs.getString("bairro"));
                funcionario.setcep(rs.getString("cep"));
                funcionario.setuf(rs.getString("uf"));
                funcionario.setemail(rs.getString("email"));
                funcionario.setpis_pasep(rs.getString("pis_pasep"));
                funcionario.setctps(rs.getString("ctps"));
                funcionario.setuf_c(rs.getString("uf_c"));
                funcionario.setcargo(rs.getString("cargo"));
                funcionario.setdata_admissao(rs.getString("data_admissao"));
                funcionario.setremuneracao(rs.getInt("remuneracao"));
                funcionario.sethorario_trabalho(rs.getInt("horario_trabalho"));
                funcionarios.add(funcionario);
            }
            
            connectionFactory.closeConnection(conn, stmt, rs);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao listar contatos" + e.getMessage());
        }
        return funcionarios;
    }
    
    public ArrayList<Funcionarios> all() {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        ArrayList<Funcionarios> funcionarios = new ArrayList<Funcionarios>();
        try {
            conn = connectionFactory.getConnection();
            stmt = conn.prepareStatement("select * from Funcionarios order by nome".toLowerCase());
            
            rs = stmt.executeQuery();
            while (rs.next()) {
                Funcionarios funcionario = new Funcionarios();
                funcionario.setcod_func(rs.getInt("cod_func"));
                funcionario.setnome(rs.getString("nome"));
                funcionario.setcpf(rs.getString("cpf"));
                funcionario.setrg(rs.getString("rg"));
                funcionario.setdata_nascimento(rs.getString("data_nacimento"));
                funcionario.setnome_pai(rs.getString("nome_pai"));
                funcionario.setnome_mae(rs.getString("nome_mae"));
                funcionario.setestado_civil(rs.getString("estado_civil"));
                funcionario.settitulo_eleitor(rs.getString("titulo_eleitor"));
                funcionario.setnacionalidade(rs.getString("nacionalidade"));
                funcionario.setnaturalidade(rs.getString("naturalidade"));
                funcionario.setuf_n(rs.getString("uf_n"));
                funcionario.setcam(rs.getInt("cam"));
                funcionario.settelefone(rs.getString("telefone"));
                funcionario.setcelular(rs.getString("celular"));
                funcionario.setendereco(rs.getString("endereco"));
                funcionario.setcidade(rs.getString("cidade"));                
                funcionario.setbairro(rs.getString("bairro"));
                funcionario.setcep(rs.getString("cep"));
                funcionario.setuf(rs.getString("uf"));
                funcionario.setemail(rs.getString("email"));
                funcionario.setpis_pasep(rs.getString("pis_pasep"));
                funcionario.setctps(rs.getString("ctps"));
                funcionario.setuf_c(rs.getString("uf_c"));
                funcionario.setcargo(rs.getString("cargo"));
                funcionario.setdata_admissao(rs.getString("data_admissao"));
                funcionario.setremuneracao(rs.getInt("remuneracao"));
                funcionario.sethorario_trabalho(rs.getInt("horario_trabalho"));
                funcionarios.add(funcionario);
            }
            
            connectionFactory.closeConnection(conn, stmt, rs);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao listar contatos" + e.getMessage());
        }
        return funcionarios;
    }

}
