# AutoLoc


Application de gestion de location de véhicules (projet UP ASI, Esprit).

## Acteurs

| Acteur | Description |
|---|---|
| Client | Personne qui consulte les véhicules, réserve et loue |
| Agent d'agence | Employé qui traite les réservations et les contrats au comptoir |
| Responsable d'agence | Manager qui supervise l'agence, son parc et ses employés |
| Administrateur | Gère le système, les utilisateurs et la configuration globale |

## Cas d'utilisation

### Client
- S'inscrire / se connecter
- Consulter les véhicules disponibles
- Réserver un véhicule
- Annuler une réservation
- Payer une location
- Consulter son historique

### Agent d'agence
- Enregistrer un client
- Confirmer ou refuser une réservation
- Établir et faire signer un contrat
- Encaisser un paiement
- Enregistrer le retour d'un véhicule

### Responsable d'agence
- Gérer le parc de véhicules de l'agence
- Planifier les maintenances
- Gérer les employés de l'agence
- Consulter les statistiques de l'agence

### Administrateur
- Gérer les agences
- Gérer les comptes utilisateurs et les rôles
- Gérer les équipements et les catégories de véhicules
- Superviser l'ensemble du système