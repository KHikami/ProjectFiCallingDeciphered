package defpackage;

/* compiled from: PG */
/* renamed from: dme */
public final class dme {
    public final byte[] a;
    int b;
    public int c;
    boolean d;
    boolean e;
    dme f;
    dme g;

    dme() {
        this.a = new byte[2048];
        this.e = true;
        this.d = false;
    }

    dme(dme dme) {
        this(dme.a, dme.b, dme.c);
        dme.d = true;
    }

    private dme(byte[] bArr, int i, int i2) {
        this.a = bArr;
        this.b = i;
        this.c = i2;
        this.e = false;
        this.d = true;
    }

    public final dme a() {
        dme dme = this.f != this ? this.f : null;
        this.g.f = this.f;
        this.f.g = this.g;
        this.f = null;
        this.g = null;
        return dme;
    }

    public final dme a(dme dme) {
        dme.g = this;
        dme.f = this.f;
        this.f.g = dme;
        this.f = dme;
        return dme;
    }

    public final void a(dme dme, int i) {
        if (dme.e) {
            if (dme.c + i > 2048) {
                if (dme.d) {
                    throw new IllegalArgumentException();
                } else if ((dme.c + i) - dme.b > 2048) {
                    throw new IllegalArgumentException();
                } else {
                    System.arraycopy(dme.a, dme.b, dme.a, 0, dme.c - dme.b);
                    dme.c -= dme.b;
                    dme.b = 0;
                }
            }
            System.arraycopy(this.a, this.b, dme.a, dme.c, i);
            dme.c += i;
            this.b += i;
            return;
        }
        throw new IllegalArgumentException();
    }
}
