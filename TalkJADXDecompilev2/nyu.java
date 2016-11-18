package defpackage;

import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ReadOnlyBufferException;

public final class nyu {
    private final ByteBuffer a;

    private nyu(byte[] bArr, int i, int i2) {
        this(ByteBuffer.wrap(bArr, i, i2));
    }

    private nyu(ByteBuffer byteBuffer) {
        this.a = byteBuffer;
        this.a.order(ByteOrder.LITTLE_ENDIAN);
    }

    public static nyu a(byte[] bArr, int i, int i2) {
        return new nyu(bArr, i, i2);
    }

    public void a(int i, double d) {
        i(i, 1);
        a(d);
    }

    public void a(int i, float f) {
        i(i, 5);
        a(f);
    }

    public void a(int i, long j) {
        i(i, 0);
        a(j);
    }

    public void b(int i, long j) {
        i(i, 0);
        b(j);
    }

    public void a(int i, int i2) {
        i(i, 0);
        a(i2);
    }

    public void c(int i, long j) {
        i(i, 1);
        c(j);
    }

    public void b(int i, int i2) {
        i(i, 5);
        b(i2);
    }

    public void a(int i, boolean z) {
        i(i, 0);
        a(z);
    }

    public void a(int i, String str) {
        i(i, 2);
        a(str);
    }

    public void a(int i, nzf nzf) {
        i(i, 3);
        a(nzf);
        i(i, 4);
    }

    public void b(int i, nzf nzf) {
        i(i, 2);
        b(nzf);
    }

    public void a(int i, byte[] bArr) {
        i(i, 2);
        a(bArr);
    }

    public void c(int i, int i2) {
        i(i, 0);
        c(i2);
    }

    public void d(int i, int i2) {
        i(i, 5);
        e(i2);
    }

    public void e(int i, int i2) {
        i(4, 0);
        f(i2);
    }

    public void d(int i, long j) {
        i(5, 0);
        e(j);
    }

    public void a(double d) {
        i(Double.doubleToLongBits(d));
    }

    public void a(float f) {
        m(Float.floatToIntBits(f));
    }

    public void a(long j) {
        h(j);
    }

    public void b(long j) {
        h(j);
    }

    public void a(int i) {
        if (i >= 0) {
            i(i);
        } else {
            h((long) i);
        }
    }

    public void c(long j) {
        i(j);
    }

    public void b(int i) {
        m(i);
    }

    public void a(boolean z) {
        l(z ? 1 : 0);
    }

    public void a(String str) {
        try {
            int j = nyu.j(str.length());
            if (j == nyu.j(str.length() * 3)) {
                int position = this.a.position();
                if (this.a.remaining() < j) {
                    throw new nyv(j + position, this.a.limit());
                }
                this.a.position(position + j);
                nyu.a((CharSequence) str, this.a);
                int position2 = this.a.position();
                this.a.position(position);
                i((position2 - position) - j);
                this.a.position(position2);
                return;
            }
            i(nyu.a((CharSequence) str));
            nyu.a((CharSequence) str, this.a);
        } catch (Throwable e) {
            nyv nyv = new nyv(this.a.position(), this.a.limit());
            nyv.initCause(e);
            throw nyv;
        }
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

    private static void a(CharSequence charSequence, ByteBuffer byteBuffer) {
        if (byteBuffer.isReadOnly()) {
            throw new ReadOnlyBufferException();
        } else if (byteBuffer.hasArray()) {
            try {
                byteBuffer.position(nyu.a(charSequence, byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining()) - byteBuffer.arrayOffset());
            } catch (Throwable e) {
                BufferOverflowException bufferOverflowException = new BufferOverflowException();
                bufferOverflowException.initCause(e);
                throw bufferOverflowException;
            }
        } else {
            nyu.b(charSequence, byteBuffer);
        }
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

    public void a(nzf nzf) {
        nzf.a(this);
    }

    public void b(nzf nzf) {
        i(nzf.e_());
        nzf.a(this);
    }

    public void a(byte[] bArr) {
        i(bArr.length);
        c(bArr);
    }

    public void c(int i) {
        i(i);
    }

    public void d(int i) {
        i(i);
    }

    public void e(int i) {
        m(i);
    }

    public void d(long j) {
        i(j);
    }

    public void f(int i) {
        i(nyu.k(i));
    }

    public void e(long j) {
        h(nyu.g(j));
    }

    public static int b(int i, double d) {
        return nyu.h(i) + 8;
    }

    public static int b(int i, float f) {
        return nyu.h(i) + 4;
    }

    public static int e(int i, long j) {
        return nyu.h(i) + nyu.f(j);
    }

    public static int f(int i, long j) {
        return nyu.h(i) + nyu.f(j);
    }

    public static int f(int i, int i2) {
        return nyu.h(i) + nyu.g(i2);
    }

    public static int b(int i, boolean z) {
        return nyu.h(i) + 1;
    }

    public static int b(int i, String str) {
        return nyu.h(i) + nyu.b(str);
    }

    public static int c(int i, nzf nzf) {
        return (nyu.h(i) << 1) + nzf.c();
    }

    public static int d(int i, nzf nzf) {
        int h = nyu.h(i);
        int c = nzf.c();
        return h + (c + nyu.j(c));
    }

    public static int b(int i, byte[] bArr) {
        return nyu.h(i) + nyu.b(bArr);
    }

    public static int g(int i, int i2) {
        return nyu.h(i) + nyu.j(i2);
    }

    public static int h(int i, int i2) {
        return nyu.h(i) + nyu.j(nyu.k(i2));
    }

    public static int g(int i, long j) {
        return nyu.h(i) + nyu.f(nyu.g(j));
    }

    public static int g(int i) {
        if (i >= 0) {
            return nyu.j(i);
        }
        return 10;
    }

    public static int b(String str) {
        int a = nyu.a((CharSequence) str);
        return a + nyu.j(a);
    }

    public static int b(byte[] bArr) {
        return nyu.j(bArr.length) + bArr.length;
    }

    private int b() {
        return this.a.remaining();
    }

    public void a() {
        if (b() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    private void a(byte b) {
        if (this.a.hasRemaining()) {
            this.a.put(b);
            return;
        }
        throw new nyv(this.a.position(), this.a.limit());
    }

    private void l(int i) {
        a((byte) i);
    }

    public void c(byte[] bArr) {
        b(bArr, 0, bArr.length);
    }

    private void b(byte[] bArr, int i, int i2) {
        if (this.a.remaining() >= i2) {
            this.a.put(bArr, 0, i2);
            return;
        }
        throw new nyv(this.a.position(), this.a.limit());
    }

    public static int h(int i) {
        return nyu.j(0 | (i << 3));
    }

    public void i(int i) {
        while ((i & -128) != 0) {
            l((i & 127) | 128);
            i >>>= 7;
        }
        l(i);
    }

    public static int j(int i) {
        if ((i & -128) == 0) {
            return 1;
        }
        if ((i & -16384) == 0) {
            return 2;
        }
        if ((-2097152 & i) == 0) {
            return 3;
        }
        if ((-268435456 & i) == 0) {
            return 4;
        }
        return 5;
    }

    private void h(long j) {
        while ((-128 & j) != 0) {
            l((((int) j) & 127) | 128);
            j >>>= 7;
        }
        l((int) j);
    }

    public static int f(long j) {
        if ((-128 & j) == 0) {
            return 1;
        }
        if ((-16384 & j) == 0) {
            return 2;
        }
        if ((-2097152 & j) == 0) {
            return 3;
        }
        if ((-268435456 & j) == 0) {
            return 4;
        }
        if ((-34359738368L & j) == 0) {
            return 5;
        }
        if ((-4398046511104L & j) == 0) {
            return 6;
        }
        if ((-562949953421312L & j) == 0) {
            return 7;
        }
        if ((-72057594037927936L & j) == 0) {
            return 8;
        }
        if ((Long.MIN_VALUE & j) == 0) {
            return 9;
        }
        return 10;
    }

    private void m(int i) {
        if (this.a.remaining() < 4) {
            throw new nyv(this.a.position(), this.a.limit());
        }
        this.a.putInt(i);
    }

    private void i(long j) {
        if (this.a.remaining() < 8) {
            throw new nyv(this.a.position(), this.a.limit());
        }
        this.a.putLong(j);
    }

    public static int k(int i) {
        return (i << 1) ^ (i >> 31);
    }

    public static long g(long j) {
        return (j << 1) ^ (j >> 63);
    }

    public void i(int i, int i2) {
        i((i << 3) | i2);
    }
}
