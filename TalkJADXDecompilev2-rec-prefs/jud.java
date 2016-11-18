package p000;

final class jud implements jtx {
    final /* synthetic */ jtz f21056a;

    jud(jtz jtz) {
        this.f21056a = jtz;
    }

    public void mo1323a(jtv jtv) {
        if (jtv.m24247m() != 2) {
            jtz jtz = this.f21056a;
            jtw l = jtv.m24246l();
            if (jtv.m24250p()) {
                String valueOf = String.valueOf(l);
                new StringBuilder(String.valueOf(valueOf).length() + 30).append("Finished preloading resource: ").append(valueOf);
            }
            jtz.f20354c.remove(l);
            jtz.b_.sendMessage(jtz.b_.obtainMessage(4, jtv));
        }
    }
}
