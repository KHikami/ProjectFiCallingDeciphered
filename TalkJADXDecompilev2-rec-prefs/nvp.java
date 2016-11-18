package p000;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

final class nvp extends nvu {
    private static final long serialVersionUID = 1;
    private final int f31134d;
    private final int f31135e;

    nvp(byte[] bArr, int i, int i2) {
        super(bArr);
        nvp.b(i, i + i2, bArr.length);
        this.f31134d = i;
        this.f31135e = i2;
    }

    public byte mo3983a(int i) {
        int b = mo3985b();
        if (((b - (i + 1)) | i) >= 0) {
            return this.c[this.f31134d + i];
        }
        if (i < 0) {
            throw new ArrayIndexOutOfBoundsException("Index < 0: " + i);
        }
        throw new ArrayIndexOutOfBoundsException("Index > length: " + i + ", " + b);
    }

    public int mo3985b() {
        return this.f31135e;
    }

    protected int mo3986d() {
        return this.f31134d;
    }

    protected void mo3984a(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.c, mo3986d(), bArr, 0, i3);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("BoundedByteStream instances are not to be serialized directly");
    }

    Object writeReplace() {
        byte[] bArr;
        int b = b();
        if (b == 0) {
            bArr = nwv.f31200c;
        } else {
            bArr = new byte[b];
            a(bArr, 0, 0, b);
        }
        return nvn.a(bArr);
    }
}
