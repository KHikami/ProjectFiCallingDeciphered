package defpackage;

import nyt;
import nyu;

/* renamed from: mrn */
public final class mrn extends nyx<mrn> {
    public mro a;
    private int b;
    private long c;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public mrn() {
        d();
    }

    private mrn d() {
        this.b = 0;
        this.a = null;
        this.c = 0;
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
        if (this.a == null) {
            if (mrn.a != null) {
                return false;
            }
        } else if (!this.a.equals(mrn.a)) {
            return false;
        }
        if ((this.b & 1) != (mrn.b & 1) || this.c != mrn.c) {
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
        if (this.a == null) {
            i = 0;
        } else {
            i = this.a.hashCode();
        }
        i = (((i + hashCode) * 31) + ((int) (this.c ^ (this.c >>> 32)))) * 31;
        if (!(this.unknownFieldData == null || this.unknownFieldData.b())) {
            i2 = this.unknownFieldData.hashCode();
        }
        return i + i2;
    }

    public void a(nyu nyu) {
        if (this.a != null) {
            nyu.b(1, this.a);
        }
        if ((this.b & 1) != 0) {
            nyu.b(2, this.c);
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.a != null) {
            b += nyu.d(1, this.a);
        }
        if ((this.b & 1) != 0) {
            return b + nyu.f(2, this.c);
        }
        return b;
    }

    private mrn b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case wi.w /*0*/:
                    break;
                case wi.dr /*10*/:
                    if (this.a == null) {
                        this.a = new mro();
                    }
                    nyt.a(this.a);
                    continue;
                case wi.dI /*16*/:
                    this.c = nyt.e();
                    this.b |= 1;
                    continue;
                default:
                    if (!super.a(nyt, a)) {
                        break;
                    }
                    continue;
            }
            return this;
        }
    }
}
