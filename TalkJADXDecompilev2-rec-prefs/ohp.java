package p000;

import com.google.api.client.http.HttpStatusCodes;

public final class ohp extends nyx<ohp> {
    public ohq f32912a;
    public Boolean f32913b;
    public Boolean f32914c;
    public String f32915d;
    public String[] f32916e;
    public String[] f32917f;
    public Boolean f32918g;
    public ohv[] f32919h;
    public Boolean f32920i;
    public ohu[] f32921j;
    public Boolean f32922k;
    public Integer f32923l;

    public /* synthetic */ nzf m38377a(nyt nyt) {
        return m38375b(nyt);
    }

    public ohp() {
        m38376d();
    }

    private ohp m38376d() {
        this.f32912a = null;
        this.f32913b = null;
        this.f32914c = null;
        this.f32915d = null;
        this.f32916e = nzl.f31332f;
        this.f32917f = nzl.f31332f;
        this.f32918g = null;
        this.f32919h = ohv.m38408d();
        this.f32920i = null;
        this.f32921j = ohu.m38402d();
        this.f32922k = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m38378a(nyu nyu) {
        int i = 0;
        if (this.f32912a != null) {
            nyu.m37182b(21, this.f32912a);
        }
        if (this.f32913b != null) {
            nyu.m37172a(25, this.f32913b.booleanValue());
        }
        if (this.f32914c != null) {
            nyu.m37172a(26, this.f32914c.booleanValue());
        }
        if (this.f32915d != null) {
            nyu.m37170a(27, this.f32915d);
        }
        if (this.f32916e != null && this.f32916e.length > 0) {
            for (String str : this.f32916e) {
                if (str != null) {
                    nyu.m37170a(28, str);
                }
            }
        }
        if (this.f32917f != null && this.f32917f.length > 0) {
            for (String str2 : this.f32917f) {
                if (str2 != null) {
                    nyu.m37170a(29, str2);
                }
            }
        }
        if (this.f32918g != null) {
            nyu.m37172a(30, this.f32918g.booleanValue());
        }
        if (this.f32919h != null && this.f32919h.length > 0) {
            for (nzf nzf : this.f32919h) {
                if (nzf != null) {
                    nyu.m37182b(31, nzf);
                }
            }
        }
        if (this.f32920i != null) {
            nyu.m37172a(32, this.f32920i.booleanValue());
        }
        if (this.f32921j != null && this.f32921j.length > 0) {
            while (i < this.f32921j.length) {
                nzf nzf2 = this.f32921j[i];
                if (nzf2 != null) {
                    nyu.m37182b(33, nzf2);
                }
                i++;
            }
        }
        if (this.f32922k != null) {
            nyu.m37172a(34, this.f32922k.booleanValue());
        }
        if (this.f32923l != null) {
            nyu.m37168a(35, this.f32923l.intValue());
        }
        super.a(nyu);
    }

    protected int m38379b() {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        int b = super.b();
        if (this.f32912a != null) {
            b += nyu.m37145d(21, this.f32912a);
        }
        if (this.f32913b != null) {
            this.f32913b.booleanValue();
            b += nyu.m37154h(25) + 1;
        }
        if (this.f32914c != null) {
            this.f32914c.booleanValue();
            b += nyu.m37154h(26) + 1;
        }
        if (this.f32915d != null) {
            b += nyu.m37137b(27, this.f32915d);
        }
        if (this.f32916e != null && this.f32916e.length > 0) {
            i = 0;
            i2 = 0;
            for (String str : this.f32916e) {
                if (str != null) {
                    i2++;
                    i += nyu.m37140b(str);
                }
            }
            b = (b + i) + (i2 * 2);
        }
        if (this.f32917f != null && this.f32917f.length > 0) {
            i = 0;
            i2 = 0;
            for (String str2 : this.f32917f) {
                if (str2 != null) {
                    i2++;
                    i += nyu.m37140b(str2);
                }
            }
            b = (b + i) + (i2 * 2);
        }
        if (this.f32918g != null) {
            this.f32918g.booleanValue();
            b += nyu.m37154h(30) + 1;
        }
        if (this.f32919h != null && this.f32919h.length > 0) {
            i3 = b;
            for (nzf nzf : this.f32919h) {
                if (nzf != null) {
                    i3 += nyu.m37145d(31, nzf);
                }
            }
            b = i3;
        }
        if (this.f32920i != null) {
            this.f32920i.booleanValue();
            b += nyu.m37154h(32) + 1;
        }
        if (this.f32921j != null && this.f32921j.length > 0) {
            while (i4 < this.f32921j.length) {
                nzf nzf2 = this.f32921j[i4];
                if (nzf2 != null) {
                    b += nyu.m37145d(33, nzf2);
                }
                i4++;
            }
        }
        if (this.f32922k != null) {
            this.f32922k.booleanValue();
            b += nyu.m37154h(34) + 1;
        }
        if (this.f32923l != null) {
            return b + nyu.m37147f(35, this.f32923l.intValue());
        }
        return b;
    }

    private ohp m38375b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            int b;
            Object obj;
            switch (a) {
                case 0:
                    break;
                case 170:
                    if (this.f32912a == null) {
                        this.f32912a = new ohq();
                    }
                    nyt.m37101a(this.f32912a);
                    continue;
                case HttpStatusCodes.STATUS_CODE_OK /*200*/:
                    this.f32913b = Boolean.valueOf(nyt.m37116i());
                    continue;
                case 208:
                    this.f32914c = Boolean.valueOf(nyt.m37116i());
                    continue;
                case 218:
                    this.f32915d = nyt.m37117j();
                    continue;
                case 226:
                    b = nzl.m37265b(nyt, 226);
                    a = this.f32916e == null ? 0 : this.f32916e.length;
                    obj = new String[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f32916e, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.m37117j();
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = nyt.m37117j();
                    this.f32916e = obj;
                    continue;
                case 234:
                    b = nzl.m37265b(nyt, 234);
                    a = this.f32917f == null ? 0 : this.f32917f.length;
                    obj = new String[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f32917f, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.m37117j();
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = nyt.m37117j();
                    this.f32917f = obj;
                    continue;
                case 240:
                    this.f32918g = Boolean.valueOf(nyt.m37116i());
                    continue;
                case 250:
                    b = nzl.m37265b(nyt, 250);
                    if (this.f32919h == null) {
                        a = 0;
                    } else {
                        a = this.f32919h.length;
                    }
                    obj = new ohv[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f32919h, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new ohv();
                        nyt.m37101a(obj[a]);
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = new ohv();
                    nyt.m37101a(obj[a]);
                    this.f32919h = obj;
                    continue;
                case 256:
                    this.f32920i = Boolean.valueOf(nyt.m37116i());
                    continue;
                case 266:
                    b = nzl.m37265b(nyt, 266);
                    if (this.f32921j == null) {
                        a = 0;
                    } else {
                        a = this.f32921j.length;
                    }
                    obj = new ohu[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f32921j, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new ohu();
                        nyt.m37101a(obj[a]);
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = new ohu();
                    nyt.m37101a(obj[a]);
                    this.f32921j = obj;
                    continue;
                case 272:
                    this.f32922k = Boolean.valueOf(nyt.m37116i());
                    continue;
                case 280:
                    a = nyt.m37112f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                            this.f32923l = Integer.valueOf(a);
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
