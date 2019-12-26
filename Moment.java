public class Moment{
    private String name;
    private String time;
    private Modificator modificator;
    public Moment (String name){
        this.name = name;
        this.modificator = Modificator.CAPTURING;
        System.out.println(name + " "+ modificator);
    }
    public Moment(String name, String time){
        this.name=name;
        this.time = time;
        System.out.print(time+" "+name);
    }
    public void changeLife(SocialEntity human){
        this.modificator = Modificator.LIFE_CHANGING;
        System.out.println(human.getName() + " получает модификатор: "+modificator);
    }
    public void begin(SocialEntity human){
        System.out.println(" наступил, когда ");
        human.cannot();
        human.control();
    }
}
