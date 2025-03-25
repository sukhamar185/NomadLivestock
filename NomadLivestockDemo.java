public class NomadLivestockDemo {
    public static void main(String[] args) {
        Herd herd = new Herd();
        herd.addLivestock(new Horse("Hongor Mori", 4));
        herd.addLivestock(new Sheep("har halzan Honi", 2));
        herd.addLivestock(new Camel("Atan Temee", 6));
        herd.addLivestock(new Goat("Muhar yamaa", 3));

        herd.dailyRoutine();

        for (Livestock animal : herd.livestock) {
            System.out.println(animal.name + " nas: " + animal.age);
        }

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
