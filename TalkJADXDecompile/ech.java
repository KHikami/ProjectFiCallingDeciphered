public final class ech {
    private final int a;
    private final int b;
    private String c;
    private String d;

    public ech(int i, int i2) {
        this.c = null;
        this.d = null;
        this.a = 16;
        this.b = i2;
    }

    public ech a(String str) {
        this.c = str;
        return this;
    }

    public ech b(String str) {
        this.d = str;
        return this;
    }

    public ecg a() {
        return new ecg(this.a, this.b, this.c, this.d);
    }
}
