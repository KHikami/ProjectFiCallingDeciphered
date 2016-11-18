package defpackage;

import java.util.Collection;

final class cgz implements Runnable {
    final /* synthetic */ Collection a;
    final /* synthetic */ String b;
    final /* synthetic */ int c;
    final /* synthetic */ cgy d;

    cgz(cgy cgy, Collection collection, String str, int i) {
        this.d = cgy;
        this.a = collection;
        this.b = str;
        this.c = i;
    }

    public void run() {
        if (this.d.e != null) {
            this.d.e.a("bg started");
        }
        this.d.a(this.a, this.b, this.c);
    }
}
