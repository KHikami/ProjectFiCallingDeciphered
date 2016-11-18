package defpackage;

import java.nio.ByteBuffer;
import org.chromium.net.impl.CronetUrlRequest;

public final class oxk implements Runnable {
    public ByteBuffer a;
    final /* synthetic */ CronetUrlRequest b;

    public oxk(CronetUrlRequest cronetUrlRequest) {
        this.b = cronetUrlRequest;
    }

    public void run() {
        ByteBuffer byteBuffer = this.a;
        this.a = null;
        try {
            synchronized (this.b.e) {
                if (this.b.d()) {
                    return;
                }
                this.b.c = true;
                this.b.f.a(this.b, this.b.h, byteBuffer);
            }
        } catch (Exception e) {
            this.b.a(e);
        }
    }
}
