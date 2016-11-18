package defpackage;

public class cnh {
    private final iid a;

    public cnh(iid iid) {
        this.a = iid;
    }

    public void a(int i) {
        this.a.b().c(i);
    }

    public void a(int i, int i2) {
        a(2321, i2, null);
    }

    public void a(int i, int i2, Integer num) {
        mck mck = new mck();
        mck.b = Integer.valueOf(i2);
        if (num != null) {
            mck.a = num;
        }
        this.a.b().a(mck).c(i);
    }

    public void a(int i, int i2, int i3, Integer num) {
        mck mck = new mck();
        mck.c = Integer.valueOf(i2);
        mck.d = Integer.valueOf(i3);
        if (num != null) {
            mck.a = num;
        }
        this.a.b().a(mck).c(i);
    }
}
