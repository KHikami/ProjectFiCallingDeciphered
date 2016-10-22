package defpackage;

/* renamed from: jud */
final class jud implements jtx {
    final /* synthetic */ jtz a;

    jud(jtz jtz) {
        this.a = jtz;
    }

    public void a(jtv jtv) {
        if (jtv.m() != 2) {
            jtz jtz = this.a;
            jtw l = jtv.l();
            if (jtv.p()) {
                String valueOf = String.valueOf(l);
                new StringBuilder(String.valueOf(valueOf).length() + 30).append("Finished preloading resource: ").append(valueOf);
            }
            jtz.c.remove(l);
            jtz.b_.sendMessage(jtz.b_.obtainMessage(4, jtv));
        }
    }
}
