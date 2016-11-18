package p000;

public final class ohj extends nyx<ohj> {
    private static volatile ohj[] f32866r;
    public Long f32867a;
    public ohb f32868b;
    public Boolean f32869c;
    public oha f32870d;
    public byte[] f32871e;
    public ogn f32872f;
    public String f32873g;
    public String[] f32874h;
    public String f32875i;
    public String f32876j;
    public ohm[] f32877k;
    public nzg f32878l;
    public Long f32879m;
    public ohk f32880n;
    public ohh f32881o;
    public ogs f32882p;
    public ogq f32883q;

    public /* synthetic */ nzf m38349a(nyt nyt) {
        return m38347b(nyt);
    }

    public static ohj[] m38348d() {
        if (f32866r == null) {
            synchronized (nzc.f31309c) {
                if (f32866r == null) {
                    f32866r = new ohj[0];
                }
            }
        }
        return f32866r;
    }

    public ohj() {
        this.f32867a = null;
        this.f32869c = null;
        this.f32871e = null;
        this.f32873g = null;
        this.f32874h = nzl.f31332f;
        this.f32875i = null;
        this.f32876j = null;
        this.f32877k = ohm.m38362d();
        this.f32879m = null;
        this.cachedSize = -1;
    }

    public void m38350a(nyu nyu) {
        int i = 0;
        if (this.f32871e != null) {
            nyu.m37173a(1, this.f32871e);
        }
        if (this.f32872f != null) {
            nyu.m37182b(2, this.f32872f);
        }
        if (this.f32874h != null && this.f32874h.length > 0) {
            for (String str : this.f32874h) {
                if (str != null) {
                    nyu.m37170a(3, str);
                }
            }
        }
        if (this.f32877k != null && this.f32877k.length > 0) {
            while (i < this.f32877k.length) {
                nzf nzf = this.f32877k[i];
                if (nzf != null) {
                    nyu.m37182b(4, nzf);
                }
                i++;
            }
        }
        if (this.f32875i != null) {
            nyu.m37170a(6, this.f32875i);
        }
        if (this.f32873g != null) {
            nyu.m37170a(7, this.f32873g);
        }
        if (this.f32879m != null) {
            nyu.m37181b(8, this.f32879m.longValue());
        }
        if (this.f32876j != null) {
            nyu.m37170a(9, this.f32876j);
        }
        if (this.f32880n != null) {
            nyu.m37182b(10, this.f32880n);
        }
        if (this.f32881o != null) {
            nyu.m37182b(11, this.f32881o);
        }
        if (this.f32867a != null) {
            nyu.m37181b(12, this.f32867a.longValue());
        }
        if (this.f32882p != null) {
            nyu.m37182b(13, this.f32882p);
        }
        if (this.f32883q != null) {
            nyu.m37182b(14, this.f32883q);
        }
        if (this.f32869c != null) {
            nyu.m37172a(16, this.f32869c.booleanValue());
        }
        if (this.f32878l != null) {
            nyu.m37182b(17, this.f32878l);
        }
        if (this.f32868b != null) {
            nyu.m37182b(18, this.f32868b);
        }
        if (this.f32870d != null) {
            nyu.m37182b(19, this.f32870d);
        }
        super.a(nyu);
    }

    protected int m38351b() {
        int i = 0;
        int b = super.b();
        if (this.f32871e != null) {
            b += nyu.m37139b(1, this.f32871e);
        }
        if (this.f32872f != null) {
            b += nyu.m37145d(2, this.f32872f);
        }
        if (this.f32874h != null && this.f32874h.length > 0) {
            int i2 = 0;
            int i3 = 0;
            for (String str : this.f32874h) {
                if (str != null) {
                    i3++;
                    i2 += nyu.m37140b(str);
                }
            }
            b = (b + i2) + (i3 * 1);
        }
        if (this.f32877k != null && this.f32877k.length > 0) {
            while (i < this.f32877k.length) {
                nzf nzf = this.f32877k[i];
                if (nzf != null) {
                    b += nyu.m37145d(4, nzf);
                }
                i++;
            }
        }
        if (this.f32875i != null) {
            b += nyu.m37137b(6, this.f32875i);
        }
        if (this.f32873g != null) {
            b += nyu.m37137b(7, this.f32873g);
        }
        if (this.f32879m != null) {
            b += nyu.m37148f(8, this.f32879m.longValue());
        }
        if (this.f32876j != null) {
            b += nyu.m37137b(9, this.f32876j);
        }
        if (this.f32880n != null) {
            b += nyu.m37145d(10, this.f32880n);
        }
        if (this.f32881o != null) {
            b += nyu.m37145d(11, this.f32881o);
        }
        if (this.f32867a != null) {
            b += nyu.m37148f(12, this.f32867a.longValue());
        }
        if (this.f32882p != null) {
            b += nyu.m37145d(13, this.f32882p);
        }
        if (this.f32883q != null) {
            b += nyu.m37145d(14, this.f32883q);
        }
        if (this.f32869c != null) {
            this.f32869c.booleanValue();
            b += nyu.m37154h(16) + 1;
        }
        if (this.f32878l != null) {
            b += nyu.m37145d(17, this.f32878l);
        }
        if (this.f32868b != null) {
            b += nyu.m37145d(18, this.f32868b);
        }
        if (this.f32870d != null) {
            return b + nyu.m37145d(19, this.f32870d);
        }
        return b;
    }

    private ohj m38347b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            int b;
            Object obj;
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f32871e = nyt.m37118k();
                    continue;
                case wi.dH /*18*/:
                    if (this.f32872f == null) {
                        this.f32872f = new ogn();
                    }
                    nyt.m37101a(this.f32872f);
                    continue;
                case wi.dx /*26*/:
                    b = nzl.m37265b(nyt, 26);
                    a = this.f32874h == null ? 0 : this.f32874h.length;
                    obj = new String[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f32874h, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.m37117j();
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = nyt.m37117j();
                    this.f32874h = obj;
                    continue;
                case 34:
                    b = nzl.m37265b(nyt, 34);
                    if (this.f32877k == null) {
                        a = 0;
                    } else {
                        a = this.f32877k.length;
                    }
                    obj = new ohm[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f32877k, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new ohm();
                        nyt.m37101a(obj[a]);
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = new ohm();
                    nyt.m37101a(obj[a]);
                    this.f32877k = obj;
                    continue;
                case 50:
                    this.f32875i = nyt.m37117j();
                    continue;
                case 58:
                    this.f32873g = nyt.m37117j();
                    continue;
                case 64:
                    this.f32879m = Long.valueOf(nyt.m37110e());
                    continue;
                case 74:
                    this.f32876j = nyt.m37117j();
                    continue;
                case 82:
                    if (this.f32880n == null) {
                        this.f32880n = new ohk();
                    }
                    nyt.m37101a(this.f32880n);
                    continue;
                case 90:
                    if (this.f32881o == null) {
                        this.f32881o = new ohh();
                    }
                    nyt.m37101a(this.f32881o);
                    continue;
                case 96:
                    this.f32867a = Long.valueOf(nyt.m37110e());
                    continue;
                case 106:
                    if (this.f32882p == null) {
                        this.f32882p = new ogs();
                    }
                    nyt.m37101a(this.f32882p);
                    continue;
                case 114:
                    if (this.f32883q == null) {
                        this.f32883q = new ogq();
                    }
                    nyt.m37101a(this.f32883q);
                    continue;
                case 128:
                    this.f32869c = Boolean.valueOf(nyt.m37116i());
                    continue;
                case 138:
                    if (this.f32878l == null) {
                        this.f32878l = new nzg();
                    }
                    nyt.m37101a(this.f32878l);
                    continue;
                case 146:
                    if (this.f32868b == null) {
                        this.f32868b = new ohb();
                    }
                    nyt.m37101a(this.f32868b);
                    continue;
                case 154:
                    if (this.f32870d == null) {
                        this.f32870d = new oha();
                    }
                    nyt.m37101a(this.f32870d);
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
