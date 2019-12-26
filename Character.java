public abstract class Character{
    private String name;
    private int age;
    private Modificator [] conditions = new Modificator[2];
    public Character(String name, int age, Modificator [] conditions){
        this.name = name;
        this.age = age;
    }
    public Character(String name){
        this.name = name;
    }
    public void setConditions(Modificator[] conditions) {
        this.conditions = conditions;
    }
    public String getName() {
        return name;
    }
}
