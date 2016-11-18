package defpackage;

import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ReadOnlyBufferException;

public final class hcj {
    private final ByteBuffer a;

    private hcj(ByteBuffer byteBuffer) {
        this.a = byteBuffer;
        this.a.order(ByteOrder.LITTLE_ENDIAN);
    }

    private hcj(byte[] bArr, int i, int i2) {
        this(ByteBuffer.wrap(bArr, i, i2));
    }

    public static int a(int i) {
        return i >= 0 ? hcj.d(i) : 10;
    }

    public static int a(long j) {
        return (-128 & j) == 0 ? 1 : (-16384 & j) == 0 ? 2 : (-2097152 & j) == 0 ? 3 : (-268435456 & j) == 0 ? 4 : (-34359738368L & j) == 0 ? 5 : (-4398046511104L & j) == 0 ? 6 : (-562949953421312L & j) == 0 ? 7 : (-72057594037927936L & j) == 0 ? 8 : (Long.MIN_VALUE & j) == 0 ? 9 : 10;
    }

    private static int a(CharSequence charSequence) {
        int i = 0;
        int length = charSequence.length();
        int i2 = 0;
        while (i2 < length && charSequence.charAt(i2) < '') {
            i2++;
        }
        int i3 = length;
        while (i2 < length) {
            char charAt = charSequence.charAt(i2);
            if (charAt < 'ࠀ') {
                i3 += (127 - charAt) >>> 31;
                i2++;
            } else {
                int length2 = charSequence.length();
                while (i2 < length2) {
                    char charAt2 = charSequence.charAt(i2);
                    if (charAt2 < 'ࠀ') {
                        i += (127 - charAt2) >>> 31;
                    } else {
                        i += 2;
                        if ('?' <= charAt2 && charAt2 <= '?') {
                            if (Character.codePointAt(charSequence, i2) < 65536) {
                                throw new IllegalArgumentException("Unpaired surrogate at index " + i2);
                            }
                            i2++;
                        }
                    }
                    i2++;
                }
                i2 = i3 + i;
                if (i2 < length) {
                    return i2;
                }
                throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (((long) i2) + 4294967296L));
            }
        }
        i2 = i3;
        if (i2 < length) {
            return i2;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (((long) i2) + 4294967296L));
    }

    private static int a(CharSequence charSequence, byte[] bArr, int i, int i2) {
        int length = charSequence.length();
        int i3 = 0;
        int i4 = i + i2;
        while (i3 < length && i3 + i < i4) {
            char charAt = charSequence.charAt(i3);
            if (charAt >= '') {
                break;
            }
            bArr[i + i3] = (byte) charAt;
            i3++;
        }
        if (i3 == length) {
            return i + length;
        }
        int i5 = i + i3;
        while (i3 < length) {
            int i6;
            char charAt2 = charSequence.charAt(i3);
            if (charAt2 < '' && i5 < i4) {
                i6 = i5 + 1;
                bArr[i5] = (byte) charAt2;
            } else if (charAt2 < 'ࠀ' && i5 <= i4 - 2) {
                r6 = i5 + 1;
                bArr[i5] = (byte) ((charAt2 >>> 6) | 960);
                i6 = r6 + 1;
                bArr[r6] = (byte) ((charAt2 & 63) | 128);
            } else if ((charAt2 < '?' || '?' < charAt2) && i5 <= i4 - 3) {
                i6 = i5 + 1;
                bArr[i5] = (byte) ((charAt2 >>> 12) | 480);
                i5 = i6 + 1;
                bArr[i6] = (byte) (((charAt2 >>> 6) & 63) | 128);
                i6 = i5 + 1;
                bArr[i5] = (byte) ((charAt2 & 63) | 128);
            } else if (i5 <= i4 - 4) {
                if (i3 + 1 != charSequence.length()) {
                    i3++;
                    charAt = charSequence.charAt(i3);
                    if (Character.isSurrogatePair(charAt2, charAt)) {
                        int toCodePoint = Character.toCodePoint(charAt2, charAt);
                        i6 = i5 + 1;
                        bArr[i5] = (byte) ((toCodePoint >>> 18) | 240);
                        i5 = i6 + 1;
                        bArr[i6] = (byte) (((toCodePoint >>> 12) & 63) | 128);
                        r6 = i5 + 1;
                        bArr[i5] = (byte) (((toCodePoint >>> 6) & 63) | 128);
                        i6 = r6 + 1;
                        bArr[r6] = (byte) ((toCodePoint & 63) | 128);
                    }
                }
                throw new IllegalArgumentException("Unpaired surrogate at index " + (i3 - 1));
            } else {
                throw new ArrayIndexOutOfBoundsException("Failed writing " + charAt2 + " at index " + i5);
            }
            i3++;
            i5 = i6;
        }
        return i5;
    }

    public static int a(String str) {
        int a = hcj.a((CharSequence) str);
        return a + hcj.d(a);
    }

    public static int a(byte[] bArr) {
        return hcj.d(bArr.length) + bArr.length;
    }

    public static hcj a(byte[] bArr, int i, int i2) {
        return new hcj(bArr, i, i2);
    }

    private void a(byte b) {
        if (this.a.hasRemaining()) {
            this.a.put(b);
            return;
        }
        throw new awx(this.a.position(), this.a.limit());
    }

    private void a(double d) {
        f(Double.doubleToLongBits(d));
    }

    private void a(float f) {
        i(Float.floatToIntBits(f));
    }

    private static void a(CharSequence charSequence, ByteBuffer byteBuffer) {
        if (byteBuffer.isReadOnly()) {
            throw new ReadOnlyBufferException();
        } else if (byteBuffer.hasArray()) {
            try {
                byteBuffer.position(hcj.a(charSequence, byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining()) - byteBuffer.arrayOffset());
            } catch (Throwable e) {
                BufferOverflowException bufferOverflowException = new BufferOverflowException();
                bufferOverflowException.initCause(e);
                throw bufferOverflowException;
            }
        } else {
            hcj.b(charSequence, byteBuffer);
        }
    }

    private void a(boolean z) {
        h(z ? 1 : 0);
    }

    private int b() {
        return this.a.remaining();
    }

    public static int b(int i) {
        return hcj.d(0 | (i << 3));
    }

    public static int b(int i, hcq hcq) {
        int b = hcj.b(i);
        int f = hcq.f();
        return b + (f + hcj.d(f));
    }

    public static int b(int i, String str) {
        return hcj.b(i) + hcj.a(str);
    }

    public static int b(int i, byte[] bArr) {
        return hcj.b(i) + hcj.a(bArr);
    }

    public static long b(long j) {
        return (j << 1) ^ (j >> 63);
    }

    private static void b(CharSequence charSequence, ByteBuffer byteBuffer) {
        int length = charSequence.length();
        int i = 0;
        while (i < length) {
            char charAt = charSequence.charAt(i);
            if (charAt < '') {
                byteBuffer.put((byte) charAt);
            } else if (charAt < 'ࠀ') {
                byteBuffer.put((byte) ((charAt >>> 6) | 960));
                byteBuffer.put((byte) ((charAt & 63) | 128));
            } else if (charAt < '?' || '?' < charAt) {
                byteBuffer.put((byte) ((charAt >>> 12) | 480));
                byteBuffer.put((byte) (((charAt >>> 6) & 63) | 128));
                byteBuffer.put((byte) ((charAt & 63) | 128));
            } else {
                if (i + 1 != charSequence.length()) {
                    i++;
                    char charAt2 = charSequence.charAt(i);
                    if (Character.isSurrogatePair(charAt, charAt2)) {
                        int toCodePoint = Character.toCodePoint(charAt, charAt2);
                        byteBuffer.put((byte) ((toCodePoint >>> 18) | 240));
                        byteBuffer.put((byte) (((toCodePoint >>> 12) & 63) | 128));
                        byteBuffer.put((byte) (((toCodePoint >>> 6) & 63) | 128));
                        byteBuffer.put((byte) ((toCodePoint & 63) | 128));
                    }
                }
                throw new IllegalArgumentException("Unpaired surrogate at index " + (i - 1));
            }
            i++;
        }
    }

    private void b(String str) {
        try {
            int d = hcj.d(str.length());
            if (d == hcj.d(str.length() * 3)) {
                int position = this.a.position();
                if (this.a.remaining() < d) {
                    throw new awx(d + position, this.a.limit());
                }
                this.a.position(position + d);
                hcj.a((CharSequence) str, this.a);
                int position2 = this.a.position();
                this.a.position(position);
                c((position2 - position) - d);
                this.a.position(position2);
                return;
            }
            c(hcj.a((CharSequence) str));
            hcj.a((CharSequence) str, this.a);
        } catch (Throwable e) {
            awx awx = new awx(this.a.position(), this.a.limit());
            awx.initCause(e);
            throw awx;
        }
    }

    private void b(byte[] bArr, int i, int i2) {
        if (this.a.remaining() >= i2) {
            this.a.put(bArr, 0, i2);
            return;
        }
        throw new awx(this.a.position(), this.a.limit());
    }

    public static int c(int i, int i2) {
        return hcj.b(i) + hcj.a(i2);
    }

    public static int c(int i, long j) {
        return hcj.b(i) + hcj.a(j);
    }

    private void c(long j) {
        e(j);
    }

    private void c(byte[] bArr) {
        c(bArr.length);
        b(bArr);
    }

    public static int d(int i) {
        return (i & -128) == 0 ? 1 : (i & -16384) == 0 ? 2 : (-2097152 & i) == 0 ? 3 : (-268435456 & i) == 0 ? 4 : 5;
    }

    private void d(long j) {
        e(hcj.b(j));
    }

    public static int e(int i) {
        return (i << 1) ^ (i >> 31);
    }

    private void e(long j) {
        while ((-128 & j) != 0) {
            h((((int) j) & 127) | 128);
            j >>>= 7;
        }
        h((int) j);
    }

    private void f(int i) {
        if (i >= 0) {
            c(i);
        } else {
            e((long) i);
        }
    }

    private void f(long j) {
        if (this.a.remaining() < 8) {
            throw new awx(this.a.position(), this.a.limit());
        }
        this.a.putLong(j);
    }

    private void g(int i) {
        c(hcj.e(i));
    }

    private void h(int i) {
        a((byte) i);
    }

    private void i(int i) {
        if (this.a.remaining() < 4) {
            throw new awx(this.a.position(), this.a.limit());
        }
        this.a.putInt(i);
    }

    public void a() {
        if (b() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public void a(int i, double d) {
        d(3, 1);
        a(d);
    }

    public void a(int i, float f) {
        d(i, 5);
        a(f);
    }

    public void a(int i, int i2) {
        d(i, 0);
        f(i2);
    }

    public void a(int i, long j) {
        d(i, 0);
        c(j);
    }

    public void a(int i, hcq hcq) {
        d(i, 2);
        b(hcq);
    }

    public void a(int i, String str) {
        d(i, 2);
        b(str);
    }

    public void a(int i, boolean z) {
        d(i, 0);
        a(z);
    }

    public void a(int i, byte[] bArr) {
        d(i, 2);
        c(bArr);
    }

    public void a(hcq hcq) {
        hcq.a(this);
    }

    public void b(int i, int i2) {
        d(7, 0);
        g(i2);
    }

    public void b(int i, long j) {
        d(15, 0);
        d(j);
    }

    public void b(hcq hcq) {
        c(hcq.e());
        hcq.a(this);
    }

    public void b(byte[] bArr) {
        b(bArr, 0, bArr.length);
    }

    public void c(int i) {
        while ((i & -128) != 0) {
            h((i & 127) | 128);
            i >>>= 7;
        }
        h(i);
    }

    public void d(int i, int i2) {
        c((i << 3) | i2);
    }
}
