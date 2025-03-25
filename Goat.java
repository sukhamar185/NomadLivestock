class Goat extends Livestock implements WorkRole {
    public Goat(String name, int age) {
        super(name, age);
    }

    @Override
    String makeSound() {
        return "mailana";
    }

    @Override
    String makeSound(int volume) {
        return "duunii hemjee: " + volume;
    }

    @Override
    public String performTask() {
        return "ymaa talbaid belchine.";
    }

}
