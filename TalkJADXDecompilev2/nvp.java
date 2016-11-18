package defpackage;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

final class nvp extends nvu {
    private static final long serialVersionUID = 1;
    private final int d;
    private final int e;

    nvp(byte[] bArr, int i, int i2) {
        super(bArr);
        nvp.b(i, i + i2, bArr.length);
        this.d = i;
        this.e = i2;
    }

    public byte a(int i) {
        int b = b();
        if (((b - (i + 1)) | i) >= 0) {
            return this.c[this.d + i];
        }
        if (i < 0) {
            throw new ArrayIndexOutOfBoundsException("Index < 0: " + i);
        }
        throw new ArrayIndexOutOfBoundsException("Index > length: " + i + ", " + b);
    }

    public int b() {
        return this.e;
    }

    protected int d() {
        return this.d;
    }

    protected void a(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.c, d(), bArr, 0, i3);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("BoundedByteStream instances are not to be serialized directly");
    }

    Object writeReplace() {
        byte[] bArr;
        int b = b();
        if (b == 0) {
            bArr = nwv.c;
        } else {
            bArr = new byte[b];
            a(bArr, 0, 0, b);
        }
        return nvn.a(bArr);
    }
}
