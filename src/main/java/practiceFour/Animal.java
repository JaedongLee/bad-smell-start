package practiceFour;

public abstract class Animal {
    protected String name;

    public String layEgg() { // 下蛋
        return "Get an egg.";
    }

    public String milk() {
        return "Get milk.";
    }

    public abstract void provide();
}
