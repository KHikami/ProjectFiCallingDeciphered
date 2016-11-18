package p000;

final class vj implements Runnable {
    final /* synthetic */ vg f35369a;

    vj(vg vgVar) {
        this.f35369a = vgVar;
    }

    public void run() {
        this.f35369a.f35343t.showAtLocation(this.f35369a.f35342s, 55, 0, 0);
        this.f35369a.m41012p();
        if (this.f35369a.m41011o()) {
            oa.m37348c(this.f35369a.f35342s, 0.0f);
            this.f35369a.f35345v = oa.m37366m(this.f35369a.f35342s).m40272a(1.0f);
            this.f35369a.f35345v.m40275a(new vk(this));
            return;
        }
        oa.m37348c(this.f35369a.f35342s, 1.0f);
        this.f35369a.f35342s.setVisibility(0);
    }
}
