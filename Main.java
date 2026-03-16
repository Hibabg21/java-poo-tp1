public class Main {

    public static void main(String[] args) {

        Livre l1 = new Livre("Java", "Dupont", 300);
        Livre l2 = new Livre("Python", "Ali", 250, 100);

        l1.setPrix(80);

        System.out.println(l1);
        System.out.println(l2);

        Etagere e = new Etagere(5);

        e.ajouter(l1);
        e.ajouter(l2);

        System.out.println("Nombre de livres: " + e.getNbLivres());

        Livre livre = e.getLivre(1);
        System.out.println(livre);

        int pos = e.chercher("Java", "Dupont");
        System.out.println("Position: " + pos);

        e.supprimer(1);

        System.out.println("Nombre de livres apres suppression: " + e.getNbLivres());
    }
}