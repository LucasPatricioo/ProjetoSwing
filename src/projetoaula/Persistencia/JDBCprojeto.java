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
    
    
}
