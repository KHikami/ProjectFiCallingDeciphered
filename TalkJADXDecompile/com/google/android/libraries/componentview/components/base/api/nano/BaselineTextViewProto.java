package com.google.android.libraries.componentview.components.base.api.nano;

import com.google.android.libraries.componentview.components.base.api.nano.AttributesProto.Color;
import com.google.android.libraries.componentview.components.base.api.nano.AttributesProto.ViewArgs;
import nyt;
import nyu;
import nyx;
import nyy;
import nzf;
import nzl;
import ofd;
import wi;

public interface BaselineTextViewProto {

    public final class BaselineTextViewArgs extends nyx<BaselineTextViewArgs> {
        public static final nyy<ofd, BaselineTextViewArgs> a;
        private static final BaselineTextViewArgs[] f;
        public Color b;
        public ViewArgs c;
        public ofd[] d;
        public Color e;
        private int g;
        private String h;
        private String i;
        private float j;
        private int k;
        private int l;
        private int m;
        private int n;
        private int o;
        private boolean p;
        private boolean q;
        private boolean r;
        private boolean s;
        private boolean t;
        private boolean u;

        public interface Gravity {
        }

        public /* synthetic */ nzf a(nyt nyt) {
            return b(nyt);
        }

        static {
            a = nyy.a(11, BaselineTextViewArgs.class, 974363362);
            f = new BaselineTextViewArgs[0];
        }

        public BaselineTextViewArgs() {
            d();
        }

        private BaselineTextViewArgs d() {
            this.g = 0;
            this.h = "";
            this.b = null;
            this.i = "";
            this.j = 0.0f;
            this.k = 0;
            this.l = 0;
            this.c = null;
            this.d = ofd.d();
            this.m = 0;
            this.n = 0;
            this.o = 0;
            this.p = false;
            this.q = false;
            this.r = false;
            this.s = true;
            this.t = false;
            this.u = false;
            this.e = null;
            this.unknownFieldData = null;
            this.cachedSize = -1;
            return this;
        }

        public void a(nyu nyu) {
            if ((this.g & 1) != 0) {
                nyu.a(1, this.h);
            }
            if (this.b != null) {
                nyu.b(2, this.b);
            }
            if ((this.g & 2) != 0) {
                nyu.a(3, this.i);
            }
            if ((this.g & 4) != 0) {
                nyu.a(4, this.j);
            }
            if ((this.g & 8) != 0) {
                nyu.c(5, this.k);
            }
            if ((this.g & 16) != 0) {
                nyu.a(6, this.l);
            }
            if (this.c != null) {
                nyu.b(7, this.c);
            }
            if (this.d != null && this.d.length > 0) {
                for (nzf nzf : this.d) {
                    if (nzf != null) {
                        nyu.b(8, nzf);
                    }
                }
            }
            if ((this.g & 32) != 0) {
                nyu.a(9, this.m);
            }
            if ((this.g & 64) != 0) {
                nyu.a(10, this.n);
            }
            if ((this.g & 128) != 0) {
                nyu.a(11, this.o);
            }
            if ((this.g & 256) != 0) {
                nyu.a(12, this.p);
            }
            if ((this.g & 512) != 0) {
                nyu.a(13, this.q);
            }
            if ((this.g & 1024) != 0) {
                nyu.a(14, this.r);
            }
            if ((this.g & 2048) != 0) {
                nyu.a(15, this.s);
            }
            if ((this.g & 4096) != 0) {
                nyu.a(16, this.t);
            }
            if ((this.g & 8192) != 0) {
                nyu.a(17, this.u);
            }
            if (this.e != null) {
                nyu.b(18, this.e);
            }
            super.a(nyu);
        }

        protected int b() {
            int b = super.b();
            if ((this.g & 1) != 0) {
                b += nyu.b(1, this.h);
            }
            if (this.b != null) {
                b += nyu.d(2, this.b);
            }
            if ((this.g & 2) != 0) {
                b += nyu.b(3, this.i);
            }
            if ((this.g & 4) != 0) {
                float f = this.j;
                b += nyu.h(4) + 4;
            }
            if ((this.g & 8) != 0) {
                b += nyu.g(5, this.k);
            }
            if ((this.g & 16) != 0) {
                b += nyu.f(6, this.l);
            }
            if (this.c != null) {
                b += nyu.d(7, this.c);
            }
            if (this.d != null && this.d.length > 0) {
                int i = b;
                for (nzf nzf : this.d) {
                    if (nzf != null) {
                        i += nyu.d(8, nzf);
                    }
                }
                b = i;
            }
            if ((this.g & 32) != 0) {
                b += nyu.f(9, this.m);
            }
            if ((this.g & 64) != 0) {
                b += nyu.f(10, this.n);
            }
            if ((this.g & 128) != 0) {
                b += nyu.f(11, this.o);
            }
            if ((this.g & 256) != 0) {
                boolean z = this.p;
                b += nyu.h(12) + 1;
            }
            if ((this.g & 512) != 0) {
                z = this.q;
                b += nyu.h(13) + 1;
            }
            if ((this.g & 1024) != 0) {
                z = this.r;
                b += nyu.h(14) + 1;
            }
            if ((this.g & 2048) != 0) {
                z = this.s;
                b += nyu.h(15) + 1;
            }
            if ((this.g & 4096) != 0) {
                z = this.t;
                b += nyu.h(16) + 1;
            }
            if ((this.g & 8192) != 0) {
                z = this.u;
                b += nyu.h(17) + 1;
            }
            if (this.e != null) {
                return b + nyu.d(18, this.e);
            }
            return b;
        }

        private BaselineTextViewArgs b(nyt nyt) {
            while (true) {
                int a = nyt.a();
                switch (a) {
                    case wi.w /*0*/:
                        break;
                    case wi.dr /*10*/:
                        this.h = nyt.j();
                        this.g |= 1;
                        continue;
                    case wi.dH /*18*/:
                        if (this.b == null) {
                            this.b = new Color();
                        }
                        nyt.a(this.b);
                        continue;
                    case wi.dx /*26*/:
                        this.i = nyt.j();
                        this.g |= 2;
                        continue;
                    case 37:
                        this.j = nyt.c();
                        this.g |= 4;
                        continue;
                    case 40:
                        this.k = nyt.l();
                        this.g |= 8;
                        continue;
                    case 48:
                        a = nyt.f();
                        switch (a) {
                            case wi.w /*0*/:
                            case wi.j /*1*/:
                            case wi.l /*2*/:
                                this.l = a;
                                this.g |= 16;
                                break;
                            default:
                                continue;
                        }
                    case 58:
                        if (this.c == null) {
                            this.c = new ViewArgs();
                        }
                        nyt.a(this.c);
                        continue;
                    case 66:
                        int b = nzl.b(nyt, 66);
                        if (this.d == null) {
                            a = 0;
                        } else {
                            a = this.d.length;
                        }
                        Object obj = new ofd[(b + a)];
                        if (a != 0) {
                            System.arraycopy(this.d, 0, obj, 0, a);
                        }
                        while (a < obj.length - 1) {
                            obj[a] = new ofd();
                            nyt.a(obj[a]);
                            nyt.a();
                            a++;
                        }
                        obj[a] = new ofd();
                        nyt.a(obj[a]);
                        this.d = obj;
                        continue;
                    case 72:
                        this.m = nyt.f();
                        this.g |= 32;
                        continue;
                    case 80:
                        this.n = nyt.f();
                        this.g |= 64;
                        continue;
                    case 88:
                        this.o = nyt.f();
                        this.g |= 128;
                        continue;
                    case 96:
                        this.p = nyt.i();
                        this.g |= 256;
                        continue;
                    case 104:
                        this.q = nyt.i();
                        this.g |= 512;
                        continue;
                    case 112:
                        this.r = nyt.i();
                        this.g |= 1024;
                        continue;
                    case 120:
                        this.s = nyt.i();
                        this.g |= 2048;
                        continue;
                    case 128:
                        this.t = nyt.i();
                        this.g |= 4096;
                        continue;
                    case 136:
                        this.u = nyt.i();
                        this.g |= 8192;
                        continue;
                    case 146:
                        if (this.e == null) {
                            this.e = new Color();
                        }
                        nyt.a(this.e);
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
}
