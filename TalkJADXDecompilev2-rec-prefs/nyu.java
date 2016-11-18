package p000;

import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ReadOnlyBufferException;

public final class nyu {
    private final ByteBuffer f31292a;

    private nyu(byte[] bArr, int i, int i2) {
        this(ByteBuffer.wrap(bArr, i, i2));
    }

    private nyu(ByteBuffer byteBuffer) {
        this.f31292a = byteBuffer;
        this.f31292a.order(ByteOrder.LITTLE_ENDIAN);
    }

    public static nyu m37131a(byte[] bArr, int i, int i2) {
        return new nyu(bArr, i, i2);
    }

    public void m37166a(int i, double d) {
        m37199i(i, 1);
        m37163a(d);
    }

    public void m37167a(int i, float f) {
        m37199i(i, 5);
        m37164a(f);
    }

    public void m37169a(int i, long j) {
        m37199i(i, 0);
        m37174a(j);
    }

    public void m37181b(int i, long j) {
        m37199i(i, 0);
        m37183b(j);
    }

    public void m37168a(int i, int i2) {
        m37199i(i, 0);
        m37165a(i2);
    }

    public void m37187c(int i, long j) {
        m37199i(i, 1);
        m37188c(j);
    }

    public void m37180b(int i, int i2) {
        m37199i(i, 5);
        m37179b(i2);
    }

    public void m37172a(int i, boolean z) {
        m37199i(i, 0);
        m37177a(z);
    }

    public void m37170a(int i, String str) {
        m37199i(i, 2);
        m37175a(str);
    }

    public void m37171a(int i, nzf nzf) {
        m37199i(i, 3);
        m37176a(nzf);
        m37199i(i, 4);
    }

    public void m37182b(int i, nzf nzf) {
        m37199i(i, 2);
        m37184b(nzf);
    }

    public void m37173a(int i, byte[] bArr) {
        m37199i(i, 2);
        m37178a(bArr);
    }

    public void m37186c(int i, int i2) {
        m37199i(i, 0);
        m37185c(i2);
    }

    public void m37191d(int i, int i2) {
        m37199i(i, 5);
        m37194e(i2);
    }

    public void m37195e(int i, int i2) {
        m37199i(4, 0);
        m37197f(i2);
    }

    public void m37192d(int i, long j) {
        m37199i(5, 0);
        m37196e(j);
    }

    public void m37163a(double d) {
        m37157i(Double.doubleToLongBits(d));
    }

    public void m37164a(float f) {
        m37161m(Float.floatToIntBits(f));
    }

    public void m37174a(long j) {
        m37156h(j);
    }

    public void m37183b(long j) {
        m37156h(j);
    }

    public void m37165a(int i) {
        if (i >= 0) {
            m37198i(i);
        } else {
            m37156h((long) i);
        }
    }

    public void m37188c(long j) {
        m37157i(j);
    }

    public void m37179b(int i) {
        m37161m(i);
    }

    public void m37177a(boolean z) {
        m37160l(z ? 1 : 0);
    }

    public void m37175a(String str) {
        try {
            int j = nyu.m37158j(str.length());
            if (j == nyu.m37158j(str.length() * 3)) {
                int position = this.f31292a.position();
                if (this.f31292a.remaining() < j) {
                    throw new nyv(j + position, this.f31292a.limit());
                }
                this.f31292a.position(position + j);
                nyu.m37133a((CharSequence) str, this.f31292a);
                int position2 = this.f31292a.position();
                this.f31292a.position(position);
                m37198i((position2 - position) - j);
                this.f31292a.position(position2);
                return;
            }
            m37198i(nyu.m37129a((CharSequence) str));
            nyu.m37133a((CharSequence) str, this.f31292a);
        } catch (Throwable e) {
            nyv nyv = new nyv(this.f31292a.position(), this.f31292a.limit());
            nyv.initCause(e);
            throw nyv;
        }
    }

    private static int m37129a(CharSequence charSequence) {
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

    private static void m37133a(CharSequence charSequence, ByteBuffer byteBuffer) {
        if (byteBuffer.isReadOnly()) {
            throw new ReadOnlyBufferException();
        } else if (byteBuffer.hasArray()) {
            try {
                byteBuffer.position(nyu.m37130a(charSequence, byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining()) - byteBuffer.arrayOffset());
            } catch (Throwable e) {
                BufferOverflowException bufferOverflowException = new BufferOverflowException();
                bufferOverflowException.initCause(e);
                throw bufferOverflowException;
            }
        } else {
            nyu.m37142b(charSequence, byteBuffer);
        }
    }

    private static void m37142b(CharSequence charSequence, ByteBuffer byteBuffer) {
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

    private static int m37130a(CharSequence charSequence, byte[] bArr, int i, int i2) {
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

    public void m37176a(nzf nzf) {
        nzf.a(this);
    }

    public void m37184b(nzf nzf) {
        m37198i(nzf.e_());
        nzf.a(this);
    }

    public void m37178a(byte[] bArr) {
        m37198i(bArr.length);
        m37189c(bArr);
    }

    public void m37185c(int i) {
        m37198i(i);
    }

    public void m37190d(int i) {
        m37198i(i);
    }

    public void m37194e(int i) {
        m37161m(i);
    }

    public void m37193d(long j) {
        m37157i(j);
    }

    public void m37197f(int i) {
        m37198i(nyu.m37159k(i));
    }

    public void m37196e(long j) {
        m37156h(nyu.m37153g(j));
    }

    public static int m37135b(int i, double d) {
        return nyu.m37154h(i) + 8;
    }

    public static int m37136b(int i, float f) {
        return nyu.m37154h(i) + 4;
    }

    public static int m37146e(int i, long j) {
        return nyu.m37154h(i) + nyu.m37149f(j);
    }

    public static int m37148f(int i, long j) {
        return nyu.m37154h(i) + nyu.m37149f(j);
    }

    public static int m37147f(int i, int i2) {
        return nyu.m37154h(i) + nyu.m37150g(i2);
    }

    public static int m37138b(int i, boolean z) {
        return nyu.m37154h(i) + 1;
    }

    public static int m37137b(int i, String str) {
        return nyu.m37154h(i) + nyu.m37140b(str);
    }

    public static int m37144c(int i, nzf nzf) {
        return (nyu.m37154h(i) << 1) + nzf.c();
    }

    public static int m37145d(int i, nzf nzf) {
        int h = nyu.m37154h(i);
        int c = nzf.c();
        return h + (c + nyu.m37158j(c));
    }

    public static int m37139b(int i, byte[] bArr) {
        return nyu.m37154h(i) + nyu.m37141b(bArr);
    }

    public static int m37151g(int i, int i2) {
        return nyu.m37154h(i) + nyu.m37158j(i2);
    }

    public static int m37155h(int i, int i2) {
        return nyu.m37154h(i) + nyu.m37158j(nyu.m37159k(i2));
    }

    public static int m37152g(int i, long j) {
        return nyu.m37154h(i) + nyu.m37149f(nyu.m37153g(j));
    }

    public static int m37150g(int i) {
        if (i >= 0) {
            return nyu.m37158j(i);
        }
        return 10;
    }

    public static int m37140b(String str) {
        int a = nyu.m37129a((CharSequence) str);
        return a + nyu.m37158j(a);
    }

    public static int m37141b(byte[] bArr) {
        return nyu.m37158j(bArr.length) + bArr.length;
    }

    private int m37134b() {
        return this.f31292a.remaining();
    }

    public void m37162a() {
        if (m37134b() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    private void m37132a(byte b) {
        if (this.f31292a.hasRemaining()) {
            this.f31292a.put(b);
            return;
        }
        throw new nyv(this.f31292a.position(), this.f31292a.limit());
    }

    private void m37160l(int i) {
        m37132a((byte) i);
    }

    public void m37189c(byte[] bArr) {
        m37143b(bArr, 0, bArr.length);
    }

    private void m37143b(byte[] bArr, int i, int i2) {
        if (this.f31292a.remaining() >= i2) {
            this.f31292a.put(bArr, 0, i2);
            return;
        }
        throw new nyv(this.f31292a.position(), this.f31292a.limit());
    }

    public static int m37154h(int i) {
        return nyu.m37158j(0 | (i << 3));
    }

    public void m37198i(int i) {
        while ((i & -128) != 0) {
            m37160l((i & 127) | 128);
            i >>>= 7;
        }
        m37160l(i);
    }

    public static int m37158j(int i) {
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

    private void m37156h(long j) {
        while ((-128 & j) != 0) {
            m37160l((((int) j) & 127) | 128);
            j >>>= 7;
        }
        m37160l((int) j);
    }

    public static int m37149f(long j) {
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

    private void m37161m(int i) {
        if (this.f31292a.remaining() < 4) {
            throw new nyv(this.f31292a.position(), this.f31292a.limit());
        }
        this.f31292a.putInt(i);
    }

    private void m37157i(long j) {
        if (this.f31292a.remaining() < 8) {
            throw new nyv(this.f31292a.position(), this.f31292a.limit());
        }
        this.f31292a.putLong(j);
    }

    public static int m37159k(int i) {
        return (i << 1) ^ (i >> 31);
    }

    public static long m37153g(long j) {
        return (j << 1) ^ (j >> 63);
    }

    public void m37199i(int i, int i2) {
        m37198i((i << 3) | i2);
    }
}
