public class Dog {
    private String rotu;

    public Dog() {
    }

    public Dog(String rotu) {
        this.rotu = rotu;
    }

    public String getRotu() {
        return rotu;
    }

    public void setRotu(String rotu) {
        this.rotu = rotu;
    }

    @Override
    public String toString() {
        return "Dog = " + rotu;
    }
}
