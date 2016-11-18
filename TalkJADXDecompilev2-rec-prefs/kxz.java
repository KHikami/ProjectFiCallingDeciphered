package p000;

import com.google.api.client.http.HttpStatusCodes;

public final class kxz extends nyx<kxz> {
    public Integer f23976a;
    public kym[] f23977b;
    public Integer f23978c;
    public String f23979d;
    public kxv[] f23980e;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m28003b(nyt);
    }

    public kxz() {
        m28004d();
    }

    private kxz m28004d() {
        this.f23977b = kym.m28087d();
        this.f23978c = null;
        this.f23979d = null;
        this.f23980e = kxv.m27983d();
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        int i = 0;
        if (this.f23976a != null) {
            nyu.a(1, this.f23976a.intValue());
        }
        if (this.f23977b != null && this.f23977b.length > 0) {
            for (nzf nzf : this.f23977b) {
                if (nzf != null) {
                    nyu.b(2, nzf);
                }
            }
        }
        if (this.f23978c != null) {
            nyu.a(3, this.f23978c.intValue());
        }
        if (this.f23979d != null) {
            nyu.a(4, this.f23979d);
        }
        if (this.f23980e != null && this.f23980e.length > 0) {
            while (i < this.f23980e.length) {
                nzf nzf2 = this.f23980e[i];
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
        if (this.f23976a != null) {
            b += nyu.f(1, this.f23976a.intValue());
        }
        if (this.f23977b != null && this.f23977b.length > 0) {
            int i2 = b;
            for (nzf nzf : this.f23977b) {
                if (nzf != null) {
                    i2 += nyu.d(2, nzf);
                }
            }
            b = i2;
        }
        if (this.f23978c != null) {
            b += nyu.f(3, this.f23978c.intValue());
        }
        if (this.f23979d != null) {
            b += nyu.b(4, this.f23979d);
        }
        if (this.f23980e != null && this.f23980e.length > 0) {
            while (i < this.f23980e.length) {
                nzf nzf2 = this.f23980e[i];
                if (nzf2 != null) {
                    b += nyu.d(5, nzf2);
                }
                i++;
            }
        }
        return b;
    }

    private kxz m28003b(nyt nyt) {
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
                            this.f23976a = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case wi.dH /*18*/:
                    b = nzl.b(nyt, 18);
                    if (this.f23977b == null) {
                        a = 0;
                    } else {
                        a = this.f23977b.length;
                    }
                    obj = new kym[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f23977b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new kym();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new kym();
                    nyt.a(obj[a]);
                    this.f23977b = obj;
                    continue;
                case wi.dA /*24*/:
                    this.f23978c = Integer.valueOf(nyt.f());
                    continue;
                case 34:
                    this.f23979d = nyt.j();
                    continue;
                case 42:
                    b = nzl.b(nyt, 42);
                    if (this.f23980e == null) {
                        a = 0;
                    } else {
                        a = this.f23980e.length;
                    }
                    obj = new kxv[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f23980e, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new kxv();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new kxv();
                    nyt.a(obj[a]);
                    this.f23980e = obj;
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
