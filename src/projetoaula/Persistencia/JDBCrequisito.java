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
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import projetoaula.Model.requisito;
/**
 *
 * @author lucas
 */
public class JDBCrequisito {
    Connection conexao;
    
    SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd"); 
    
    
    
    public JDBCrequisito(Connection conexao){
        this.conexao = conexao;
    }
    
    public void cadastrarRequisito(requisito req){
    
        String sql = "insert into tblrequisitos(nome,modulo,funcionalidade,dataCriacao,ultimaMod,"
                + "ultimaModAut,versao,prioridade,complexibilidade,esfEstimado,estado,fase,descricao,"
                + "idProjeto, idUsuario, autor) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        
        PreparedStatement ps;
        
        try{
            ps = this.conexao.prepareStatement(sql);
            
            ps.setString(1, req.getNome());
            ps.setString(2, req.getModulo());
            ps.setString(3, req.getFuncionalidade());
            ps.setString(4, formato.format(req.getDataCriacao()));
            ps.setString(5, formato.format(req.getUltimaMod()));
            ps.setString(6, req.getUltimaModAut());
            ps.setString(7, req.getVersao());
            ps.setString(8, req.getPrioridade());
            ps.setString(9, req.getComplexibilidade());
            ps.setString(10, req.getEsfEstimado());
            ps.setString(11, req.getEstado());
            ps.setString(12, req.getFase());
            ps.setString(13, req.getDescricao());
            ps.setString(14, String.valueOf(req.getIdProjeto()));
            ps.setString(15, String.valueOf(req.getIdUsuario())); 
            ps.setString(16, String.valueOf(req.getAutor()));
            
            ps.execute();
        }catch(SQLException ex){
            ex.printStackTrace();
        }
    
    }
    
    public requisito buscarRequisito(int idRequisitoRecebido){

        String sql = "select * from tblrequisitos where idRequisito=?";
        PreparedStatement ps;
        requisito requeriment = null;
        
        try{
           ps = this.conexao.prepareStatement(sql);
            
           ps.setString(1, String.valueOf(idRequisitoRecebido));
            
           ResultSet resultado = ps.executeQuery();
           
           while(resultado.next()){
                int idRequisito = Integer.parseInt(resultado.getString("idRequisito"));
                String nome = resultado.getString("nome");
                String modulo = resultado.getString("modulo");
                String funcionalidade = resultado.getString("funcionalidade");
                Date dataCriacao = formato.parse(resultado.getString("dataCriacao"));
                Date ultimaMod = formato.parse(resultado.getString("ultimaMod"));
                String ultimaModAut = resultado.getString("ultimaModAut");
                String versao = resultado.getString("versao");
                String prioridade = resultado.getString("prioridade");
                String complexibilidade = resultado.getString("complexibilidade");
                String esfEstimado = resultado.getString("esfEstimado");
                String estado = resultado.getString("estado");
                String fase = resultado.getString("fase");
                String descricao = resultado.getString("descricao");
                int idProjeto = Integer.parseInt(resultado.getString("idProjeto"));
                int idUsuario = Integer.parseInt(resultado.getString("idUsuario"));
                String autor = resultado.getString("autor");
                
                requeriment = new requisito(idRequisito, nome, modulo, funcionalidade, dataCriacao, ultimaMod, ultimaModAut, versao, prioridade, complexibilidade, esfEstimado, estado, fase, descricao, idProjeto, idUsuario, autor);
            }
        }catch(SQLException ex){
            ex.printStackTrace();
        }catch(ParseException ex){
            ex.printStackTrace();
        }
        return requeriment;
    }
    
    
    public ArrayList<requisito> buscarTodosRequisitos(){
    
    ArrayList<requisito> requerimentList = new ArrayList<requisito>();
    
    String sql = "SELECT * FROM tblrequisitos";
    
    try{
        Statement st = conexao.createStatement();
        
        ResultSet resultado = st.executeQuery(sql);
        
            while(resultado.next()){
                int idRequisito = Integer.parseInt(resultado.getString("idRequisito"));
                String nome = resultado.getString("nome");
                String modulo = resultado.getString("modulo");
                String funcionalidade = resultado.getString("funcionalidade");
                Date dataCriacao = formato.parse(resultado.getString("dataCriacao"));
                Date ultimaMod = formato.parse(resultado.getString("ultimaMod"));
                String ultimaModAut = resultado.getString("ultimaModAut");
                String versao = resultado.getString("versao");
                String prioridade = resultado.getString("prioridade");
                String complexibilidade = resultado.getString("complexibilidade");
                String esfEstimado = resultado.getString("esfEstimado");
                String estado = resultado.getString("estado");
                String fase = resultado.getString("fase");
                String descricao = resultado.getString("descricao");
                int idProjeto = Integer.parseInt(resultado.getString("idProjeto"));
                int idUsuario = Integer.parseInt(resultado.getString("idUsuario"));
                String autor = resultado.getString("autor");

                requisito requeriment = new requisito(idRequisito, nome, modulo, funcionalidade, dataCriacao, ultimaMod, ultimaModAut, versao, prioridade, complexibilidade, esfEstimado, estado, fase, descricao, idProjeto, idUsuario, autor);
                requerimentList.add(requeriment);
            }
        }catch(SQLException ex){
            ex.printStackTrace();
        }catch(ParseException ex){
            ex.printStackTrace();
        }
    
        return requerimentList;
    }
    public ArrayList<requisito> buscarTodosRequisitos(int idProjetoRecebido){
    
    ArrayList<requisito> requerimentList = new ArrayList<requisito>();
    
    String sql = "SELECT * FROM tblrequisitos WHERE idProjeto=" + idProjetoRecebido;
    
    try{
        Statement st = conexao.createStatement();
        
        ResultSet resultado = st.executeQuery(sql);
        
            while(resultado.next()){
                int idRequisito = Integer.parseInt(resultado.getString("idRequisito"));
                String nome = resultado.getString("nome");
                String modulo = resultado.getString("modulo");
                String funcionalidade = resultado.getString("funcionalidade");
                Date dataCriacao = formato.parse(resultado.getString("dataCriacao"));
                Date ultimaMod = formato.parse(resultado.getString("ultimaMod"));
                String ultimaModAut = resultado.getString("ultimaModAut");
                String versao = resultado.getString("versao");
                String prioridade = resultado.getString("prioridade");
                String complexibilidade = resultado.getString("complexibilidade");
                String esfEstimado = resultado.getString("esfEstimado");
                String estado = resultado.getString("estado");
                String fase = resultado.getString("fase");
                String descricao = resultado.getString("descricao");
                int idProjeto = Integer.parseInt(resultado.getString("idProjeto"));
                int idUsuario = Integer.parseInt(resultado.getString("idUsuario"));
                String autor = resultado.getString("autor");

                requisito requeriment = new requisito(idRequisito, nome, modulo, funcionalidade, dataCriacao, ultimaMod, ultimaModAut, versao, prioridade, complexibilidade, esfEstimado, estado, fase, descricao, idProjeto, idUsuario, autor);
                requerimentList.add(requeriment);
            }
        }catch(SQLException ex){
            ex.printStackTrace();
        }catch(ParseException ex){
            ex.printStackTrace();
        }
    
        return requerimentList;
    }
    
    
    
    
        public void AtualizarDadosRequisito(int idRequisito, requisito requeriment){
        
        String sql = "UPDATE tblrequisitos SET "
                + "nome=?, "
                + "modulo=?, "
                + "funcionalidade=?, "
                + "ultimaMod=?, "
                + "ultimaModAut=?, "
                + "versao=?, "
                + "prioridade=?, "
                + "complexibilidade=?, "
                + "esfEstimado=?, "
                + "estado=?, "
                + "fase=?, "
                + "descricao=? WHERE idRequisito=?";
        
        PreparedStatement ps;
        
        try{
            ps = this.conexao.prepareStatement(sql);
        
            ps.setString(1, requeriment.getNome());
            ps.setString(2, requeriment.getModulo());
            ps.setString(3, requeriment.getFuncionalidade());
            ps.setString(4, formato.format(requeriment.getUltimaMod()));
            ps.setString(5, requeriment.getUltimaModAut());
            ps.setString(6, requeriment.getVersao());
            ps.setString(7, requeriment.getPrioridade());
            ps.setString(8, requeriment.getComplexibilidade());
            ps.setString(9, requeriment.getEsfEstimado());
            ps.setString(10, requeriment.getEstado());
            ps.setString(11, requeriment.getFase());
            ps.setString(12, requeriment.getDescricao());
            ps.setString(13, String.valueOf(idRequisito));
            
            ps.execute();
        }catch(SQLException ex){ 
            ex.printStackTrace();
        }
    }
    
    
    public void DeletarRequisito(int idRequisito){
        
        String sql = "DELETE FROM tblrequisitos WHERE idRequisito=?";
        PreparedStatement ps;
        
        try{
            ps = this.conexao.prepareStatement(sql);
            
            ps.setString(1, String.valueOf(idRequisito));
            ps.execute();
        }
        catch(SQLException ex){
            ex.printStackTrace();
        }
    }
}
