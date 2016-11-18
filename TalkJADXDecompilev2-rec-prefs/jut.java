package p000;

import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import org.chromium.net.UrlRequest;
import org.chromium.net.UrlResponseInfo;

final class jut extends jup {
    final /* synthetic */ juo f21081d;
    private final WritableByteChannel f21082e;

    jut(juo juo, WritableByteChannel writableByteChannel) {
        this.f21081d = juo;
        super(juo);
        this.f21082e = writableByteChannel;
    }

    public void m25252a(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer) {
        byteBuffer.flip();
        this.f21082e.write(byteBuffer);
        byteBuffer.clear();
        urlRequest.a(byteBuffer);
    }
}
