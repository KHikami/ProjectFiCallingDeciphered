package p000;

import java.util.concurrent.Executor;

final class omm implements Runnable {
    final omh f33241a;
    final /* synthetic */ String f33242b;
    final /* synthetic */ okw f33243c;
    final /* synthetic */ olh f33244d;
    final /* synthetic */ omk f33245e;

    omm(omk omk, String str, okw okw, olh olh) {
        this.f33245e = omk;
        this.f33242b = str;
        this.f33243c = okw;
        this.f33244d = olh;
        String str2 = this.f33242b;
        String str3 = this.f33245e.f33226b;
        Executor executor = this.f33245e.f33230f;
        okw okw2 = this.f33243c;
        omk omk2 = this.f33245e;
        Object obj = this.f33245e.f33228d;
        int i = this.f33245e.f33231g;
        boolean z = this.f33244d.m38679c() || omk.f33225a;
        this.f33241a = new omh(str2, str3, executor, okw2, omk2, this, obj, i, z, this.f33244d.m38677a() == olj.UNARY);
    }

    public void run() {
        synchronized (this.f33245e.f33228d) {
            if (this.f33245e.f33232h) {
                this.f33241a.a(this.f33245e.f33233i, true, new okw());
            } else if (this.f33245e.f33234j) {
                omk omk = this.f33245e;
                omh omh = this.f33241a;
                omk.f33229e.add(omh);
                omh.m38729a(omk.f33235k);
            } else {
                throw new AssertionError("Transport is not started");
            }
        }
    }
}
