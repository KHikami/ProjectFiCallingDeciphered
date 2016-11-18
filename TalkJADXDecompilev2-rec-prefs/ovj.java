package p000;

import java.nio.ByteBuffer;
import org.chromium.net.UrlResponseInfo;

final class ovj implements ovn {
    final /* synthetic */ UrlResponseInfo f34368a;
    final /* synthetic */ ByteBuffer f34369b;
    final /* synthetic */ ovg f34370c;

    ovj(ovg ovg, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer) {
        this.f34370c = ovg;
        this.f34368a = urlResponseInfo;
        this.f34369b = byteBuffer;
    }

    public void mo4235a() {
        if (this.f34370c.f34363c.f34323f.compareAndSet(ovw.READING, ovw.AWAITING_READ)) {
            this.f34370c.f34361a.m39379a(this.f34370c.f34363c, this.f34368a, this.f34369b);
        }
    }
}
