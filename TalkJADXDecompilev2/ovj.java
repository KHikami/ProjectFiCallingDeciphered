package defpackage;

import java.nio.ByteBuffer;
import org.chromium.net.UrlResponseInfo;

final class ovj implements ovn {
    final /* synthetic */ UrlResponseInfo a;
    final /* synthetic */ ByteBuffer b;
    final /* synthetic */ ovg c;

    ovj(ovg ovg, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer) {
        this.c = ovg;
        this.a = urlResponseInfo;
        this.b = byteBuffer;
    }

    public void a() {
        if (this.c.c.f.compareAndSet(ovw.READING, ovw.AWAITING_READ)) {
            this.c.a.a(this.c.c, this.a, this.b);
        }
    }
}
