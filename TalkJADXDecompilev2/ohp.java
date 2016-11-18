package defpackage;

import com.google.api.client.http.HttpStatusCodes;

public final class ohp extends nyx<ohp> {
    public ohq a;
    public Boolean b;
    public Boolean c;
    public String d;
    public String[] e;
    public String[] f;
    public Boolean g;
    public ohv[] h;
    public Boolean i;
    public ohu[] j;
    public Boolean k;
    public Integer l;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public ohp() {
        d();
    }

    private ohp d() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = nzl.f;
        this.f = nzl.f;
        this.g = null;
        this.h = ohv.d();
        this.i = null;
        this.j = ohu.d();
        this.k = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        int i = 0;
        if (this.a != null) {
            nyu.b(21, this.a);
        }
        if (this.b != null) {
            nyu.a(25, this.b.booleanValue());
        }
        if (this.c != null) {
            nyu.a(26, this.c.booleanValue());
        }
        if (this.d != null) {
            nyu.a(27, this.d);
        }
        if (this.e != null && this.e.length > 0) {
            for (String str : this.e) {
                if (str != null) {
                    nyu.a(28, str);
                }
            }
        }
        if (this.f != null && this.f.length > 0) {
            for (String str2 : this.f) {
                if (str2 != null) {
                    nyu.a(29, str2);
                }
            }
        }
        if (this.g != null) {
            nyu.a(30, this.g.booleanValue());
        }
        if (this.h != null && this.h.length > 0) {
            for (nzf nzf : this.h) {
                if (nzf != null) {
                    nyu.b(31, nzf);
                }
            }
        }
        if (this.i != null) {
            nyu.a(32, this.i.booleanValue());
        }
        if (this.j != null && this.j.length > 0) {
            while (i < this.j.length) {
                nzf nzf2 = this.j[i];
                if (nzf2 != null) {
                    nyu.b(33, nzf2);
                }
                i++;
            }
        }
        if (this.k != null) {
            nyu.a(34, this.k.booleanValue());
        }
        if (this.l != null) {
            nyu.a(35, this.l.intValue());
        }
        super.a(nyu);
    }

    protected int b() {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        int b = super.b();
        if (this.a != null) {
            b += nyu.d(21, this.a);
        }
        if (this.b != null) {
            this.b.booleanValue();
            b += nyu.h(25) + 1;
        }
        if (this.c != null) {
            this.c.booleanValue();
            b += nyu.h(26) + 1;
        }
        if (this.d != null) {
            b += nyu.b(27, this.d);
        }
        if (this.e != null && this.e.length > 0) {
            i = 0;
            i2 = 0;
            for (String str : this.e) {
                if (str != null) {
                    i2++;
                    i += nyu.b(str);
                }
            }
            b = (b + i) + (i2 * 2);
        }
        if (this.f != null && this.f.length > 0) {
            i = 0;
            i2 = 0;
            for (String str2 : this.f) {
                if (str2 != null) {
                    i2++;
                    i += nyu.b(str2);
                }
            }
            b = (b + i) + (i2 * 2);
        }
        if (this.g != null) {
            this.g.booleanValue();
            b += nyu.h(30) + 1;
        }
        if (this.h != null && this.h.length > 0) {
            i3 = b;
            for (nzf nzf : this.h) {
                if (nzf != null) {
                    i3 += nyu.d(31, nzf);
                }
            }
            b = i3;
        }
        if (this.i != null) {
            this.i.booleanValue();
            b += nyu.h(32) + 1;
        }
        if (this.j != null && this.j.length > 0) {
            while (i4 < this.j.length) {
                nzf nzf2 = this.j[i4];
                if (nzf2 != null) {
                    b += nyu.d(33, nzf2);
                }
                i4++;
            }
        }
        if (this.k != null) {
            this.k.booleanValue();
            b += nyu.h(34) + 1;
        }
        if (this.l != null) {
            return b + nyu.f(35, this.l.intValue());
        }
        return b;
    }

    private ohp b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            int b;
            Object obj;
            switch (a) {
                case 0:
                    break;
                case 170:
                    if (this.a == null) {
                        this.a = new ohq();
                    }
                    nyt.a(this.a);
                    continue;
                case HttpStatusCodes.STATUS_CODE_OK /*200*/:
                    this.b = Boolean.valueOf(nyt.i());
                    continue;
                case 208:
                    this.c = Boolean.valueOf(nyt.i());
                    continue;
                case 218:
                    this.d = nyt.j();
                    continue;
                case 226:
                    b = nzl.b(nyt, 226);
                    a = this.e == null ? 0 : this.e.length;
                    obj = new String[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.e, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.j();
                        nyt.a();
                        a++;
                    }
                    obj[a] = nyt.j();
                    this.e = obj;
                    continue;
                case 234:
                    b = nzl.b(nyt, 234);
                    a = this.f == null ? 0 : this.f.length;
                    obj = new String[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.j();
                        nyt.a();
                        a++;
                    }
                    obj[a] = nyt.j();
                    this.f = obj;
                    continue;
                case 240:
                    this.g = Boolean.valueOf(nyt.i());
                    continue;
                case 250:
                    b = nzl.b(nyt, 250);
                    if (this.h == null) {
                        a = 0;
                    } else {
                        a = this.h.length;
                    }
                    obj = new ohv[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.h, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new ohv();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new ohv();
                    nyt.a(obj[a]);
                    this.h = obj;
                    continue;
                case 256:
                    this.i = Boolean.valueOf(nyt.i());
                    continue;
                case 266:
                    b = nzl.b(nyt, 266);
                    if (this.j == null) {
                        a = 0;
                    } else {
                        a = this.j.length;
                    }
                    obj = new ohu[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.j, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new ohu();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new ohu();
                    nyt.a(obj[a]);
                    this.j = obj;
                    continue;
                case 272:
                    this.k = Boolean.valueOf(nyt.i());
                    continue;
                case 280:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                            this.l = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
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
