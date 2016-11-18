package p000;

public final class nur extends nyx<nur> {
    public Float f30970a;
    public Float f30971b;
    public Float f30972c;
    public Float f30973d;
    public Float f30974e;
    public Float f30975f;
    public Float f30976g;
    public Float f30977h;
    public Boolean f30978i;
    public Boolean f30979j;
    public Boolean f30980k;
    public Float f30981l;

    public /* synthetic */ nzf m36634a(nyt nyt) {
        return m36633b(nyt);
    }

    public nur() {
        this.f30970a = null;
        this.f30971b = null;
        this.f30972c = null;
        this.f30973d = null;
        this.f30974e = null;
        this.f30975f = null;
        this.f30976g = null;
        this.f30977h = null;
        this.f30978i = null;
        this.f30979j = null;
        this.f30980k = null;
        this.f30981l = null;
        this.cachedSize = -1;
    }

    public void m36635a(nyu nyu) {
        if (this.f30970a != null) {
            nyu.m37167a(1, this.f30970a.floatValue());
        }
        if (this.f30971b != null) {
            nyu.m37167a(2, this.f30971b.floatValue());
        }
        if (this.f30972c != null) {
            nyu.m37167a(3, this.f30972c.floatValue());
        }
        if (this.f30976g != null) {
            nyu.m37167a(7, this.f30976g.floatValue());
        }
        if (this.f30977h != null) {
            nyu.m37167a(8, this.f30977h.floatValue());
        }
        if (this.f30974e != null) {
            nyu.m37167a(9, this.f30974e.floatValue());
        }
        if (this.f30973d != null) {
            nyu.m37167a(10, this.f30973d.floatValue());
        }
        if (this.f30975f != null) {
            nyu.m37167a(11, this.f30975f.floatValue());
        }
        if (this.f30978i != null) {
            nyu.m37172a(12, this.f30978i.booleanValue());
        }
        if (this.f30979j != null) {
            nyu.m37172a(13, this.f30979j.booleanValue());
        }
        if (this.f30980k != null) {
            nyu.m37172a(14, this.f30980k.booleanValue());
        }
        if (this.f30981l != null) {
            nyu.m37167a(15, this.f30981l.floatValue());
        }
        super.a(nyu);
    }

    protected int m36636b() {
        int b = super.b();
        if (this.f30970a != null) {
            this.f30970a.floatValue();
            b += nyu.m37154h(1) + 4;
        }
        if (this.f30971b != null) {
            this.f30971b.floatValue();
            b += nyu.m37154h(2) + 4;
        }
        if (this.f30972c != null) {
            this.f30972c.floatValue();
            b += nyu.m37154h(3) + 4;
        }
        if (this.f30976g != null) {
            this.f30976g.floatValue();
            b += nyu.m37154h(7) + 4;
        }
        if (this.f30977h != null) {
            this.f30977h.floatValue();
            b += nyu.m37154h(8) + 4;
        }
        if (this.f30974e != null) {
            this.f30974e.floatValue();
            b += nyu.m37154h(9) + 4;
        }
        if (this.f30973d != null) {
            this.f30973d.floatValue();
            b += nyu.m37154h(10) + 4;
        }
        if (this.f30975f != null) {
            this.f30975f.floatValue();
            b += nyu.m37154h(11) + 4;
        }
        if (this.f30978i != null) {
            this.f30978i.booleanValue();
            b += nyu.m37154h(12) + 1;
        }
        if (this.f30979j != null) {
            this.f30979j.booleanValue();
            b += nyu.m37154h(13) + 1;
        }
        if (this.f30980k != null) {
            this.f30980k.booleanValue();
            b += nyu.m37154h(14) + 1;
        }
        if (this.f30981l == null) {
            return b;
        }
        this.f30981l.floatValue();
        return b + (nyu.m37154h(15) + 4);
    }

    private nur m36633b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 13:
                    this.f30970a = Float.valueOf(nyt.m37106c());
                    continue;
                case 21:
                    this.f30971b = Float.valueOf(nyt.m37106c());
                    continue;
                case 29:
                    this.f30972c = Float.valueOf(nyt.m37106c());
                    continue;
                case 61:
                    this.f30976g = Float.valueOf(nyt.m37106c());
                    continue;
                case 69:
                    this.f30977h = Float.valueOf(nyt.m37106c());
                    continue;
                case 77:
                    this.f30974e = Float.valueOf(nyt.m37106c());
                    continue;
                case 85:
                    this.f30973d = Float.valueOf(nyt.m37106c());
                    continue;
                case 93:
                    this.f30975f = Float.valueOf(nyt.m37106c());
                    continue;
                case 96:
                    this.f30978i = Boolean.valueOf(nyt.m37116i());
                    continue;
                case 104:
                    this.f30979j = Boolean.valueOf(nyt.m37116i());
                    continue;
                case 112:
                    this.f30980k = Boolean.valueOf(nyt.m37116i());
                    continue;
                case 125:
                    this.f30981l = Float.valueOf(nyt.m37106c());
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
