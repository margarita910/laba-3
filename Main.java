public class Main {
    public static void main(String args[]) {
        Moment moment = new Moment("Момент");
        moment.changeLife(new SocialEntity("Рассказчик", 54, (new Modificator[]{Modificator.NORMAL, Modificator.PSYCHO})));
        SocialEntity human = new SocialEntity("Мы");
        human.follow();
        human.forget();
        human.makeDecision("не рассказывать о ");
        Newspapers newspapers = new Newspapers("Газеты");
        newspapers.print();
        SocialEntity Leik = new SocialEntity("Лейк");
        Leik.drill();
        SocialEntity AmundsenAndByrd = new SocialEntity("Амундсен и Бэрд");
        AmundsenAndByrd.notice();
        Wind wind = new Wind("Ветер");
        wind.wind();
        Moment moment1 = new Moment("Момент", "Затем");
        moment1.begin(new SocialEntity("Мы"));
        SocialEntity Larsen = new SocialEntity("Матрос Ларсен");
        Larsen.see();
        Mountains mountains = new Mountains("Горы");
        mountains.mountainsCondition();
        mountains.visible();
        mountains.grew();
        SocialEntity human1 = new SocialEntity("Мы");
        human1.consider();
    }
}
