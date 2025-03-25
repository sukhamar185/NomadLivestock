class Sheep extends Livestock {
    public Sheep(String name, int age) {
        super(name, age);
    }

    @Override
    String makeSound() {
        return "Maa!";
    }
}
