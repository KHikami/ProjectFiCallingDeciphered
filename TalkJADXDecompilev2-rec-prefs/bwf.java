package p000;

import java.util.Observable;
import java.util.Observer;

final class bwf implements Observer {
    final /* synthetic */ bwe f4639a;

    bwf(bwe bwe) {
        this.f4639a = bwe;
    }

    public void update(Observable observable, Object obj) {
        gwb.aJ();
        if (this.f4639a.f4631g) {
            this.f4639a.m6818d();
            this.f4639a.m6817b();
        }
    }
}
