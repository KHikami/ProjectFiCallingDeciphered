package com.google.android.libraries.componentview.components.base.api.nano;

import com.google.android.libraries.componentview.components.base.api.nano.AttributesProto.ViewArgs;
import nyt;
import nyu;
import nyx;
import nyy;
import nzf;
import nzl;
import ofd;
import wi;

public interface LinearLayoutProto {

    public final class LinearLayoutArgs extends nyx<LinearLayoutArgs> {
        public static final nyy<ofd, LinearLayoutArgs> a;
        private static final LinearLayoutArgs[] d;
        public ofd[] b;
        public ViewArgs c;
        private int e;
        private boolean f;
        private int g;
        private boolean h;

        public interface Gravity {
        }

        public /* synthetic */ nzf a(nyt nyt) {
            return b(nyt);
        }

        static {
            a = nyy.a(11, LinearLayoutArgs.class, 867122690);
            d = new LinearLayoutArgs[0];
        }

        public LinearLayoutArgs() {
            d();
        }

        private LinearLayoutArgs d() {
            this.e = 0;
            this.b = ofd.d();
            this.f = false;
            this.g = 0;
            this.c = null;
            this.h = true;
            this.unknownFieldData = null;
            this.cachedSize = -1;
            return this;
        }

        public void a(nyu nyu) {
            if (this.b != null && this.b.length > 0) {
                for (nzf nzf : this.b) {
                    if (nzf != null) {
                        nyu.b(1, nzf);
                    }
                }
            }
            if ((this.e & 1) != 0) {
                nyu.a(2, this.f);
            }
            if ((this.e & 2) != 0) {
                nyu.a(6, this.g);
            }
            if (this.c != null) {
                nyu.b(7, this.c);
            }
            if ((this.e & 4) != 0) {
                nyu.a(8, this.h);
            }
            super.a(nyu);
        }

        protected int b() {
            int b = super.b();
            if (this.b != null && this.b.length > 0) {
                for (nzf nzf : this.b) {
                    if (nzf != null) {
                        b += nyu.d(1, nzf);
                    }
                }
            }
            if ((this.e & 1) != 0) {
                boolean z = this.f;
                b += nyu.h(2) + 1;
            }
            if ((this.e & 2) != 0) {
                b += nyu.f(6, this.g);
            }
            if (this.c != null) {
                b += nyu.d(7, this.c);
            }
            if ((this.e & 4) == 0) {
                return b;
            }
            z = this.h;
            return b + (nyu.h(8) + 1);
        }

        private LinearLayoutArgs b(nyt nyt) {
            while (true) {
                int a = nyt.a();
                switch (a) {
                    case wi.w /*0*/:
                        break;
                    case wi.dr /*10*/:
                        int b = nzl.b(nyt, 10);
                        if (this.b == null) {
                            a = 0;
                        } else {
                            a = this.b.length;
                        }
                        Object obj = new ofd[(b + a)];
                        if (a != 0) {
                            System.arraycopy(this.b, 0, obj, 0, a);
                        }
                        while (a < obj.length - 1) {
                            obj[a] = new ofd();
                            nyt.a(obj[a]);
                            nyt.a();
                            a++;
                        }
                        obj[a] = new ofd();
                        nyt.a(obj[a]);
                        this.b = obj;
                        continue;
                    case wi.dI /*16*/:
                        this.f = nyt.i();
                        this.e |= 1;
                        continue;
                    case 48:
                        a = nyt.f();
                        switch (a) {
                            case wi.w /*0*/:
                            case wi.j /*1*/:
                            case wi.l /*2*/:
                            case wi.z /*3*/:
                            case wi.h /*4*/:
                                this.g = a;
                                this.e |= 2;
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
                    case 64:
                        this.h = nyt.i();
                        this.e |= 4;
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
