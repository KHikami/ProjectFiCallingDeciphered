package defpackage;

import java.util.List;

/* renamed from: ljw */
final class ljw implements Runnable {
    final /* synthetic */ ljs a;
    final /* synthetic */ List b;
    final /* synthetic */ ljv c;

    ljw(ljv ljv, ljs ljs, List list) {
        this.c = ljv;
        this.a = ljs;
        this.b = list;
    }

    public void run() {
        this.a.a(this.b);
    }
}
