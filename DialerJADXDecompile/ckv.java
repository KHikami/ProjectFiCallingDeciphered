public class ckv extends cla {
    public ckx a;

    private ckv d() {
        ckv ckv = (ckv) super.b();
        ckz.a(this, ckv);
        return ckv;
    }

    protected int a() {
        int i = 0;
        if (this.a == null) {
            return 0;
        }
        int i2 = 0;
        while (i < this.a.b) {
            i2 += this.a.a[i].a();
            i++;
        }
        return i2;
    }

    public void a(ckt ckt) {
        if (this.a != null) {
            for (int i = 0; i < this.a.b; i++) {
                this.a.a[i].a(ckt);
            }
        }
    }

    public final /* synthetic */ cla b() {
        return d();
    }

    public /* synthetic */ Object clone() {
        return d();
    }
}
