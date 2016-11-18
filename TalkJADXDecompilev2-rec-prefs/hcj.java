package p000;

import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ReadOnlyBufferException;

public final class hcj {
    private final ByteBuffer f16607a;

    private hcj(ByteBuffer byteBuffer) {
        this.f16607a = byteBuffer;
        this.f16607a.order(ByteOrder.LITTLE_ENDIAN);
    }

    private hcj(byte[] bArr, int i, int i2) {
        this(ByteBuffer.wrap(bArr, i, i2));
    }

    public static int m19266a(int i) {
        return i >= 0 ? hcj.m19291d(i) : 10;
    }

    public static int m19267a(long j) {
        return (-128 & j) == 0 ? 1 : (-16384 & j) == 0 ? 2 : (-2097152 & j) == 0 ? 3 : (-268435456 & j) == 0 ? 4 : (-34359738368L & j) == 0 ? 5 : (-4398046511104L & j) == 0 ? 6 : (-562949953421312L & j) == 0 ? 7 : (-72057594037927936L & j) == 0 ? 8 : (Long.MIN_VALUE & j) == 0 ? 9 : 10;
    }

    private static int m19268a(CharSequence charSequence) {
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

    private static int m19269a(CharSequence charSequence, byte[] bArr, int i, int i2) {
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

    public static int m19270a(String str) {
        int a = hcj.m19268a((CharSequence) str);
        return a + hcj.m19291d(a);
    }

    public static int m19271a(byte[] bArr) {
        return hcj.m19291d(bArr.length) + bArr.length;
    }

    public static hcj m19272a(byte[] bArr, int i, int i2) {
        return new hcj(bArr, i, i2);
    }

    private void m19273a(byte b) {
        if (this.f16607a.hasRemaining()) {
            this.f16607a.put(b);
            return;
        }
        throw new awx(this.f16607a.position(), this.f16607a.limit());
    }

    private void m19274a(double d) {
        m19296f(Double.doubleToLongBits(d));
    }

    private void m19275a(float f) {
        m19299i(Float.floatToIntBits(f));
    }

    private static void m19276a(CharSequence charSequence, ByteBuffer byteBuffer) {
        if (byteBuffer.isReadOnly()) {
            throw new ReadOnlyBufferException();
        } else if (byteBuffer.hasArray()) {
            try {
                byteBuffer.position(hcj.m19269a(charSequence, byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining()) - byteBuffer.arrayOffset());
            } catch (Throwable e) {
                BufferOverflowException bufferOverflowException = new BufferOverflowException();
                bufferOverflowException.initCause(e);
                throw bufferOverflowException;
            }
        } else {
            hcj.m19284b(charSequence, byteBuffer);
        }
    }

    private void m19277a(boolean z) {
        m19298h(z ? 1 : 0);
    }

    private int m19278b() {
        return this.f16607a.remaining();
    }

    public static int m19279b(int i) {
        return hcj.m19291d(0 | (i << 3));
    }

    public static int m19280b(int i, hcq hcq) {
        int b = hcj.m19279b(i);
        int f = hcq.m19209f();
        return b + (f + hcj.m19291d(f));
    }

    public static int m19281b(int i, String str) {
        return hcj.m19279b(i) + hcj.m19270a(str);
    }

    public static int m19282b(int i, byte[] bArr) {
        return hcj.m19279b(i) + hcj.m19271a(bArr);
    }

    public static long m19283b(long j) {
        return (j << 1) ^ (j >> 63);
    }

    private static void m19284b(CharSequence charSequence, ByteBuffer byteBuffer) {
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

    private void m19285b(String str) {
        try {
            int d = hcj.m19291d(str.length());
            if (d == hcj.m19291d(str.length() * 3)) {
                int position = this.f16607a.position();
                if (this.f16607a.remaining() < d) {
                    throw new awx(d + position, this.f16607a.limit());
                }
                this.f16607a.position(position + d);
                hcj.m19276a((CharSequence) str, this.f16607a);
                int position2 = this.f16607a.position();
                this.f16607a.position(position);
                m19314c((position2 - position) - d);
                this.f16607a.position(position2);
                return;
            }
            m19314c(hcj.m19268a((CharSequence) str));
            hcj.m19276a((CharSequence) str, this.f16607a);
        } catch (Throwable e) {
            awx awx = new awx(this.f16607a.position(), this.f16607a.limit());
            awx.initCause(e);
            throw awx;
        }
    }

    private void m19286b(byte[] bArr, int i, int i2) {
        if (this.f16607a.remaining() >= i2) {
            this.f16607a.put(bArr, 0, i2);
            return;
        }
        throw new awx(this.f16607a.position(), this.f16607a.limit());
    }

    public static int m19287c(int i, int i2) {
        return hcj.m19279b(i) + hcj.m19266a(i2);
    }

    public static int m19288c(int i, long j) {
        return hcj.m19279b(i) + hcj.m19267a(j);
    }

    private void m19289c(long j) {
        m19294e(j);
    }

    private void m19290c(byte[] bArr) {
        m19314c(bArr.length);
        m19313b(bArr);
    }

    public static int m19291d(int i) {
        return (i & -128) == 0 ? 1 : (i & -16384) == 0 ? 2 : (-2097152 & i) == 0 ? 3 : (-268435456 & i) == 0 ? 4 : 5;
    }

    private void m19292d(long j) {
        m19294e(hcj.m19283b(j));
    }

    public static int m19293e(int i) {
        return (i << 1) ^ (i >> 31);
    }

    private void m19294e(long j) {
        while ((-128 & j) != 0) {
            m19298h((((int) j) & 127) | 128);
            j >>>= 7;
        }
        m19298h((int) j);
    }

    private void m19295f(int i) {
        if (i >= 0) {
            m19314c(i);
        } else {
            m19294e((long) i);
        }
    }

    private void m19296f(long j) {
        if (this.f16607a.remaining() < 8) {
            throw new awx(this.f16607a.position(), this.f16607a.limit());
        }
        this.f16607a.putLong(j);
    }

    private void m19297g(int i) {
        m19314c(hcj.m19293e(i));
    }

    private void m19298h(int i) {
        m19273a((byte) i);
    }

    private void m19299i(int i) {
        if (this.f16607a.remaining() < 4) {
            throw new awx(this.f16607a.position(), this.f16607a.limit());
        }
        this.f16607a.putInt(i);
    }

    public void m19300a() {
        if (m19278b() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public void m19301a(int i, double d) {
        m19315d(3, 1);
        m19274a(d);
    }

    public void m19302a(int i, float f) {
        m19315d(i, 5);
        m19275a(f);
    }

    public void m19303a(int i, int i2) {
        m19315d(i, 0);
        m19295f(i2);
    }

    public void m19304a(int i, long j) {
        m19315d(i, 0);
        m19289c(j);
    }

    public void m19305a(int i, hcq hcq) {
        m19315d(i, 2);
        m19312b(hcq);
    }

    public void m19306a(int i, String str) {
        m19315d(i, 2);
        m19285b(str);
    }

    public void m19307a(int i, boolean z) {
        m19315d(i, 0);
        m19277a(z);
    }

    public void m19308a(int i, byte[] bArr) {
        m19315d(i, 2);
        m19290c(bArr);
    }

    public void m19309a(hcq hcq) {
        hcq.mo2449a(this);
    }

    public void m19310b(int i, int i2) {
        m19315d(7, 0);
        m19297g(i2);
    }

    public void m19311b(int i, long j) {
        m19315d(15, 0);
        m19292d(j);
    }

    public void m19312b(hcq hcq) {
        m19314c(hcq.m19208e());
        hcq.mo2449a(this);
    }

    public void m19313b(byte[] bArr) {
        m19286b(bArr, 0, bArr.length);
    }

    public void m19314c(int i) {
        while ((i & -128) != 0) {
            m19298h((i & 127) | 128);
            i >>>= 7;
        }
        m19298h(i);
    }

    public void m19315d(int i, int i2) {
        m19314c((i << 3) | i2);
    }
}
