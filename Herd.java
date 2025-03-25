import java.util.ArrayList;

class Herd {
    ArrayList<Livestock> livestock = new ArrayList<>();

    void addLivestock(Livestock animal) {
        livestock.add(animal);
    }

    void dailyRoutine() {
        for (Livestock animal : livestock) {
            System.out.println(animal.name + ": " + animal.makeSound());
            if (animal instanceof WorkRole) {
                System.out.println(((WorkRole) animal).performTask());
            }
        }
    }
}
