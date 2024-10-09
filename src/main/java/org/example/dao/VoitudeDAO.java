package org.example.dao;

import org.example.model.Voiture;

import java.util.List;

public interface VoitudeDAO {

    int ajouterVoiture(Voiture voiture);

    Voiture trouverVoitureParId(int id);

    List<Voiture> trouverToutes();

    void mettreAJourVoiture(Voiture voiture);

    void supprimerVoiture(int id);


}
