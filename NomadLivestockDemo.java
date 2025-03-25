public class NomadLivestockDemo {
    public static void main(String[] args) {
        Herd herd = new Herd();
        herd.addLivestock(new Horse("Bayn", 4));
        herd.addLivestock(new Sheep("Chuluun", 2));
        herd.addLivestock(new Camel("Tamir", 6));
        herd.addLivestock(new Goat("yamaa", 4));

        herd.dailyRoutine();
    }
}
