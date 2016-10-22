import android.content.Context;
import android.os.Parcelable;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import java.util.List;

public class acx extends aef {
    private ada a;
    private boolean b;
    private boolean c;
    private boolean d;
    private boolean e;
    private boolean f;
    private final acz g;
    int i;
    ads j;
    boolean k;
    int l;
    int m;
    adb n;
    final acy o;

    public acx(Context context) {
        this(1, false);
    }

    public acx(int i, boolean z) {
        this.c = false;
        this.k = false;
        this.d = false;
        this.e = true;
        this.l = -1;
        this.m = nzf.UNSET_ENUM_VALUE;
        this.n = null;
        this.o = new acy(this);
        this.g = new acz();
        a(i);
        a(z);
        c(true);
    }

    public aeg e() {
        return new aeg(-2, -2);
    }

    public void a(RecyclerView recyclerView, aek aek) {
        super.a(recyclerView, aek);
        if (this.f) {
            c(aek);
            aek.a();
        }
    }

    public void a(AccessibilityEvent accessibilityEvent) {
        super.a(accessibilityEvent);
        if (w() > 0) {
            rf a = qf.a(accessibilityEvent);
            a.b(p());
            a.c(r());
        }
    }

    public Parcelable g() {
        if (this.n != null) {
            return new adb(this.n);
        }
        Parcelable adb = new adb();
        if (w() > 0) {
            l();
            boolean z = this.b ^ this.k;
            adb.c = z;
            View N;
            if (z) {
                N = N();
                adb.b = this.j.d() - this.j.b(N);
                adb.a = d(N);
                return adb;
            }
            N = M();
            adb.a = d(N);
            adb.b = this.j.a(N) - this.j.c();
            return adb;
        }
        adb.b();
        return adb;
    }

    public void a(Parcelable parcelable) {
        if (parcelable instanceof adb) {
            this.n = (adb) parcelable;
            t();
        }
    }

    public boolean h() {
        return this.i == 0;
    }

    public boolean i() {
        return this.i == 1;
    }

    public int j() {
        return this.i;
    }

    public void a(int i) {
        if (i == 0 || i == 1) {
            a(null);
            if (i != this.i) {
                this.i = i;
                this.j = null;
                t();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("invalid orientation:" + i);
    }

    private void L() {
        boolean z = true;
        if (this.i == 1 || !k()) {
            z = this.c;
        } else if (this.c) {
            z = false;
        }
        this.k = z;
    }

    public void a(boolean z) {
        a(null);
        if (z != this.c) {
            this.c = z;
            t();
        }
    }

    public View b(int i) {
        int w = w();
        if (w == 0) {
            return null;
        }
        int d = i - d(g(0));
        if (d >= 0 && d < w) {
            View g = g(d);
            if (d(g) == i) {
                return g;
            }
        }
        return super.b(i);
    }

    protected int b(aep aep) {
        if (aep.c()) {
            return this.j.f();
        }
        return 0;
    }

    public void c(aek aek, aep aep) {
        if (!(this.n == null && this.l == -1) && aep.d() == 0) {
            c(aek);
            return;
        }
        int b;
        View F;
        int i;
        int d;
        int i2;
        if (this.n != null && this.n.a()) {
            this.l = this.n.a;
        }
        l();
        this.a.a = false;
        L();
        if (!(this.o.d && this.l == -1 && this.n == null)) {
            Object obj;
            View b2;
            this.o.a();
            this.o.c = this.k ^ this.d;
            acy acy = this.o;
            if (aep.a() || this.l == -1) {
                obj = null;
            } else if (this.l < 0 || this.l >= aep.d()) {
                this.l = -1;
                this.m = nzf.UNSET_ENUM_VALUE;
                obj = null;
            } else {
                acy.a = this.l;
                if (this.n == null || !this.n.a()) {
                    if (this.m == nzf.UNSET_ENUM_VALUE) {
                        b2 = b(this.l);
                        if (b2 == null) {
                            if (w() > 0) {
                                acy.c = (this.l < d(g(0))) == this.k;
                            }
                            acy.b();
                        } else if (this.j.e(b2) > this.j.f()) {
                            acy.b();
                        } else if (this.j.a(b2) - this.j.c() < 0) {
                            acy.b = this.j.c();
                            acy.c = false;
                        } else if (this.j.d() - this.j.b(b2) < 0) {
                            acy.b = this.j.d();
                            acy.c = true;
                        } else {
                            if (acy.c) {
                                b = this.j.b(b2) + this.j.b();
                            } else {
                                b = this.j.a(b2);
                            }
                            acy.b = b;
                        }
                        obj = 1;
                    } else {
                        acy.c = this.k;
                        if (this.k) {
                            acy.b = this.j.d() - this.m;
                        } else {
                            acy.b = this.j.c() + this.m;
                        }
                    }
                    obj = 1;
                } else {
                    acy.c = this.n.c;
                    if (acy.c) {
                        acy.b = this.j.d() - this.n.b;
                    } else {
                        acy.b = this.j.c() + this.n.b;
                    }
                    obj = 1;
                }
            }
            if (obj == null) {
                if (w() != 0) {
                    F = F();
                    if (F != null) {
                        aeg aeg = (aeg) F.getLayoutParams();
                        if (aeg.d() || aeg.f() < 0 || aeg.f() >= aep.d()) {
                            obj = null;
                        } else {
                            obj = 1;
                        }
                        if (obj != null) {
                            acy.a(F);
                            obj = 1;
                            if (obj == null) {
                                acy.b();
                                if (this.d) {
                                    b = aep.d() - 1;
                                } else {
                                    b = 0;
                                }
                                acy.a = b;
                            }
                        }
                    }
                    if (this.b == this.d) {
                        if (acy.c) {
                            b2 = d(aek, aep);
                        } else {
                            b2 = e(aek, aep);
                        }
                        if (b2 != null) {
                            acy.b(b2);
                            if (!aep.a() && f()) {
                                obj = (this.j.a(b2) >= this.j.d() || this.j.b(b2) < this.j.c()) ? 1 : null;
                                if (obj != null) {
                                    if (acy.c) {
                                        b = this.j.d();
                                    } else {
                                        b = this.j.c();
                                    }
                                    acy.b = b;
                                }
                            }
                            obj = 1;
                            if (obj == null) {
                                acy.b();
                                if (this.d) {
                                    b = 0;
                                } else {
                                    b = aep.d() - 1;
                                }
                                acy.a = b;
                            }
                        }
                    }
                }
                obj = null;
                if (obj == null) {
                    acy.b();
                    if (this.d) {
                        b = aep.d() - 1;
                    } else {
                        b = 0;
                    }
                    acy.a = b;
                }
            }
            this.o.d = true;
        }
        b = b(aep);
        if (this.a.j >= 0) {
            i = 0;
        } else {
            i = b;
            b = 0;
        }
        i += this.j.c();
        b += this.j.g();
        if (!(!aep.a() || this.l == -1 || this.m == nzf.UNSET_ENUM_VALUE)) {
            F = b(this.l);
            if (F != null) {
                if (this.k) {
                    d = (this.j.d() - this.j.b(F)) - this.m;
                } else {
                    d = this.m - (this.j.a(F) - this.j.c());
                }
                if (d > 0) {
                    i += d;
                } else {
                    b -= d;
                }
            }
        }
        d = this.o.c ? this.k ? 1 : -1 : this.k ? -1 : 1;
        a(aek, aep, this.o, d);
        a(aek);
        this.a.l = n();
        this.a.i = aep.a();
        if (this.o.c) {
            b(this.o);
            this.a.h = i;
            a(aek, this.a, aep, false);
            i = this.a.b;
            i2 = this.a.d;
            if (this.a.c > 0) {
                b += this.a.c;
            }
            a(this.o);
            this.a.h = b;
            ada ada = this.a;
            ada.d += this.a.e;
            a(aek, this.a, aep, false);
            d = this.a.b;
            if (this.a.c > 0) {
                b = this.a.c;
                g(i2, i);
                this.a.h = b;
                a(aek, this.a, aep, false);
                b = this.a.b;
            } else {
                b = i;
            }
            i = b;
            b = d;
        } else {
            a(this.o);
            this.a.h = b;
            a(aek, this.a, aep, false);
            b = this.a.b;
            d = this.a.d;
            if (this.a.c > 0) {
                i += this.a.c;
            }
            b(this.o);
            this.a.h = i;
            ada ada2 = this.a;
            ada2.d += this.a.e;
            a(aek, this.a, aep, false);
            i = this.a.b;
            if (this.a.c > 0) {
                i2 = this.a.c;
                f(d, b);
                this.a.h = i2;
                a(aek, this.a, aep, false);
                b = this.a.b;
            }
        }
        if (w() <= 0) {
            d = i;
            i = b;
        } else if ((this.k ^ this.d) != 0) {
            d = a(b, aek, aep, true);
            i += d;
            b += d;
            d = b(i, aek, aep, false);
            b += d;
            d = i + d;
            i = b;
        } else {
            d = b(i, aek, aep, true);
            i += d;
            b += d;
            d = a(b, aek, aep, false);
            b += d;
            d = i + d;
            i = b;
        }
        if (aep.b() && w() != 0 && !aep.a() && f()) {
            int i3 = 0;
            int i4 = 0;
            List b3 = aek.b();
            int size = b3.size();
            int d2 = d(g(0));
            int i5 = 0;
            while (i5 < size) {
                aer aer = (aer) b3.get(i5);
                if (aer.n()) {
                    b = i4;
                    i2 = i3;
                } else {
                    if (((aer.d() < d2) != this.k ? -1 : 1) == -1) {
                        i2 = this.j.e(aer.a) + i3;
                        b = i4;
                    } else {
                        b = this.j.e(aer.a) + i4;
                        i2 = i3;
                    }
                }
                i5++;
                i3 = i2;
                i4 = b;
            }
            this.a.k = b3;
            if (i3 > 0) {
                g(d(M()), d);
                this.a.h = i3;
                this.a.c = 0;
                this.a.a();
                a(aek, this.a, aep, false);
            }
            if (i4 > 0) {
                f(d(N()), i);
                this.a.h = i4;
                this.a.c = 0;
                this.a.a();
                a(aek, this.a, aep, false);
            }
            this.a.k = null;
        }
        if (aep.a()) {
            this.o.a();
        } else {
            this.j.a();
        }
        this.b = this.d;
    }

    public void a(aep aep) {
        super.a(aep);
        this.n = null;
        this.l = -1;
        this.m = nzf.UNSET_ENUM_VALUE;
        this.o.a();
    }

    void a(aek aek, aep aep, acy acy, int i) {
    }

    private int a(int i, aek aek, aep aep, boolean z) {
        int d = this.j.d() - i;
        if (d <= 0) {
            return 0;
        }
        d = -c(-d, aek, aep);
        int i2 = i + d;
        if (!z) {
            return d;
        }
        i2 = this.j.d() - i2;
        if (i2 <= 0) {
            return d;
        }
        this.j.a(i2);
        return d + i2;
    }

    private int b(int i, aek aek, aep aep, boolean z) {
        int c = i - this.j.c();
        if (c <= 0) {
            return 0;
        }
        c = -c(c, aek, aep);
        int i2 = i + c;
        if (!z) {
            return c;
        }
        i2 -= this.j.c();
        if (i2 <= 0) {
            return c;
        }
        this.j.a(-i2);
        return c - i2;
    }

    private void a(acy acy) {
        f(acy.a, acy.b);
    }

    private void f(int i, int i2) {
        this.a.c = this.j.d() - i2;
        this.a.e = this.k ? -1 : 1;
        this.a.d = i;
        this.a.f = 1;
        this.a.b = i2;
        this.a.g = nzf.UNSET_ENUM_VALUE;
    }

    private void b(acy acy) {
        g(acy.a, acy.b);
    }

    private void g(int i, int i2) {
        this.a.c = i2 - this.j.c();
        this.a.d = i;
        this.a.e = this.k ? 1 : -1;
        this.a.f = -1;
        this.a.b = i2;
        this.a.g = nzf.UNSET_ENUM_VALUE;
    }

    protected boolean k() {
        return v() == 1;
    }

    void l() {
        if (this.a == null) {
            this.a = m();
        }
        if (this.j == null) {
            ads adt;
            switch (this.i) {
                case wi.w /*0*/:
                    adt = new adt(this);
                    break;
                case wi.j /*1*/:
                    adt = new adu(this);
                    break;
                default:
                    throw new IllegalArgumentException("invalid orientation");
            }
            this.j = adt;
        }
    }

    ada m() {
        return new ada();
    }

    public void c(int i) {
        this.l = i;
        this.m = nzf.UNSET_ENUM_VALUE;
        if (this.n != null) {
            this.n.b();
        }
        t();
    }

    public int a(int i, aek aek, aep aep) {
        if (this.i == 1) {
            return 0;
        }
        return c(i, aek, aep);
    }

    public int b(int i, aek aek, aep aep) {
        if (this.i == 0) {
            return 0;
        }
        return c(i, aek, aep);
    }

    public int c(aep aep) {
        return i(aep);
    }

    public int d(aep aep) {
        return i(aep);
    }

    public int e(aep aep) {
        return j(aep);
    }

    public int f(aep aep) {
        return j(aep);
    }

    public int g(aep aep) {
        return k(aep);
    }

    public int h(aep aep) {
        return k(aep);
    }

    private int i(aep aep) {
        boolean z = false;
        if (w() == 0) {
            return 0;
        }
        l();
        ads ads = this.j;
        View a = a(!this.e, true);
        if (!this.e) {
            z = true;
        }
        return gwb.a(aep, ads, a, b(z, true), (aef) this, this.e, this.k);
    }

    private int j(aep aep) {
        boolean z = false;
        if (w() == 0) {
            return 0;
        }
        l();
        ads ads = this.j;
        View a = a(!this.e, true);
        if (!this.e) {
            z = true;
        }
        return gwb.a(aep, ads, a, b(z, true), (aef) this, this.e);
    }

    private int k(aep aep) {
        boolean z = false;
        if (w() == 0) {
            return 0;
        }
        l();
        ads ads = this.j;
        View a = a(!this.e, true);
        if (!this.e) {
            z = true;
        }
        return gwb.b(aep, ads, a, b(z, true), this, this.e);
    }

    public void b(boolean z) {
        this.e = true;
    }

    private void a(int i, int i2, boolean z, aep aep) {
        int i3 = -1;
        int i4 = 1;
        this.a.l = n();
        this.a.h = b(aep);
        this.a.f = i;
        View N;
        ada ada;
        if (i == 1) {
            ada ada2 = this.a;
            ada2.h += this.j.g();
            N = N();
            ada = this.a;
            if (!this.k) {
                i3 = 1;
            }
            ada.e = i3;
            this.a.d = d(N) + this.a.e;
            this.a.b = this.j.b(N);
            i3 = this.j.b(N) - this.j.d();
        } else {
            N = M();
            ada = this.a;
            ada.h += this.j.c();
            ada = this.a;
            if (!this.k) {
                i4 = -1;
            }
            ada.e = i4;
            this.a.d = d(N) + this.a.e;
            this.a.b = this.j.a(N);
            i3 = (-this.j.a(N)) + this.j.c();
        }
        this.a.c = i2;
        if (z) {
            ada ada3 = this.a;
            ada3.c -= i3;
        }
        this.a.g = i3;
    }

    boolean n() {
        return this.j.h() == 0 && this.j.e() == 0;
    }

    int c(int i, aek aek, aep aep) {
        if (w() == 0 || i == 0) {
            return 0;
        }
        this.a.a = true;
        l();
        int i2 = i > 0 ? 1 : -1;
        int abs = Math.abs(i);
        a(i2, abs, true, aep);
        int a = this.a.g + a(aek, this.a, aep, false);
        if (a < 0) {
            return 0;
        }
        if (abs > a) {
            i = i2 * a;
        }
        this.j.a(-i);
        this.a.j = i;
        return i;
    }

    public void a(String str) {
        if (this.n == null) {
            super.a(str);
        }
    }

    private void a(aek aek, int i, int i2) {
        if (i != i2) {
            if (i2 > i) {
                for (int i3 = i2 - 1; i3 >= i; i3--) {
                    a(i3, aek);
                }
                return;
            }
            while (i > i2) {
                a(i, aek);
                i--;
            }
        }
    }

    private void a(aek aek, ada ada) {
        if (ada.a && !ada.l) {
            int i;
            int w;
            int e;
            View g;
            View g2;
            if (ada.f == -1) {
                i = ada.g;
                w = w();
                if (i >= 0) {
                    e = this.j.e() - i;
                    if (this.k) {
                        for (i = 0; i < w; i++) {
                            g = g(i);
                            if (this.j.a(g) < e || this.j.d(g) < e) {
                                a(aek, 0, i);
                                return;
                            }
                        }
                        return;
                    }
                    for (i = w - 1; i >= 0; i--) {
                        g2 = g(i);
                        if (this.j.a(g2) < e || this.j.d(g2) < e) {
                            a(aek, w - 1, i);
                            return;
                        }
                    }
                    return;
                }
                return;
            }
            w = ada.g;
            if (w >= 0) {
                e = w();
                if (this.k) {
                    for (i = e - 1; i >= 0; i--) {
                        g2 = g(i);
                        if (this.j.b(g2) > w || this.j.c(g2) > w) {
                            a(aek, e - 1, i);
                            return;
                        }
                    }
                    return;
                }
                for (i = 0; i < e; i++) {
                    g = g(i);
                    if (this.j.b(g) > w || this.j.c(g) > w) {
                        a(aek, 0, i);
                        return;
                    }
                }
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    int a(aek r8, ada r9, aep r10, boolean r11) {
        /*
        r7 = this;
        r6 = -2147483648; // 0xffffffff80000000 float:-0.0 double:NaN;
        r1 = r9.c;
        r0 = r9.g;
        if (r0 == r6) goto L_0x0016;
    L_0x0008:
        r0 = r9.c;
        if (r0 >= 0) goto L_0x0013;
    L_0x000c:
        r0 = r9.g;
        r2 = r9.c;
        r0 = r0 + r2;
        r9.g = r0;
    L_0x0013:
        r7.a(r8, r9);
    L_0x0016:
        r0 = r9.c;
        r2 = r9.h;
        r0 = r0 + r2;
        r2 = r7.g;
    L_0x001d:
        r3 = r9.l;
        if (r3 != 0) goto L_0x0023;
    L_0x0021:
        if (r0 <= 0) goto L_0x0076;
    L_0x0023:
        r3 = r9.a(r10);
        if (r3 == 0) goto L_0x0076;
    L_0x0029:
        r2.a();
        r7.a(r8, r10, r9, r2);
        r3 = r2.b;
        if (r3 != 0) goto L_0x0076;
    L_0x0033:
        r3 = r9.b;
        r4 = r2.a;
        r5 = r9.f;
        r4 = r4 * r5;
        r3 = r3 + r4;
        r9.b = r3;
        r3 = r2.c;
        if (r3 == 0) goto L_0x004d;
    L_0x0041:
        r3 = r7.a;
        r3 = r3.k;
        if (r3 != 0) goto L_0x004d;
    L_0x0047:
        r3 = r10.a();
        if (r3 != 0) goto L_0x0057;
    L_0x004d:
        r3 = r9.c;
        r4 = r2.a;
        r3 = r3 - r4;
        r9.c = r3;
        r3 = r2.a;
        r0 = r0 - r3;
    L_0x0057:
        r3 = r9.g;
        if (r3 == r6) goto L_0x0070;
    L_0x005b:
        r3 = r9.g;
        r4 = r2.a;
        r3 = r3 + r4;
        r9.g = r3;
        r3 = r9.c;
        if (r3 >= 0) goto L_0x006d;
    L_0x0066:
        r3 = r9.g;
        r4 = r9.c;
        r3 = r3 + r4;
        r9.g = r3;
    L_0x006d:
        r7.a(r8, r9);
    L_0x0070:
        if (r11 == 0) goto L_0x001d;
    L_0x0072:
        r3 = r2.d;
        if (r3 == 0) goto L_0x001d;
    L_0x0076:
        r0 = r9.c;
        r0 = r1 - r0;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: acx.a(aek, ada, aep, boolean):int");
    }

    void a(aek aek, aep aep, ada ada, acz acz) {
        View a = ada.a(aek);
        if (a == null) {
            acz.b = true;
            return;
        }
        int f;
        int i;
        int i2;
        int i3;
        aeg aeg = (aeg) a.getLayoutParams();
        if (ada.k == null) {
            if (this.k == (ada.f == -1)) {
                b(a);
            } else {
                b(a, 0);
            }
        } else {
            boolean z;
            boolean z2 = this.k;
            if (ada.f == -1) {
                z = true;
            } else {
                z = false;
            }
            if (z2 == z) {
                a(a);
            } else {
                a(a, 0);
            }
        }
        a(a, 0, 0);
        acz.a = this.j.e(a);
        if (this.i == 1) {
            int z3;
            if (k()) {
                z3 = z() - D();
                f = z3 - this.j.f(a);
            } else {
                f = B();
                z3 = this.j.f(a) + f;
            }
            if (ada.f == -1) {
                i = ada.b;
                i2 = ada.b - acz.a;
                i3 = z3;
            } else {
                i2 = ada.b;
                i = acz.a + ada.b;
                i3 = z3;
            }
        } else {
            i2 = C();
            i = i2 + this.j.f(a);
            if (ada.f == -1) {
                f = ada.b - acz.a;
                i3 = ada.b;
            } else {
                f = ada.b;
                i3 = ada.b + acz.a;
            }
        }
        a(a, f, i2, i3, i);
        if (aeg.d() || aeg.e()) {
            acz.c = true;
        }
        acz.d = a.isFocusable();
    }

    boolean o() {
        return (y() == 1073741824 || x() == 1073741824 || !K()) ? false : true;
    }

    int d(int i) {
        switch (i) {
            case wi.j /*1*/:
                if (this.i == 1 || !k()) {
                    return -1;
                }
                return 1;
            case wi.l /*2*/:
                if (this.i == 1) {
                    return 1;
                }
                if (k()) {
                    return -1;
                }
                return 1;
            case wi.dK /*17*/:
                if (this.i != 0) {
                    return nzf.UNSET_ENUM_VALUE;
                }
                return -1;
            case 33:
                if (this.i != 1) {
                    return nzf.UNSET_ENUM_VALUE;
                }
                return -1;
            case 66:
                return this.i == 0 ? 1 : nzf.UNSET_ENUM_VALUE;
            case 130:
                return this.i == 1 ? 1 : nzf.UNSET_ENUM_VALUE;
            default:
                return nzf.UNSET_ENUM_VALUE;
        }
    }

    private View M() {
        return g(this.k ? w() - 1 : 0);
    }

    private View N() {
        return g(this.k ? 0 : w() - 1);
    }

    private View a(boolean z, boolean z2) {
        if (this.k) {
            return a(w() - 1, -1, z, true);
        }
        return a(0, w(), z, true);
    }

    private View b(boolean z, boolean z2) {
        if (this.k) {
            return a(0, w(), z, true);
        }
        return a(w() - 1, -1, z, true);
    }

    private View d(aek aek, aep aep) {
        if (this.k) {
            return f(aek, aep);
        }
        return g(aek, aep);
    }

    private View e(aek aek, aep aep) {
        if (this.k) {
            return g(aek, aep);
        }
        return f(aek, aep);
    }

    private View f(aek aek, aep aep) {
        return a(aek, aep, 0, w(), aep.d());
    }

    private View g(aek aek, aep aep) {
        return a(aek, aep, w() - 1, -1, aep.d());
    }

    View a(aek aek, aep aep, int i, int i2, int i3) {
        View view = null;
        l();
        int c = this.j.c();
        int d = this.j.d();
        int i4 = i2 > i ? 1 : -1;
        View view2 = null;
        while (i != i2) {
            View view3;
            View g = g(i);
            int d2 = d(g);
            if (d2 >= 0 && d2 < i3) {
                if (((aeg) g.getLayoutParams()).d()) {
                    if (view2 == null) {
                        view3 = view;
                        i += i4;
                        view = view3;
                        view2 = g;
                    }
                } else if (this.j.a(g) < d && this.j.b(g) >= c) {
                    return g;
                } else {
                    if (view == null) {
                        view3 = g;
                        g = view2;
                        i += i4;
                        view = view3;
                        view2 = g;
                    }
                }
            }
            view3 = view;
            g = view2;
            i += i4;
            view = view3;
            view2 = g;
        }
        return view != null ? view : view2;
    }

    public int p() {
        View a = a(0, w(), false, true);
        return a == null ? -1 : d(a);
    }

    public int q() {
        View a = a(0, w(), true, false);
        return a == null ? -1 : d(a);
    }

    public int r() {
        View a = a(w() - 1, -1, false, true);
        if (a == null) {
            return -1;
        }
        return d(a);
    }

    public int s() {
        View a = a(w() - 1, -1, true, false);
        if (a == null) {
            return -1;
        }
        return d(a);
    }

    View a(int i, int i2, boolean z, boolean z2) {
        l();
        int c = this.j.c();
        int d = this.j.d();
        int i3 = i2 > i ? 1 : -1;
        View view = null;
        while (i != i2) {
            View g = g(i);
            int a = this.j.a(g);
            int b = this.j.b(g);
            if (a < d && b > c) {
                if (!z) {
                    return g;
                }
                if (a >= c && b <= d) {
                    return g;
                }
                if (z2 && view == null) {
                    i += i3;
                    view = g;
                }
            }
            g = view;
            i += i3;
            view = g;
        }
        return view;
    }

    public View a(View view, int i, aek aek, aep aep) {
        L();
        if (w() == 0) {
            return null;
        }
        int d = d(i);
        if (d == nzf.UNSET_ENUM_VALUE) {
            return null;
        }
        View e;
        l();
        if (d == -1) {
            e = e(aek, aep);
        } else {
            e = d(aek, aep);
        }
        if (e == null) {
            return null;
        }
        View M;
        l();
        a(d, (int) (0.33333334f * ((float) this.j.f())), false, aep);
        this.a.g = nzf.UNSET_ENUM_VALUE;
        this.a.a = false;
        a(aek, this.a, aep, true);
        if (d == -1) {
            M = M();
        } else {
            M = N();
        }
        if (M == e || !M.isFocusable()) {
            return null;
        }
        return M;
    }

    public boolean f() {
        return this.n == null && this.b == this.d;
    }
}
