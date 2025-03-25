class Sheep extends Livestock implements WorkRole {
    public Sheep(String name, int age) {
        super(name, age);
    }

    @Override
    String makeSound() {
        return "Maa!";
    }
    @Override
    String makeSound(int volume) {
        return "duunii hemjee: " + volume;
    }

    @Override
    public String performTask() {
        return "Honi talbaid belchine.";
    }
    
}
