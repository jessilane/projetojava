/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package restaurante;
import java.sql.*;
import javax.swing.JOptionPane;

public class ConectarBanco{   
    public static com.mysql.jdbc.Connection AbrirConexao(){
        com.mysql.jdbc.Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost/restaurante";
            con = (com.mysql.jdbc.Connection) 
                    DriverManager.getConnection(url,"root", "");
            if(con!=null){
            JOptionPane.showMessageDialog(null, 
                    "Conexao realizada com sucesso",
                    "restaurante", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, 
                    "Erro na conexao com o Banco",
                    "restaurante", 
                    JOptionPane.ERROR_MESSAGE);
            e.getMessage();
        }
        return con;
    }
    
    public static void FecharConexao(com.mysql.jdbc.Connection con){
        try {
            con.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        }
    }
