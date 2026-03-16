//Réaliser une classe Point permettant de représenter un point sur un axe. Chaque Point sera caractérisé par un nom (de type char) et une abscisse (de type double).
//On prévoira :
  //  • Une fonction initialiser recevant en arguments le nom et l’abscisse d’un point,
   // • Une deuxième fonction initialiser recevant en argument un objet de type Point
   // • une méthode affiche imprimant le nom du point et son abscisse,
    //• une méthode translate effectuant une translation définie par la valeur de son
//argument.
//Écrire un petit programme utilisant cette classe pour créer un point, en afficher les
//caractéristiques, le déplacer et en afficher à nouveau les caractéristiques.

public class point {
    char nom = 'A' ;
    double abscisse =  1;

    public void intialiser (char NOM  , double  Abscisse ){
        this.nom =  NOM ;
        this.abscisse = Abscisse ;
    }
    public void intialiser2 (point p ){
        this.nom =  p.nom;
        this.abscisse = p.abscisse;
        
    }
    public void affiche(){
        System.out.println("le nom  de point "  + nom +  " et son abscisse " + abscisse);
    }
    public void translate(double argument){
        abscisse = abscisse + argument ;

    }

    public static void main(String[] args) {
        point p1 =  new point();
        p1.intialiser('B', 2);
        p1.affiche();
        point p2 = new point();
        p2.intialiser('C', 3);
        p2.affiche();
        p1.intialiser2(p2); // Prenne tous les infos de p2 et la affecte a p1
        p1.affiche();
        p1.translate(4);
        p1.affiche();
    }

}
