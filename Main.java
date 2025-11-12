package javastream;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Client> clients = ClientData.getClients();

        System.out.println("========= EXERCICE 1 =========");
        exercice1(clients);

        System.out.println("\n========= EXERCICE 2 =========");
        exercice2(clients);

        System.out.println("\n========= EXERCICE 3 =========");
        exercice3(clients);

        System.out.println("\n========= EXERCICE 4 =========");
        exercice4(clients);

        System.out.println("\n========= EXERCICE 5 =========");
        exercice5(clients);
    }

    // ----------------------------------------------------------
    // EXERCICE 1 : Filtrage & tri
    // ----------------------------------------------------------
    private static void exercice1(List<Client> clients) {
        List<Client> result = clients.stream()
                .filter(c -> c.getAdresse().equalsIgnoreCase("Lyon"))
                .sorted(Comparator.comparingDouble(Client::getChiffreAffaire).reversed())
                .toList();

        result.forEach(System.out::println);
    }

    // ----------------------------------------------------------
    // EXERCICE 2 : Transformation -> Map<ID, Nom>
    // ----------------------------------------------------------
    private static void exercice2(List<Client> clients) {
        Map<Integer, String> mapIdNom = clients.stream()
                .collect(Collectors.toMap(
                        Client::getIdClient,
                        Client::getNom
                ));

        mapIdNom.forEach((id, nom) -> System.out.println(id + " => " + nom));
    }

    // ----------------------------------------------------------
    // EXERCICE 3 : Agrégation (somme du CA des clients de Paris)
    // ----------------------------------------------------------
    private static void exercice3(List<Client> clients) {
        double totalCA = clients.stream()
                .filter(c -> c.getAdresse().equalsIgnoreCase("Paris"))
                .mapToDouble(Client::getChiffreAffaire)
                .sum();

        System.out.println("Chiffre d'affaires total des clients de Paris : " + totalCA);
    }

    // ----------------------------------------------------------
    // EXERCICE 4 : Regroupement -> Map<Ville, Moyenne_CA>
    // ----------------------------------------------------------
    private static void exercice4(List<Client> clients) {

        Map<String, Double> moyenneParVille = clients.stream()
                .collect(
                        Collectors.groupingBy(
                                Client::getAdresse,
                                Collectors.averagingDouble(Client::getChiffreAffaire)
                        )
                );

        moyenneParVille.forEach((ville, moyenne) ->
                System.out.println(ville + " => " + moyenne));
    }

    // ----------------------------------------------------------
    // EXERCICE 5 : Vérification + transformation si condition remplie
    // ----------------------------------------------------------
    private static void exercice5(List<Client> clients) {

        boolean tousSup50k = clients.stream()
                .allMatch(c -> c.getChiffreAffaire() > 50000);

        if (tousSup50k) {
            System.out.println("Tous les clients ont un CA > 50 000. Noms en majuscules :");

            clients.stream()
                    .map(c -> c.getNom().toUpperCase())
                    .forEach(System.out::println);
        } else {
            System.out.println("Tous les clients n'ont pas un CA supérieur à 50 000.");
        }
    }
}
