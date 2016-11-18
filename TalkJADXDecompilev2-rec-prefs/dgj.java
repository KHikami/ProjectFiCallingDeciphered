package p000;

final class dgj implements guq<haw> {
    final /* synthetic */ dgg f9701a;

    dgj(dgg dgg) {
        this.f9701a = dgg;
    }

    private void m11735a(haw haw) {
        String valueOf;
        if (haw == null || !haw.mo1279k().m9663d()) {
            valueOf = String.valueOf(haw);
            glk.m17970a("Babel_calls", new StringBuilder(String.valueOf(valueOf).length() + 50).append("Getting predicted network quality failed, result: ").append(valueOf).toString(), new Object[0]);
        } else {
            this.f9701a.f9685h = haw.m19114a();
            valueOf = String.valueOf(this.f9701a.f9685h);
            glk.m17970a("Babel_calls", new StringBuilder(String.valueOf(valueOf).length() + 27).append("Predicted network quality: ").append(valueOf).toString(), new Object[0]);
        }
        this.f9701a.f9681d.mo2523d();
    }
}
