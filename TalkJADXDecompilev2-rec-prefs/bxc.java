package p000;

import java.util.Observable;
import java.util.Observer;

final class bxc implements Observer {
    final /* synthetic */ bxb f4719a;

    bxc(bxb bxb) {
        this.f4719a = bxb;
    }

    public void update(Observable observable, Object obj) {
        this.f4719a.m6866a(((gln) observable).m17986a());
        gwb.aJ();
        this.f4719a.f4712b.m6686b();
    }
}
