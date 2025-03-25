class Camel extends Livestock implements WorkRole {
    public Camel(String name, int age) {
        super(name, age);
    }

    @Override
    String makeSound() {
        return "Builna!";
    }

    @Override
    public String performTask() {
        return "Temee holiin teewert hereglegdene.";
    }
}
