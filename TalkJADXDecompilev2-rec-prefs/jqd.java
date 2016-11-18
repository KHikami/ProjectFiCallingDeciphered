package p000;

import java.nio.ByteBuffer;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UploadDataSink;

final class jqd extends UploadDataProvider {
    private final byte[] f20789a;
    private int f20790b;

    jqd(byte[] bArr) {
        this.f20789a = bArr;
    }

    public long m25005a() {
        return (long) this.f20789a.length;
    }

    public void m25007a(UploadDataSink uploadDataSink, ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        byteBuffer.put(this.f20789a, this.f20790b, Math.min(byteBuffer.remaining(), this.f20789a.length - this.f20790b));
        this.f20790b = (byteBuffer.position() - position) + this.f20790b;
        uploadDataSink.a(false);
    }

    public void m25006a(UploadDataSink uploadDataSink) {
        this.f20790b = 0;
        uploadDataSink.a();
    }
}
