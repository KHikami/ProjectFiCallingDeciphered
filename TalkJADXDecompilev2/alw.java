package defpackage;

public class alw {
    int a;
    int b;
    final int c;
    final float d;

    public int a() {
        return this.a;
    }

    public int b() {
        return this.b;
    }

    public void a(alx alx) {
        this.b++;
        this.a = (int) (((float) this.a) + (((float) this.a) * this.d));
        if (!c()) {
            throw alx;
        }
    }

    public alw() {
        this(2500, 1, 1.0f);
    }

    public alw(int i, int i2, float f) {
        this.a = i;
        this.c = i2;
        this.d = f;
    }

    protected boolean c() {
        return this.b <= this.c;
    }
}
