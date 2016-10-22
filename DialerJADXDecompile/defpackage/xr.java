package defpackage;

import android.content.Context;
import android.os.Parcelable;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.accessibility.AccessibilityEvent;
import java.util.List;

/* compiled from: PG */
/* renamed from: xr */
public final class xr extends yz {
    int a;
    ym b;
    boolean c;
    private xu n;
    private boolean o;
    private boolean p;
    private boolean q;
    private boolean r;
    private int s;
    private int t;
    private xv u;
    private xs v;

    public xr(Context context) {
        this(1, false);
    }

    public xr(int i, boolean z) {
        this.p = false;
        this.c = false;
        this.q = false;
        this.r = true;
        this.s = -1;
        this.t = oe.INVALID_ID;
        this.u = null;
        this.v = new xs(this);
        a(null);
        if (1 != this.a) {
            this.a = 1;
            this.b = null;
            g();
        }
        a(null);
        if (false != this.p) {
            this.p = false;
            g();
        }
        this.h = true;
    }

    public final za a() {
        return new za(-2, -2);
    }

    public final void a(RecyclerView recyclerView, zc zcVar) {
        super.a(recyclerView, zcVar);
    }

    public final void a(AccessibilityEvent accessibilityEvent) {
        int i = -1;
        super.a(accessibilityEvent);
        if (h() > 0) {
            int i2;
            nj a = ml.a(accessibilityEvent);
            View a2 = a(0, h(), false, true);
            if (a2 == null) {
                i2 = -1;
            } else {
                i2 = yz.a(a2);
            }
            a.b(i2);
            a2 = a(h() - 1, -1, false, true);
            if (a2 != null) {
                i = yz.a(a2);
            }
            a.c(i);
        }
    }

    public final Parcelable b() {
        if (this.u != null) {
            return new xv(this.u);
        }
        Parcelable xvVar = new xv();
        if (h() > 0) {
            o();
            boolean z = this.o ^ this.c;
            xvVar.c = z;
            View r;
            if (z) {
                r = r();
                xvVar.b = this.b.c() - this.b.b(r);
                xvVar.a = yz.a(r);
                return xvVar;
            }
            r = q();
            xvVar.a = yz.a(r);
            xvVar.b = this.b.a(r) - this.b.b();
            return xvVar;
        }
        xvVar.a = -1;
        return xvVar;
    }

    public final void a(Parcelable parcelable) {
        if (parcelable instanceof xv) {
            this.u = (xv) parcelable;
            g();
        }
    }

    public final boolean c() {
        return this.a == 0;
    }

    public final boolean d() {
        return this.a == 1;
    }

    private final void m() {
        boolean z = true;
        if (this.a == 1 || !n()) {
            z = this.p;
        } else if (this.p) {
            z = false;
        }
        this.c = z;
    }

    public final View a(int i) {
        int h = h();
        if (h == 0) {
            return null;
        }
        int a = i - yz.a(e(0));
        if (a >= 0 && a < h) {
            View e = e(a);
            if (yz.a(e) == i) {
                return e;
            }
        }
        return super.a(i);
    }

    private int h(zi ziVar) {
        int i;
        if (ziVar.a != -1) {
            i = 1;
        } else {
            i = 0;
        }
        if (i != 0) {
            return this.b.e();
        }
        return 0;
    }

    public final void a(zc zcVar, zi ziVar) {
        if (!(this.u == null && this.s == -1) && ziVar.a() == 0) {
            b(zcVar);
            return;
        }
        int b;
        int e;
        int b2;
        int min;
        int c;
        if (this.u != null && this.u.a()) {
            this.s = this.u.a;
        }
        o();
        this.n.a = false;
        m();
        if (!(this.v.d && this.s == -1 && this.u == null)) {
            Object obj;
            View a;
            this.v.a();
            this.v.c = this.c;
            xs xsVar = this.v;
            if (ziVar.g || this.s == -1) {
                obj = null;
            } else if (this.s < 0 || this.s >= ziVar.a()) {
                this.s = -1;
                this.t = oe.INVALID_ID;
                obj = null;
            } else {
                xsVar.a = this.s;
                if (this.u == null || !this.u.a()) {
                    if (this.t == oe.INVALID_ID) {
                        a = a(this.s);
                        if (a == null) {
                            if (h() > 0) {
                                xsVar.c = (this.s < yz.a(e(0))) == this.c;
                            }
                            xsVar.b();
                        } else if (this.b.e(a) > this.b.e()) {
                            xsVar.b();
                        } else if (this.b.a(a) - this.b.b() < 0) {
                            xsVar.b = this.b.b();
                            xsVar.c = false;
                        } else if (this.b.c() - this.b.b(a) < 0) {
                            xsVar.b = this.b.c();
                            xsVar.c = true;
                        } else {
                            if (xsVar.c) {
                                b = this.b.b(a) + this.b.a();
                            } else {
                                b = this.b.a(a);
                            }
                            xsVar.b = b;
                        }
                        obj = 1;
                    } else {
                        xsVar.c = this.c;
                        if (this.c) {
                            xsVar.b = this.b.c() - this.t;
                        } else {
                            xsVar.b = this.b.b() + this.t;
                        }
                    }
                    obj = 1;
                } else {
                    xsVar.c = this.u.c;
                    if (xsVar.c) {
                        xsVar.b = this.b.c() - this.u.b;
                    } else {
                        xsVar.b = this.b.b() + this.u.b;
                    }
                    obj = 1;
                }
            }
            if (obj == null) {
                if (h() != 0) {
                    View view;
                    if (this.e == null) {
                        view = null;
                    } else {
                        a = this.e.getFocusedChild();
                        view = (a == null || this.d.d(a)) ? null : a;
                    }
                    if (view != null) {
                        za zaVar = (za) view.getLayoutParams();
                        if (zaVar.a.m() || zaVar.a.c() < 0 || zaVar.a.c() >= ziVar.a()) {
                            obj = null;
                        } else {
                            obj = 1;
                        }
                        if (obj != null) {
                            b = xsVar.e.b.a();
                            if (b >= 0) {
                                xsVar.a(view);
                            } else {
                                xsVar.a = yz.a(view);
                                if (xsVar.c) {
                                    b = (xsVar.e.b.c() - b) - xsVar.e.b.b(view);
                                    xsVar.b = xsVar.e.b.c() - b;
                                    if (b > 0) {
                                        e = xsVar.b - xsVar.e.b.e(view);
                                        b2 = xsVar.e.b.b();
                                        min = e - (Math.min(xsVar.e.b.a(view) - b2, 0) + b2);
                                        if (min < 0) {
                                            xsVar.b = Math.min(b, -min) + xsVar.b;
                                        }
                                    }
                                } else {
                                    e = xsVar.e.b.a(view);
                                    b2 = e - xsVar.e.b.b();
                                    xsVar.b = e;
                                    if (b2 > 0) {
                                        b = (xsVar.e.b.c() - Math.min(0, (xsVar.e.b.c() - b) - xsVar.e.b.b(view))) - (e + xsVar.e.b.e(view));
                                        if (b < 0) {
                                            xsVar.b -= Math.min(b2, -b);
                                        }
                                    }
                                }
                            }
                            obj = 1;
                            if (obj == null) {
                                xsVar.b();
                                xsVar.a = 0;
                            }
                        }
                    }
                    if (!this.o) {
                        if (xsVar.c) {
                            a = b(zcVar, ziVar);
                        } else {
                            a = c(zcVar, ziVar);
                        }
                        if (a != null) {
                            xsVar.a(a);
                            if (!ziVar.g && f()) {
                                obj = (this.b.a(a) >= this.b.c() || this.b.b(a) < this.b.b()) ? 1 : null;
                                if (obj != null) {
                                    if (xsVar.c) {
                                        b = this.b.c();
                                    } else {
                                        b = this.b.b();
                                    }
                                    xsVar.b = b;
                                }
                            }
                            obj = 1;
                            if (obj == null) {
                                xsVar.b();
                                xsVar.a = 0;
                            }
                        }
                    }
                }
                obj = null;
                if (obj == null) {
                    xsVar.b();
                    xsVar.a = 0;
                }
            }
            this.v.d = true;
        }
        b = h(ziVar);
        if (this.n.i >= 0) {
            min = 0;
        } else {
            min = b;
            b = 0;
        }
        min += this.b.b();
        b += this.b.f();
        if (!(!ziVar.g || this.s == -1 || this.t == oe.INVALID_ID)) {
            View a2 = a(this.s);
            if (a2 != null) {
                if (this.c) {
                    c = (this.b.c() - this.b.b(a2)) - this.t;
                } else {
                    c = this.t - (this.b.a(a2) - this.b.b());
                }
                if (c > 0) {
                    min += c;
                } else {
                    b -= c;
                }
            }
        }
        for (c = h() - 1; c >= 0; c--) {
            View e2 = e(c);
            zk b3 = RecyclerView.b(e2);
            if (!b3.b()) {
                if (!b3.j() || b3.m() || this.e.j.b) {
                    d(c);
                    zcVar.c(e2);
                    this.e.f.c(b3);
                } else {
                    c(c);
                    zcVar.a(b3);
                }
            }
        }
        this.n.k = p();
        if (this.v.c) {
            b(this.v);
            this.n.h = min;
            a(zcVar, this.n, ziVar, false);
            min = this.n.b;
            e = this.n.d;
            if (this.n.c > 0) {
                b += this.n.c;
            }
            a(this.v);
            this.n.h = b;
            xu xuVar = this.n;
            xuVar.d += this.n.e;
            a(zcVar, this.n, ziVar, false);
            c = this.n.b;
            if (this.n.c > 0) {
                b = this.n.c;
                e(e, min);
                this.n.h = b;
                a(zcVar, this.n, ziVar, false);
                b = this.n.b;
            } else {
                b = min;
            }
            min = b;
            b = c;
        } else {
            a(this.v);
            this.n.h = b;
            a(zcVar, this.n, ziVar, false);
            b = this.n.b;
            c = this.n.d;
            if (this.n.c > 0) {
                min += this.n.c;
            }
            b(this.v);
            this.n.h = min;
            xu xuVar2 = this.n;
            xuVar2.d += this.n.e;
            a(zcVar, this.n, ziVar, false);
            min = this.n.b;
            if (this.n.c > 0) {
                e = this.n.c;
                d(c, b);
                this.n.h = e;
                a(zcVar, this.n, ziVar, false);
                b = this.n.b;
            }
        }
        if (h() <= 0) {
            c = min;
            min = b;
        } else if (this.c) {
            c = a(b, zcVar, ziVar, true);
            min += c;
            b += c;
            c = b(min, zcVar, ziVar, false);
            b += c;
            c = min + c;
            min = b;
        } else {
            c = b(min, zcVar, ziVar, true);
            min += c;
            b += c;
            c = a(b, zcVar, ziVar, false);
            b += c;
            c = min + c;
            min = b;
        }
        if (ziVar.i && h() != 0 && !ziVar.g && f()) {
            int i = 0;
            b2 = 0;
            List list = zcVar.d;
            int size = list.size();
            int a3 = yz.a(e(0));
            int i2 = 0;
            while (i2 < size) {
                zk zkVar = (zk) list.get(i2);
                if (zkVar.m()) {
                    b = b2;
                    e = i;
                } else {
                    if (((zkVar.c() < a3) != this.c ? -1 : 1) == -1) {
                        e = this.b.e(zkVar.a) + i;
                        b = b2;
                    } else {
                        b = this.b.e(zkVar.a) + b2;
                        e = i;
                    }
                }
                i2++;
                i = e;
                b2 = b;
            }
            this.n.j = list;
            if (i > 0) {
                e(yz.a(q()), c);
                this.n.h = i;
                this.n.c = 0;
                this.n.a(null);
                a(zcVar, this.n, ziVar, false);
            }
            if (b2 > 0) {
                d(yz.a(r()), min);
                this.n.h = b2;
                this.n.c = 0;
                this.n.a(null);
                a(zcVar, this.n, ziVar, false);
            }
            this.n.j = null;
        }
        if (ziVar.g) {
            this.v.a();
        } else {
            ym ymVar = this.b;
            ymVar.b = ymVar.e();
        }
        this.o = false;
    }

    public final void a(zi ziVar) {
        super.a(ziVar);
        this.u = null;
        this.s = -1;
        this.t = oe.INVALID_ID;
        this.v.a();
    }

    private final int a(int i, zc zcVar, zi ziVar, boolean z) {
        int c = this.b.c() - i;
        if (c <= 0) {
            return 0;
        }
        c = -d(-c, zcVar, ziVar);
        int i2 = i + c;
        if (!z) {
            return c;
        }
        i2 = this.b.c() - i2;
        if (i2 <= 0) {
            return c;
        }
        this.b.a(i2);
        return c + i2;
    }

    private final int b(int i, zc zcVar, zi ziVar, boolean z) {
        int b = i - this.b.b();
        if (b <= 0) {
            return 0;
        }
        b = -d(b, zcVar, ziVar);
        int i2 = i + b;
        if (!z) {
            return b;
        }
        i2 -= this.b.b();
        if (i2 <= 0) {
            return b;
        }
        this.b.a(-i2);
        return b - i2;
    }

    private final void a(xs xsVar) {
        d(xsVar.a, xsVar.b);
    }

    private final void d(int i, int i2) {
        this.n.c = this.b.c() - i2;
        this.n.e = this.c ? -1 : 1;
        this.n.d = i;
        this.n.f = 1;
        this.n.b = i2;
        this.n.g = oe.INVALID_ID;
    }

    private final void b(xs xsVar) {
        e(xsVar.a, xsVar.b);
    }

    private final void e(int i, int i2) {
        this.n.c = i2 - this.b.b();
        this.n.d = i;
        this.n.e = this.c ? 1 : -1;
        this.n.f = -1;
        this.n.b = i2;
        this.n.g = oe.INVALID_ID;
    }

    private boolean n() {
        return kn.f(this.e) == 1;
    }

    private void o() {
        if (this.n == null) {
            this.n = new xu();
        }
        if (this.b == null) {
            ym ynVar;
            switch (this.a) {
                case rl.c /*0*/:
                    ynVar = new yn(this);
                    break;
                case rq.b /*1*/:
                    ynVar = new yo(this);
                    break;
                default:
                    throw new IllegalArgumentException("invalid orientation");
            }
            this.b = ynVar;
        }
    }

    public final void b(int i) {
        this.s = i;
        this.t = oe.INVALID_ID;
        if (this.u != null) {
            this.u.a = -1;
        }
        g();
    }

    public final int a(int i, zc zcVar, zi ziVar) {
        if (this.a == 1) {
            return 0;
        }
        return d(i, zcVar, ziVar);
    }

    public final int b(int i, zc zcVar, zi ziVar) {
        if (this.a == 0) {
            return 0;
        }
        return d(i, zcVar, ziVar);
    }

    public final int b(zi ziVar) {
        return i(ziVar);
    }

    public final int c(zi ziVar) {
        return i(ziVar);
    }

    public final int d(zi ziVar) {
        return j(ziVar);
    }

    public final int e(zi ziVar) {
        return j(ziVar);
    }

    public final int f(zi ziVar) {
        return k(ziVar);
    }

    public final int g(zi ziVar) {
        return k(ziVar);
    }

    private final int i(zi ziVar) {
        boolean z = false;
        if (h() == 0) {
            return 0;
        }
        o();
        ym ymVar = this.b;
        View a = a(!this.r, true);
        if (!this.r) {
            z = true;
        }
        return buf.a(ziVar, ymVar, a, b(z, true), (yz) this, this.r, this.c);
    }

    private final int j(zi ziVar) {
        boolean z = false;
        if (h() == 0) {
            return 0;
        }
        o();
        ym ymVar = this.b;
        View a = a(!this.r, true);
        if (!this.r) {
            z = true;
        }
        return buf.a(ziVar, ymVar, a, b(z, true), (yz) this, this.r);
    }

    private final int k(zi ziVar) {
        boolean z = false;
        if (h() == 0) {
            return 0;
        }
        o();
        ym ymVar = this.b;
        View a = a(!this.r, true);
        if (!this.r) {
            z = true;
        }
        return buf.b(ziVar, ymVar, a, b(z, true), this, this.r);
    }

    private final void a(int i, int i2, boolean z, zi ziVar) {
        int i3 = -1;
        int i4 = 1;
        this.n.k = p();
        this.n.h = h(ziVar);
        this.n.f = i;
        View r;
        xu xuVar;
        if (i == 1) {
            xu xuVar2 = this.n;
            xuVar2.h += this.b.f();
            r = r();
            xuVar = this.n;
            if (!this.c) {
                i3 = 1;
            }
            xuVar.e = i3;
            this.n.d = yz.a(r) + this.n.e;
            this.n.b = this.b.b(r);
            i3 = this.b.b(r) - this.b.c();
        } else {
            r = q();
            xuVar = this.n;
            xuVar.h += this.b.b();
            xuVar = this.n;
            if (!this.c) {
                i4 = -1;
            }
            xuVar.e = i4;
            this.n.d = yz.a(r) + this.n.e;
            this.n.b = this.b.a(r);
            i3 = (-this.b.a(r)) + this.b.b();
        }
        this.n.c = i2;
        if (z) {
            xu xuVar3 = this.n;
            xuVar3.c -= i3;
        }
        this.n.g = i3;
    }

    private boolean p() {
        return this.b.g() == 0 && this.b.d() == 0;
    }

    private int d(int i, zc zcVar, zi ziVar) {
        if (h() == 0 || i == 0) {
            return 0;
        }
        this.n.a = true;
        o();
        int i2 = i > 0 ? 1 : -1;
        int abs = Math.abs(i);
        a(i2, abs, true, ziVar);
        int a = this.n.g + a(zcVar, this.n, ziVar, false);
        if (a < 0) {
            return 0;
        }
        if (abs > a) {
            i = i2 * a;
        }
        this.b.a(-i);
        this.n.i = i;
        return i;
    }

    public final void a(String str) {
        if (this.u == null) {
            super.a(str);
        }
    }

    private final void a(zc zcVar, int i, int i2) {
        if (i != i2) {
            if (i2 > i) {
                for (int i3 = i2 - 1; i3 >= i; i3--) {
                    a(i3, zcVar);
                }
                return;
            }
            while (i > i2) {
                a(i, zcVar);
                i--;
            }
        }
    }

    private final void a(zc zcVar, xu xuVar) {
        if (xuVar.a && !xuVar.k) {
            int i;
            int h;
            int d;
            View e;
            View e2;
            if (xuVar.f == -1) {
                i = xuVar.g;
                h = h();
                if (i >= 0) {
                    d = this.b.d() - i;
                    if (this.c) {
                        for (i = 0; i < h; i++) {
                            e = e(i);
                            if (this.b.a(e) < d || this.b.d(e) < d) {
                                a(zcVar, 0, i);
                                return;
                            }
                        }
                        return;
                    }
                    for (i = h - 1; i >= 0; i--) {
                        e2 = e(i);
                        if (this.b.a(e2) < d || this.b.d(e2) < d) {
                            a(zcVar, h - 1, i);
                            return;
                        }
                    }
                    return;
                }
                return;
            }
            h = xuVar.g;
            if (h >= 0) {
                d = h();
                if (this.c) {
                    for (i = d - 1; i >= 0; i--) {
                        e2 = e(i);
                        if (this.b.b(e2) > h || this.b.c(e2) > h) {
                            a(zcVar, d - 1, i);
                            return;
                        }
                    }
                    return;
                }
                for (i = 0; i < d; i++) {
                    e = e(i);
                    if (this.b.b(e) > h || this.b.c(e) > h) {
                        a(zcVar, 0, i);
                        return;
                    }
                }
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int a(defpackage.zc r16, defpackage.xu r17, defpackage.zi r18, boolean r19) {
        /*
        r15 = this;
        r0 = r17;
        r10 = r0.c;
        r0 = r17;
        r2 = r0.g;
        r3 = -2147483648; // 0xffffffff80000000 float:-0.0 double:NaN;
        if (r2 == r3) goto L_0x0022;
    L_0x000c:
        r0 = r17;
        r2 = r0.c;
        if (r2 >= 0) goto L_0x001f;
    L_0x0012:
        r0 = r17;
        r2 = r0.g;
        r0 = r17;
        r3 = r0.c;
        r2 = r2 + r3;
        r0 = r17;
        r0.g = r2;
    L_0x001f:
        r15.a(r16, r17);
    L_0x0022:
        r0 = r17;
        r2 = r0.c;
        r0 = r17;
        r3 = r0.h;
        r2 = r2 + r3;
        r11 = new xt;
        r11.<init>();
        r4 = r2;
    L_0x0031:
        r0 = r17;
        r2 = r0.k;
        if (r2 != 0) goto L_0x0039;
    L_0x0037:
        if (r4 <= 0) goto L_0x00fd;
    L_0x0039:
        r0 = r17;
        r2 = r0.d;
        if (r2 < 0) goto L_0x0104;
    L_0x003f:
        r0 = r17;
        r2 = r0.d;
        r3 = r18.a();
        if (r2 >= r3) goto L_0x0104;
    L_0x0049:
        r2 = 1;
    L_0x004a:
        if (r2 == 0) goto L_0x00fd;
    L_0x004c:
        r2 = 0;
        r11.a = r2;
        r2 = 0;
        r11.b = r2;
        r2 = 0;
        r11.c = r2;
        r2 = 0;
        r11.d = r2;
        r0 = r17;
        r2 = r0.j;
        if (r2 == 0) goto L_0x010f;
    L_0x005e:
        r0 = r17;
        r2 = r0.j;
        r6 = r2.size();
        r2 = 0;
        r5 = r2;
    L_0x0068:
        if (r5 >= r6) goto L_0x010c;
    L_0x006a:
        r0 = r17;
        r2 = r0.j;
        r2 = r2.get(r5);
        r2 = (defpackage.zk) r2;
        r3 = r2.a;
        r2 = r3.getLayoutParams();
        r2 = (defpackage.za) r2;
        r7 = r2.a;
        r7 = r7.m();
        if (r7 != 0) goto L_0x0107;
    L_0x0084:
        r0 = r17;
        r7 = r0.d;
        r2 = r2.a;
        r2 = r2.c();
        if (r7 != r2) goto L_0x0107;
    L_0x0090:
        r0 = r17;
        r0.a(r3);
        r9 = r3;
    L_0x0096:
        if (r9 != 0) goto L_0x043d;
    L_0x0098:
        r2 = 1;
        r11.b = r2;
    L_0x009b:
        r2 = r11.b;
        if (r2 != 0) goto L_0x00fd;
    L_0x009f:
        r0 = r17;
        r2 = r0.b;
        r3 = r11.a;
        r0 = r17;
        r5 = r0.f;
        r3 = r3 * r5;
        r2 = r2 + r3;
        r0 = r17;
        r0.b = r2;
        r2 = r11.c;
        if (r2 == 0) goto L_0x00bf;
    L_0x00b3:
        r2 = r15.n;
        r2 = r2.j;
        if (r2 != 0) goto L_0x00bf;
    L_0x00b9:
        r0 = r18;
        r2 = r0.g;
        if (r2 != 0) goto L_0x05cb;
    L_0x00bf:
        r0 = r17;
        r2 = r0.c;
        r3 = r11.a;
        r2 = r2 - r3;
        r0 = r17;
        r0.c = r2;
        r2 = r11.a;
        r2 = r4 - r2;
    L_0x00ce:
        r0 = r17;
        r3 = r0.g;
        r4 = -2147483648; // 0xffffffff80000000 float:-0.0 double:NaN;
        if (r3 == r4) goto L_0x00f7;
    L_0x00d6:
        r0 = r17;
        r3 = r0.g;
        r4 = r11.a;
        r3 = r3 + r4;
        r0 = r17;
        r0.g = r3;
        r0 = r17;
        r3 = r0.c;
        if (r3 >= 0) goto L_0x00f4;
    L_0x00e7:
        r0 = r17;
        r3 = r0.g;
        r0 = r17;
        r4 = r0.c;
        r3 = r3 + r4;
        r0 = r17;
        r0.g = r3;
    L_0x00f4:
        r15.a(r16, r17);
    L_0x00f7:
        if (r19 == 0) goto L_0x05c8;
    L_0x00f9:
        r3 = r11.d;
        if (r3 == 0) goto L_0x05c8;
    L_0x00fd:
        r0 = r17;
        r2 = r0.c;
        r2 = r10 - r2;
        return r2;
    L_0x0104:
        r2 = 0;
        goto L_0x004a;
    L_0x0107:
        r2 = r5 + 1;
        r5 = r2;
        goto L_0x0068;
    L_0x010c:
        r2 = 0;
        r9 = r2;
        goto L_0x0096;
    L_0x010f:
        r0 = r17;
        r7 = r0.d;
        if (r7 < 0) goto L_0x0121;
    L_0x0115:
        r0 = r16;
        r2 = r0.e;
        r2 = r2.A;
        r2 = r2.a();
        if (r7 < r2) goto L_0x0154;
    L_0x0121:
        r2 = new java.lang.IndexOutOfBoundsException;
        r3 = new java.lang.StringBuilder;
        r4 = "Invalid item position ";
        r3.<init>(r4);
        r3 = r3.append(r7);
        r4 = "(";
        r3 = r3.append(r4);
        r3 = r3.append(r7);
        r4 = "). Item count:";
        r3 = r3.append(r4);
        r0 = r16;
        r4 = r0.e;
        r4 = r4.A;
        r4 = r4.a();
        r3 = r3.append(r4);
        r3 = r3.toString();
        r2.<init>(r3);
        throw r2;
    L_0x0154:
        r3 = 0;
        r2 = 0;
        r0 = r16;
        r5 = r0.e;
        r5 = r5.A;
        r5 = r5.g;
        if (r5 == 0) goto L_0x016c;
    L_0x0160:
        r0 = r16;
        r3 = r0.b(r7);
        if (r3 == 0) goto L_0x01f8;
    L_0x0168:
        r2 = 1;
    L_0x0169:
        r14 = r3;
        r3 = r2;
        r2 = r14;
    L_0x016c:
        if (r2 != 0) goto L_0x01a5;
    L_0x016e:
        r2 = -1;
        r5 = 0;
        r0 = r16;
        r2 = r0.a(r7, r2, r5);
        if (r2 == 0) goto L_0x01a5;
    L_0x0178:
        r5 = r2.m();
        if (r5 == 0) goto L_0x01fb;
    L_0x017e:
        r0 = r16;
        r5 = r0.e;
        r5 = r5.A;
        r5 = r5.g;
    L_0x0186:
        if (r5 != 0) goto L_0x026f;
    L_0x0188:
        r5 = 4;
        r2.b(r5);
        r5 = r2.e();
        if (r5 == 0) goto L_0x0264;
    L_0x0192:
        r0 = r16;
        r5 = r0.e;
        r6 = r2.a;
        r8 = 0;
        r5.removeDetachedView(r6, r8);
        r2.f();
    L_0x019f:
        r0 = r16;
        r0.a(r2);
        r2 = 0;
    L_0x01a5:
        if (r2 != 0) goto L_0x05d5;
    L_0x01a7:
        r0 = r16;
        r5 = r0.e;
        r5 = r5.d;
        r5 = r5.c(r7);
        if (r5 < 0) goto L_0x01bf;
    L_0x01b3:
        r0 = r16;
        r6 = r0.e;
        r6 = r6.j;
        r6 = r6.a();
        if (r5 < r6) goto L_0x0272;
    L_0x01bf:
        r2 = new java.lang.IndexOutOfBoundsException;
        r3 = new java.lang.StringBuilder;
        r4 = "Inconsistency detected. Invalid item position ";
        r3.<init>(r4);
        r3 = r3.append(r7);
        r4 = "(offset:";
        r3 = r3.append(r4);
        r3 = r3.append(r5);
        r4 = ").";
        r3 = r3.append(r4);
        r4 = "state:";
        r3 = r3.append(r4);
        r0 = r16;
        r4 = r0.e;
        r4 = r4.A;
        r4 = r4.a();
        r3 = r3.append(r4);
        r3 = r3.toString();
        r2.<init>(r3);
        throw r2;
    L_0x01f8:
        r2 = 0;
        goto L_0x0169;
    L_0x01fb:
        r5 = r2.b;
        if (r5 < 0) goto L_0x020d;
    L_0x01ff:
        r5 = r2.b;
        r0 = r16;
        r6 = r0.e;
        r6 = r6.j;
        r6 = r6.a();
        if (r5 < r6) goto L_0x0222;
    L_0x020d:
        r3 = new java.lang.IndexOutOfBoundsException;
        r4 = new java.lang.StringBuilder;
        r5 = "Inconsistency detected. Invalid view holder adapter position";
        r4.<init>(r5);
        r2 = r4.append(r2);
        r2 = r2.toString();
        r3.<init>(r2);
        throw r3;
    L_0x0222:
        r0 = r16;
        r5 = r0.e;
        r5 = r5.A;
        r5 = r5.g;
        if (r5 != 0) goto L_0x023f;
    L_0x022c:
        r0 = r16;
        r5 = r0.e;
        r5 = r5.j;
        r6 = r2.b;
        r5 = r5.a(r6);
        r6 = r2.e;
        if (r5 == r6) goto L_0x023f;
    L_0x023c:
        r5 = 0;
        goto L_0x0186;
    L_0x023f:
        r0 = r16;
        r5 = r0.e;
        r5 = r5.j;
        r5 = r5.b;
        if (r5 == 0) goto L_0x0261;
    L_0x0249:
        r8 = r2.d;
        r0 = r16;
        r5 = r0.e;
        r5 = r5.j;
        r6 = r2.b;
        r12 = r5.b(r6);
        r5 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1));
        if (r5 != 0) goto L_0x025e;
    L_0x025b:
        r5 = 1;
        goto L_0x0186;
    L_0x025e:
        r5 = 0;
        goto L_0x0186;
    L_0x0261:
        r5 = 1;
        goto L_0x0186;
    L_0x0264:
        r5 = r2.g();
        if (r5 == 0) goto L_0x019f;
    L_0x026a:
        r2.h();
        goto L_0x019f;
    L_0x026f:
        r3 = 1;
        goto L_0x01a5;
    L_0x0272:
        r0 = r16;
        r6 = r0.e;
        r6 = r6.j;
        r6 = r6.a(r5);
        r0 = r16;
        r8 = r0.e;
        r8 = r8.j;
        r8 = r8.b;
        if (r8 == 0) goto L_0x05d2;
    L_0x0286:
        r0 = r16;
        r2 = r0.e;
        r2 = r2.j;
        r8 = r2.b(r5);
        r2 = 0;
        r0 = r16;
        r2 = r0.a(r8, r6, r2);
        if (r2 == 0) goto L_0x05d2;
    L_0x0299:
        r2.b = r5;
        r3 = 1;
        r5 = r3;
    L_0x029d:
        if (r2 != 0) goto L_0x02dc;
    L_0x029f:
        r2 = r16.c();
        r2 = r2.a;
        r2 = r2.get(r6);
        r2 = (java.util.ArrayList) r2;
        if (r2 == 0) goto L_0x0394;
    L_0x02ad:
        r3 = r2.isEmpty();
        if (r3 != 0) goto L_0x0394;
    L_0x02b3:
        r3 = r2.size();
        r8 = r3 + -1;
        r3 = r2.get(r8);
        r3 = (defpackage.zk) r3;
        r2.remove(r8);
    L_0x02c2:
        if (r3 == 0) goto L_0x02db;
    L_0x02c4:
        r3.q();
        r2 = android.support.v7.widget.RecyclerView.a;
        if (r2 == 0) goto L_0x02db;
    L_0x02cb:
        r2 = r3.a;
        r2 = r2 instanceof android.view.ViewGroup;
        if (r2 == 0) goto L_0x02db;
    L_0x02d1:
        r2 = r3.a;
        r2 = (android.view.ViewGroup) r2;
        r8 = 0;
        r0 = r16;
        r0.a(r2, r8);
    L_0x02db:
        r2 = r3;
    L_0x02dc:
        if (r2 != 0) goto L_0x05ce;
    L_0x02de:
        r0 = r16;
        r2 = r0.e;
        r2 = r2.j;
        r0 = r16;
        r3 = r0.e;
        r8 = "RV CreateView";
        defpackage.buf.d(r8);
        r2 = r2.a(r3, r6);
        r2.e = r6;
        defpackage.buf.d();
        r6 = r5;
        r5 = r2;
    L_0x02f8:
        if (r6 == 0) goto L_0x034e;
    L_0x02fa:
        r0 = r16;
        r2 = r0.e;
        r2 = r2.A;
        r2 = r2.g;
        if (r2 != 0) goto L_0x034e;
    L_0x0304:
        r2 = 8192; // 0x2000 float:1.14794E-41 double:4.0474E-320;
        r2 = r5.a(r2);
        if (r2 == 0) goto L_0x034e;
    L_0x030c:
        r2 = 0;
        r3 = 8192; // 0x2000 float:1.14794E-41 double:4.0474E-320;
        r5.a(r2, r3);
        r0 = r16;
        r2 = r0.e;
        r2 = r2.A;
        r2 = r2.h;
        if (r2 == 0) goto L_0x034e;
    L_0x031c:
        defpackage.yv.d(r5);
        r0 = r16;
        r2 = r0.e;
        r2 = r2.y;
        r0 = r16;
        r2 = r0.e;
        r2 = r2.A;
        r5.p();
        r2 = new yx;
        r2.<init>();
        r3 = r5.a;
        r8 = r3.getLeft();
        r2.a = r8;
        r8 = r3.getTop();
        r2.b = r8;
        r3.getRight();
        r3.getBottom();
        r0 = r16;
        r3 = r0.e;
        r3.a(r5, r2);
    L_0x034e:
        r2 = 0;
        r0 = r16;
        r3 = r0.e;
        r3 = r3.A;
        r3 = r3.g;
        if (r3 == 0) goto L_0x0397;
    L_0x0359:
        r3 = r5.l();
        if (r3 == 0) goto L_0x0397;
    L_0x035f:
        r5.f = r7;
        r3 = r2;
    L_0x0362:
        r2 = r5.a;
        r2 = r2.getLayoutParams();
        if (r2 != 0) goto L_0x041b;
    L_0x036a:
        r0 = r16;
        r2 = r0.e;
        r2 = r2.generateDefaultLayoutParams();
        r2 = (defpackage.za) r2;
        r7 = r5.a;
        r7.setLayoutParams(r2);
    L_0x0379:
        r2.a = r5;
        if (r6 == 0) goto L_0x043a;
    L_0x037d:
        if (r3 == 0) goto L_0x043a;
    L_0x037f:
        r3 = 1;
    L_0x0380:
        r2.d = r3;
        r2 = r5.a;
        r0 = r17;
        r3 = r0.d;
        r0 = r17;
        r5 = r0.e;
        r3 = r3 + r5;
        r0 = r17;
        r0.d = r3;
        r9 = r2;
        goto L_0x0096;
    L_0x0394:
        r3 = 0;
        goto L_0x02c2;
    L_0x0397:
        r3 = r5.l();
        if (r3 == 0) goto L_0x03a9;
    L_0x039d:
        r3 = r5.k();
        if (r3 != 0) goto L_0x03a9;
    L_0x03a3:
        r3 = r5.j();
        if (r3 == 0) goto L_0x0418;
    L_0x03a9:
        r0 = r16;
        r2 = r0.e;
        r2 = r2.d;
        r2 = r2.c(r7);
        r0 = r16;
        r3 = r0.e;
        r5.m = r3;
        r0 = r16;
        r3 = r0.e;
        r3 = r3.j;
        r5.b = r2;
        r8 = r3.b;
        if (r8 == 0) goto L_0x03cb;
    L_0x03c5:
        r8 = r3.b(r2);
        r5.d = r8;
    L_0x03cb:
        r8 = 1;
        r9 = 519; // 0x207 float:7.27E-43 double:2.564E-321;
        r5.a(r8, r9);
        r8 = "RV OnBindView";
        defpackage.buf.d(r8);
        r5.p();
        r3.a(r5, r2);
        r5.o();
        defpackage.buf.d();
        r2 = r5.a;
        r0 = r16;
        r3 = r0.e;
        r3 = r3.i();
        if (r3 == 0) goto L_0x040b;
    L_0x03ee:
        r3 = defpackage.kn.d(r2);
        if (r3 != 0) goto L_0x03f8;
    L_0x03f4:
        r3 = 1;
        defpackage.kn.c(r2, r3);
    L_0x03f8:
        r3 = defpackage.kn.a;
        r3 = r3.k(r2);
        if (r3 != 0) goto L_0x040b;
    L_0x0400:
        r0 = r16;
        r3 = r0.e;
        r3 = r3.E;
        r3 = r3.b;
        defpackage.kn.a(r2, r3);
    L_0x040b:
        r2 = 1;
        r0 = r16;
        r3 = r0.e;
        r3 = r3.A;
        r3 = r3.g;
        if (r3 == 0) goto L_0x0418;
    L_0x0416:
        r5.f = r7;
    L_0x0418:
        r3 = r2;
        goto L_0x0362;
    L_0x041b:
        r0 = r16;
        r7 = r0.e;
        r7 = r7.checkLayoutParams(r2);
        if (r7 != 0) goto L_0x0436;
    L_0x0425:
        r0 = r16;
        r7 = r0.e;
        r2 = r7.generateLayoutParams(r2);
        r2 = (defpackage.za) r2;
        r7 = r5.a;
        r7.setLayoutParams(r2);
        goto L_0x0379;
    L_0x0436:
        r2 = (defpackage.za) r2;
        goto L_0x0379;
    L_0x043a:
        r3 = 0;
        goto L_0x0380;
    L_0x043d:
        r2 = r9.getLayoutParams();
        r2 = (defpackage.za) r2;
        r0 = r17;
        r3 = r0.j;
        if (r3 != 0) goto L_0x0558;
    L_0x0449:
        r5 = r15.c;
        r0 = r17;
        r3 = r0.f;
        r6 = -1;
        if (r3 != r6) goto L_0x054e;
    L_0x0452:
        r3 = 1;
    L_0x0453:
        if (r5 != r3) goto L_0x0551;
    L_0x0455:
        r3 = -1;
        r5 = 0;
        super.a(r9, r3, r5);
    L_0x045a:
        r3 = r9.getLayoutParams();
        r3 = (defpackage.za) r3;
        r5 = r15.e;
        r5 = r5.d(r9);
        r6 = r5.left;
        r7 = r5.right;
        r6 = r6 + r7;
        r6 = r6 + 0;
        r7 = r5.top;
        r5 = r5.bottom;
        r5 = r5 + r7;
        r5 = r5 + 0;
        r7 = r15.l;
        r8 = r15.j;
        r12 = r15.i();
        r13 = r15.k();
        r12 = r12 + r13;
        r13 = r3.leftMargin;
        r12 = r12 + r13;
        r13 = r3.rightMargin;
        r12 = r12 + r13;
        r6 = r6 + r12;
        r12 = r3.width;
        r13 = r15.c();
        r6 = defpackage.yz.a(r7, r8, r6, r12, r13);
        r7 = r15.m;
        r8 = r15.k;
        r12 = r15.j();
        r13 = r15.l();
        r12 = r12 + r13;
        r13 = r3.topMargin;
        r12 = r12 + r13;
        r13 = r3.bottomMargin;
        r12 = r12 + r13;
        r5 = r5 + r12;
        r12 = r3.height;
        r13 = r15.d();
        r5 = defpackage.yz.a(r7, r8, r5, r12, r13);
        r7 = r9.isLayoutRequested();
        if (r7 != 0) goto L_0x04d2;
    L_0x04b6:
        r7 = r15.i;
        if (r7 == 0) goto L_0x04d2;
    L_0x04ba:
        r7 = r9.getWidth();
        r8 = r3.width;
        r7 = defpackage.yz.b(r7, r6, r8);
        if (r7 == 0) goto L_0x04d2;
    L_0x04c6:
        r7 = r9.getHeight();
        r3 = r3.height;
        r3 = defpackage.yz.b(r7, r5, r3);
        if (r3 != 0) goto L_0x0574;
    L_0x04d2:
        r3 = 1;
    L_0x04d3:
        if (r3 == 0) goto L_0x04d8;
    L_0x04d5:
        r9.measure(r6, r5);
    L_0x04d8:
        r3 = r15.b;
        r3 = r3.e(r9);
        r11.a = r3;
        r3 = r15.a;
        r5 = 1;
        if (r3 != r5) goto L_0x0594;
    L_0x04e5:
        r3 = r15.n();
        if (r3 == 0) goto L_0x0577;
    L_0x04eb:
        r3 = r15.l;
        r5 = r15.k();
        r3 = r3 - r5;
        r5 = r15.b;
        r5 = r5.f(r9);
        r5 = r3 - r5;
    L_0x04fa:
        r0 = r17;
        r6 = r0.f;
        r7 = -1;
        if (r6 != r7) goto L_0x0584;
    L_0x0501:
        r0 = r17;
        r6 = r0.b;
        r0 = r17;
        r7 = r0.b;
        r8 = r11.a;
        r7 = r7 - r8;
        r8 = r5;
        r5 = r6;
        r6 = r3;
    L_0x050f:
        r3 = r9.getLayoutParams();
        r3 = (defpackage.za) r3;
        r12 = r3.b;
        r13 = r12.left;
        r8 = r8 + r13;
        r13 = r3.leftMargin;
        r8 = r8 + r13;
        r13 = r12.top;
        r7 = r7 + r13;
        r13 = r3.topMargin;
        r7 = r7 + r13;
        r13 = r12.right;
        r6 = r6 - r13;
        r13 = r3.rightMargin;
        r6 = r6 - r13;
        r12 = r12.bottom;
        r5 = r5 - r12;
        r3 = r3.bottomMargin;
        r3 = r5 - r3;
        r9.layout(r8, r7, r6, r3);
        r3 = r2.a;
        r3 = r3.m();
        if (r3 != 0) goto L_0x0543;
    L_0x053b:
        r2 = r2.a;
        r2 = r2.s();
        if (r2 == 0) goto L_0x0546;
    L_0x0543:
        r2 = 1;
        r11.c = r2;
    L_0x0546:
        r2 = r9.isFocusable();
        r11.d = r2;
        goto L_0x009b;
    L_0x054e:
        r3 = 0;
        goto L_0x0453;
    L_0x0551:
        r3 = 0;
        r5 = 0;
        super.a(r9, r3, r5);
        goto L_0x045a;
    L_0x0558:
        r5 = r15.c;
        r0 = r17;
        r3 = r0.f;
        r6 = -1;
        if (r3 != r6) goto L_0x056b;
    L_0x0561:
        r3 = 1;
    L_0x0562:
        if (r5 != r3) goto L_0x056d;
    L_0x0564:
        r3 = -1;
        r5 = 1;
        super.a(r9, r3, r5);
        goto L_0x045a;
    L_0x056b:
        r3 = 0;
        goto L_0x0562;
    L_0x056d:
        r3 = 0;
        r5 = 1;
        super.a(r9, r3, r5);
        goto L_0x045a;
    L_0x0574:
        r3 = 0;
        goto L_0x04d3;
    L_0x0577:
        r5 = r15.i();
        r3 = r15.b;
        r3 = r3.f(r9);
        r3 = r3 + r5;
        goto L_0x04fa;
    L_0x0584:
        r0 = r17;
        r7 = r0.b;
        r0 = r17;
        r6 = r0.b;
        r8 = r11.a;
        r6 = r6 + r8;
        r8 = r5;
        r5 = r6;
        r6 = r3;
        goto L_0x050f;
    L_0x0594:
        r6 = r15.j();
        r3 = r15.b;
        r3 = r3.f(r9);
        r3 = r3 + r6;
        r0 = r17;
        r5 = r0.f;
        r7 = -1;
        if (r5 != r7) goto L_0x05b7;
    L_0x05a6:
        r0 = r17;
        r5 = r0.b;
        r0 = r17;
        r7 = r0.b;
        r8 = r11.a;
        r7 = r7 - r8;
        r8 = r7;
        r7 = r6;
        r6 = r5;
        r5 = r3;
        goto L_0x050f;
    L_0x05b7:
        r0 = r17;
        r7 = r0.b;
        r0 = r17;
        r5 = r0.b;
        r8 = r11.a;
        r5 = r5 + r8;
        r8 = r7;
        r7 = r6;
        r6 = r5;
        r5 = r3;
        goto L_0x050f;
    L_0x05c8:
        r4 = r2;
        goto L_0x0031;
    L_0x05cb:
        r2 = r4;
        goto L_0x00ce;
    L_0x05ce:
        r6 = r5;
        r5 = r2;
        goto L_0x02f8;
    L_0x05d2:
        r5 = r3;
        goto L_0x029d;
    L_0x05d5:
        r5 = r2;
        r6 = r3;
        goto L_0x02f8;
        */
        throw new UnsupportedOperationException("Method not decompiled: xr.a(zc, xu, zi, boolean):int");
    }

    final boolean e() {
        if (!(this.k == 1073741824 || this.j == 1073741824)) {
            boolean z;
            int h = h();
            for (int i = 0; i < h; i++) {
                LayoutParams layoutParams = e(i).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    z = true;
                    break;
                }
            }
            z = false;
            if (z) {
                return true;
            }
        }
        return false;
    }

    private final View q() {
        return e(this.c ? h() - 1 : 0);
    }

    private final View r() {
        return e(this.c ? 0 : h() - 1);
    }

    private final View a(boolean z, boolean z2) {
        if (this.c) {
            return a(h() - 1, -1, z, true);
        }
        return a(0, h(), z, true);
    }

    private final View b(boolean z, boolean z2) {
        if (this.c) {
            return a(0, h(), z, true);
        }
        return a(h() - 1, -1, z, true);
    }

    private final View b(zc zcVar, zi ziVar) {
        if (this.c) {
            return d(zcVar, ziVar);
        }
        return e(zcVar, ziVar);
    }

    private final View c(zc zcVar, zi ziVar) {
        if (this.c) {
            return e(zcVar, ziVar);
        }
        return d(zcVar, ziVar);
    }

    private final View d(zc zcVar, zi ziVar) {
        return c(0, h(), ziVar.a());
    }

    private final View e(zc zcVar, zi ziVar) {
        return c(h() - 1, -1, ziVar.a());
    }

    private View c(int i, int i2, int i3) {
        View view = null;
        o();
        int b = this.b.b();
        int c = this.b.c();
        int i4 = i2 > i ? 1 : -1;
        View view2 = null;
        while (i != i2) {
            View view3;
            View e = e(i);
            int a = yz.a(e);
            if (a >= 0 && a < i3) {
                if (((za) e.getLayoutParams()).a.m()) {
                    if (view2 == null) {
                        view3 = view;
                        i += i4;
                        view = view3;
                        view2 = e;
                    }
                } else if (this.b.a(e) < c && this.b.b(e) >= b) {
                    return e;
                } else {
                    if (view == null) {
                        view3 = e;
                        e = view2;
                        i += i4;
                        view = view3;
                        view2 = e;
                    }
                }
            }
            view3 = view;
            e = view2;
            i += i4;
            view = view3;
            view2 = e;
        }
        return view != null ? view : view2;
    }

    private View a(int i, int i2, boolean z, boolean z2) {
        o();
        int b = this.b.b();
        int c = this.b.c();
        int i3 = i2 > i ? 1 : -1;
        View view = null;
        while (i != i2) {
            View e = e(i);
            int a = this.b.a(e);
            int b2 = this.b.b(e);
            if (a < c && b2 > b) {
                if (!z) {
                    return e;
                }
                if (a >= b && b2 <= c) {
                    return e;
                }
                if (z2 && view == null) {
                    i += i3;
                    view = e;
                }
            }
            e = view;
            i += i3;
            view = e;
        }
        return view;
    }

    public final View c(int i, zc zcVar, zi ziVar) {
        m();
        if (h() == 0) {
            return null;
        }
        int i2;
        switch (i) {
            case rq.b /*1*/:
                if (this.a != 1) {
                    if (!n()) {
                        i2 = -1;
                        break;
                    }
                    i2 = 1;
                    break;
                }
                i2 = -1;
                break;
            case rq.c /*2*/:
                if (this.a != 1) {
                    if (!n()) {
                        i2 = 1;
                        break;
                    }
                    i2 = -1;
                    break;
                }
                i2 = 1;
                break;
            case rk.bZ /*17*/:
                if (this.a != 0) {
                    i2 = oe.INVALID_ID;
                    break;
                }
                i2 = -1;
                break;
            case 33:
                if (this.a != 1) {
                    i2 = oe.INVALID_ID;
                    break;
                }
                i2 = -1;
                break;
            case 66:
                if (this.a != 0) {
                    i2 = oe.INVALID_ID;
                    break;
                }
                i2 = 1;
                break;
            case 130:
                if (this.a != 1) {
                    i2 = oe.INVALID_ID;
                    break;
                }
                i2 = 1;
                break;
            default:
                i2 = oe.INVALID_ID;
                break;
        }
        if (i2 == oe.INVALID_ID) {
            return null;
        }
        View c;
        o();
        if (i2 == -1) {
            c = c(zcVar, ziVar);
        } else {
            c = b(zcVar, ziVar);
        }
        if (c == null) {
            return null;
        }
        View q;
        o();
        a(i2, (int) (0.33333334f * ((float) this.b.e())), false, ziVar);
        this.n.g = oe.INVALID_ID;
        this.n.a = false;
        a(zcVar, this.n, ziVar, true);
        if (i2 == -1) {
            q = q();
        } else {
            q = r();
        }
        if (q == c || !q.isFocusable()) {
            return null;
        }
        return q;
    }

    public final boolean f() {
        return this.u == null && !this.o;
    }
}
