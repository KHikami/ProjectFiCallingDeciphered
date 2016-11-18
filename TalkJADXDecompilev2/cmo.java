package defpackage;

final class cmo {
    public gol a = null;
    public gkt b = null;
    final /* synthetic */ cmm c;

    cmo(cmm cmm) {
        this.c = cmm;
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
