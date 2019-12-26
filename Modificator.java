public enum Modificator {
    CAPTURING("врезающийся(-аяся) в память"),
    LIFE_CHANGING("потрясённый переменами в жизни."),
    NORMAL("с нормальным рассудком и живущим в согласии с природой и её законами"),
    PSYCHO("навсегда утратил мир и покой."),
    MONSTROUS("чудовищного и искаженного мира "),
    APPROACH(" казалось, не приближались."),
    CAUSES("только из-за своей невероятной, непостижимой высоты.");
    private String title;
    Modificator (String title){
        this.title = title;
    }
    @Override
    public String toString(){
        return title;
    }
}
