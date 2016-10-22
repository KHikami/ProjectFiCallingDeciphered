package com.google.android.libraries.componentview.components.base.api.nano;

import com.google.android.libraries.componentview.components.base.api.nano.AttributesProto.Color;
import nyt;
import nyu;
import nyx;
import nzc;
import nzf;
import nzl;
import wi;

public interface ActionProto {

    public final class AbstractAction extends nyx<AbstractAction> {
        public Color a;
        private int b;
        private boolean c;
        private boolean d;

        public /* synthetic */ nzf a(nyt nyt) {
            return b(nyt);
        }

        public AbstractAction() {
            d();
        }

        private AbstractAction d() {
            this.b = 0;
            this.c = true;
            this.d = false;
            this.a = null;
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
            if (this.a != null) {
                nyu.b(3, this.a);
            }
            super.a(nyu);
        }

        protected int b() {
            int b = super.b();
            if ((this.b & 1) != 0) {
                boolean z = this.c;
                b += nyu.h(1) + 1;
            }
            if ((this.b & 2) != 0) {
                z = this.d;
                b += nyu.h(2) + 1;
            }
            if (this.a != null) {
                return b + nyu.d(3, this.a);
            }
            return b;
        }

        private AbstractAction b(nyt nyt) {
            while (true) {
                int a = nyt.a();
                switch (a) {
                    case wi.w /*0*/:
                        break;
                    case wi.m /*8*/:
                        this.c = nyt.i();
                        this.b |= 1;
                        continue;
                    case wi.dI /*16*/:
                        this.d = nyt.i();
                        this.b |= 2;
                        continue;
                    case wi.dx /*26*/:
                        if (this.a == null) {
                            this.a = new Color();
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

    public final class Action extends nyx<Action> {
        public ActionData[] a;
        private int b;
        private String c;
        private String d;
        private boolean e;
        private long f;
        private int g;
        private String h;

        public interface Type {
        }

        public /* synthetic */ nzf a(nyt nyt) {
            return b(nyt);
        }

        public long d() {
            return this.f;
        }

        public Action() {
            g();
        }

        private Action g() {
            this.b = 0;
            this.c = "";
            this.d = "";
            this.e = false;
            this.f = -1;
            this.g = 0;
            this.h = "";
            this.a = ActionData.d();
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
            if ((this.b & 4) != 0) {
                nyu.a(3, this.e);
            }
            if ((this.b & 8) != 0) {
                nyu.b(4, this.f);
            }
            if ((this.b & 16) != 0) {
                nyu.a(5, this.g);
            }
            if ((this.b & 32) != 0) {
                nyu.a(6, this.h);
            }
            if (this.a != null && this.a.length > 0) {
                for (nzf nzf : this.a) {
                    if (nzf != null) {
                        nyu.b(7, nzf);
                    }
                }
            }
            super.a(nyu);
        }

        protected int b() {
            int b = super.b();
            if ((this.b & 1) != 0) {
                b += nyu.b(1, this.c);
            }
            if ((this.b & 2) != 0) {
                b += nyu.b(2, this.d);
            }
            if ((this.b & 4) != 0) {
                boolean z = this.e;
                b += nyu.h(3) + 1;
            }
            if ((this.b & 8) != 0) {
                b += nyu.f(4, this.f);
            }
            if ((this.b & 16) != 0) {
                b += nyu.f(5, this.g);
            }
            if ((this.b & 32) != 0) {
                b += nyu.b(6, this.h);
            }
            if (this.a == null || this.a.length <= 0) {
                return b;
            }
            int i = b;
            for (nzf nzf : this.a) {
                if (nzf != null) {
                    i += nyu.d(7, nzf);
                }
            }
            return i;
        }

        private Action b(nyt nyt) {
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
                    case wi.dA /*24*/:
                        this.e = nyt.i();
                        this.b |= 4;
                        continue;
                    case 32:
                        this.f = nyt.e();
                        this.b |= 8;
                        continue;
                    case 40:
                        a = nyt.f();
                        switch (a) {
                            case wi.w /*0*/:
                            case wi.j /*1*/:
                            case wi.l /*2*/:
                            case wi.z /*3*/:
                                this.g = a;
                                this.b |= 16;
                                break;
                            default:
                                continue;
                        }
                    case 50:
                        this.h = nyt.j();
                        this.b |= 32;
                        continue;
                    case 58:
                        int b = nzl.b(nyt, 58);
                        if (this.a == null) {
                            a = 0;
                        } else {
                            a = this.a.length;
                        }
                        Object obj = new ActionData[(b + a)];
                        if (a != 0) {
                            System.arraycopy(this.a, 0, obj, 0, a);
                        }
                        while (a < obj.length - 1) {
                            obj[a] = new ActionData();
                            nyt.a(obj[a]);
                            nyt.a();
                            a++;
                        }
                        obj[a] = new ActionData();
                        nyt.a(obj[a]);
                        this.a = obj;
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
}
