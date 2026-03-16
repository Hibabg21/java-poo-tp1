 public class personne {
  String CIN ;
  String NOM ;
  String prenom ;
  String email  ;
  int age ;
  public void intialiser (String cin,String nom , String prenom , String email ,  int age ){
    this.CIN = cin;
    this.NOM = nom;
    this.prenom = prenom;
    this.email =   email ;
    this.age = age ;
  }
  public void affiche(){
    System.out.println("mon nom est "+ NOM);    
    System.out.println("mon prenom est "+prenom);
    System.out.println( " mon age est "+  age);
    System.out.println(" mon email " + email);



  }
  public static void main(String[] args) {
  personne p1  =  new personne();
  p1.intialiser("EE836283", "al alami", "mohammed", "elalamimoha@gmail.com", 32);
  p1.affiche();
  personne p2 = new personne();
  p2.intialiser("K1234566", "Manjik", "omar", "manjik19@gmail.com", 33);
  p2.affiche();
}
}

