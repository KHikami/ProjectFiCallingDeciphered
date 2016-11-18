package p000;

final class vx implements yo {
    final /* synthetic */ vv f35416a;
    private boolean f35417b;

    vx(vv vvVar) {
        this.f35416a = vvVar;
    }

    public boolean mo4442a(xy xyVar) {
        if (this.f35416a.f35408c == null) {
            return false;
        }
        this.f35416a.f35408c.onMenuOpened(108, xyVar);
        return true;
    }

    public void mo4441a(xy xyVar, boolean z) {
        if (!this.f35417b) {
            this.f35417b = true;
            this.f35416a.f35406a.k();
            if (this.f35416a.f35408c != null) {
                this.f35416a.f35408c.onPanelClosed(108, xyVar);
            }
            this.f35417b = false;
        }
    }
}
