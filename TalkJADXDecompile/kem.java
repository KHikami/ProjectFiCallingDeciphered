import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

final class kem extends FilterInputStream {
    final /* synthetic */ kel a;
    private long b;

    public kem(kel kel, InputStream inputStream) {
        this.a = kel;
        super(inputStream);
        this.b = 0;
    }

    public int read(byte[] bArr, int i, int i2) {
        int read = this.in.read(bArr, i, i2);
        if (read == -1) {
            a();
        } else {
            this.b += (long) read;
        }
        return read;
    }

    public int read() {
        int read = this.in.read();
        if (read == -1) {
            a();
        } else {
            this.b++;
        }
        return read;
    }

    private void a() {
        long contentLength = this.a.getContentLength();
        if (contentLength != -1 && this.b != 0 && this.b < contentLength) {
            throw new IOException("Connection closed prematurely: bytesRead = " + this.b + ", Content-Length = " + contentLength);
        }
    }
}
