public final class itj {
    private boolean a;

    public itj() {
        this.a = false;
    }

    public itj a(boolean z) {
        this.a = true;
        return this;
    }

    public boolean a() {
        return this.a;
    }

    public String toString() {
        return "{ useNewApiaryClient: " + this.a + "}";
    }
}
