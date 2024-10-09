package org.example.dao;

import org.example.model.Voiture;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class VoitureDAOImpl implements VoitudeDAO {
        private static final String URL = "jdbc:mariadb://localhost:3313/mariacar";
        private static final String USER = "carcfa";
        private static final String PASSWORD = "admin";

        private Connection getConnection() throws SQLException {
            return DriverManager.getConnection(URL, USER, PASSWORD);
        }

    @Override
    public void ajouterVoiture(Voiture voiture) {
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
            } catch (SQLException e) {
                e.printStackTrace();
            }
    }

    @Override
    public Voiture trouverVoitureParId(int id) {
        return null;
    }

    @Override
    public List<Voiture> trouverToutes() {
        return List.of();
    }

    @Override
    public void mettreAJourVoiture(Voiture voiture) {

    }

    @Override
    public void supprimerVoiture(int id) {

    }
}
