
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
