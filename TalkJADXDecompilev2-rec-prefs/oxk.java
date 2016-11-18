package p000;

import java.nio.ByteBuffer;
import org.chromium.net.impl.CronetUrlRequest;

public final class oxk implements Runnable {
    public ByteBuffer f34496a;
    final /* synthetic */ CronetUrlRequest f34497b;

    public oxk(CronetUrlRequest cronetUrlRequest) {
        this.f34497b = cronetUrlRequest;
    }

    public void run() {
        ByteBuffer byteBuffer = this.f34496a;
        this.f34496a = null;
        try {
            synchronized (this.f34497b.e) {
                if (this.f34497b.d()) {
                    return;
                }
                this.f34497b.c = true;
                this.f34497b.f.m39379a(this.f34497b, this.f34497b.h, byteBuffer);
            }
        } catch (Exception e) {
            this.f34497b.a(e);
        }
    }
}
