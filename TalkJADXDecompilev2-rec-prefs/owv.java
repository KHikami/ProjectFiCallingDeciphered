package p000;

import java.nio.ByteBuffer;
import org.chromium.net.impl.CronetBidirectionalStream;

public final class owv implements Runnable {
    public ByteBuffer f34455a;
    public boolean f34456b;
    final /* synthetic */ CronetBidirectionalStream f34457c;

    public owv(CronetBidirectionalStream cronetBidirectionalStream) {
        this.f34457c = cronetBidirectionalStream;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        Object obj = null;
        try {
            ByteBuffer byteBuffer = this.f34455a;
            this.f34455a = null;
            synchronized (this.f34457c.c) {
                if (this.f34457c.d()) {
                } else if (this.f34456b) {
                    this.f34457c.e = owx.f34465e;
                    if (this.f34457c.f == owx.f34471k) {
                        obj = 1;
                    }
                } else {
                    this.f34457c.e = owx.f34463c;
                }
            }
        } catch (Exception e) {
            this.f34457c.a(e);
        }
    }
}
