/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetoaula.Persistencia;

import com.mysql.cj.protocol.Resultset;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import projetoaula.Model.projeto;




/**
 *
 * @author lucas
 */
public class JDBCprojeto {
    
    Connection conexao;
    
    
    public JDBCprojeto(Connection conexao){
        this.conexao = conexao;
    }
    
    public void cadastrarProjeto(projeto proj){
        String sql = "insert into tblprojeto(nome,descricao,idProprietario) values(?,?,?)";
        PreparedStatement ps;
        
        try{
            ps = this.conexao.prepareStatement(sql);
            
            ps.setString(1, proj.getNomeProjeto());
            ps.setString(2, proj.getDescProjeto());
            ps.setString(3, String.valueOf(proj.getIdProprietario()));
            
            ps.execute();
        }catch(SQLException ex){
            ex.printStackTrace();
        }
    }
    
     public projeto buscarProjeto(int idProjetoRecebido){

        String sql = "select * from tblprojeto where idProjeto=?";
        PreparedStatement ps;
        projeto project = null;
        
        try{
            ps = this.conexao.prepareStatement(sql);
            
            ps.setString(1, String.valueOf(idProjetoRecebido));
            
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                int idProjeto = rs.getInt("idProjeto");
                String nomeProjeto = rs.getString("nome");
                String descricao = rs.getString("descricao");
                int idProprietario = Integer.parseInt(rs.getString("idProprietario"));
                
                project = new projeto(idProjeto, nomeProjeto, descricao, idProprietario);
            }
            
        }catch(SQLException ex){
            ex.printStackTrace();
        }
        return project;
    }
    
    
     public ArrayList<projeto> buscarTodosProjetos(){
    
        ArrayList<projeto> projectList = new ArrayList<projeto>();
        
        String sql = "SELECT * FROM tblprojeto";
    
        try{
            Statement st = conexao.createStatement();
        
             ResultSet resultado = st.executeQuery(sql);
        
             while(resultado.next()){
                 int idProjeto = resultado.getInt("idProjeto");
                 String nome = resultado.getString("nome");
                 String descricao = resultado.getString("descricao");
                 int idProprietario = resultado.getInt("idProprietario");
                 
                 projeto project = new projeto(idProjeto, nome, descricao, idProprietario);
                 projectList.add(project);
             }
        }catch(SQLException ex){
            ex.printStackTrace();
        }
        
        return projectList;
    }
    
      public ArrayList<projeto> buscarProjetosPorNome(String nomeProject) {

        ArrayList<projeto> listProject = new ArrayList<projeto>();

        String sql = "select * from tblprojeto inner join tblusuario on tblusuario.idUsuario = tblprojeto.idProprietario where nome = ?";
        PreparedStatement ps;
        projeto project;

        try {

            ps = this.conexao.prepareStatement(sql);

            ps.setString(1, nomeProject);

            System.out.println(ps);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                int idProjeto = rs.getInt("idProjeto");
                String nomeProjeto = rs.getString("nome");
                String descricao = rs.getString("descricao");
                int idProprietario = Integer.parseInt(rs.getString("idProprietario"));
                String nomeProprietario = rs.getString("nomeCompleto");

                project = new projeto(idProjeto, nomeProjeto, descricao, idProprietario, nomeProprietario);
                listProject.add(project);
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return listProject;
    }
      
       public ArrayList<projeto> buscarProjetoRelatorio(int idProjetoRecebido) {

        ArrayList<projeto> projectList = new ArrayList<projeto>();
        
        String sql = "select * from tblprojeto inner join tblusuario on tblusuario.idUsuario = tblprojeto.idProprietario where idProjeto=?";
        PreparedStatement ps;
        projeto project = null;

        try {
            ps = this.conexao.prepareStatement(sql);

            ps.setString(1, String.valueOf(idProjetoRecebido));

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                int idProjeto = rs.getInt("idProjeto");
                String nomeProjeto = rs.getString("nome");
                String descricao = rs.getString("descricao");
                int idProprietario = Integer.parseInt(rs.getString("idProprietario"));
                String nomeProprietario = rs.getString("nomeCompleto");

                project = new projeto(idProjeto, nomeProjeto, descricao, idProprietario, nomeProprietario);
                projectList.add(project);
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return projectList;
    }
       
     
     
    public ArrayList<projeto> buscarProjetosResponsavel(int idResponsavel){

        ArrayList<projeto> listProject = new ArrayList<projeto>();
        
        String sql = "select * from tblprojeto where idProprietario=?";
        PreparedStatement ps;
        projeto project;
        
        try{
            ps = this.conexao.prepareStatement(sql);
            
            ps.setString(1, String.valueOf(idResponsavel));
            
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                int idProjeto = rs.getInt("idProjeto");
                String nomeProjeto = rs.getString("nome");
                String descricao = rs.getString("descricao");
                int idProprietario = Integer.parseInt(rs.getString("idProprietario"));
                
                project = new projeto(idProjeto, nomeProjeto, descricao, idProprietario);
                listProject.add(project);
            }
            
        }catch(SQLException ex){
            ex.printStackTrace();
        }
        return listProject;
    }
     
     
     
     public void AtualizarDadosProjeto(int idProjeto, projeto project){
        
        String sql = "UPDATE tblprojeto SET "
                + "nome=?, "
                + "descricao=?, "
                + "idProprietario=? WHERE idProjeto=?";
        
        PreparedStatement ps;
        
        try{
            ps = this.conexao.prepareStatement(sql);
            
            ps.setString(1, project.getNomeProjeto());
            ps.setString(2, project.getDescProjeto());
            ps.setString(3, String.valueOf(project.getIdProprietario()));
            ps.setString(4, String.valueOf(idProjeto));
            
            ps.execute();
        }catch(SQLException ex){ 
            ex.printStackTrace();
        }
    }
     
      public void DeletarProjeto(int idProjeto){
        
        String sql = "DELETE FROM tblprojeto WHERE idProjeto=?";
        PreparedStatement ps;
        
        try{
            ps = this.conexao.prepareStatement(sql);
            
            ps.setString(1, String.valueOf(idProjeto));
            ps.execute();
        }catch(SQLException ex){
            ex.printStackTrace();
        }
    }
    
}
