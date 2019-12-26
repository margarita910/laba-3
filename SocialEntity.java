public class SocialEntity extends Character implements Actions {

    public SocialEntity(String name, int age, Modificator [] conditions){
        super(name, age, conditions);
        System.out.println(name+", "+"в возрасте "+ age+" лет,"+ " являясь человеком "+conditions[0]+", " +conditions[1]);
    }
    public SocialEntity(String name){
        super(name);
    }
    @Override
    public void follow(){
        System.out.print("С этого времени "+this.getName()+" стали неотрывно следить за ");
        Fantom fantom = new Fantom("Фантом");
        fantom.lurk();
        System.out.println();
    }
    @Override
    public void forget(){
        System.out.print(this.getName()+" не сможем позабыть ");
        Moment moment = new Moment("Времени", "этого");
        System.out.println();
    }
    @Override
    public void makeDecision(String s){
        System.out.print(this.getName()+" приняли решение "+s);
        Felling experiences = new Felling("Перживаниях ");
        System.out.print(experiences.getName());
        SocialEntity humanity = new SocialEntity("Человечеству");
        System.out.println(humanity.getName());
    }
    public void drill(){
        Mine mine = new Mine("Шахта");
        System.out.println(this.getName()+" пробурил "+mine.getName());
    }
    public void notice(){
        Cylinder cylinder = new Cylinder("Цилиндры");
        System.out.println(this.getName() + " заметили "+cylinder.getName());
    }
    public void cannot(){
        Felling felling = new Felling("охватившие нас чувства");
        System.out.println(this.getName() + " не могли передать "+ felling.getName());
    }
    public void control(){
        System.out.println(this.getName()+ " стали контролировать свои слова");
    }
    public void see(){
        Mountains mountains = new Mountains("Горы");
        System.out.println(this.getName()+" завидел "+mountains.getName());
    }
    public void consider(){
        System.out.print(this.getName()+" могли рассмотреть ");
        Tops tops = new Tops("Вершины");
    }
}
