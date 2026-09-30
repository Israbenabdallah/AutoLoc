package tn.esprit.autoloc;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import tn.esprit.autoloc.domain.CategorieVehicule;
import tn.esprit.autoloc.domain.StatutVehicule;
import tn.esprit.autoloc.domain.Vehicule;
import tn.esprit.autoloc.repository.VehiculeRepository;

import java.math.BigDecimal;

@Configuration
public class DataInitializer {

    @Bean
    CommandLineRunner initVehicules(VehiculeRepository repository) {
        return args -> {
            if (repository.count() == 0) {
                repository.save(creer("123 TUN 4567", "Renault", "Clio",
                        CategorieVehicule.CITADINE, "80.00", StatutVehicule.DISPONIBLE));
                repository.save(creer("234 TUN 5678", "Peugeot", "508",
                        CategorieVehicule.BERLINE, "150.00", StatutVehicule.DISPONIBLE));
                repository.save(creer("345 TUN 6789", "Toyota", "RAV4",
                        CategorieVehicule.SUV, "200.00", StatutVehicule.MAINTENANCE));
            }
        };
    }

    private Vehicule creer(String immat, String marque, String modele,
                           CategorieVehicule categorie, String tarif, StatutVehicule statut) {
        Vehicule v = new Vehicule();
        v.setImmatriculation(immat);
        v.setMarque(marque);
        v.setModele(modele);
        v.setCategorie(categorie);
        v.setTarifJournalier(new BigDecimal(tarif));
        v.setStatut(statut);
        return v;
    }
}
