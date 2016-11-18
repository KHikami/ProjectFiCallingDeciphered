package defpackage;

import android.content.Context;

final class dtg extends erm implements glc {
    final /* synthetic */ dtf a;

    public dtg(dtf dtf, Context context, kbu kbu, int i) {
        this.a = dtf;
        super(context, kbu, i, dtf.a);
    }

    protected void c() {
        this.a.c = 0;
        this.a.a();
    }

    protected void a(boolean z) {
        if (z) {
            dtf.b.a(this);
        } else {
            dtf.b.b(this);
        }
    }

    public void a(etu etu) {
        this.a.c = etu.a(0);
        this.a.a();
    }

    public void d() {
        this.a.a();
    }
}
