public class Wind {
    private String name;
    public Wind(String name){
        this.name=name;
    }
    public String getName() {
        return name;
    }
    public void wind (){
       Cylinder cylinder = new Cylinder("Цилиндры");
       Wind wind = new Wind("Ветер");
       System.out.println(wind.name + " гнал "+ cylinder.getName());
    }
}
