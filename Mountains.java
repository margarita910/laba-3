public class Mountains extends Things {
    public Mountains(String name){
        super(name);
    }
    @Override
    public String getName() {
        return super.getName();
    }
    public void mountainsCondition(){
        System.out.println(getName()+ Modificator.APPROACH);
    }
    public void visible (){
        System.out.println(getName()+" видны "+Modificator.CAUSES);
    }
    public void grew(){
        System.out.println("И всё же постепенно "+ getName()+" вырастали.");
    }
}
