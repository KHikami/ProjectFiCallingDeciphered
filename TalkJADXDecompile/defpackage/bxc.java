package defpackage;

import java.util.Observable;
import java.util.Observer;

/* renamed from: bxc */
final class bxc implements Observer {
    final /* synthetic */ bxb a;

    bxc(bxb bxb) {
        this.a = bxb;
    }

    public void update(Observable observable, Object obj) {
        this.a.a(((gln) observable).a());
        gwb.aJ();
        this.a.b.b();
    }
}
