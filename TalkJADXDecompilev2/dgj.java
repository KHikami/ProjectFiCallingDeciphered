package defpackage;

final class dgj implements guq<haw> {
    final /* synthetic */ dgg a;

    dgj(dgg dgg) {
        this.a = dgg;
    }

    private void a(haw haw) {
        String valueOf;
        if (haw == null || !haw.k().d()) {
            valueOf = String.valueOf(haw);
            glk.a("Babel_calls", new StringBuilder(String.valueOf(valueOf).length() + 50).append("Getting predicted network quality failed, result: ").append(valueOf).toString(), new Object[0]);
        } else {
            this.a.h = haw.a();
            valueOf = String.valueOf(this.a.h);
            glk.a("Babel_calls", new StringBuilder(String.valueOf(valueOf).length() + 27).append("Predicted network quality: ").append(valueOf).toString(), new Object[0]);
        }
        this.a.d.d();
    }
}
