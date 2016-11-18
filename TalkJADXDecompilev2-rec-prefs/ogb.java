package p000;

public final class ogb extends nyx<ogb> {
    public int[] f32696a;
    public int[] f32697b;

    public /* synthetic */ nzf m38152a(nyt nyt) {
        return m38151b(nyt);
    }

    public ogb() {
        this.f32696a = nzl.f31327a;
        this.f32697b = nzl.f31327a;
        this.cachedSize = -1;
    }

    public void m38153a(nyu nyu) {
        int i = 0;
        if (this.f32696a != null && this.f32696a.length > 0) {
            for (int a : this.f32696a) {
                nyu.m37168a(1, a);
            }
        }
        if (this.f32697b != null && this.f32697b.length > 0) {
            while (i < this.f32697b.length) {
                nyu.m37168a(2, this.f32697b[i]);
                i++;
            }
        }
        super.a(nyu);
    }

    protected int m38154b() {
        int i;
        int i2;
        int i3 = 0;
        int b = super.b();
        if (this.f32696a == null || this.f32696a.length <= 0) {
            i = b;
        } else {
            i2 = 0;
            for (int g : this.f32696a) {
                i2 += nyu.m37150g(g);
            }
            i = (b + i2) + (this.f32696a.length * 1);
        }
        if (this.f32697b == null || this.f32697b.length <= 0) {
            return i;
        }
        i2 = 0;
        while (i3 < this.f32697b.length) {
            i2 += nyu.m37150g(this.f32697b[i3]);
            i3++;
        }
        return (i + i2) + (this.f32697b.length * 1);
    }

    private ogb m38151b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
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
                    b = nzl.m37265b(nyt, 8);
                    obj = new int[b];
                    i = 0;
                    i2 = 0;
                    while (i < b) {
                        if (i != 0) {
                            nyt.m37099a();
                        }
                        f = nyt.m37112f();
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
                        a = this.f32696a == null ? 0 : this.f32696a.length;
                        if (a != 0 || i2 != obj.length) {
                            obj2 = new int[(a + i2)];
                            if (a != 0) {
                                System.arraycopy(this.f32696a, 0, obj2, 0, a);
                            }
                            System.arraycopy(obj, 0, obj2, a, i2);
                            this.f32696a = obj2;
                            break;
                        }
                        this.f32696a = obj;
                        break;
                    }
                    continue;
                case 10:
                    i = nyt.m37108d(nyt.m37125r());
                    i2 = nyt.m37128u();
                    a = 0;
                    while (nyt.m37126s() > 0) {
                        switch (nyt.m37112f()) {
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
                        nyt.m37113f(i2);
                        if (this.f32696a == null) {
                            i2 = 0;
                        } else {
                            i2 = this.f32696a.length;
                        }
                        obj3 = new int[(a + i2)];
                        if (i2 != 0) {
                            System.arraycopy(this.f32696a, 0, obj3, 0, i2);
                        }
                        while (nyt.m37126s() > 0) {
                            f2 = nyt.m37112f();
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
                        this.f32696a = obj3;
                    }
                    nyt.m37111e(i);
                    continue;
                case 16:
                    b = nzl.m37265b(nyt, 16);
                    obj = new int[b];
                    i = 0;
                    i2 = 0;
                    while (i < b) {
                        if (i != 0) {
                            nyt.m37099a();
                        }
                        f = nyt.m37112f();
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
                        a = this.f32697b == null ? 0 : this.f32697b.length;
                        if (a != 0 || i2 != obj.length) {
                            obj2 = new int[(a + i2)];
                            if (a != 0) {
                                System.arraycopy(this.f32697b, 0, obj2, 0, a);
                            }
                            System.arraycopy(obj, 0, obj2, a, i2);
                            this.f32697b = obj2;
                            break;
                        }
                        this.f32697b = obj;
                        break;
                    }
                    continue;
                case wi.dH /*18*/:
                    i = nyt.m37108d(nyt.m37125r());
                    i2 = nyt.m37128u();
                    a = 0;
                    while (nyt.m37126s() > 0) {
                        switch (nyt.m37112f()) {
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
                        nyt.m37113f(i2);
                        if (this.f32697b == null) {
                            i2 = 0;
                        } else {
                            i2 = this.f32697b.length;
                        }
                        obj3 = new int[(a + i2)];
                        if (i2 != 0) {
                            System.arraycopy(this.f32697b, 0, obj3, 0, i2);
                        }
                        while (nyt.m37126s() > 0) {
                            f2 = nyt.m37112f();
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
                        this.f32697b = obj3;
                    }
                    nyt.m37111e(i);
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
