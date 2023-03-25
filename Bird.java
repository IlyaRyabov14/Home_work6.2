public abstract class Bird extends Animal{
    protected int hightFly;

    public int getHightFly() {
        return this.hightFly;
    }

    protected Bird (int height, int weight, String ColorEye, int hightFly) {
        super(height, weight, ColorEye);
        this.hightFly = hightFly;
    }

    public abstract void toFly();
}