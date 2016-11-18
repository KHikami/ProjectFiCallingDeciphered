package p000;

import java.util.List;

final class bqk implements Runnable {
    final /* synthetic */ List f4239a;
    final /* synthetic */ bqf f4240b;

    bqk(bqf bqf, List list) {
        this.f4240b = bqf;
        this.f4239a = list;
    }

    public void run() {
        int i;
        if (glq.m18019d(this.f4240b.f4214b, ((bcn) this.f4239a.get(0)).m4893b().f12669d)) {
            i = 3;
        } else {
            i = fde.m15018e(this.f4240b.f4219g.mo2317a()).m5620G();
        }
        this.f4240b.f4222j.mo661a(i);
    }
}
