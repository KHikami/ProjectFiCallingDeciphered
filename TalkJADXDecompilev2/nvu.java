package defpackage;

class nvu extends nvt {
    private static final long serialVersionUID = 1;
    public final byte[] c;

    nvu(byte[] bArr) {
        this.c = bArr;
    }

    public byte a(int i) {
        return this.c[i];
    }

    public int b() {
        return this.c.length;
    }

    public final nvn a(int i, int i2) {
        int b = nvu.b(i, i2, b());
        if (b == 0) {
            return nvn.a;
        }
        return new nvp(this.c, d() + i, b);
    }

    protected void a(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.c, 0, bArr, 0, i3);
    }

    final void a(nvm nvm) {
        nvm.a(this.c, d(), b());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof nvn)) {
            return false;
        }
        if (b() != ((nvn) obj).b()) {
            return false;
        }
        if (b() == 0) {
            return true;
        }
        if (!(obj instanceof nvu)) {
            return obj.equals(this);
        }
        nvu nvu = (nvu) obj;
        int i = this.b;
        int i2 = nvu.b;
        if (i != 0 && i2 != 0 && i != i2) {
            return false;
        }
        nvu nvu2 = (nvu) obj;
        i2 = b();
        if (i2 > nvu2.b()) {
            throw new IllegalArgumentException("Length too large: " + i2 + b());
        } else if (i2 + 0 > nvu2.b()) {
            throw new IllegalArgumentException("Ran off end of other: 0" + ", " + i2 + ", " + nvu2.b());
        } else if (!(nvu2 instanceof nvu)) {
            return nvu2.a(0, i2 + 0).equals(a(0, i2));
        } else {
            nvu2 = nvu2;
            byte[] bArr = this.c;
            byte[] bArr2 = nvu2.c;
            int d = d() + i2;
            i = d();
            i2 = nvu2.d();
            while (i < d) {
                if (bArr[i] != bArr2[i2]) {
                    return false;
                }
                i++;
                i2++;
            }
            return true;
        }
    }

    protected final int a(int i, int i2, int i3) {
        return nwv.a(i, this.c, d(), i3);
    }

    public final nvw c() {
        return nvw.a(this.c, d(), b(), true);
    }

    protected int d() {
        return 0;
    }
}
