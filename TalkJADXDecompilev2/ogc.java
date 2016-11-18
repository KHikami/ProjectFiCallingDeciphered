package defpackage;

public final class ogc extends nyx<ogc> {
    public int[] a;
    public int[] b;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public ogc() {
        d();
    }

    private ogc d() {
        this.a = nzl.a;
        this.b = nzl.a;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        int i = 0;
        if (this.a != null && this.a.length > 0) {
            for (int a : this.a) {
                nyu.a(1, a);
            }
        }
        if (this.b != null && this.b.length > 0) {
            while (i < this.b.length) {
                nyu.a(2, this.b[i]);
                i++;
            }
        }
        super.a(nyu);
    }

    protected int b() {
        int i;
        int i2;
        int i3 = 0;
        int b = super.b();
        if (this.a == null || this.a.length <= 0) {
            i = b;
        } else {
            i2 = 0;
            for (int g : this.a) {
                i2 += nyu.g(g);
            }
            i = (b + i2) + (this.a.length * 1);
        }
        if (this.b == null || this.b.length <= 0) {
            return i;
        }
        i2 = 0;
        while (i3 < this.b.length) {
            i2 += nyu.g(this.b[i3]);
            i3++;
        }
        return (i + i2) + (this.b.length * 1);
    }

    private ogc b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            int b;
            Object obj;
            int i;
            int i2;
            int f;
            Object obj2;
            Object obj3;
            int f2;
            switch (a) {
                case 0:
                    break;
                case 8:
                    b = nzl.b(nyt, 8);
                    obj = new int[b];
                    i = 0;
                    i2 = 0;
                    while (i < b) {
                        if (i != 0) {
                            nyt.a();
                        }
                        f = nyt.f();
                        switch (f) {
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
                                a = i2 + 1;
                                obj[i2] = f;
                                break;
                            default:
                                a = i2;
                                break;
                        }
                        i++;
                        i2 = a;
                    }
                    if (i2 != 0) {
                        a = this.a == null ? 0 : this.a.length;
                        if (a != 0 || i2 != obj.length) {
                            obj2 = new int[(a + i2)];
                            if (a != 0) {
                                System.arraycopy(this.a, 0, obj2, 0, a);
                            }
                            System.arraycopy(obj, 0, obj2, a, i2);
                            this.a = obj2;
                            break;
                        }
                        this.a = obj;
                        break;
                    }
                    continue;
                case 10:
                    i = nyt.d(nyt.r());
                    i2 = nyt.u();
                    a = 0;
                    while (nyt.s() > 0) {
                        switch (nyt.f()) {
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
                                a++;
                                break;
                            default:
                                break;
                        }
                    }
                    if (a != 0) {
                        nyt.f(i2);
                        if (this.a == null) {
                            i2 = 0;
                        } else {
                            i2 = this.a.length;
                        }
                        obj3 = new int[(a + i2)];
                        if (i2 != 0) {
                            System.arraycopy(this.a, 0, obj3, 0, i2);
                        }
                        while (nyt.s() > 0) {
                            f2 = nyt.f();
                            switch (f2) {
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
                                    a = i2 + 1;
                                    obj3[i2] = f2;
                                    i2 = a;
                                    break;
                                default:
                                    break;
                            }
                        }
                        this.a = obj3;
                    }
                    nyt.e(i);
                    continue;
                case 16:
                    b = nzl.b(nyt, 16);
                    obj = new int[b];
                    i = 0;
                    i2 = 0;
                    while (i < b) {
                        if (i != 0) {
                            nyt.a();
                        }
                        f = nyt.f();
                        switch (f) {
                            case 0:
                            case 1:
                            case 2:
                            case 3:
                                a = i2 + 1;
                                obj[i2] = f;
                                break;
                            default:
                                a = i2;
                                break;
                        }
                        i++;
                        i2 = a;
                    }
                    if (i2 != 0) {
                        a = this.b == null ? 0 : this.b.length;
                        if (a != 0 || i2 != obj.length) {
                            obj2 = new int[(a + i2)];
                            if (a != 0) {
                                System.arraycopy(this.b, 0, obj2, 0, a);
                            }
                            System.arraycopy(obj, 0, obj2, a, i2);
                            this.b = obj2;
                            break;
                        }
                        this.b = obj;
                        break;
                    }
                    continue;
                case wi.dH /*18*/:
                    i = nyt.d(nyt.r());
                    i2 = nyt.u();
                    a = 0;
                    while (nyt.s() > 0) {
                        switch (nyt.f()) {
                            case 0:
                            case 1:
                            case 2:
                            case 3:
                                a++;
                                break;
                            default:
                                break;
                        }
                    }
                    if (a != 0) {
                        nyt.f(i2);
                        if (this.b == null) {
                            i2 = 0;
                        } else {
                            i2 = this.b.length;
                        }
                        obj3 = new int[(a + i2)];
                        if (i2 != 0) {
                            System.arraycopy(this.b, 0, obj3, 0, i2);
                        }
                        while (nyt.s() > 0) {
                            f2 = nyt.f();
                            switch (f2) {
                                case 0:
                                case 1:
                                case 2:
                                case 3:
                                    a = i2 + 1;
                                    obj3[i2] = f2;
                                    i2 = a;
                                    break;
                                default:
                                    break;
                            }
                        }
                        this.b = obj3;
                    }
                    nyt.e(i);
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
