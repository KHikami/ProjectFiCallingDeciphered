package defpackage;

import java.util.concurrent.Executor;

final class omm implements Runnable {
    final omh a;
    final /* synthetic */ String b;
    final /* synthetic */ okw c;
    final /* synthetic */ olh d;
    final /* synthetic */ omk e;

    omm(omk omk, String str, okw okw, olh olh) {
        this.e = omk;
        this.b = str;
        this.c = okw;
        this.d = olh;
        String str2 = this.b;
        String str3 = this.e.b;
        Executor executor = this.e.f;
        okw okw2 = this.c;
        omk omk2 = this.e;
        Object obj = this.e.d;
        int i = this.e.g;
        boolean z = this.d.c() || omk.a;
        this.a = new omh(str2, str3, executor, okw2, omk2, this, obj, i, z, this.d.a() == olj.UNARY);
    }

    public void run() {
        synchronized (this.e.d) {
            if (this.e.h) {
                this.a.a(this.e.i, true, new okw());
            } else if (this.e.j) {
                omk omk = this.e;
                omh omh = this.a;
                omk.e.add(omh);
                omh.a(omk.k);
            } else {
                throw new AssertionError("Transport is not started");
            }
        }
    }
}
