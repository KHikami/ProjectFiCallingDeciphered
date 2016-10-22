package com.google.android.libraries.componentview.components.base.api.nano;

import com.google.android.libraries.componentview.components.base.api.nano.AttributesProto.Dimension;
import nyt;
import nyu;
import nyx;
import nyy;
import nzf;
import ofd;
import wi;

public interface LayoutParamsProto {

    public final class LayoutParamsArgs extends nyx<LayoutParamsArgs> {
        public static final nyy<ofd, LayoutParamsArgs> a;
        private static final LayoutParamsArgs[] f;
        public ofd b;
        public Dimension c;
        public Dimension d;
        public Margin e;

        public /* synthetic */ nzf a(nyt nyt) {
            return b(nyt);
        }

        static {
            a = nyy.a(11, LayoutParamsArgs.class, 867122698);
            f = new LayoutParamsArgs[0];
        }

        public LayoutParamsArgs() {
            d();
        }

        private LayoutParamsArgs d() {
            this.b = null;
            this.c = null;
            this.d = null;
            this.e = null;
            this.unknownFieldData = null;
            this.cachedSize = -1;
            return this;
        }

        public void a(nyu nyu) {
            if (this.b != null) {
                nyu.b(1, this.b);
            }
            if (this.c != null) {
                nyu.b(2, this.c);
            }
            if (this.d != null) {
                nyu.b(3, this.d);
            }
            if (this.e != null) {
                nyu.b(4, this.e);
            }
            super.a(nyu);
        }

        protected int b() {
            int b = super.b();
            if (this.b != null) {
                b += nyu.d(1, this.b);
            }
            if (this.c != null) {
                b += nyu.d(2, this.c);
            }
            if (this.d != null) {
                b += nyu.d(3, this.d);
            }
            if (this.e != null) {
                return b + nyu.d(4, this.e);
            }
            return b;
        }

        private LayoutParamsArgs b(nyt nyt) {
            while (true) {
                int a = nyt.a();
                switch (a) {
                    case wi.w /*0*/:
                        break;
                    case wi.dr /*10*/:
                        if (this.b == null) {
                            this.b = new ofd();
                        }
                        nyt.a(this.b);
                        continue;
                    case wi.dH /*18*/:
                        if (this.c == null) {
                            this.c = new Dimension();
                        }
                        nyt.a(this.c);
                        continue;
                    case wi.dx /*26*/:
                        if (this.d == null) {
                            this.d = new Dimension();
                        }
                        nyt.a(this.d);
                        continue;
                    case 34:
                        if (this.e == null) {
                            this.e = new Margin();
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

    public final class Margin extends nyx<Margin> {
        private int a;
        private int b;
        private int c;
        private int d;
        private int e;
        private float f;
        private float g;
        private float h;
        private float i;

        public /* synthetic */ nzf a(nyt nyt) {
            return b(nyt);
        }

        public Margin() {
            d();
        }

        private Margin d() {
            this.a = 0;
            this.b = 0;
            this.c = 0;
            this.d = 0;
            this.e = 0;
            this.f = 0.0f;
            this.g = 0.0f;
            this.h = 0.0f;
            this.i = 0.0f;
            this.unknownFieldData = null;
            this.cachedSize = -1;
            return this;
        }

        public void a(nyu nyu) {
            if ((this.a & 1) != 0) {
                nyu.a(1, this.b);
            }
            if ((this.a & 2) != 0) {
                nyu.a(2, this.c);
            }
            if ((this.a & 4) != 0) {
                nyu.a(3, this.d);
            }
            if ((this.a & 8) != 0) {
                nyu.a(4, this.e);
            }
            if ((this.a & 16) != 0) {
                nyu.a(5, this.f);
            }
            if ((this.a & 32) != 0) {
                nyu.a(6, this.g);
            }
            if ((this.a & 64) != 0) {
                nyu.a(7, this.h);
            }
            if ((this.a & 128) != 0) {
                nyu.a(8, this.i);
            }
            super.a(nyu);
        }

        protected int b() {
            int b = super.b();
            if ((this.a & 1) != 0) {
                b += nyu.f(1, this.b);
            }
            if ((this.a & 2) != 0) {
                b += nyu.f(2, this.c);
            }
            if ((this.a & 4) != 0) {
                b += nyu.f(3, this.d);
            }
            if ((this.a & 8) != 0) {
                b += nyu.f(4, this.e);
            }
            if ((this.a & 16) != 0) {
                float f = this.f;
                b += nyu.h(5) + 4;
            }
            if ((this.a & 32) != 0) {
                f = this.g;
                b += nyu.h(6) + 4;
            }
            if ((this.a & 64) != 0) {
                f = this.h;
                b += nyu.h(7) + 4;
            }
            if ((this.a & 128) == 0) {
                return b;
            }
            f = this.i;
            return b + (nyu.h(8) + 4);
        }

        private Margin b(nyt nyt) {
            while (true) {
                int a = nyt.a();
                switch (a) {
                    case wi.w /*0*/:
                        break;
                    case wi.m /*8*/:
                        this.b = nyt.f();
                        this.a |= 1;
                        continue;
                    case wi.dI /*16*/:
                        this.c = nyt.f();
                        this.a |= 2;
                        continue;
                    case wi.dA /*24*/:
                        this.d = nyt.f();
                        this.a |= 4;
                        continue;
                    case 32:
                        this.e = nyt.f();
                        this.a |= 8;
                        continue;
                    case 45:
                        this.f = nyt.c();
                        this.a |= 16;
                        continue;
                    case 53:
                        this.g = nyt.c();
                        this.a |= 32;
                        continue;
                    case 61:
                        this.h = nyt.c();
                        this.a |= 64;
                        continue;
                    case 69:
                        this.i = nyt.c();
                        this.a |= 128;
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
