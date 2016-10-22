package com.google.android.libraries.componentview.components.base.api.nano;

import com.google.android.libraries.componentview.components.base.api.nano.ActionProto.Action;
import com.google.android.libraries.componentview.components.base.api.nano.AttributesProto.Color;
import nyt;
import nyu;
import nyx;
import nyy;
import nzf;
import nzl;
import ofd;
import wi;

public interface SpanProto {

    public final class SpanArgs extends nyx<SpanArgs> {
        public static final nyy<ofd, SpanArgs> a;
        private static final SpanArgs[] e;
        public Color b;
        public ofd[] c;
        public Action d;
        private int f;
        private String g;
        private boolean h;
        private boolean i;
        private boolean j;
        private boolean k;
        private float l;
        private boolean m;
        private String n;
        private float o;
        private float p;
        private boolean q;
        private boolean r;
        private String s;
        private float t;
        private boolean u;
        private boolean v;
        private float w;

        public /* synthetic */ nzf a(nyt nyt) {
            return b(nyt);
        }

        static {
            a = nyy.a(11, SpanArgs.class, 867122650);
            e = new SpanArgs[0];
        }

        public SpanArgs a(String str) {
            this.g = str;
            this.f |= 1;
            return this;
        }

        public SpanArgs() {
            d();
        }

        private SpanArgs d() {
            this.f = 0;
            this.g = "";
            this.h = false;
            this.i = false;
            this.j = false;
            this.k = false;
            this.l = 0.6f;
            this.b = null;
            this.m = false;
            this.n = "";
            this.o = 0.0f;
            this.p = 0.0f;
            this.q = false;
            this.r = false;
            this.c = ofd.d();
            this.s = "";
            this.t = 0.0f;
            this.d = null;
            this.u = false;
            this.v = false;
            this.w = 0.0f;
            this.unknownFieldData = null;
            this.cachedSize = -1;
            return this;
        }

        public void a(nyu nyu) {
            if ((this.f & 1) != 0) {
                nyu.a(1, this.g);
            }
            if ((this.f & 2) != 0) {
                nyu.a(2, this.h);
            }
            if ((this.f & 4) != 0) {
                nyu.a(3, this.i);
            }
            if ((this.f & 8) != 0) {
                nyu.a(4, this.j);
            }
            if ((this.f & 16) != 0) {
                nyu.a(5, this.k);
            }
            if ((this.f & 32) != 0) {
                nyu.a(6, this.l);
            }
            if (this.b != null) {
                nyu.b(7, this.b);
            }
            if ((this.f & 64) != 0) {
                nyu.a(8, this.m);
            }
            if ((this.f & 128) != 0) {
                nyu.a(9, this.n);
            }
            if ((this.f & 256) != 0) {
                nyu.a(10, this.o);
            }
            if ((this.f & 512) != 0) {
                nyu.a(11, this.p);
            }
            if ((this.f & 1024) != 0) {
                nyu.a(13, this.q);
            }
            if ((this.f & 2048) != 0) {
                nyu.a(14, this.r);
            }
            if (this.c != null && this.c.length > 0) {
                for (nzf nzf : this.c) {
                    if (nzf != null) {
                        nyu.b(15, nzf);
                    }
                }
            }
            if ((this.f & 4096) != 0) {
                nyu.a(16, this.s);
            }
            if ((this.f & 8192) != 0) {
                nyu.a(17, this.t);
            }
            if (this.d != null) {
                nyu.b(18, this.d);
            }
            if ((this.f & 16384) != 0) {
                nyu.a(19, this.u);
            }
            if ((this.f & 32768) != 0) {
                nyu.a(20, this.v);
            }
            if ((this.f & 65536) != 0) {
                nyu.a(21, this.w);
            }
            super.a(nyu);
        }

        protected int b() {
            int b = super.b();
            if ((this.f & 1) != 0) {
                b += nyu.b(1, this.g);
            }
            if ((this.f & 2) != 0) {
                boolean z = this.h;
                b += nyu.h(2) + 1;
            }
            if ((this.f & 4) != 0) {
                z = this.i;
                b += nyu.h(3) + 1;
            }
            if ((this.f & 8) != 0) {
                z = this.j;
                b += nyu.h(4) + 1;
            }
            if ((this.f & 16) != 0) {
                z = this.k;
                b += nyu.h(5) + 1;
            }
            if ((this.f & 32) != 0) {
                float f = this.l;
                b += nyu.h(6) + 4;
            }
            if (this.b != null) {
                b += nyu.d(7, this.b);
            }
            if ((this.f & 64) != 0) {
                z = this.m;
                b += nyu.h(8) + 1;
            }
            if ((this.f & 128) != 0) {
                b += nyu.b(9, this.n);
            }
            if ((this.f & 256) != 0) {
                f = this.o;
                b += nyu.h(10) + 4;
            }
            if ((this.f & 512) != 0) {
                f = this.p;
                b += nyu.h(11) + 4;
            }
            if ((this.f & 1024) != 0) {
                z = this.q;
                b += nyu.h(13) + 1;
            }
            if ((this.f & 2048) != 0) {
                z = this.r;
                b += nyu.h(14) + 1;
            }
            if (this.c != null && this.c.length > 0) {
                int i = b;
                for (nzf nzf : this.c) {
                    if (nzf != null) {
                        i += nyu.d(15, nzf);
                    }
                }
                b = i;
            }
            if ((this.f & 4096) != 0) {
                b += nyu.b(16, this.s);
            }
            if ((this.f & 8192) != 0) {
                f = this.t;
                b += nyu.h(17) + 4;
            }
            if (this.d != null) {
                b += nyu.d(18, this.d);
            }
            if ((this.f & 16384) != 0) {
                z = this.u;
                b += nyu.h(19) + 1;
            }
            if ((this.f & 32768) != 0) {
                z = this.v;
                b += nyu.h(20) + 1;
            }
            if ((this.f & 65536) == 0) {
                return b;
            }
            f = this.w;
            return b + (nyu.h(21) + 4);
        }

        private SpanArgs b(nyt nyt) {
            while (true) {
                int a = nyt.a();
                switch (a) {
                    case wi.w /*0*/:
                        break;
                    case wi.dr /*10*/:
                        this.g = nyt.j();
                        this.f |= 1;
                        continue;
                    case wi.dI /*16*/:
                        this.h = nyt.i();
                        this.f |= 2;
                        continue;
                    case wi.dA /*24*/:
                        this.i = nyt.i();
                        this.f |= 4;
                        continue;
                    case 32:
                        this.j = nyt.i();
                        this.f |= 8;
                        continue;
                    case 40:
                        this.k = nyt.i();
                        this.f |= 16;
                        continue;
                    case 53:
                        this.l = nyt.c();
                        this.f |= 32;
                        continue;
                    case 58:
                        if (this.b == null) {
                            this.b = new Color();
                        }
                        nyt.a(this.b);
                        continue;
                    case 64:
                        this.m = nyt.i();
                        this.f |= 64;
                        continue;
                    case 74:
                        this.n = nyt.j();
                        this.f |= 128;
                        continue;
                    case 85:
                        this.o = nyt.c();
                        this.f |= 256;
                        continue;
                    case 93:
                        this.p = nyt.c();
                        this.f |= 512;
                        continue;
                    case 104:
                        this.q = nyt.i();
                        this.f |= 1024;
                        continue;
                    case 112:
                        this.r = nyt.i();
                        this.f |= 2048;
                        continue;
                    case 122:
                        int b = nzl.b(nyt, 122);
                        if (this.c == null) {
                            a = 0;
                        } else {
                            a = this.c.length;
                        }
                        Object obj = new ofd[(b + a)];
                        if (a != 0) {
                            System.arraycopy(this.c, 0, obj, 0, a);
                        }
                        while (a < obj.length - 1) {
                            obj[a] = new ofd();
                            nyt.a(obj[a]);
                            nyt.a();
                            a++;
                        }
                        obj[a] = new ofd();
                        nyt.a(obj[a]);
                        this.c = obj;
                        continue;
                    case 130:
                        this.s = nyt.j();
                        this.f |= 4096;
                        continue;
                    case 141:
                        this.t = nyt.c();
                        this.f |= 8192;
                        continue;
                    case 146:
                        if (this.d == null) {
                            this.d = new Action();
                        }
                        nyt.a(this.d);
                        continue;
                    case 152:
                        this.u = nyt.i();
                        this.f |= 16384;
                        continue;
                    case 160:
                        this.v = nyt.i();
                        this.f |= 32768;
                        continue;
                    case 173:
                        this.w = nyt.c();
                        this.f |= 65536;
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
