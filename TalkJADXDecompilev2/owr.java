package defpackage;

import org.chromium.net.impl.CronetBidirectionalStream;

public final class owr implements Runnable {
    final /* synthetic */ CronetBidirectionalStream a;

    public owr(CronetBidirectionalStream cronetBidirectionalStream) {
        this.a = cronetBidirectionalStream;
    }

    public void run() {
        synchronized (this.a.c) {
            if (this.a.d()) {
                return;
            }
            this.a.e = owx.c;
            try {
                this.a.a.a(this.a, this.a.g);
            } catch (Exception e) {
                this.a.a(e);
            }
        }
    }
}
