class Horse extends Livestock implements WorkRole {
    public Horse(String name, int age) {
        super(name, age);
    }

    @Override
    String makeSound() {
        return "Yntsgaana!";
    }
    @Override
    String makeSound(int volume) {
        return "duunii hemjee: " + volume;
    }

    @Override
    public String performTask() {
        return "Mori unalgad hereglegdene.";
    }
}
