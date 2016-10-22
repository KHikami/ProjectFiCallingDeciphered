package defpackage;

/* renamed from: djw */
public class djw {
    public final /* synthetic */ djv a;
    public final /* synthetic */ dpa b;

    public void a(itl itl) {
        boolean z;
        int i = 0;
        if (this.a.getVisibility() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (itl.d() != z) {
            djv djv = this.a;
            if (!itl.d()) {
                i = 8;
            }
            djv.setVisibility(i);
        }
    }

    public djw(dpa dpa, djv djv) {
        this.b = dpa;
        this.a = djv;
    }
}
