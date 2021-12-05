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
import java.util.ArrayList;
import projetoaula.Model.requisito;
/**
 *
 * @author lucas
 */
public class JDBCrequisito {
    Connection conexao;
    
    public JDBCrequisito(Connection conexao){
        this.conexao = conexao;
    }
    
    public void cadastrarRequisito(requisito req){
    
        String sql = "insert into tblrequisitos(nome,modulo,funcionalidade,dataCricao,ultimaMod,"
                + "ultimaModAut,versao,prioridade,complexibilidade,esfEstimado,estado,fase,descricao,"
                + "idProjeto) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        
        PreparedStatement ps;
        
        try{
            ps = this.conexao.prepareStatement(sql);
            
            ps.setString(1, req.getNome());
            ps.setString(2, req.getModulo());
            ps.setString(3, req.getFuncionalidade());
            ps.setString(4, String.valueOf(req.getDataCriacao()));
            ps.setString(5, String.valueOf(req.getUltimaMod()));
            ps.setString(6, req.getUltimaModAut());
            ps.setString(7, req.getVersao());
            ps.setString(8, req.getPrioridade());
            ps.setString(9, req.getComplexibilidade());
            ps.setString(10, req.getEsfEstimado());
            ps.setString(11, req.getEstado());
            ps.setString(12, req.getFase());
            ps.setString(13, req.getDescricao());
            ps.setString(14, String.valueOf(req.getIdProjeto()));
            
            ps.execute();
        }catch(SQLException ex){
            ex.printStackTrace();
        }
    
    }
}
