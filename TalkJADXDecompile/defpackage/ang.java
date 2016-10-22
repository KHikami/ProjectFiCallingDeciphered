package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;

/* renamed from: ang */
final class ang extends ByteArrayOutputStream {
    final /* synthetic */ anf a;

    ang(anf anf, int i) {
        this.a = anf;
        super(i);
    }

    public String toString() {
        int i = (this.count <= 0 || this.buf[this.count - 1] != 13) ? this.count : this.count - 1;
        try {
            return new String(this.buf, 0, i, this.a.a.name());
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }
}
