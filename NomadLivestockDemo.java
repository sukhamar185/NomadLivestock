public class NomadLivestockDemo {
    public static void main(String[] args) {
        Herd herd = new Herd();
        herd.addLivestock(new Horse("Bayn", 4));
        herd.addLivestock(new Sheep("Chuluun", 2));
        herd.addLivestock(new Camel("Tamir", 6));
        herd.addLivestock(new Goat("yamaa", 3));

        herd.dailyRoutine();
        Livestock[] livestockArray = {
            new Horse("Bayn", 4),
            new Sheep("Chuluun", 2),
            new Camel("Tamir", 6),
            new Goat("yamaa", 3)
        };

        for (Livestock animal : livestockArray) {
            animal.graze();
        }
    }
}
