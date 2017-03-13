package DAO;

import Modelo.CD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class CDDAO {
    private Connection con;
    public CDDAO() {
        con = Conexao.AbrirConexao();
    }
    public boolean Cadastrar(CD cd) {
        String sql = "INSERT INTO cd VALUES (0, ?, ?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, cd.getTitulo());
            ps.setString(2, cd.getCantores());
            ps.setString(3, cd.getGenero());
            ps.setString(4, cd.getGravadora());
            ps.setInt(5, cd.getFaixas());
            ps.setDate(6, cd.getLancamento());
            ps.setString(7, cd.getPais());
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
            return false;
        }
    }

    public boolean Atualizar(CD cd) {
        String sql = "UPDATE cd set titulo_cd=?,cantores_cd=?, genero_de=?, gravadora_cd=?, faixas_cd=?, pais_cd = ? WHERE codigo_cd=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, cd.getTitulo());
            ps.setString(2, cd.getCantores());
            ps.setString(3, cd.getGenero());
            ps.setString(4, cd.getGravadora());
            ps.setInt(5, cd.getFaixas());
            ps.setString(6, cd.getPais());
            ps.setInt(7, cd.getCodigo());
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
            return false;
        }
    }
    public boolean Deletar(CD cd) {
        String sql = "DELETE FROM cd WHERE codigo_cd=?";
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, cd.getCodigo());
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
            return false;
        }
    }
    public ArrayList<CD> Consultar() {
        String sql = "SELECT * FROM cd";
        ArrayList<CD> lista = new ArrayList<>();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                CD  cd = new CD();
                cd.setCodigo(rs.getInt(1));
                cd.setTitulo(rs.getString(2));
                cd.setCantores(rs.getString(3));
                cd.setGenero(rs.getString(4));
                cd.setGravadora(rs.getString(5));
                cd.setFaixas(rs.getInt(6));
                cd.setLancamento(rs.getDate(7));
                cd.setPais(rs.getString(8));
                
                lista.add(cd);
            }
            return lista;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
            return null;
        }
    }
}
