package p000;

import android.view.View;

final class dbf implements gan {
    final /* synthetic */ dbe f9456a;
    private boolean f9457b;
    private final boolean f9458c;

    dbf(dbe dbe, boolean z) {
        this.f9456a = dbe;
        this.f9458c = z;
    }

    public void onClick(View view) {
        int i;
        if (this.f9458c) {
            i = 2886;
        } else {
            i = 2888;
        }
        int g = this.f9456a.f9450a.m5638g();
        for (int i2 = 0; i2 < this.f9456a.f9451b.size(); i2++) {
            ((iih) this.f9456a.f9452c.binder.m25443a(iih.class)).mo1979a(g).mo1693b().mo1714c(i);
        }
        dbe dbe = this.f9456a;
        if (dbe.f9451b != null && dbe.f9451b.size() > 0) {
            dbe.m11410a(dbe.f9451b, false, false);
            dbe.f9451b = null;
        }
        this.f9457b = true;
    }

    public void mo1483a() {
        if (!this.f9457b) {
            this.f9456a.m11410a(this.f9456a.f9451b, true, false);
        }
        this.f9457b = false;
    }
}
