package p000;

import org.chromium.net.impl.CronetBidirectionalStream;

public final class owr implements Runnable {
    final /* synthetic */ CronetBidirectionalStream f34449a;

    public owr(CronetBidirectionalStream cronetBidirectionalStream) {
        this.f34449a = cronetBidirectionalStream;
    }

    public void run() {
        synchronized (this.f34449a.c) {
            if (this.f34449a.d()) {
                return;
            }
            this.f34449a.e = owx.f34463c;
            try {
                this.f34449a.a.mo4179a(this.f34449a, this.f34449a.g);
            } catch (Exception e) {
                this.f34449a.a(e);
            }
        }
    }
}
