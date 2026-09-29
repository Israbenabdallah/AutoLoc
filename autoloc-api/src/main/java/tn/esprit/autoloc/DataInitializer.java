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
                repository.save(new Vehicule(null, "123 TUN 4567", "Renault", "Clio",
                        CategorieVehicule.CITADINE, new BigDecimal("80.00"), StatutVehicule.DISPONIBLE));
                repository.save(new Vehicule(null, "234 TUN 5678", "Peugeot", "508",
                        CategorieVehicule.BERLINE, new BigDecimal("150.00"), StatutVehicule.DISPONIBLE));
                repository.save(new Vehicule(null, "345 TUN 6789", "Toyota", "RAV4",
                        CategorieVehicule.SUV, new BigDecimal("200.00"), StatutVehicule.MAINTENANCE));
            }
        };
    }
}
