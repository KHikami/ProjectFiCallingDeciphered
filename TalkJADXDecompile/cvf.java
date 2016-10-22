final class cvf extends ctt {
    final /* synthetic */ cve a;

    cvf(cve cve) {
        this.a = cve;
    }

    public void a(boolean z, cuo cuo) {
        if (z && cuo != null && cuo.d()) {
            this.a.a();
            return;
        }
        cve cve = this.a;
        if (cve.b != null) {
            glk.c("Babel_explane", "[Outgoing ringtone] Stopping playback", new Object[0]);
            cve.b.release();
            cve.b = null;
        }
    }
}
