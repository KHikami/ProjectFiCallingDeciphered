package p000;

import java.util.concurrent.TimeoutException;

final class czl implements Runnable {
    final /* synthetic */ czj f9381a;

    czl(czj czj) {
        this.f9381a = czj;
    }

    public void run() {
        synchronized (this.f9381a.f9350c) {
            if (this.f9381a.f9348a >= 0) {
                this.f9381a.f9348a = -1;
                this.f9381a.mo1888a(new TimeoutException());
            }
        }
    }
}
