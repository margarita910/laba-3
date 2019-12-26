public class Newspapers {
    private String name;
    public Newspapers (String name){
        this.name = name;
    }
    protected void print(){
        System.out.print(name+" напечатали ");
        News news = new News("Бюллетени");
        news.send();
        news.message();
    }
}
