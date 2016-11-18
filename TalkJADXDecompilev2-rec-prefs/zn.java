package p000;

final class zn implements yo {
    final /* synthetic */ zh f35913a;

    zn(zh zhVar) {
        this.f35913a = zhVar;
    }

    public boolean mo4442a(xy xyVar) {
        if (xyVar == null) {
            return false;
        }
        this.f35913a.f35890l = ((yv) xyVar).getItem().getItemId();
        yo a = this.f35913a.m41324a();
        return a != null ? a.mo4442a(xyVar) : false;
    }

    public void mo4441a(xy xyVar, boolean z) {
        if (xyVar instanceof yv) {
            xyVar.mo4541r().m41417a(false);
        }
        yo a = this.f35913a.m41324a();
        if (a != null) {
            a.mo4441a(xyVar, z);
        }
    }
}
