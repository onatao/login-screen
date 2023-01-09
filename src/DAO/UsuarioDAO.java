
package DAO;

import DTO.UsuarioDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class UsuarioDAO {
    Connection  conn;
    
    public ResultSet autentificacaoUsuario(UsuarioDTO usuario) {
        conn = new ConexaoDAO().conectaBD();
        
        try {
            String sql = "select * from usuario where nome_usuario = ? and senha_usuario = ?";
            
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, usuario.getUsuario());
            pstm.setString(2, usuario.getSenha());
            
            ResultSet rs = pstm.executeQuery();
            return rs;
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null,"UsuarioDAO" + erro);
            return null;
        }
        
    }
}
