package defpackage;

final class vz implements yo {
    final /* synthetic */ vv a;

    vz(vv vvVar) {
        this.a = vvVar;
    }

    public void a(xy xyVar, boolean z) {
        if (this.a.c != null) {
            this.a.c.onPanelClosed(0, xyVar);
        }
    }

    public boolean a(xy xyVar) {
        if (xyVar == null && this.a.c != null) {
            this.a.c.onMenuOpened(0, xyVar);
        }
        return true;
    }
}
