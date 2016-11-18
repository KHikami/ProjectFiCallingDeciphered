package p000;

import org.chromium.net.impl.CronetBidirectionalStream;

public final class owq implements Runnable {
    final /* synthetic */ boolean f34447a;
    final /* synthetic */ CronetBidirectionalStream f34448b;

    public owq(CronetBidirectionalStream cronetBidirectionalStream, boolean z) {
        this.f34448b = cronetBidirectionalStream;
        this.f34447a = z;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        synchronized (this.f34448b.c) {
            if (this.f34448b.d()) {
                return;
            }
            this.f34448b.d = this.f34447a;
            this.f34448b.e = owx.f34463c;
            if (CronetBidirectionalStream.a(this.f34448b.b) || !this.f34448b.d) {
                this.f34448b.f = owx.f34469i;
            } else {
                this.f34448b.f = owx.f34471k;
            }
        }
    }
}
