package p000;

final class cvf extends ctt {
    final /* synthetic */ cve f9158a;

    cvf(cve cve) {
        this.f9158a = cve;
    }

    public void mo1438a(boolean z, cuo cuo) {
        if (z && cuo != null && cuo.m11039d()) {
            this.f9158a.m11088a();
            return;
        }
        cve cve = this.f9158a;
        if (cve.f9154b != null) {
            glk.m17979c("Babel_explane", "[Outgoing ringtone] Stopping playback", new Object[0]);
            cve.f9154b.release();
            cve.f9154b = null;
        }
    }
}
