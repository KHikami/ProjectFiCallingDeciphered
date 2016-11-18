package p000;

import java.nio.ByteBuffer;
import java.util.Arrays;

public final class iyu extends iyw {
    private final int f19418a;
    private int[] f19419e;
    private int[] f19420f;
    private int[] f19421g;
    private int[] f19422h;
    private int f19423i;
    private iyu f19424j;
    private int f19425k = -1;

    public iyu(int i, int i2) {
        super(i);
        this.f19418a = i2;
    }

    public int m23520a() {
        return this.f19425k;
    }

    public int mo3419a(iyz iyz) {
        return this.f19419e.length;
    }

    public int mo3420a(iyz iyz, int i) {
        return this.f19419e[i];
    }

    public String mo3422b(iyz iyz, int i) {
        return iyz.m23537a(this.f19420f[i]);
    }

    public String mo3421b(iyz iyz) {
        String str = "#";
        String valueOf = String.valueOf(m23528c(iyz));
        return valueOf.length() != 0 ? str.concat(valueOf) : new String(str);
    }

    String m23529c(iyz iyz, int i) {
        ba.m4592b(i, this.f19425k);
        if (i < this.f19421g.length) {
            return iyz.m23537a(this.f19421g[i]);
        }
        return this.f19424j.m23529c(iyz, i - this.f19421g.length);
    }

    void m23527b() {
        if (this.f19425k == -1) {
            this.f19425k = this.f19421g.length;
            if (this.f19424j != null) {
                this.f19424j.m23527b();
                this.f19425k += this.f19424j.f19425k;
                if ((this.f19424j.d & 2) != 0) {
                    this.d |= 2;
                }
            }
        }
    }

    public String m23528c(iyz iyz) {
        return iyz.m23537a(this.f19418a);
    }

    public int m23523a(iyz iyz, iyv iyv, int i) {
        ba.m4592b(i, this.f19425k);
        return m23519a(iyz, (((iyv.b + iyz.m23539b()) + 4) + iyz.m23539b()) + 4, i);
    }

    private int m23519a(iyz iyz, int i, int i2) {
        while (i2 >= this.f19421g.length) {
            i += this.f19423i;
            i2 -= this.f19421g.length;
            this = this.f19424j;
        }
        return iyz.m23547h(this.f19422h[i2] + i);
    }

    public void m23524a(iyz iyz, izd<iyu> izd_iyu, izb izb) {
        int i;
        int i2;
        int[] iArr;
        int[] iArr2;
        ByteBuffer a = iyz.m23538a();
        this.b = a.position() - iyz.m23539b();
        a.getInt();
        this.f19424j = (iyu) izd_iyu.m23566a(iyz.m23541c());
        iyz.m23546g((iyz.m23539b() * 5) + 4);
        ByteBuffer a2 = iyz.m23538a();
        int i3 = a2.getShort() & 65535;
        for (i = 0; i < i3; i++) {
            a2.getShort();
            iyz.m23546g(iyz.m23543d(a2.get()));
        }
        ByteBuffer a3 = iyz.m23538a();
        int i4 = a3.getShort() & 65535;
        this.f19419e = new int[i4];
        this.f19420f = new int[i4];
        i = 0;
        for (i2 = 0; i2 < i4; i2++) {
            int c = iyz.m23541c();
            byte b = a3.get();
            if (iyz.m23536i(b)) {
                int c2 = iyz.m23541c();
                if (c2 != 0) {
                    this.f19419e[i] = c2;
                    this.f19420f[i] = izb.m23559b(c);
                    i++;
                }
            } else {
                iyz.m23546g(iyz.m23543d(b));
            }
        }
        if (i == i4) {
            iArr = this.f19419e;
        } else {
            iArr = Arrays.copyOf(this.f19419e, i);
        }
        this.f19419e = iArr;
        if (i == i4) {
            iArr2 = this.f19420f;
        } else {
            iArr2 = Arrays.copyOf(this.f19420f, i);
        }
        this.f19420f = iArr2;
        a3 = iyz.m23538a();
        i4 = a3.getShort() & 65535;
        this.f19421g = new int[i4];
        this.f19422h = new int[i4];
        this.f19423i = 0;
        i = 0;
        for (i2 = 0; i2 < i4; i2++) {
            int c3 = iyz.m23541c();
            byte b2 = a3.get();
            if (iyz.m23536i(b2)) {
                this.f19421g[i] = izb.m23559b(c3);
                this.f19422h[i] = this.f19423i;
                i++;
            }
            this.f19423i += iyz.m23543d(b2);
        }
        if (i == i4) {
            iArr = this.f19421g;
        } else {
            iArr = Arrays.copyOf(this.f19421g, i);
        }
        this.f19421g = iArr;
        if (i == i4) {
            iArr2 = this.f19422h;
        } else {
            iArr2 = Arrays.copyOf(this.f19422h, i);
        }
        this.f19422h = iArr2;
    }
}
