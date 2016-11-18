package p000;

final class vz implements yo {
    final /* synthetic */ vv f35419a;

    vz(vv vvVar) {
        this.f35419a = vvVar;
    }

    public void mo4441a(xy xyVar, boolean z) {
        if (this.f35419a.f35408c != null) {
            this.f35419a.f35408c.onPanelClosed(0, xyVar);
        }
    }

    public boolean mo4442a(xy xyVar) {
        if (xyVar == null && this.f35419a.f35408c != null) {
            this.f35419a.f35408c.onMenuOpened(0, xyVar);
        }
        return true;
    }
}
