package p000;

class nvu extends nvt {
    private static final long serialVersionUID = 1;
    public final byte[] f31133c;

    nvu(byte[] bArr) {
        this.f31133c = bArr;
    }

    public byte mo3983a(int i) {
        return this.f31133c[i];
    }

    public int mo3985b() {
        return this.f31133c.length;
    }

    public final nvn m36742a(int i, int i2) {
        int b = nvu.b(i, i2, mo3985b());
        if (b == 0) {
            return nvn.a;
        }
        return new nvp(this.f31133c, mo3986d() + i, b);
    }

    protected void mo3984a(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.f31133c, 0, bArr, 0, i3);
    }

    final void m36743a(nvm nvm) {
        nvm.mo4015a(this.f31133c, mo3986d(), mo3985b());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof nvn)) {
            return false;
        }
        if (mo3985b() != ((nvn) obj).b()) {
            return false;
        }
        if (mo3985b() == 0) {
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
        i2 = mo3985b();
        if (i2 > nvu2.b()) {
            throw new IllegalArgumentException("Length too large: " + i2 + mo3985b());
        } else if (i2 + 0 > nvu2.b()) {
            throw new IllegalArgumentException("Ran off end of other: 0" + ", " + i2 + ", " + nvu2.b());
        } else if (!(nvu2 instanceof nvu)) {
            return nvu2.a(0, i2 + 0).equals(m36742a(0, i2));
        } else {
            nvu2 = nvu2;
            byte[] bArr = this.f31133c;
            byte[] bArr2 = nvu2.f31133c;
            int d = mo3986d() + i2;
            i = mo3986d();
            i2 = nvu2.mo3986d();
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

    protected final int m36741a(int i, int i2, int i3) {
        return nwv.m37007a(i, this.f31133c, mo3986d(), i3);
    }

    public final nvw m36746c() {
        return nvw.m36757a(this.f31133c, mo3986d(), mo3985b(), true);
    }

    protected int mo3986d() {
        return 0;
    }
}
