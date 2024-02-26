public class ClasseEssai {
    public static void main(String [] args){
        try{
            Pile pile = new Pile();
            System.out.println(pile.estVide());
            System.out.println(pile.estPleine());
            pile.empiler(8);
            pile.empiler(5);
            pile.empiler(5);
            System.out.println(pile.estPleine());
            System.out.println(pile.depiler());
            System.out.println(pile.estVide());
            System.out.println(pile.sommet());
            pile.vider();
            System.out.println(pile.depiler());
            System.out.println(pile.estVide());
             
            Pile p = new Pile();
            p.empiler(4);
            int element = p.depiler();
            System.out.println(element);
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
