package p000;

import java.nio.ByteBuffer;
import org.chromium.net.UrlRequest;
import org.chromium.net.UrlResponseInfo;

final class juq extends jup {
    final /* synthetic */ juo f21076d;
    private final jur f21077e;

    juq(juo juo, jur jur) {
        this.f21076d = juo;
        super(juo);
        this.f21077e = jur;
    }

    public void m25246a(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer) {
        this.f21077e.m25248a(byteBuffer);
        if (byteBuffer.hasRemaining()) {
            urlRequest.a(byteBuffer);
        } else {
            urlRequest.a(ByteBuffer.allocateDirect(8192));
        }
    }
}
