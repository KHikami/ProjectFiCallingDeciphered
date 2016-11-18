package defpackage;

final class zn implements yo {
    final /* synthetic */ zh a;

    zn(zh zhVar) {
        this.a = zhVar;
    }

    public boolean a(xy xyVar) {
        if (xyVar == null) {
            return false;
        }
        this.a.l = ((yv) xyVar).getItem().getItemId();
        yo a = this.a.a();
        return a != null ? a.a(xyVar) : false;
    }

    public void a(xy xyVar, boolean z) {
        if (xyVar instanceof yv) {
            xyVar.r().a(false);
        }
        yo a = this.a.a();
        if (a != null) {
            a.a(xyVar, z);
        }
    }
}
