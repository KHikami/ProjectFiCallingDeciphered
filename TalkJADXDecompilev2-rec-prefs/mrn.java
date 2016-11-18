package p000;

public final class mrn extends nyx<mrn> {
    public mro f28182a;
    private int f28183b;
    private long f28184c;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m32772b(nyt);
    }

    public mrn() {
        m32773d();
    }

    private mrn m32773d() {
        this.f28183b = 0;
        this.f28182a = null;
        this.f28184c = 0;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof mrn)) {
            return false;
        }
        mrn mrn = (mrn) obj;
        if (this.f28182a == null) {
            if (mrn.f28182a != null) {
                return false;
            }
        } else if (!this.f28182a.equals(mrn.f28182a)) {
            return false;
        }
        if ((this.f28183b & 1) != (mrn.f28183b & 1) || this.f28184c != mrn.f28184c) {
            return false;
        }
        if (this.unknownFieldData != null && !this.unknownFieldData.b()) {
            return this.unknownFieldData.equals(mrn.unknownFieldData);
        }
        if (mrn.unknownFieldData == null || mrn.unknownFieldData.b()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i;
        int i2 = 0;
        int hashCode = (getClass().getName().hashCode() + 527) * 31;
        if (this.f28182a == null) {
            i = 0;
        } else {
            i = this.f28182a.hashCode();
        }
        i = (((i + hashCode) * 31) + ((int) (this.f28184c ^ (this.f28184c >>> 32)))) * 31;
        if (!(this.unknownFieldData == null || this.unknownFieldData.b())) {
            i2 = this.unknownFieldData.hashCode();
        }
        return i + i2;
    }

    public void mo146a(nyu nyu) {
        if (this.f28182a != null) {
            nyu.b(1, this.f28182a);
        }
        if ((this.f28183b & 1) != 0) {
            nyu.b(2, this.f28184c);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f28182a != null) {
            b += nyu.d(1, this.f28182a);
        }
        if ((this.f28183b & 1) != 0) {
            return b + nyu.f(2, this.f28184c);
        }
        return b;
    }

    private mrn m32772b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f28182a == null) {
                        this.f28182a = new mro();
                    }
                    nyt.a(this.f28182a);
                    continue;
                case 16:
                    this.f28184c = nyt.e();
                    this.f28183b |= 1;
                    continue;
                default:
                    if (!super.m1039a(nyt, a)) {
                        break;
                    }
                    continue;
            }
            return this;
        }
    }
}
