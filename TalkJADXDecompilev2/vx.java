package defpackage;

final class vx implements yo {
    final /* synthetic */ vv a;
    private boolean b;

    vx(vv vvVar) {
        this.a = vvVar;
    }

    public boolean a(xy xyVar) {
        if (this.a.c == null) {
            return false;
        }
        this.a.c.onMenuOpened(108, xyVar);
        return true;
    }

    public void a(xy xyVar, boolean z) {
        if (!this.b) {
            this.b = true;
            this.a.a.k();
            if (this.a.c != null) {
                this.a.c.onPanelClosed(108, xyVar);
            }
            this.b = false;
        }
    }
}
