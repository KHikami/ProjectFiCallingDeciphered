package p000;

import java.nio.ByteBuffer;
import org.chromium.net.impl.CronetBidirectionalStream;

public final class oww implements Runnable {
    final /* synthetic */ CronetBidirectionalStream f34458a;
    private ByteBuffer f34459b;
    private final boolean f34460c;

    public oww(CronetBidirectionalStream cronetBidirectionalStream, ByteBuffer byteBuffer, boolean z) {
        this.f34458a = cronetBidirectionalStream;
        this.f34459b = byteBuffer;
        this.f34460c = z;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        Object obj = null;
        try {
            ByteBuffer byteBuffer = this.f34459b;
            this.f34459b = null;
            synchronized (this.f34458a.c) {
                if (this.f34458a.d()) {
                } else if (this.f34460c) {
                    this.f34458a.f = owx.f34471k;
                    if (this.f34458a.e == owx.f34465e) {
                        obj = 1;
                    }
                }
            }
        } catch (Exception e) {
            this.f34458a.a(e);
        }
    }
}
