package p000;

import com.google.api.client.http.AbstractHttpContent;
import java.io.OutputStream;

final class ipa extends AbstractHttpContent {
    private final byte[] f18636a;

    protected ipa(byte[] bArr) {
        super("application/x-protobuf");
        this.f18636a = bArr;
    }

    public void writeTo(OutputStream outputStream) {
        outputStream.write(this.f18636a);
        outputStream.flush();
    }
}
