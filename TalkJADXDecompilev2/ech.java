package defpackage;

public final class ech {
    private final int a = 16;
    private final int b;
    private String c = null;
    private String d = null;

    public ech(int i, int i2) {
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
