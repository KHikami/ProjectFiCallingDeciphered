import com.google.api.client.http.AbstractHttpContent;
import java.io.OutputStream;

final class ipa extends AbstractHttpContent {
    private final byte[] a;

    protected ipa(byte[] bArr) {
        super("application/x-protobuf");
        this.a = bArr;
    }

    public void writeTo(OutputStream outputStream) {
        outputStream.write(this.a);
        outputStream.flush();
    }
}
