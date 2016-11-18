package p000;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

final class kem extends FilterInputStream {
    final /* synthetic */ kel f21496a;
    private long f21497b = 0;

    public kem(kel kel, InputStream inputStream) {
        this.f21496a = kel;
        super(inputStream);
    }

    public int read(byte[] bArr, int i, int i2) {
        int read = this.in.read(bArr, i, i2);
        if (read == -1) {
            m25661a();
        } else {
            this.f21497b += (long) read;
        }
        return read;
    }

    public int read() {
        int read = this.in.read();
        if (read == -1) {
            m25661a();
        } else {
            this.f21497b++;
        }
        return read;
    }

    private void m25661a() {
        long contentLength = this.f21496a.getContentLength();
        if (contentLength != -1 && this.f21497b != 0 && this.f21497b < contentLength) {
            throw new IOException("Connection closed prematurely: bytesRead = " + this.f21497b + ", Content-Length = " + contentLength);
        }
    }
}
