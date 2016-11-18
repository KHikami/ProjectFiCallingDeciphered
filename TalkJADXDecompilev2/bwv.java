package defpackage;

import java.util.Observable;
import java.util.Observer;

final class bwv implements Observer {
    final /* synthetic */ bwu a;

    bwv(bwu bwu) {
        this.a = bwu;
    }

    public void update(Observable observable, Object obj) {
        gwb.aJ();
        if (this.a.f.b(bm.n) != null) {
            this.a.f.b(bm.n, null, this.a.c);
        }
    }
}
