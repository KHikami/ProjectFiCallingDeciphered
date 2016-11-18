package p000;

import android.util.Log;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

public final class anm {
    private final byte[] f1898a = new byte[256];
    private ByteBuffer f1899b;
    private anl f1900c;
    private int f1901d = 0;

    public void m3498a() {
        this.f1899b = null;
        this.f1900c = null;
    }

    public anl m3499b() {
        if (this.f1899b == null) {
            throw new IllegalStateException("You must call setData() before parseHeader()");
        } else if (m3496h()) {
            return this.f1900c;
        } else {
            m3492d();
            if (!m3496h()) {
                m3489a(Integer.MAX_VALUE);
                if (this.f1900c.f1887c < 0) {
                    this.f1900c.f1886b = 1;
                }
            }
            return this.f1900c;
        }
    }

    private void m3489a(int i) {
        int i2 = 0;
        while (i2 == 0 && !m3496h() && this.f1900c.f1887c <= Integer.MAX_VALUE) {
            int g;
            switch (m3495g()) {
                case 33:
                    switch (m3495g()) {
                        case 1:
                            m3493e();
                            break;
                        case 249:
                            boolean z;
                            this.f1900c.f1888d = new ank();
                            m3495g();
                            g = m3495g();
                            this.f1900c.f1888d.f1880g = (g & 28) >> 2;
                            if (this.f1900c.f1888d.f1880g == 0) {
                                this.f1900c.f1888d.f1880g = 1;
                            }
                            ank ank = this.f1900c.f1888d;
                            if ((g & 1) != 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            ank.f1879f = z;
                            g = this.f1899b.getShort();
                            if (g < 2) {
                                g = 10;
                            }
                            this.f1900c.f1888d.f1882i = g * 10;
                            this.f1900c.f1888d.f1881h = m3495g();
                            m3495g();
                            break;
                        case 254:
                            m3493e();
                            break;
                        case 255:
                            m3494f();
                            String str = "";
                            for (g = 0; g < 11; g++) {
                                str = String.valueOf(str);
                                str = new StringBuilder(String.valueOf(str).length() + 1).append(str).append((char) this.f1898a[g]).toString();
                            }
                            if (!str.equals("NETSCAPE2.0")) {
                                m3493e();
                                break;
                            } else {
                                m3491c();
                                break;
                            }
                        default:
                            m3493e();
                            break;
                    }
                case 44:
                    boolean z2;
                    if (this.f1900c.f1888d == null) {
                        this.f1900c.f1888d = new ank();
                    }
                    this.f1900c.f1888d.f1874a = this.f1899b.getShort();
                    this.f1900c.f1888d.f1875b = this.f1899b.getShort();
                    this.f1900c.f1888d.f1876c = this.f1899b.getShort();
                    this.f1900c.f1888d.f1877d = this.f1899b.getShort();
                    int g2 = m3495g();
                    g = (g2 & 128) != 0 ? 1 : 0;
                    int pow = (int) Math.pow(2.0d, (double) ((g2 & 7) + 1));
                    ank ank2 = this.f1900c.f1888d;
                    if ((g2 & 64) != 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    ank2.f1878e = z2;
                    if (g != 0) {
                        this.f1900c.f1888d.f1884k = m3490b(pow);
                    } else {
                        this.f1900c.f1888d.f1884k = null;
                    }
                    this.f1900c.f1888d.f1883j = this.f1899b.position();
                    m3495g();
                    m3493e();
                    if (!m3496h()) {
                        anl anl = this.f1900c;
                        anl.f1887c++;
                        this.f1900c.f1889e.add(this.f1900c.f1888d);
                        break;
                    }
                    break;
                case 59:
                    i2 = 1;
                    break;
                default:
                    this.f1900c.f1886b = 1;
                    break;
            }
        }
    }

    private void m3491c() {
        do {
            m3494f();
            if (this.f1898a[0] == (byte) 1) {
                this.f1900c.f1897m = (this.f1898a[1] & 255) | ((this.f1898a[2] & 255) << 8);
            }
            if (this.f1901d <= 0) {
                return;
            }
        } while (!m3496h());
    }

    private void m3492d() {
        int i;
        boolean z = true;
        String str = "";
        for (i = 0; i < 6; i++) {
            str = String.valueOf(str);
            str = new StringBuilder(String.valueOf(str).length() + 1).append(str).append((char) m3495g()).toString();
        }
        if (str.startsWith("GIF")) {
            this.f1900c.f1890f = this.f1899b.getShort();
            this.f1900c.f1891g = this.f1899b.getShort();
            i = m3495g();
            anl anl = this.f1900c;
            if ((i & 128) == 0) {
                z = false;
            }
            anl.f1892h = z;
            this.f1900c.f1893i = (int) Math.pow(2.0d, (double) ((i & 7) + 1));
            this.f1900c.f1894j = m3495g();
            this.f1900c.f1895k = m3495g();
            if (this.f1900c.f1892h && !m3496h()) {
                this.f1900c.f1885a = m3490b(this.f1900c.f1893i);
                this.f1900c.f1896l = this.f1900c.f1885a[this.f1900c.f1894j];
                return;
            }
            return;
        }
        this.f1900c.f1886b = 1;
    }

    private int[] m3490b(int i) {
        int i2 = 0;
        int[] iArr = null;
        byte[] bArr = new byte[(i * 3)];
        try {
            this.f1899b.get(bArr);
            iArr = new int[256];
            int i3 = 0;
            while (i3 < i) {
                int i4 = i2 + 1;
                int i5 = bArr[i2] & 255;
                int i6 = i4 + 1;
                int i7 = bArr[i4] & 255;
                i2 = i6 + 1;
                i4 = i3 + 1;
                iArr[i3] = (((i5 << 16) | -16777216) | (i7 << 8)) | (bArr[i6] & 255);
                i3 = i4;
            }
        } catch (BufferUnderflowException e) {
            this.f1900c.f1886b = 1;
        }
        return iArr;
    }

    private void m3493e() {
        int g;
        do {
            g = m3495g();
            this.f1899b.position(this.f1899b.position() + g);
        } while (g > 0);
    }

    private int m3494f() {
        int i = 0;
        this.f1901d = m3495g();
        if (this.f1901d > 0) {
            int i2 = 0;
            while (i < this.f1901d) {
                try {
                    i2 = this.f1901d - i;
                    this.f1899b.get(this.f1898a, i, i2);
                    i += i2;
                } catch (Exception e) {
                    if (Log.isLoggable("GifHeaderParser", 3)) {
                        new StringBuilder(76).append("Error Reading Block n: ").append(i).append(" count: ").append(i2).append(" blockSize: ").append(this.f1901d);
                    }
                    this.f1900c.f1886b = 1;
                }
            }
        }
        return i;
    }

    private int m3495g() {
        int i = 0;
        try {
            return this.f1899b.get() & 255;
        } catch (Exception e) {
            this.f1900c.f1886b = 1;
            return i;
        }
    }

    private boolean m3496h() {
        return this.f1900c.f1886b != 0;
    }

    public anm m3497a(ByteBuffer byteBuffer) {
        this.f1899b = null;
        Arrays.fill(this.f1898a, (byte) 0);
        this.f1900c = new anl();
        this.f1901d = 0;
        this.f1899b = byteBuffer.asReadOnlyBuffer();
        this.f1899b.position(0);
        this.f1899b.order(ByteOrder.LITTLE_ENDIAN);
        return this;
    }
}
