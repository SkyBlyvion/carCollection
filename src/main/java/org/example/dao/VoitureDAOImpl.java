package org.example.dao;

import org.example.model.Voiture;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class VoitureDAOImpl implements VoitudeDAO {
        private static final String URL = "jdbc:mariadb://localhost:3313/mariacar";
        private static final String USER = "carcfa";
        private static final String PASSWORD = "admin";

        private Connection getConnection() throws SQLException {
            return DriverManager.getConnection(URL, USER, PASSWORD);
        }

    @Override
    public int ajouterVoiture(Voiture voiture) {
            String sql= "INSERT INTO voiture(marque, modele, nbrPorte, nbrVitesse, isOccas, stock, imageName) " +
                    "VALUE (?,?,?,?,?,?,?)";
            try {
                Connection conn = getConnection();
                PreparedStatement stmt = conn.prepareStatement(sql);
                stmt.setString(1, voiture.getMarque());
                stmt.setString(2, voiture.getModele());
                stmt.setInt(3, voiture.getNbrPorte());
                stmt.setInt(4, voiture.getNbrVitesse());
                stmt.setBoolean(5, voiture.getOccas());
                stmt.setInt(6, voiture.getStock());
                stmt.setString(7, voiture.getImageName());
                stmt.executeUpdate();
                try(ResultSet generateKeys = stmt.getGeneratedKeys()){
                    if(generateKeys.next()){
                        return generateKeys.getInt(1);
                    } else {
                        throw new SQLException("Pas d'ID generee");
                    }
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            return -1;
    }

    @Override
    public Voiture trouverVoitureParId(int id) {
        return null;
    }

    @Override
    public List<Voiture> trouverToutes() {
            String sql = "SELECT * FROM voiture";
            List<Voiture> voitures = new ArrayList<>();
            try {
                Connection conn = getConnection();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql);
                while (rs.next()) {
                    Voiture car = new Voiture(rs.getInt("id"),
                            rs.getString("marque"),
                            rs.getString("modele"),
                            rs.getInt("stock"),
                            rs.getInt("nbrVitesse"),
                            rs.getInt("nbrPorte"),
                            rs.getBoolean("isOccas"),
                            rs.getString("imageName")
                    );
                    voitures.add(car);
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        return List.of();
    }

    @Override
    public void mettreAJourVoiture(Voiture voiture) {

    }

    @Override
    public void supprimerVoiture(int id) {

    }
}
