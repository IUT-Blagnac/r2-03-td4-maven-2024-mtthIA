public class Pile
{
private int taillePile = 2; //taille de la pile
    private int[] element= new int[taillePile];
    private int sommet;
    private int val;

    Pile(){
        this.element = new int[taillePile];
        this.sommet = 0;
    }
    
    Pile(int pfTaille){
        this.element = new int[pfTaille];
        this.sommet = 0;
    }
    
    public void creerPile(int pfTaille){
        Pile p = new Pile(pfTaille);
    }

    public void empiler(int entier)throws Exception{
        if(this.estPleine()){
            throw new Exception("La pile ne doit pas être pleine");
        }
        this.element[sommet]=entier;
        sommet++;
    }

    public int depiler()throws Exception{
        if(this.estVide()){
            throw new Exception("La pile ne doit pas être vide");
        }
        sommet--;
        val = this.element[sommet];
        return val;
    }

    public boolean estVide(){
        if(sommet==0){
            return true;
        }else{
            return false;
        }
    }

    public boolean estPleine(){
        if(sommet==taillePile){
            return true;
        }else{
            return false;
        }
    }

    public int sommet(){
        return sommet;
    }

    public void vider(){
        sommet=0;
    }

}
