package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public class ond {
    private static final byte[] l = new byte[768];
    int a;
    boolean b;
    boolean c;
    int[] d;
    int e;
    int f;
    int g;
    private final byte[] h;
    private final int i;
    private int j;
    private int k;

    public ond(ByteBuffer byteBuffer) {
        int arrayOffset;
        byte[] a = ond.a(byteBuffer);
        if (byteBuffer.hasArray()) {
            arrayOffset = byteBuffer.arrayOffset();
        } else {
            arrayOffset = 0;
        }
        this(a, arrayOffset);
    }

    private static byte[] a(ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray()) {
            return byteBuffer.array();
        }
        int position = byteBuffer.position();
        try {
            byte[] bArr = new byte[byteBuffer.capacity()];
            byteBuffer.get(bArr);
            return bArr;
        } finally {
            byteBuffer.position(position);
        }
    }

    private ond(byte[] bArr, int i) {
        boolean z = false;
        this.d = new int[256];
        this.h = bArr;
        this.i = i;
        InputStream one = new one(this, bArr);
        one.skip((long) i);
        try {
            boolean z2;
            if ((one.read() == 71) && one.read() == 73) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2 && one.read() == 70) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                one.skip(3);
                this.j = ond.a(one);
                this.k = ond.a(one);
                int read = one.read();
                if ((read & 128) != 0) {
                    z = true;
                }
                this.b = z;
                this.e = 2 << (read & 7);
                this.g = one.read();
                one.skip(1);
                if (this.b && !this.c) {
                    ond.a(one, this.d, this.e);
                    this.f = this.d[this.g];
                }
            } else {
                this.c = true;
            }
            this.a = one.a();
        } catch (IOException e) {
            this.c = true;
        }
        try {
            one.close();
        } catch (IOException e2) {
        }
    }

    public int a() {
        return this.h.length + (this.d.length << 2);
    }

    private static boolean a(InputStream inputStream, int[] iArr, int i) {
        int i2 = 0;
        synchronized (l) {
            int i3 = i * 3;
            if (inputStream.read(l, 0, i3) < i3) {
                return false;
            }
            i3 = 0;
            while (i3 < i) {
                int i4 = i2 + 1;
                int i5 = l[i2] & 255;
                int i6 = i4 + 1;
                i2 = i6 + 1;
                int i7 = l[i6] & 255;
                i6 = i3 + 1;
                iArr[i3] = (((l[i4] & 255) << 8) | ((i5 << 16) | -16777216)) | i7;
                i3 = i6;
            }
            return true;
        }
    }

    private static int a(InputStream inputStream) {
        return inputStream.read() | (inputStream.read() << 8);
    }
}
