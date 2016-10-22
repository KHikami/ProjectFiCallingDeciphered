package com.google.android.libraries.componentview.components.elements.api.nano;

import com.google.android.libraries.componentview.components.base.api.nano.AttributesProto.ViewArgs;
import nyt;
import nyu;
import nyx;
import nyy;
import nzf;
import nzl;
import ofd;
import wi;

public interface CardProto {

    public final class CardArgs extends nyx<CardArgs> {
        public static final nyy<ofd, CardArgs> a;
        private static final CardArgs[] e;
        public ofd[] b;
        public ViewArgs c;
        public CardData d;

        public /* synthetic */ nzf a(nyt nyt) {
            return b(nyt);
        }

        static {
            a = nyy.a(11, CardArgs.class, 867122618);
            e = new CardArgs[0];
        }

        public CardArgs() {
            d();
        }

        private CardArgs d() {
            this.b = ofd.d();
            this.c = null;
            this.d = null;
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
            if (this.c != null) {
                nyu.b(2, this.c);
            }
            if (this.d != null) {
                nyu.b(5, this.d);
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
            if (this.c != null) {
                b += nyu.d(2, this.c);
            }
            if (this.d != null) {
                return b + nyu.d(5, this.d);
            }
            return b;
        }

        private CardArgs b(nyt nyt) {
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
                    case wi.dH /*18*/:
                        if (this.c == null) {
                            this.c = new ViewArgs();
                        }
                        nyt.a(this.c);
                        continue;
                    case 42:
                        if (this.d == null) {
                            this.d = new CardData();
                        }
                        nyt.a(this.d);
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

    public final class CardData extends nyx<CardData> {
        public ViewArgs a;

        public /* synthetic */ nzf a(nyt nyt) {
            return b(nyt);
        }

        public CardData() {
            d();
        }

        private CardData d() {
            this.a = null;
            this.unknownFieldData = null;
            this.cachedSize = -1;
            return this;
        }

        public void a(nyu nyu) {
            if (this.a != null) {
                nyu.b(1, this.a);
            }
            super.a(nyu);
        }

        protected int b() {
            int b = super.b();
            if (this.a != null) {
                return b + nyu.d(1, this.a);
            }
            return b;
        }

        private CardData b(nyt nyt) {
            while (true) {
                int a = nyt.a();
                switch (a) {
                    case wi.w /*0*/:
                        break;
                    case wi.dr /*10*/:
                        if (this.a == null) {
                            this.a = new ViewArgs();
                        }
                        nyt.a(this.a);
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
