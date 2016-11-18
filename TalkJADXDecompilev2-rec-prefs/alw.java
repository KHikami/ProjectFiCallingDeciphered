package p000;

public class alw {
    int f1257a;
    int f1258b;
    final int f1259c;
    final float f1260d;

    public int m2878a() {
        return this.f1257a;
    }

    public int m2880b() {
        return this.f1258b;
    }

    public void m2879a(alx alx) {
        this.f1258b++;
        this.f1257a = (int) (((float) this.f1257a) + (((float) this.f1257a) * this.f1260d));
        if (!m2881c()) {
            throw alx;
        }
    }

    public alw() {
        this(2500, 1, 1.0f);
    }

    public alw(int i, int i2, float f) {
        this.f1257a = i;
        this.f1259c = i2;
        this.f1260d = f;
    }

    protected boolean m2881c() {
        return this.f1258b <= this.f1259c;
    }
}
