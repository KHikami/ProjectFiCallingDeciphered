import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import org.chromium.net.UrlRequest;
import org.chromium.net.UrlResponseInfo;

final class jut extends jup {
    final /* synthetic */ juo d;
    private final WritableByteChannel e;

    jut(juo juo, WritableByteChannel writableByteChannel) {
        this.d = juo;
        super(juo);
        this.e = writableByteChannel;
    }

    public void a(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer) {
        byteBuffer.flip();
        this.e.write(byteBuffer);
        byteBuffer.clear();
        urlRequest.a(byteBuffer);
    }
}
