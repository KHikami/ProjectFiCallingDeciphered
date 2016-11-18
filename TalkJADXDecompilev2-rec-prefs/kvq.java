package p000;

import com.google.api.client.http.HttpStatusCodes;

public final class kvq extends nyx<kvq> {
    public int f23657a;
    public kwh[] f23658b;
    public Integer f23659c;
    public String f23660d;
    public kvl[] f23661e;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m27720b(nyt);
    }

    public kvq() {
        this.f23657a = nzf.UNSET_ENUM_VALUE;
        this.f23658b = kwh.m27792d();
        this.f23659c = null;
        this.f23660d = null;
        this.f23661e = kvl.m27700d();
        this.cachedSize = -1;
    }

    public void mo146a(nyu nyu) {
        int i = 0;
        if (this.f23657a != nzf.UNSET_ENUM_VALUE) {
            nyu.a(1, this.f23657a);
        }
        if (this.f23658b != null && this.f23658b.length > 0) {
            for (nzf nzf : this.f23658b) {
                if (nzf != null) {
                    nyu.b(2, nzf);
                }
            }
        }
        if (this.f23659c != null) {
            nyu.a(3, this.f23659c.intValue());
        }
        if (this.f23660d != null) {
            nyu.a(4, this.f23660d);
        }
        if (this.f23661e != null && this.f23661e.length > 0) {
            while (i < this.f23661e.length) {
                nzf nzf2 = this.f23661e[i];
                if (nzf2 != null) {
                    nyu.b(5, nzf2);
                }
                i++;
            }
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int i = 0;
        int b = super.mo147b();
        if (this.f23657a != nzf.UNSET_ENUM_VALUE) {
            b += nyu.f(1, this.f23657a);
        }
        if (this.f23658b != null && this.f23658b.length > 0) {
            int i2 = b;
            for (nzf nzf : this.f23658b) {
                if (nzf != null) {
                    i2 += nyu.d(2, nzf);
                }
            }
            b = i2;
        }
        if (this.f23659c != null) {
            b += nyu.f(3, this.f23659c.intValue());
        }
        if (this.f23660d != null) {
            b += nyu.b(4, this.f23660d);
        }
        if (this.f23661e != null && this.f23661e.length > 0) {
            while (i < this.f23661e.length) {
                nzf nzf2 = this.f23661e[i];
                if (nzf2 != null) {
                    b += nyu.d(5, nzf2);
                }
                i++;
            }
        }
        return b;
    }

    private kvq m27720b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            int b;
            Object obj;
            switch (a) {
                case 0:
                    break;
                case 8:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 100:
                        case 101:
                        case 102:
                        case HttpStatusCodes.STATUS_CODE_OK /*200*/:
                        case 201:
                        case 202:
                        case 203:
                        case HttpStatusCodes.STATUS_CODE_NO_CONTENT /*204*/:
                        case 205:
                        case 206:
                        case 207:
                        case HttpStatusCodes.STATUS_CODE_MULTIPLE_CHOICES /*300*/:
                        case HttpStatusCodes.STATUS_CODE_UNAUTHORIZED /*401*/:
                        case 402:
                        case 500:
                        case 600:
                        case 601:
                        case 602:
                        case 603:
                        case 604:
                        case 605:
                        case 606:
                        case 700:
                        case 701:
                        case 800:
                        case 801:
                        case 802:
                        case 803:
                        case 900:
                            this.f23657a = a;
                            break;
                        default:
                            continue;
                    }
                case wi.dH /*18*/:
                    b = nzl.b(nyt, 18);
                    if (this.f23658b == null) {
                        a = 0;
                    } else {
                        a = this.f23658b.length;
                    }
                    obj = new kwh[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f23658b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new kwh();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new kwh();
                    nyt.a(obj[a]);
                    this.f23658b = obj;
                    continue;
                case wi.dA /*24*/:
                    this.f23659c = Integer.valueOf(nyt.f());
                    continue;
                case 34:
                    this.f23660d = nyt.j();
                    continue;
                case 42:
                    b = nzl.b(nyt, 42);
                    if (this.f23661e == null) {
                        a = 0;
                    } else {
                        a = this.f23661e.length;
                    }
                    obj = new kvl[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f23661e, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new kvl();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new kvl();
                    nyt.a(obj[a]);
                    this.f23661e = obj;
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
