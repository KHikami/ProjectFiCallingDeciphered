package defpackage;

public final class ofz extends nyx<ofz> {
    public String a;
    public int b;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public ofz() {
        this.a = null;
        this.b = nzf.UNSET_ENUM_VALUE;
        this.cachedSize = -1;
    }

    public void a(nyu nyu) {
        if (this.a != null) {
            nyu.a(1, this.a);
        }
        if (this.b != nzf.UNSET_ENUM_VALUE) {
            nyu.a(2, this.b);
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.a != null) {
            b += nyu.b(1, this.a);
        }
        if (this.b != nzf.UNSET_ENUM_VALUE) {
            return b + nyu.f(2, this.b);
        }
        return b;
    }

    private ofz b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.a = nyt.j();
                    continue;
                case 16:
                    a = nyt.f();
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
                            this.b = a;
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
