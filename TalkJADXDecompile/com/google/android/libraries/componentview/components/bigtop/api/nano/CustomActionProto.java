package com.google.android.libraries.componentview.components.bigtop.api.nano;

import com.google.android.libraries.componentview.components.base.api.nano.ActionProto.AbstractAction;
import nyt;
import nyu;
import nyx;
import nyy;
import nzc;
import nzf;
import nzl;
import ofd;
import wi;

public interface CustomActionProto {

    public final class ActionData extends nyx<ActionData> {
        private static volatile ActionData[] a;
        private int b;
        private String c;
        private String d;

        public /* synthetic */ nzf a(nyt nyt) {
            return b(nyt);
        }

        public static ActionData[] d() {
            if (a == null) {
                synchronized (nzc.c) {
                    if (a == null) {
                        a = new ActionData[0];
                    }
                }
            }
            return a;
        }

        public ActionData() {
            g();
        }

        private ActionData g() {
            this.b = 0;
            this.c = "";
            this.d = "";
            this.unknownFieldData = null;
            this.cachedSize = -1;
            return this;
        }

        public void a(nyu nyu) {
            if ((this.b & 1) != 0) {
                nyu.a(1, this.c);
            }
            if ((this.b & 2) != 0) {
                nyu.a(2, this.d);
            }
            super.a(nyu);
        }

        protected int b() {
            int b = super.b();
            if ((this.b & 1) != 0) {
                b += nyu.b(1, this.c);
            }
            if ((this.b & 2) != 0) {
                return b + nyu.b(2, this.d);
            }
            return b;
        }

        private ActionData b(nyt nyt) {
            while (true) {
                int a = nyt.a();
                switch (a) {
                    case wi.w /*0*/:
                        break;
                    case wi.dr /*10*/:
                        this.c = nyt.j();
                        this.b |= 1;
                        continue;
                    case wi.dH /*18*/:
                        this.d = nyt.j();
                        this.b |= 2;
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

    public final class CustomActionArgs extends nyx<CustomActionArgs> {
        public static final nyy<ofd, CustomActionArgs> a;
        private static final CustomActionArgs[] e;
        public ofd b;
        public ActionData[] c;
        public AbstractAction d;
        private int f;
        private boolean g;

        public /* synthetic */ nzf a(nyt nyt) {
            return b(nyt);
        }

        static {
            a = nyy.a(11, CustomActionArgs.class, 994727082);
            e = new CustomActionArgs[0];
        }

        public CustomActionArgs() {
            d();
        }

        private CustomActionArgs d() {
            this.f = 0;
            this.b = null;
            this.c = ActionData.d();
            this.g = true;
            this.d = null;
            this.unknownFieldData = null;
            this.cachedSize = -1;
            return this;
        }

        public void a(nyu nyu) {
            if (this.b != null) {
                nyu.b(1, this.b);
            }
            if (this.c != null && this.c.length > 0) {
                for (nzf nzf : this.c) {
                    if (nzf != null) {
                        nyu.b(2, nzf);
                    }
                }
            }
            if ((this.f & 1) != 0) {
                nyu.a(3, this.g);
            }
            if (this.d != null) {
                nyu.b(4, this.d);
            }
            super.a(nyu);
        }

        protected int b() {
            int b = super.b();
            if (this.b != null) {
                b += nyu.d(1, this.b);
            }
            if (this.c != null && this.c.length > 0) {
                int i = b;
                for (nzf nzf : this.c) {
                    if (nzf != null) {
                        i += nyu.d(2, nzf);
                    }
                }
                b = i;
            }
            if ((this.f & 1) != 0) {
                boolean z = this.g;
                b += nyu.h(3) + 1;
            }
            if (this.d != null) {
                return b + nyu.d(4, this.d);
            }
            return b;
        }

        private CustomActionArgs b(nyt nyt) {
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
                        int b = nzl.b(nyt, 18);
                        if (this.c == null) {
                            a = 0;
                        } else {
                            a = this.c.length;
                        }
                        Object obj = new ActionData[(b + a)];
                        if (a != 0) {
                            System.arraycopy(this.c, 0, obj, 0, a);
                        }
                        while (a < obj.length - 1) {
                            obj[a] = new ActionData();
                            nyt.a(obj[a]);
                            nyt.a();
                            a++;
                        }
                        obj[a] = new ActionData();
                        nyt.a(obj[a]);
                        this.c = obj;
                        continue;
                    case wi.dA /*24*/:
                        this.g = nyt.i();
                        this.f |= 1;
                        continue;
                    case 34:
                        if (this.d == null) {
                            this.d = new AbstractAction();
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
}
