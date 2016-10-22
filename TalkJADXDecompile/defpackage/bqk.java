package defpackage;

import java.util.List;

/* renamed from: bqk */
final class bqk implements Runnable {
    final /* synthetic */ List a;
    final /* synthetic */ bqf b;

    bqk(bqf bqf, List list) {
        this.b = bqf;
        this.a = list;
    }

    public void run() {
        int i;
        if (glq.d(this.b.b, ((bcn) this.a.get(0)).b().d)) {
            i = 3;
        } else {
            i = fde.e(this.b.g.a()).G();
        }
        this.b.j.a(i);
    }
}
