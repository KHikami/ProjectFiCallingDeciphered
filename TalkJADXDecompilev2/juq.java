package defpackage;

import java.nio.ByteBuffer;
import org.chromium.net.UrlRequest;
import org.chromium.net.UrlResponseInfo;

final class juq extends jup {
    final /* synthetic */ juo d;
    private final jur e;

    juq(juo juo, jur jur) {
        this.d = juo;
        super(juo);
        this.e = jur;
    }

    public void a(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer) {
        this.e.a(byteBuffer);
        if (byteBuffer.hasRemaining()) {
            urlRequest.a(byteBuffer);
        } else {
            urlRequest.a(ByteBuffer.allocateDirect(8192));
        }
    }
}
