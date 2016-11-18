package p000;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public class ond {
    private static final byte[] f33270l = new byte[768];
    int f33271a;
    boolean f33272b;
    boolean f33273c;
    int[] f33274d;
    int f33275e;
    int f33276f;
    int f33277g;
    private final byte[] f33278h;
    private final int f33279i;
    private int f33280j;
    private int f33281k;

    public ond(ByteBuffer byteBuffer) {
        int arrayOffset;
        byte[] a = ond.m38787a(byteBuffer);
        if (byteBuffer.hasArray()) {
            arrayOffset = byteBuffer.arrayOffset();
        } else {
            arrayOffset = 0;
        }
        this(a, arrayOffset);
    }

    private static byte[] m38787a(ByteBuffer byteBuffer) {
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
        this.f33274d = new int[256];
        this.f33278h = bArr;
        this.f33279i = i;
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
                this.f33280j = ond.m38785a(one);
                this.f33281k = ond.m38785a(one);
                int read = one.read();
                if ((read & 128) != 0) {
                    z = true;
                }
                this.f33272b = z;
                this.f33275e = 2 << (read & 7);
                this.f33277g = one.read();
                one.skip(1);
                if (this.f33272b && !this.f33273c) {
                    ond.m38786a(one, this.f33274d, this.f33275e);
                    this.f33276f = this.f33274d[this.f33277g];
                }
            } else {
                this.f33273c = true;
            }
            this.f33271a = one.m38789a();
        } catch (IOException e) {
            this.f33273c = true;
        }
        try {
            one.close();
        } catch (IOException e2) {
        }
    }

    public int m38788a() {
        return this.f33278h.length + (this.f33274d.length << 2);
    }

    private static boolean m38786a(InputStream inputStream, int[] iArr, int i) {
        int i2 = 0;
        synchronized (f33270l) {
            int i3 = i * 3;
            if (inputStream.read(f33270l, 0, i3) < i3) {
                return false;
            }
            i3 = 0;
            while (i3 < i) {
                int i4 = i2 + 1;
                int i5 = f33270l[i2] & 255;
                int i6 = i4 + 1;
                i2 = i6 + 1;
                int i7 = f33270l[i6] & 255;
                i6 = i3 + 1;
                iArr[i3] = (((f33270l[i4] & 255) << 8) | ((i5 << 16) | -16777216)) | i7;
                i3 = i6;
            }
            return true;
        }
    }

    private static int m38785a(InputStream inputStream) {
        return inputStream.read() | (inputStream.read() << 8);
    }
}
