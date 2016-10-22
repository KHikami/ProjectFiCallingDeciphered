import android.util.Log;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

public final class anm {
    private final byte[] a;
    private ByteBuffer b;
    private anl c;
    private int d;

    public anm() {
        this.a = new byte[256];
        this.d = 0;
    }

    public void a() {
        this.b = null;
        this.c = null;
    }

    public anl b() {
        if (this.b == null) {
            throw new IllegalStateException("You must call setData() before parseHeader()");
        } else if (h()) {
            return this.c;
        } else {
            d();
            if (!h()) {
                a(Integer.MAX_VALUE);
                if (this.c.c < 0) {
                    this.c.b = 1;
                }
            }
            return this.c;
        }
    }

    private void a(int i) {
        int i2 = 0;
        while (i2 == 0 && !h() && this.c.c <= Integer.MAX_VALUE) {
            int g;
            switch (g()) {
                case 33:
                    switch (g()) {
                        case wi.j /*1*/:
                            e();
                            break;
                        case 249:
                            boolean z;
                            this.c.d = new ank();
                            g();
                            g = g();
                            this.c.d.g = (g & 28) >> 2;
                            if (this.c.d.g == 0) {
                                this.c.d.g = 1;
                            }
                            ank ank = this.c.d;
                            if ((g & 1) != 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            ank.f = z;
                            g = this.b.getShort();
                            if (g < 2) {
                                g = 10;
                            }
                            this.c.d.i = g * 10;
                            this.c.d.h = g();
                            g();
                            break;
                        case 254:
                            e();
                            break;
                        case 255:
                            f();
                            String str = "";
                            for (g = 0; g < 11; g++) {
                                str = String.valueOf(str);
                                str = new StringBuilder(String.valueOf(str).length() + 1).append(str).append((char) this.a[g]).toString();
                            }
                            if (!str.equals("NETSCAPE2.0")) {
                                e();
                                break;
                            } else {
                                c();
                                break;
                            }
                        default:
                            e();
                            break;
                    }
                case 44:
                    boolean z2;
                    if (this.c.d == null) {
                        this.c.d = new ank();
                    }
                    this.c.d.a = this.b.getShort();
                    this.c.d.b = this.b.getShort();
                    this.c.d.c = this.b.getShort();
                    this.c.d.d = this.b.getShort();
                    int g2 = g();
                    g = (g2 & 128) != 0 ? 1 : 0;
                    int pow = (int) Math.pow(2.0d, (double) ((g2 & 7) + 1));
                    ank ank2 = this.c.d;
                    if ((g2 & 64) != 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    ank2.e = z2;
                    if (g != 0) {
                        this.c.d.k = b(pow);
                    } else {
                        this.c.d.k = null;
                    }
                    this.c.d.j = this.b.position();
                    g();
                    e();
                    if (!h()) {
                        anl anl = this.c;
                        anl.c++;
                        this.c.e.add(this.c.d);
                        break;
                    }
                    break;
                case 59:
                    i2 = 1;
                    break;
                default:
                    this.c.b = 1;
                    break;
            }
        }
    }

    private void c() {
        do {
            f();
            if (this.a[0] == (byte) 1) {
                this.c.m = (this.a[1] & 255) | ((this.a[2] & 255) << 8);
            }
            if (this.d <= 0) {
                return;
            }
        } while (!h());
    }

    private void d() {
        int i;
        boolean z = true;
        String str = "";
        for (i = 0; i < 6; i++) {
            str = String.valueOf(str);
            str = new StringBuilder(String.valueOf(str).length() + 1).append(str).append((char) g()).toString();
        }
        if (str.startsWith("GIF")) {
            this.c.f = this.b.getShort();
            this.c.g = this.b.getShort();
            i = g();
            anl anl = this.c;
            if ((i & 128) == 0) {
                z = false;
            }
            anl.h = z;
            this.c.i = (int) Math.pow(2.0d, (double) ((i & 7) + 1));
            this.c.j = g();
            this.c.k = g();
            if (this.c.h && !h()) {
                this.c.a = b(this.c.i);
                this.c.l = this.c.a[this.c.j];
                return;
            }
            return;
        }
        this.c.b = 1;
    }

    private int[] b(int i) {
        int i2 = 0;
        int[] iArr = null;
        byte[] bArr = new byte[(i * 3)];
        try {
            this.b.get(bArr);
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
            this.c.b = 1;
        }
        return iArr;
    }

    private void e() {
        int g;
        do {
            g = g();
            this.b.position(this.b.position() + g);
        } while (g > 0);
    }

    private int f() {
        int i = 0;
        this.d = g();
        if (this.d > 0) {
            int i2 = 0;
            while (i < this.d) {
                try {
                    i2 = this.d - i;
                    this.b.get(this.a, i, i2);
                    i += i2;
                } catch (Exception e) {
                    if (Log.isLoggable("GifHeaderParser", 3)) {
                        new StringBuilder(76).append("Error Reading Block n: ").append(i).append(" count: ").append(i2).append(" blockSize: ").append(this.d);
                    }
                    this.c.b = 1;
                }
            }
        }
        return i;
    }

    private int g() {
        int i = 0;
        try {
            return this.b.get() & 255;
        } catch (Exception e) {
            this.c.b = 1;
            return i;
        }
    }

    private boolean h() {
        return this.c.b != 0;
    }

    public anm a(ByteBuffer byteBuffer) {
        this.b = null;
        Arrays.fill(this.a, (byte) 0);
        this.c = new anl();
        this.d = 0;
        this.b = byteBuffer.asReadOnlyBuffer();
        this.b.position(0);
        this.b.order(ByteOrder.LITTLE_ENDIAN);
        return this;
    }
}
