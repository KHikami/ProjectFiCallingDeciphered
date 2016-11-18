package p000;

public final class oga extends nyx<oga> {
    public String f32694a;
    public Integer f32695b;

    public /* synthetic */ nzf m38148a(nyt nyt) {
        return m38146b(nyt);
    }

    public oga() {
        m38147d();
    }

    private oga m38147d() {
        this.f32694a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m38149a(nyu nyu) {
        if (this.f32694a != null) {
            nyu.m37170a(1, this.f32694a);
        }
        if (this.f32695b != null) {
            nyu.m37168a(2, this.f32695b.intValue());
        }
        super.a(nyu);
    }

    protected int m38150b() {
        int b = super.b();
        if (this.f32694a != null) {
            b += nyu.m37137b(1, this.f32694a);
        }
        if (this.f32695b != null) {
            return b + nyu.m37147f(2, this.f32695b.intValue());
        }
        return b;
    }

    private oga m38146b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f32694a = nyt.m37117j();
                    continue;
                case 16:
                    a = nyt.m37112f();
                    switch (a) {
                        case 0:
                        case 73046798:
                        case 73046859:
                        case 73046960:
                        case 73047122:
                        case 73063113:
                        case 77630322:
                        case 78631618:
                        case 89449585:
                        case 91688171:
                        case 95298271:
                        case 96372017:
                        case 98979821:
                        case 101530918:
                        case 103685814:
                        case 103903807:
                        case 104208012:
                        case 104316901:
                        case 104320496:
                        case 105815918:
                        case 105911961:
                        case 106101125:
                        case 106431989:
                        case 106450108:
                        case 106613276:
                        case 106799177:
                        case 107078998:
                        case 112302371:
                        case 112373167:
                        case 115701237:
                        case 116149454:
                        case 116265594:
                        case 116332662:
                        case 117099250:
                        case 117486130:
                        case 117500317:
                        case 119411270:
                        case 120887544:
                        case 121638809:
                        case 122021327:
                        case 123117890:
                        case 123236645:
                        case 124567150:
                        case 125919303:
                        case 126453213:
                        case 129999250:
                        case 130681249:
                        case 130960511:
                            this.f32695b = Integer.valueOf(a);
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
