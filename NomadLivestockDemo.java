public class NomadLivestockDemo {
    public static void main(String[] args) {
        Herd herd = new Herd();
        herd.addLivestock(new Horse("Mori", 4));
        herd.addLivestock(new Sheep("Honi", 2));
        herd.addLivestock(new Camel("Temee", 6));
        herd.addLivestock(new Goat("yamaa", 3));

        herd.dailyRoutine();
        Livestock[] livestockArray = {
            new Horse("Mori", 4),
            new Sheep("Honi", 2),
            new Camel("Temee", 6),
            new Goat("yamaa", 3)
        };
        for (Livestock animal : livestockArray) {
            if (animal instanceof Horse) {
                animal.graze("urgamal");
            } else if (animal instanceof Sheep) {
                animal.graze("ows");
            } else if (animal instanceof Camel) {
                animal.graze("goviin but");
            } else if (animal instanceof Goat) {
                animal.graze("tsetseg");
            }
        }
    }
}
