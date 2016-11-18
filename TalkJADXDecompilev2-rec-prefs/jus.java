package p000;

import java.nio.ByteBuffer;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UploadDataSink;

final class jus extends UploadDataProvider {
    private final byte[] f21079a;
    private int f21080b;

    jus(byte[] bArr) {
        this.f21079a = bArr;
    }

    public long m25249a() {
        return (long) this.f21079a.length;
    }

    public void m25251a(UploadDataSink uploadDataSink, ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        byteBuffer.put(this.f21079a, this.f21080b, Math.min(byteBuffer.remaining(), this.f21079a.length - this.f21080b));
        this.f21080b = (byteBuffer.position() - position) + this.f21080b;
        uploadDataSink.a(false);
    }

    public void m25250a(UploadDataSink uploadDataSink) {
        this.f21080b = 0;
        uploadDataSink.a();
    }
}
