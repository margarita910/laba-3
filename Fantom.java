public class Fantom extends Character {
    public Fantom (String name){
        super(name);
        System.out.println(getName());
    }
    public void lurk(){
        System.out.print(getName()+ " таится в глубинах "+Modificator.MONSTROUS );
    }
}
