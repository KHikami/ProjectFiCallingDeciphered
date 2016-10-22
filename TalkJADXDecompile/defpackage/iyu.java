package defpackage;

import java.nio.ByteBuffer;
import java.util.Arrays;

/* renamed from: iyu */
public final class iyu extends iyw {
    private final int a;
    private int[] e;
    private int[] f;
    private int[] g;
    private int[] h;
    private int i;
    private iyu j;
    private int k;

    public iyu(int i, int i2) {
        super(i);
        this.k = -1;
        this.a = i2;
    }

    public int a() {
        return this.k;
    }

    public int a(iyz iyz) {
        return this.e.length;
    }

    public int a(iyz iyz, int i) {
        return this.e[i];
    }

    public String b(iyz iyz, int i) {
        return iyz.a(this.f[i]);
    }

    public String b(iyz iyz) {
        String str = "#";
        String valueOf = String.valueOf(c(iyz));
        return valueOf.length() != 0 ? str.concat(valueOf) : new String(str);
    }

    String c(iyz iyz, int i) {
        ba.b(i, this.k);
        if (i < this.g.length) {
            return iyz.a(this.g[i]);
        }
        return this.j.c(iyz, i - this.g.length);
    }

    void b() {
        if (this.k == -1) {
            this.k = this.g.length;
            if (this.j != null) {
                this.j.b();
                this.k += this.j.k;
                if ((this.j.d & 2) != 0) {
                    this.d |= 2;
                }
            }
        }
    }

    public String c(iyz iyz) {
        return iyz.a(this.a);
    }

    public int a(iyz iyz, iyv iyv, int i) {
        ba.b(i, this.k);
        return a(iyz, (((iyv.b + iyz.b()) + 4) + iyz.b()) + 4, i);
    }

    private int a(iyz iyz, int i, int i2) {
        while (i2 >= this.g.length) {
            i += this.i;
            i2 -= this.g.length;
            this = this.j;
        }
        return iyz.h(this.h[i2] + i);
    }

    public void a(iyz iyz, izd<iyu> izd_iyu, izb izb) {
        int i;
        int i2;
        int[] iArr;
        int[] iArr2;
        ByteBuffer a = iyz.a();
        this.b = a.position() - iyz.b();
        a.getInt();
        this.j = (iyu) izd_iyu.a(iyz.c());
        iyz.g((iyz.b() * 5) + 4);
        ByteBuffer a2 = iyz.a();
        int i3 = a2.getShort() & 65535;
        for (i = 0; i < i3; i++) {
            a2.getShort();
            iyz.g(iyz.d(a2.get()));
        }
        ByteBuffer a3 = iyz.a();
        int i4 = a3.getShort() & 65535;
        this.e = new int[i4];
        this.f = new int[i4];
        i = 0;
        for (i2 = 0; i2 < i4; i2++) {
            int c = iyz.c();
            byte b = a3.get();
            if (iyz.i(b)) {
                int c2 = iyz.c();
                if (c2 != 0) {
                    this.e[i] = c2;
                    this.f[i] = izb.b(c);
                    i++;
                }
            } else {
                iyz.g(iyz.d(b));
            }
        }
        if (i == i4) {
            iArr = this.e;
        } else {
            iArr = Arrays.copyOf(this.e, i);
        }
        this.e = iArr;
        if (i == i4) {
            iArr2 = this.f;
        } else {
            iArr2 = Arrays.copyOf(this.f, i);
        }
        this.f = iArr2;
        a3 = iyz.a();
        i4 = a3.getShort() & 65535;
        this.g = new int[i4];
        this.h = new int[i4];
        this.i = 0;
        i = 0;
        for (i2 = 0; i2 < i4; i2++) {
            int c3 = iyz.c();
            byte b2 = a3.get();
            if (iyz.i(b2)) {
                this.g[i] = izb.b(c3);
                this.h[i] = this.i;
                i++;
            }
            this.i += iyz.d(b2);
        }
        if (i == i4) {
            iArr = this.g;
        } else {
            iArr = Arrays.copyOf(this.g, i);
        }
        this.g = iArr;
        if (i == i4) {
            iArr2 = this.h;
        } else {
            iArr2 = Arrays.copyOf(this.h, i);
        }
        this.h = iArr2;
    }
}
