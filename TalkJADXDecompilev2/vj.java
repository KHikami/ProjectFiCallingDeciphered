package defpackage;

final class vj implements Runnable {
    final /* synthetic */ vg a;

    vj(vg vgVar) {
        this.a = vgVar;
    }

    public void run() {
        this.a.t.showAtLocation(this.a.s, 55, 0, 0);
        this.a.p();
        if (this.a.o()) {
            oa.c(this.a.s, 0.0f);
            this.a.v = oa.m(this.a.s).a(1.0f);
            this.a.v.a(new vk(this));
            return;
        }
        oa.c(this.a.s, 1.0f);
        this.a.s.setVisibility(0);
    }
}
