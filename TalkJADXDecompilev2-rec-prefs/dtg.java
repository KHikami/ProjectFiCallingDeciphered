package p000;

import android.content.Context;

final class dtg extends erm implements glc {
    final /* synthetic */ dtf f10507a;

    public dtg(dtf dtf, Context context, kbu kbu, int i) {
        this.f10507a = dtf;
        super(context, kbu, i, dtf.f10495a);
    }

    protected void mo983c() {
        this.f10507a.f10497c = 0;
        this.f10507a.m12656a();
    }

    protected void mo1664a(boolean z) {
        if (z) {
            dtf.f10496b.m17917a(this);
        } else {
            dtf.f10496b.m17918b(this);
        }
    }

    public void mo982a(etu etu) {
        this.f10507a.f10497c = etu.m14511a(0);
        this.f10507a.m12656a();
    }

    public void mo1665d() {
        this.f10507a.m12656a();
    }
}
