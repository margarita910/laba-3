public class News implements Message {
    private String name;
    public News(String name){
        this.name = name;
        System.out.print(name);

    }
    public String getName() {
        return name;
    }
    @Override
    public void send(){
        System.out.println(" "+getName() + " отправленны с борта самолета ");
    }
    @Override
    public void message(){
        News news = new News("Бюллетени ");
        System.out.print ("сообщали ");
        news.about();
    }
    public void about (){
        System.out.println("о нашем беспосадочном перелете; встрече с предательскими порывами ветра; увиденной с высоты шахте; загадочных снежных цилиндрах.");
    }
}

