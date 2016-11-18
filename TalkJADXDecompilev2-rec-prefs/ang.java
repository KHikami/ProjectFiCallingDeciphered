package p000;

import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;

final class ang extends ByteArrayOutputStream {
    final /* synthetic */ anf f1869a;

    ang(anf anf, int i) {
        this.f1869a = anf;
        super(i);
    }

    public String toString() {
        int i = (this.count <= 0 || this.buf[this.count - 1] != (byte) 13) ? this.count : this.count - 1;
        try {
            return new String(this.buf, 0, i, this.f1869a.f1864a.name());
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }
}
