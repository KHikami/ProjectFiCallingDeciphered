package p000;

public final class kyy extends nyx<kyy> {
    public int[] f24132a;
    public int[] f24133b;
    public Boolean f24134c;
    public Boolean f24135d;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m28149b(nyt);
    }

    public kyy() {
        m28150d();
    }

    private kyy m28150d() {
        this.f24132a = nzl.a;
        this.f24133b = nzl.a;
        this.f24134c = null;
        this.f24135d = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        int i = 0;
        if (this.f24132a != null && this.f24132a.length > 0) {
            for (int a : this.f24132a) {
                nyu.a(1, a);
            }
        }
        if (this.f24133b != null && this.f24133b.length > 0) {
            while (i < this.f24133b.length) {
                nyu.a(2, this.f24133b[i]);
                i++;
            }
        }
        if (this.f24134c != null) {
            nyu.a(3, this.f24134c.booleanValue());
        }
        if (this.f24135d != null) {
            nyu.a(4, this.f24135d.booleanValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int i;
        int i2;
        int i3 = 0;
        int b = super.mo147b();
        if (this.f24132a == null || this.f24132a.length <= 0) {
            i = b;
        } else {
            i2 = 0;
            for (int g : this.f24132a) {
                i2 += nyu.g(g);
            }
            i = (b + i2) + (this.f24132a.length * 1);
        }
        if (this.f24133b != null && this.f24133b.length > 0) {
            i2 = 0;
            while (i3 < this.f24133b.length) {
                i2 += nyu.g(this.f24133b[i3]);
                i3++;
            }
            i = (i + i2) + (this.f24133b.length * 1);
        }
        if (this.f24134c != null) {
            this.f24134c.booleanValue();
            i += nyu.h(3) + 1;
        }
        if (this.f24135d == null) {
            return i;
        }
        this.f24135d.booleanValue();
        return i + (nyu.h(4) + 1);
    }

    private kyy m28149b(nyt nyt) {
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
                            case 1:
                            case 2:
                            case 3:
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                            case 9:
                            case 1001:
                            case 1002:
                            case 1003:
                            case 1004:
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
                        a = this.f24132a == null ? 0 : this.f24132a.length;
                        if (a != 0 || i2 != obj.length) {
                            obj2 = new int[(a + i2)];
                            if (a != 0) {
                                System.arraycopy(this.f24132a, 0, obj2, 0, a);
                            }
                            System.arraycopy(obj, 0, obj2, a, i2);
                            this.f24132a = obj2;
                            break;
                        }
                        this.f24132a = obj;
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
                            case 1:
                            case 2:
                            case 3:
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                            case 9:
                            case 1001:
                            case 1002:
                            case 1003:
                            case 1004:
                                a++;
                                break;
                            default:
                                break;
                        }
                    }
                    if (a != 0) {
                        nyt.f(i2);
                        if (this.f24132a == null) {
                            i2 = 0;
                        } else {
                            i2 = this.f24132a.length;
                        }
                        obj3 = new int[(a + i2)];
                        if (i2 != 0) {
                            System.arraycopy(this.f24132a, 0, obj3, 0, i2);
                        }
                        while (nyt.s() > 0) {
                            f2 = nyt.f();
                            switch (f2) {
                                case 0:
                                case 1:
                                case 2:
                                case 3:
                                case 5:
                                case 6:
                                case 7:
                                case 8:
                                case 9:
                                case 1001:
                                case 1002:
                                case 1003:
                                case 1004:
                                    a = i2 + 1;
                                    obj3[i2] = f2;
                                    i2 = a;
                                    break;
                                default:
                                    break;
                            }
                        }
                        this.f24132a = obj3;
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
                            case 8:
                            case wi.dL /*19*/:
                            case 20:
                            case 21:
                            case 100:
                            case 101:
                            case 102:
                            case 103:
                            case 104:
                            case 105:
                            case 106:
                            case 107:
                            case 108:
                            case 109:
                            case 110:
                            case 111:
                            case 112:
                            case 113:
                            case 114:
                            case 115:
                            case 116:
                            case 117:
                            case 118:
                            case 119:
                            case 120:
                            case 121:
                            case 122:
                            case 123:
                            case 124:
                            case 125:
                            case 126:
                            case 127:
                            case 128:
                            case 129:
                            case 130:
                            case 131:
                            case 132:
                            case 133:
                            case 134:
                            case 135:
                            case 136:
                            case 137:
                            case 138:
                            case 139:
                            case 140:
                            case 141:
                            case 142:
                            case 143:
                            case 144:
                            case 145:
                            case 146:
                            case 147:
                            case 148:
                            case 149:
                            case 150:
                            case 151:
                            case 152:
                            case 153:
                            case 154:
                            case 155:
                            case 156:
                            case 157:
                            case 158:
                            case 159:
                            case 160:
                            case 161:
                            case 162:
                            case 163:
                            case 164:
                            case 165:
                            case 166:
                            case 167:
                            case 168:
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
                        a = this.f24133b == null ? 0 : this.f24133b.length;
                        if (a != 0 || i2 != obj.length) {
                            obj2 = new int[(a + i2)];
                            if (a != 0) {
                                System.arraycopy(this.f24133b, 0, obj2, 0, a);
                            }
                            System.arraycopy(obj, 0, obj2, a, i2);
                            this.f24133b = obj2;
                            break;
                        }
                        this.f24133b = obj;
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
                            case 8:
                            case wi.dL /*19*/:
                            case 20:
                            case 21:
                            case 100:
                            case 101:
                            case 102:
                            case 103:
                            case 104:
                            case 105:
                            case 106:
                            case 107:
                            case 108:
                            case 109:
                            case 110:
                            case 111:
                            case 112:
                            case 113:
                            case 114:
                            case 115:
                            case 116:
                            case 117:
                            case 118:
                            case 119:
                            case 120:
                            case 121:
                            case 122:
                            case 123:
                            case 124:
                            case 125:
                            case 126:
                            case 127:
                            case 128:
                            case 129:
                            case 130:
                            case 131:
                            case 132:
                            case 133:
                            case 134:
                            case 135:
                            case 136:
                            case 137:
                            case 138:
                            case 139:
                            case 140:
                            case 141:
                            case 142:
                            case 143:
                            case 144:
                            case 145:
                            case 146:
                            case 147:
                            case 148:
                            case 149:
                            case 150:
                            case 151:
                            case 152:
                            case 153:
                            case 154:
                            case 155:
                            case 156:
                            case 157:
                            case 158:
                            case 159:
                            case 160:
                            case 161:
                            case 162:
                            case 163:
                            case 164:
                            case 165:
                            case 166:
                            case 167:
                            case 168:
                                a++;
                                break;
                            default:
                                break;
                        }
                    }
                    if (a != 0) {
                        nyt.f(i2);
                        if (this.f24133b == null) {
                            i2 = 0;
                        } else {
                            i2 = this.f24133b.length;
                        }
                        obj3 = new int[(a + i2)];
                        if (i2 != 0) {
                            System.arraycopy(this.f24133b, 0, obj3, 0, i2);
                        }
                        while (nyt.s() > 0) {
                            f2 = nyt.f();
                            switch (f2) {
                                case 0:
                                case 8:
                                case wi.dL /*19*/:
                                case 20:
                                case 21:
                                case 100:
                                case 101:
                                case 102:
                                case 103:
                                case 104:
                                case 105:
                                case 106:
                                case 107:
                                case 108:
                                case 109:
                                case 110:
                                case 111:
                                case 112:
                                case 113:
                                case 114:
                                case 115:
                                case 116:
                                case 117:
                                case 118:
                                case 119:
                                case 120:
                                case 121:
                                case 122:
                                case 123:
                                case 124:
                                case 125:
                                case 126:
                                case 127:
                                case 128:
                                case 129:
                                case 130:
                                case 131:
                                case 132:
                                case 133:
                                case 134:
                                case 135:
                                case 136:
                                case 137:
                                case 138:
                                case 139:
                                case 140:
                                case 141:
                                case 142:
                                case 143:
                                case 144:
                                case 145:
                                case 146:
                                case 147:
                                case 148:
                                case 149:
                                case 150:
                                case 151:
                                case 152:
                                case 153:
                                case 154:
                                case 155:
                                case 156:
                                case 157:
                                case 158:
                                case 159:
                                case 160:
                                case 161:
                                case 162:
                                case 163:
                                case 164:
                                case 165:
                                case 166:
                                case 167:
                                case 168:
                                    a = i2 + 1;
                                    obj3[i2] = f2;
                                    i2 = a;
                                    break;
                                default:
                                    break;
                            }
                        }
                        this.f24133b = obj3;
                    }
                    nyt.e(i);
                    continue;
                case wi.dA /*24*/:
                    this.f24134c = Boolean.valueOf(nyt.i());
                    continue;
                case 32:
                    this.f24135d = Boolean.valueOf(nyt.i());
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
