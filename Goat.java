class Goat extends Livestock implements WorkRole {
    public Goat(String name, int age) {
        super(name, age);
    }

    @Override
    String makeSound() {
        return "mailana";
    }

    @Override
    public String performTask() {
        return "ymaa talbaid belchine.";
    }

    String makeSound(int volume) {
        return "mailana! duunii hemjee: " + volume;
    }
}
