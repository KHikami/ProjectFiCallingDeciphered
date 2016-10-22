import java.nio.ByteBuffer;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UploadDataSink;

final class jus extends UploadDataProvider {
    private final byte[] a;
    private int b;

    jus(byte[] bArr) {
        this.a = bArr;
    }

    public long a() {
        return (long) this.a.length;
    }

    public void a(UploadDataSink uploadDataSink, ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        byteBuffer.put(this.a, this.b, Math.min(byteBuffer.remaining(), this.a.length - this.b));
        this.b = (byteBuffer.position() - position) + this.b;
        uploadDataSink.a(false);
    }

    public void a(UploadDataSink uploadDataSink) {
        this.b = 0;
        uploadDataSink.a();
    }
}
