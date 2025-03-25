class Sheep extends Livestock implements WorkRole {
    public Sheep(String name, int age) {
        super(name, age);
    }

    @Override
    String makeSound() {
        return "Maa!";
    }

    @Override
    public String performTask() {
        return "Honi talbaid belchine.";
    }
    
}
