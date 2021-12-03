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
import projetoaula.Model.usuario;



/**
 *
 * @author lucas
 */
public class JDBCusuario {
    Connection conexao;
    
    
    public JDBCusuario(Connection conexao){
        this.conexao = conexao;
    }
    
    public void cadastrarUsuario(usuario user){
        String sql = "insert into tblusuario(nomeCompleto, nomeUsuario,email,senha,telefone) values(?,?,?,?,?)";
        PreparedStatement ps;
        
        try{
            ps = this.conexao.prepareStatement(sql);
            
            ps.setString(1, user.getNomeCompleto());
            ps.setString(2, user.getNomeUsuario());
            ps.setString(3, user.getEmail());
            ps.setString(4, user.getSenha());
            ps.setString(5, user.getTelefone());
            
            ps.execute();
        }catch(SQLException ex){
            ex.printStackTrace();
        }
    }
    
    public usuario buscarUsuario(int idUsuarioRecebido){

        String sql = "select * from tblusuario where idUsuario=?";
        PreparedStatement ps;
        usuario user = null;
        
        try{
            ps = this.conexao.prepareStatement(sql);
            
            ps.setString(1, String.valueOf(idUsuarioRecebido));
            
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                int idUsuario = rs.getInt("idUsuario");
                String nomeUsuarioRecebido = rs.getString("nomeUsuario");
                String senhaRecebida = rs.getString("senha");
                String nomeCompleto = rs.getString("nomeCompleto");
                String telefone = rs.getString("telefone");
                String email = rs.getString("email");
                
                user = new usuario(idUsuario, nomeUsuarioRecebido, senhaRecebida, nomeCompleto, email, telefone);
            }
            
        }catch(SQLException ex){
            ex.printStackTrace();
        }
        return user;
    }
    
    public usuario buscarUsuario(String nomeUsuario){

        String sql = "select * from tblusuario where nomeUsuario=?";
        PreparedStatement ps;
        usuario user = null;
        
        try{
            ps = this.conexao.prepareStatement(sql);
            
            ps.setString(1, nomeUsuario);
            
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                int idUsuario = rs.getInt("idUsuario");
                String nomeUsuarioRecebido = rs.getString("nomeUsuario");
                String senhaRecebida = rs.getString("senha");
                String nomeCompleto = rs.getString("nomeCompleto");
                String telefone = rs.getString("telefone");
                String email = rs.getString("email");
                
                user = new usuario(idUsuario, nomeUsuarioRecebido, senhaRecebida, nomeCompleto, email, telefone);
            }
            
        }catch(SQLException ex){
            ex.printStackTrace();
        }
        return user;
    }
    
    public usuario buscarUsuario(String nomeUsuario, String senha){

        String sql = "select * from tblusuario where nomeUsuario=? and senha=?";
        PreparedStatement ps;
        usuario user = null;
        
        try{
            ps = this.conexao.prepareStatement(sql);
            
            ps.setString(1, nomeUsuario);
            ps.setString(2, senha);
            
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                int idUsuario = rs.getInt("idUsuario");
                String nomeUsuarioRecebido = rs.getString("nomeUsuario");
                String senhaRecebida = rs.getString("senha");
                String nomeCompleto = rs.getString("nomeCompleto");
                String telefone = rs.getString("telefone");
                String email = rs.getString("email");
                
                user = new usuario(idUsuario, nomeUsuarioRecebido, senhaRecebida, nomeCompleto, email, telefone);
            }
            
        }catch(SQLException ex){
            ex.printStackTrace();
        }
        return user;
    }
}