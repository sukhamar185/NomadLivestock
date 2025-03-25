abstract class Livestock {
    String name;
    int age;

    public Livestock(String name, int age) {
        this.name = name;
        this.age = age;
    }

    abstract String makeSound();

    void graze() {
        System.out.println(name + "belcheert belchine.");
    }

    void graze(String food) {
        System.out.println(name + " " + food + "-iig belcine.");
    }
}
