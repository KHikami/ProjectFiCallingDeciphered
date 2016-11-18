package p000;

import java.util.Collection;

final class cgz implements Runnable {
    final /* synthetic */ Collection f5301a;
    final /* synthetic */ String f5302b;
    final /* synthetic */ int f5303c;
    final /* synthetic */ cgy f5304d;

    cgz(cgy cgy, Collection collection, String str, int i) {
        this.f5304d = cgy;
        this.f5301a = collection;
        this.f5302b = str;
        this.f5303c = i;
    }

    public void run() {
        if (this.f5304d.f5291e != null) {
            this.f5304d.f5291e.m17983a("bg started");
        }
        this.f5304d.m7630a(this.f5301a, this.f5302b, this.f5303c);
    }
}
