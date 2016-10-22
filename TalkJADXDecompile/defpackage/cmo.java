package defpackage;

/* renamed from: cmo */
final class cmo {
    public gol a;
    public gkt b;
    final /* synthetic */ cmm c;

    cmo(cmm cmm) {
        this.c = cmm;
        this.a = null;
        this.b = null;
    }

    public void a() {
        if (this.b != null) {
            this.b.b();
            this.b = null;
        }
        if (this.a != null) {
            this.a.c();
            this.a = null;
        }
    }
}
