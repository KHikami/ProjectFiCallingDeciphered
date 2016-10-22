package com.google.android.libraries.componentview.components.base.api.nano;

import nyt;
import nyu;
import nyx;
import nzf;
import nzl;
import wi;

public interface AttributesProto {

    public final class Attributes extends nyx<Attributes> {

        public interface FontWeight {
        }

        public interface Gravity {
        }

        public /* synthetic */ nzf a(nyt nyt) {
            return b(nyt);
        }

        public Attributes() {
            d();
        }

        private Attributes d() {
            this.unknownFieldData = null;
            this.cachedSize = -1;
            return this;
        }

        private Attributes b(nyt nyt) {
            int a;
            do {
                a = nyt.a();
                switch (a) {
                    case wi.w /*0*/:
                        break;
                    default:
                        break;
                }
                return this;
            } while (super.a(nyt, a));
            return this;
        }
    }

    public final class Color extends nyx<Color> {
        private int a;
        private float b;
        private float c;
        private float d;
        private float e;
        private int f;

        public /* synthetic */ nzf a(nyt nyt) {
            return b(nyt);
        }

        public Color() {
            d();
        }

        private Color d() {
            this.a = 0;
            this.b = 0.0f;
            this.c = 0.0f;
            this.d = 0.0f;
            this.e = 0.0f;
            this.f = 0;
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
                nyu.b(5, this.f);
            }
            super.a(nyu);
        }

        protected int b() {
            int b = super.b();
            if ((this.a & 1) != 0) {
                float f = this.b;
                b += nyu.h(1) + 4;
            }
            if ((this.a & 2) != 0) {
                f = this.c;
                b += nyu.h(2) + 4;
            }
            if ((this.a & 4) != 0) {
                f = this.d;
                b += nyu.h(3) + 4;
            }
            if ((this.a & 8) != 0) {
                f = this.e;
                b += nyu.h(4) + 4;
            }
            if ((this.a & 16) == 0) {
                return b;
            }
            int i = this.f;
            return b + (nyu.h(5) + 4);
        }

        private Color b(nyt nyt) {
            while (true) {
                int a = nyt.a();
                switch (a) {
                    case wi.w /*0*/:
                        break;
                    case wi.dD /*13*/:
                        this.b = nyt.c();
                        this.a |= 1;
                        continue;
                    case wi.f /*21*/:
                        this.c = nyt.c();
                        this.a |= 2;
                        continue;
                    case 29:
                        this.d = nyt.c();
                        this.a |= 4;
                        continue;
                    case 37:
                        this.e = nyt.c();
                        this.a |= 8;
                        continue;
                    case 45:
                        this.f = nyt.h();
                        this.a |= 16;
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

    public final class DateFormatSet extends nyx<DateFormatSet> {
        public int[] a;

        public interface DateFormat {
        }

        public /* synthetic */ nzf a(nyt nyt) {
            return b(nyt);
        }

        public DateFormatSet() {
            d();
        }

        private DateFormatSet d() {
            this.a = nzl.a;
            this.unknownFieldData = null;
            this.cachedSize = -1;
            return this;
        }

        public void a(nyu nyu) {
            if (this.a != null && this.a.length > 0) {
                for (int a : this.a) {
                    nyu.a(1, a);
                }
            }
            super.a(nyu);
        }

        protected int b() {
            int i = 0;
            int b = super.b();
            if (this.a == null || this.a.length <= 0) {
                return b;
            }
            int i2 = 0;
            while (i < this.a.length) {
                i2 += nyu.g(this.a[i]);
                i++;
            }
            return (b + i2) + (this.a.length * 1);
        }

        private DateFormatSet b(nyt nyt) {
            while (true) {
                int a = nyt.a();
                int i;
                int i2;
                switch (a) {
                    case wi.w /*0*/:
                        break;
                    case wi.m /*8*/:
                        int b = nzl.b(nyt, 8);
                        Object obj = new int[b];
                        i = 0;
                        i2 = 0;
                        while (i < b) {
                            if (i != 0) {
                                nyt.a();
                            }
                            int f = nyt.f();
                            switch (f) {
                                case wi.j /*1*/:
                                case wi.l /*2*/:
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
                                Object obj2 = new int[(a + i2)];
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
                    case wi.dr /*10*/:
                        i = nyt.d(nyt.r());
                        i2 = nyt.u();
                        a = 0;
                        while (nyt.s() > 0) {
                            switch (nyt.f()) {
                                case wi.j /*1*/:
                                case wi.l /*2*/:
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
                            Object obj3 = new int[(a + i2)];
                            if (i2 != 0) {
                                System.arraycopy(this.a, 0, obj3, 0, i2);
                            }
                            while (nyt.s() > 0) {
                                int f2 = nyt.f();
                                switch (f2) {
                                    case wi.j /*1*/:
                                    case wi.l /*2*/:
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

    public final class Dimension extends nyx<Dimension> {
        private int a;
        private float b;
        private int c;

        public interface Mode {
        }

        public /* synthetic */ nzf a(nyt nyt) {
            return b(nyt);
        }

        public Dimension() {
            d();
        }

        private Dimension d() {
            this.a = 0;
            this.b = 0.0f;
            this.c = 0;
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
            super.a(nyu);
        }

        protected int b() {
            int b = super.b();
            if ((this.a & 1) != 0) {
                float f = this.b;
                b += nyu.h(1) + 4;
            }
            if ((this.a & 2) != 0) {
                return b + nyu.f(2, this.c);
            }
            return b;
        }

        private Dimension b(nyt nyt) {
            while (true) {
                int a = nyt.a();
                switch (a) {
                    case wi.w /*0*/:
                        break;
                    case wi.dD /*13*/:
                        this.b = nyt.c();
                        this.a |= 1;
                        continue;
                    case wi.dI /*16*/:
                        a = nyt.f();
                        switch (a) {
                            case wi.w /*0*/:
                            case wi.j /*1*/:
                            case wi.l /*2*/:
                                this.c = a;
                                this.a |= 2;
                                break;
                            default:
                                continue;
                        }
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

    public final class Padding extends nyx<Padding> {
        private int a;
        private float b;
        private float c;
        private float d;
        private float e;

        public /* synthetic */ nzf a(nyt nyt) {
            return b(nyt);
        }

        public Padding() {
            d();
        }

        private Padding d() {
            this.a = 0;
            this.b = 0.0f;
            this.c = 0.0f;
            this.d = 0.0f;
            this.e = 0.0f;
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
            super.a(nyu);
        }

        protected int b() {
            int b = super.b();
            if ((this.a & 1) != 0) {
                float f = this.b;
                b += nyu.h(1) + 4;
            }
            if ((this.a & 2) != 0) {
                f = this.c;
                b += nyu.h(2) + 4;
            }
            if ((this.a & 4) != 0) {
                f = this.d;
                b += nyu.h(3) + 4;
            }
            if ((this.a & 8) == 0) {
                return b;
            }
            f = this.e;
            return b + (nyu.h(4) + 4);
        }

        private Padding b(nyt nyt) {
            while (true) {
                int a = nyt.a();
                switch (a) {
                    case wi.w /*0*/:
                        break;
                    case wi.dD /*13*/:
                        this.b = nyt.c();
                        this.a |= 1;
                        continue;
                    case wi.f /*21*/:
                        this.c = nyt.c();
                        this.a |= 2;
                        continue;
                    case 29:
                        this.d = nyt.c();
                        this.a |= 4;
                        continue;
                    case 37:
                        this.e = nyt.c();
                        this.a |= 8;
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

    public final class Radius extends nyx<Radius> {
        private int a;
        private float b;
        private float c;
        private float d;
        private float e;

        public /* synthetic */ nzf a(nyt nyt) {
            return b(nyt);
        }

        public Radius() {
            d();
        }

        private Radius d() {
            this.a = 0;
            this.b = 0.0f;
            this.c = 0.0f;
            this.d = 0.0f;
            this.e = 0.0f;
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
            super.a(nyu);
        }

        protected int b() {
            int b = super.b();
            if ((this.a & 1) != 0) {
                float f = this.b;
                b += nyu.h(1) + 4;
            }
            if ((this.a & 2) != 0) {
                f = this.c;
                b += nyu.h(2) + 4;
            }
            if ((this.a & 4) != 0) {
                f = this.d;
                b += nyu.h(3) + 4;
            }
            if ((this.a & 8) == 0) {
                return b;
            }
            f = this.e;
            return b + (nyu.h(4) + 4);
        }

        private Radius b(nyt nyt) {
            while (true) {
                int a = nyt.a();
                switch (a) {
                    case wi.w /*0*/:
                        break;
                    case wi.dD /*13*/:
                        this.b = nyt.c();
                        this.a |= 1;
                        continue;
                    case wi.f /*21*/:
                        this.c = nyt.c();
                        this.a |= 2;
                        continue;
                    case 29:
                        this.d = nyt.c();
                        this.a |= 4;
                        continue;
                    case 37:
                        this.e = nyt.c();
                        this.a |= 8;
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

    public final class ViewArgs extends nyx<ViewArgs> {
        public Color a;
        public Radius b;
        public Padding c;
        private int d;
        private float e;
        private float f;
        private String g;
        private boolean h;
        private int i;
        private int j;
        private int k;
        private int l;

        public interface ImportantForAccessibility {
        }

        public interface TextDirection {
        }

        public /* synthetic */ nzf a(nyt nyt) {
            return b(nyt);
        }

        public ViewArgs() {
            d();
        }

        private ViewArgs d() {
            this.d = 0;
            this.a = null;
            this.e = 0.0f;
            this.b = null;
            this.f = 0.0f;
            this.c = null;
            this.g = "";
            this.h = false;
            this.i = 0;
            this.j = 0;
            this.k = 0;
            this.l = 0;
            this.unknownFieldData = null;
            this.cachedSize = -1;
            return this;
        }

        public void a(nyu nyu) {
            if (this.a != null) {
                nyu.b(1, this.a);
            }
            if ((this.d & 1) != 0) {
                nyu.a(2, this.e);
            }
            if ((this.d & 2) != 0) {
                nyu.a(3, this.f);
            }
            if (this.c != null) {
                nyu.b(4, this.c);
            }
            if ((this.d & 4) != 0) {
                nyu.a(5, this.g);
            }
            if ((this.d & 8) != 0) {
                nyu.a(6, this.h);
            }
            if (this.b != null) {
                nyu.b(7, this.b);
            }
            if ((this.d & 16) != 0) {
                nyu.a(8, this.i);
            }
            if ((this.d & 32) != 0) {
                nyu.a(9, this.j);
            }
            if ((this.d & 64) != 0) {
                nyu.a(10, this.k);
            }
            if ((this.d & 128) != 0) {
                nyu.a(11, this.l);
            }
            super.a(nyu);
        }

        protected int b() {
            int b = super.b();
            if (this.a != null) {
                b += nyu.d(1, this.a);
            }
            if ((this.d & 1) != 0) {
                float f = this.e;
                b += nyu.h(2) + 4;
            }
            if ((this.d & 2) != 0) {
                f = this.f;
                b += nyu.h(3) + 4;
            }
            if (this.c != null) {
                b += nyu.d(4, this.c);
            }
            if ((this.d & 4) != 0) {
                b += nyu.b(5, this.g);
            }
            if ((this.d & 8) != 0) {
                boolean z = this.h;
                b += nyu.h(6) + 1;
            }
            if (this.b != null) {
                b += nyu.d(7, this.b);
            }
            if ((this.d & 16) != 0) {
                b += nyu.f(8, this.i);
            }
            if ((this.d & 32) != 0) {
                b += nyu.f(9, this.j);
            }
            if ((this.d & 64) != 0) {
                b += nyu.f(10, this.k);
            }
            if ((this.d & 128) != 0) {
                return b + nyu.f(11, this.l);
            }
            return b;
        }

        private ViewArgs b(nyt nyt) {
            while (true) {
                int a = nyt.a();
                switch (a) {
                    case wi.w /*0*/:
                        break;
                    case wi.dr /*10*/:
                        if (this.a == null) {
                            this.a = new Color();
                        }
                        nyt.a(this.a);
                        continue;
                    case wi.f /*21*/:
                        this.e = nyt.c();
                        this.d |= 1;
                        continue;
                    case 29:
                        this.f = nyt.c();
                        this.d |= 2;
                        continue;
                    case 34:
                        if (this.c == null) {
                            this.c = new Padding();
                        }
                        nyt.a(this.c);
                        continue;
                    case 42:
                        this.g = nyt.j();
                        this.d |= 4;
                        continue;
                    case 48:
                        this.h = nyt.i();
                        this.d |= 8;
                        continue;
                    case 58:
                        if (this.b == null) {
                            this.b = new Radius();
                        }
                        nyt.a(this.b);
                        continue;
                    case 64:
                        a = nyt.f();
                        switch (a) {
                            case wi.w /*0*/:
                            case wi.j /*1*/:
                            case wi.l /*2*/:
                            case wi.z /*3*/:
                                this.i = a;
                                this.d |= 16;
                                break;
                            default:
                                continue;
                        }
                    case 72:
                        this.j = nyt.f();
                        this.d |= 32;
                        continue;
                    case 80:
                        this.k = nyt.f();
                        this.d |= 64;
                        continue;
                    case 88:
                        a = nyt.f();
                        switch (a) {
                            case wi.w /*0*/:
                            case wi.j /*1*/:
                            case wi.l /*2*/:
                            case wi.z /*3*/:
                            case wi.h /*4*/:
                            case wi.p /*5*/:
                            case wi.s /*6*/:
                            case wi.q /*7*/:
                                this.l = a;
                                this.d |= 128;
                                break;
                            default:
                                continue;
                        }
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

    public final class ViewGravitySet extends nyx<ViewGravitySet> {
        public int[] a;

        public interface ViewGravity {
        }

        public /* synthetic */ nzf a(nyt nyt) {
            return b(nyt);
        }

        public ViewGravitySet() {
            d();
        }

        private ViewGravitySet d() {
            this.a = nzl.a;
            this.unknownFieldData = null;
            this.cachedSize = -1;
            return this;
        }

        public void a(nyu nyu) {
            if (this.a != null && this.a.length > 0) {
                for (int a : this.a) {
                    nyu.a(1, a);
                }
            }
            super.a(nyu);
        }

        protected int b() {
            int i = 0;
            int b = super.b();
            if (this.a == null || this.a.length <= 0) {
                return b;
            }
            int i2 = 0;
            while (i < this.a.length) {
                i2 += nyu.g(this.a[i]);
                i++;
            }
            return (b + i2) + (this.a.length * 1);
        }

        private ViewGravitySet b(nyt nyt) {
            while (true) {
                int a = nyt.a();
                int i;
                int i2;
                switch (a) {
                    case wi.w /*0*/:
                        break;
                    case wi.m /*8*/:
                        int b = nzl.b(nyt, 8);
                        Object obj = new int[b];
                        i = 0;
                        i2 = 0;
                        while (i < b) {
                            if (i != 0) {
                                nyt.a();
                            }
                            int f = nyt.f();
                            switch (f) {
                                case wi.w /*0*/:
                                case wi.j /*1*/:
                                case wi.l /*2*/:
                                case wi.z /*3*/:
                                case wi.h /*4*/:
                                case wi.p /*5*/:
                                case wi.s /*6*/:
                                case wi.q /*7*/:
                                case wi.m /*8*/:
                                case wi.n /*9*/:
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
                                Object obj2 = new int[(a + i2)];
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
                    case wi.dr /*10*/:
                        i = nyt.d(nyt.r());
                        i2 = nyt.u();
                        a = 0;
                        while (nyt.s() > 0) {
                            switch (nyt.f()) {
                                case wi.w /*0*/:
                                case wi.j /*1*/:
                                case wi.l /*2*/:
                                case wi.z /*3*/:
                                case wi.h /*4*/:
                                case wi.p /*5*/:
                                case wi.s /*6*/:
                                case wi.q /*7*/:
                                case wi.m /*8*/:
                                case wi.n /*9*/:
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
                            Object obj3 = new int[(a + i2)];
                            if (i2 != 0) {
                                System.arraycopy(this.a, 0, obj3, 0, i2);
                            }
                            while (nyt.s() > 0) {
                                int f2 = nyt.f();
                                switch (f2) {
                                    case wi.w /*0*/:
                                    case wi.j /*1*/:
                                    case wi.l /*2*/:
                                    case wi.z /*3*/:
                                    case wi.h /*4*/:
                                    case wi.p /*5*/:
                                    case wi.s /*6*/:
                                    case wi.q /*7*/:
                                    case wi.m /*8*/:
                                    case wi.n /*9*/:
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
