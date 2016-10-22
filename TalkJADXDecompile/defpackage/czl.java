package defpackage;

import java.util.concurrent.TimeoutException;

/* renamed from: czl */
final class czl implements Runnable {
    final /* synthetic */ czj a;

    czl(czj czj) {
        this.a = czj;
    }

    public void run() {
        synchronized (this.a.c) {
            if (this.a.a >= 0) {
                this.a.a = -1;
                this.a.a(new TimeoutException());
            }
        }
    }
}
