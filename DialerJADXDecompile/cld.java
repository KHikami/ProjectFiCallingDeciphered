public final class cld extends ckv {
    private String[] c;
    private String[] d;
    private int[] e;
    private long[] f;

    public cld() {
        this.c = clc.c;
        this.d = clc.c;
        this.e = clc.a;
        this.f = clc.b;
        this.a = null;
        this.b = -1;
    }

    protected final int a() {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        int a = super.a();
        if (this.c == null || this.c.length <= 0) {
            i = a;
        } else {
            i2 = 0;
            i3 = 0;
            for (String str : this.c) {
                if (str != null) {
                    i3++;
                    i2 += ckt.a(str);
                }
            }
            i = (a + i2) + (i3 * 1);
        }
        if (this.d != null && this.d.length > 0) {
            i3 = 0;
            a = 0;
            for (String str2 : this.d) {
                if (str2 != null) {
                    a++;
                    i3 += ckt.a(str2);
                }
            }
            i = (i + i3) + (a * 1);
        }
        if (this.e != null && this.e.length > 0) {
            i3 = 0;
            for (int a2 : this.e) {
                i3 += ckt.a(a2);
            }
            i = (i + i3) + (this.e.length * 1);
        }
        if (this.f == null || this.f.length <= 0) {
            return i;
        }
        i2 = 0;
        while (i4 < this.f.length) {
            i2 += ckt.b(this.f[i4]);
            i4++;
        }
        return (i + i2) + (this.f.length * 1);
    }

    public final void a(ckt ckt) {
        int i = 0;
        if (this.c != null && this.c.length > 0) {
            for (String str : this.c) {
                if (str != null) {
                    ckt.a(1, str);
                }
            }
        }
        if (this.d != null && this.d.length > 0) {
            for (String str2 : this.d) {
                if (str2 != null) {
                    ckt.a(2, str2);
                }
            }
        }
        if (this.e != null && this.e.length > 0) {
            for (int a : this.e) {
                ckt.a(3, a);
            }
        }
        if (this.f != null && this.f.length > 0) {
            while (i < this.f.length) {
                ckt.a(4, this.f[i]);
                i++;
            }
        }
        super.a(ckt);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof cld)) {
            return false;
        }
        cld cld = (cld) obj;
        return !ckz.a(this.c, cld.c) ? false : !ckz.a(this.d, cld.d) ? false : !ckz.a(this.e, cld.e) ? false : !ckz.a(this.f, cld.f) ? false : (this.a == null || this.a.a()) ? cld.a == null || cld.a.a() : this.a.equals(cld.a);
    }

    public final int hashCode() {
        int hashCode = (((((((((getClass().getName().hashCode() + 527) * 31) + ckz.a(this.c)) * 31) + ckz.a(this.d)) * 31) + ckz.a(this.e)) * 31) + ckz.a(this.f)) * 31;
        int hashCode2 = (this.a == null || this.a.a()) ? 0 : this.a.hashCode();
        return hashCode2 + hashCode;
    }
}
