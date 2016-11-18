package p000;

import android.content.Context;
import android.os.Parcelable;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import java.util.List;

public class acx extends aef {
    private ada f262a;
    private boolean f263b;
    private boolean f264c;
    private boolean f265d;
    private boolean f266e;
    private boolean f267f;
    private final acz f268g;
    int f269i;
    ads f270j;
    boolean f271k;
    int f272l;
    int f273m;
    adb f274n;
    final acy f275o;

    public acx(Context context) {
        this(1, false);
    }

    public acx(int i, boolean z) {
        this.f264c = false;
        this.f271k = false;
        this.f265d = false;
        this.f266e = true;
        this.f272l = -1;
        this.f273m = nzf.UNSET_ENUM_VALUE;
        this.f274n = null;
        this.f275o = new acy(this);
        this.f268g = new acz();
        m533a(i);
        m541a(z);
        m465c(true);
    }

    public aeg mo55e() {
        return new aeg(-2, -2);
    }

    public void mo45a(RecyclerView recyclerView, aek aek) {
        super.mo45a(recyclerView, aek);
        if (this.f267f) {
            m461c(aek);
            aek.m806a();
        }
    }

    public void mo46a(AccessibilityEvent accessibilityEvent) {
        super.mo46a(accessibilityEvent);
        if (m503w() > 0) {
            rf a = qf.m33682a(accessibilityEvent);
            a.m33694b(m567p());
            a.m33695c(m569r());
        }
    }

    public Parcelable mo59g() {
        if (this.f274n != null) {
            return new adb(this.f274n);
        }
        Parcelable adb = new adb();
        if (m503w() > 0) {
            m563l();
            boolean z = this.f263b ^ this.f271k;
            adb.f333c = z;
            View N;
            if (z) {
                N = m509N();
                adb.f332b = this.f270j.mo93d() - this.f270j.mo90b(N);
                adb.f331a = m468d(N);
                return adb;
            }
            N = m508M();
            adb.f331a = m468d(N);
            adb.f332b = this.f270j.mo88a(N) - this.f270j.mo91c();
            return adb;
        }
        adb.m649b();
        return adb;
    }

    public void mo44a(Parcelable parcelable) {
        if (parcelable instanceof adb) {
            this.f274n = (adb) parcelable;
            m500t();
        }
    }

    public boolean mo61h() {
        return this.f269i == 0;
    }

    public boolean mo62i() {
        return this.f269i == 1;
    }

    public int m561j() {
        return this.f269i;
    }

    public void m533a(int i) {
        if (i == 0 || i == 1) {
            mo47a(null);
            if (i != this.f269i) {
                this.f269i = i;
                this.f270j = null;
                m500t();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("invalid orientation:" + i);
    }

    private void m507L() {
        boolean z = true;
        if (this.f269i == 1 || !m562k()) {
            z = this.f264c;
        } else if (this.f264c) {
            z = false;
        }
        this.f271k = z;
    }

    public void m541a(boolean z) {
        mo47a(null);
        if (z != this.f264c) {
            this.f264c = z;
            m500t();
        }
    }

    public View mo49b(int i) {
        int w = m503w();
        if (w == 0) {
            return null;
        }
        int d = i - m468d(m484g(0));
        if (d >= 0 && d < w) {
            View g = m484g(d);
            if (m468d(g) == i) {
                return g;
            }
        }
        return super.mo49b(i);
    }

    protected int m543b(aep aep) {
        if (aep.m844c()) {
            return this.f270j.mo97f();
        }
        return 0;
    }

    public void mo52c(aek aek, aep aep) {
        if (!(this.f274n == null && this.f272l == -1) && aep.m845d() == 0) {
            m461c(aek);
            return;
        }
        int b;
        View F;
        int i;
        int d;
        int i2;
        if (this.f274n != null && this.f274n.m648a()) {
            this.f272l = this.f274n.f331a;
        }
        m563l();
        this.f262a.f319a = false;
        m507L();
        if (!(this.f275o.f312d && this.f272l == -1 && this.f274n == null)) {
            Object obj;
            View b2;
            this.f275o.m638a();
            this.f275o.f311c = this.f271k ^ this.f265d;
            acy acy = this.f275o;
            if (aep.m842a() || this.f272l == -1) {
                obj = null;
            } else if (this.f272l < 0 || this.f272l >= aep.m845d()) {
                this.f272l = -1;
                this.f273m = nzf.UNSET_ENUM_VALUE;
                obj = null;
            } else {
                acy.f309a = this.f272l;
                if (this.f274n == null || !this.f274n.m648a()) {
                    if (this.f273m == nzf.UNSET_ENUM_VALUE) {
                        b2 = mo49b(this.f272l);
                        if (b2 == null) {
                            if (m503w() > 0) {
                                acy.f311c = (this.f272l < m468d(m484g(0))) == this.f271k;
                            }
                            acy.m640b();
                        } else if (this.f270j.mo96e(b2) > this.f270j.mo97f()) {
                            acy.m640b();
                        } else if (this.f270j.mo88a(b2) - this.f270j.mo91c() < 0) {
                            acy.f310b = this.f270j.mo91c();
                            acy.f311c = false;
                        } else if (this.f270j.mo93d() - this.f270j.mo90b(b2) < 0) {
                            acy.f310b = this.f270j.mo93d();
                            acy.f311c = true;
                        } else {
                            if (acy.f311c) {
                                b = this.f270j.mo90b(b2) + this.f270j.m694b();
                            } else {
                                b = this.f270j.mo88a(b2);
                            }
                            acy.f310b = b;
                        }
                        obj = 1;
                    } else {
                        acy.f311c = this.f271k;
                        if (this.f271k) {
                            acy.f310b = this.f270j.mo93d() - this.f273m;
                        } else {
                            acy.f310b = this.f270j.mo91c() + this.f273m;
                        }
                    }
                    obj = 1;
                } else {
                    acy.f311c = this.f274n.f333c;
                    if (acy.f311c) {
                        acy.f310b = this.f270j.mo93d() - this.f274n.f332b;
                    } else {
                        acy.f310b = this.f270j.mo91c() + this.f274n.f332b;
                    }
                    obj = 1;
                }
            }
            if (obj == null) {
                if (m503w() != 0) {
                    F = m403F();
                    if (F != null) {
                        aeg aeg = (aeg) F.getLayoutParams();
                        if (aeg.m611d() || aeg.m613f() < 0 || aeg.m613f() >= aep.m845d()) {
                            obj = null;
                        } else {
                            obj = 1;
                        }
                        if (obj != null) {
                            acy.m639a(F);
                            obj = 1;
                            if (obj == null) {
                                acy.m640b();
                                if (this.f265d) {
                                    b = aep.m845d() - 1;
                                } else {
                                    b = 0;
                                }
                                acy.f309a = b;
                            }
                        }
                    }
                    if (this.f263b == this.f265d) {
                        if (acy.f311c) {
                            b2 = m519d(aek, aep);
                        } else {
                            b2 = m520e(aek, aep);
                        }
                        if (b2 != null) {
                            acy.m641b(b2);
                            if (!aep.m842a() && mo57f()) {
                                obj = (this.f270j.mo88a(b2) >= this.f270j.mo93d() || this.f270j.mo90b(b2) < this.f270j.mo91c()) ? 1 : null;
                                if (obj != null) {
                                    if (acy.f311c) {
                                        b = this.f270j.mo93d();
                                    } else {
                                        b = this.f270j.mo91c();
                                    }
                                    acy.f310b = b;
                                }
                            }
                            obj = 1;
                            if (obj == null) {
                                acy.m640b();
                                if (this.f265d) {
                                    b = 0;
                                } else {
                                    b = aep.m845d() - 1;
                                }
                                acy.f309a = b;
                            }
                        }
                    }
                }
                obj = null;
                if (obj == null) {
                    acy.m640b();
                    if (this.f265d) {
                        b = aep.m845d() - 1;
                    } else {
                        b = 0;
                    }
                    acy.f309a = b;
                }
            }
            this.f275o.f312d = true;
        }
        b = m543b(aep);
        if (this.f262a.f328j >= 0) {
            i = 0;
        } else {
            i = b;
            b = 0;
        }
        i += this.f270j.mo91c();
        b += this.f270j.mo99g();
        if (!(!aep.m842a() || this.f272l == -1 || this.f273m == nzf.UNSET_ENUM_VALUE)) {
            F = mo49b(this.f272l);
            if (F != null) {
                if (this.f271k) {
                    d = (this.f270j.mo93d() - this.f270j.mo90b(F)) - this.f273m;
                } else {
                    d = this.f273m - (this.f270j.mo88a(F) - this.f270j.mo91c());
                }
                if (d > 0) {
                    i += d;
                } else {
                    b -= d;
                }
            }
        }
        d = this.f275o.f311c ? this.f271k ? 1 : -1 : this.f271k ? -1 : 1;
        mo69a(aek, aep, this.f275o, d);
        m417a(aek);
        this.f262a.f330l = m565n();
        this.f262a.f327i = aep.m842a();
        if (this.f275o.f311c) {
            m518b(this.f275o);
            this.f262a.f326h = i;
            m529a(aek, this.f262a, aep, false);
            i = this.f262a.f320b;
            i2 = this.f262a.f322d;
            if (this.f262a.f321c > 0) {
                b += this.f262a.f321c;
            }
            m513a(this.f275o);
            this.f262a.f326h = b;
            ada ada = this.f262a;
            ada.f322d += this.f262a.f323e;
            m529a(aek, this.f262a, aep, false);
            d = this.f262a.f320b;
            if (this.f262a.f321c > 0) {
                b = this.f262a.f321c;
                m524g(i2, i);
                this.f262a.f326h = b;
                m529a(aek, this.f262a, aep, false);
                b = this.f262a.f320b;
            } else {
                b = i;
            }
            i = b;
            b = d;
        } else {
            m513a(this.f275o);
            this.f262a.f326h = b;
            m529a(aek, this.f262a, aep, false);
            b = this.f262a.f320b;
            d = this.f262a.f322d;
            if (this.f262a.f321c > 0) {
                i += this.f262a.f321c;
            }
            m518b(this.f275o);
            this.f262a.f326h = i;
            ada ada2 = this.f262a;
            ada2.f322d += this.f262a.f323e;
            m529a(aek, this.f262a, aep, false);
            i = this.f262a.f320b;
            if (this.f262a.f321c > 0) {
                i2 = this.f262a.f321c;
                m522f(d, b);
                this.f262a.f326h = i2;
                m529a(aek, this.f262a, aep, false);
                b = this.f262a.f320b;
            }
        }
        if (m503w() <= 0) {
            d = i;
            i = b;
        } else if ((this.f271k ^ this.f265d) != 0) {
            d = m510a(b, aek, aep, true);
            i += d;
            b += d;
            d = m516b(i, aek, aep, false);
            b += d;
            d = i + d;
            i = b;
        } else {
            d = m516b(i, aek, aep, true);
            i += d;
            b += d;
            d = m510a(b, aek, aep, false);
            b += d;
            d = i + d;
            i = b;
        }
        if (aep.m843b() && m503w() != 0 && !aep.m842a() && mo57f()) {
            int i3 = 0;
            int i4 = 0;
            List b3 = aek.m813b();
            int size = b3.size();
            int d2 = m468d(m484g(0));
            int i5 = 0;
            while (i5 < size) {
                aer aer = (aer) b3.get(i5);
                if (aer.m874n()) {
                    b = i4;
                    i2 = i3;
                } else {
                    if (((aer.m864d() < d2) != this.f271k ? -1 : 1) == -1) {
                        i2 = this.f270j.mo96e(aer.f438a) + i3;
                        b = i4;
                    } else {
                        b = this.f270j.mo96e(aer.f438a) + i4;
                        i2 = i3;
                    }
                }
                i5++;
                i3 = i2;
                i4 = b;
            }
            this.f262a.f329k = b3;
            if (i3 > 0) {
                m524g(m468d(m508M()), d);
                this.f262a.f326h = i3;
                this.f262a.f321c = 0;
                this.f262a.m646a();
                m529a(aek, this.f262a, aep, false);
            }
            if (i4 > 0) {
                m522f(m468d(m509N()), i);
                this.f262a.f326h = i4;
                this.f262a.f321c = 0;
                this.f262a.m646a();
                m529a(aek, this.f262a, aep, false);
            }
            this.f262a.f329k = null;
        }
        if (aep.m842a()) {
            this.f275o.m638a();
        } else {
            this.f270j.m692a();
        }
        this.f263b = this.f265d;
    }

    public void mo43a(aep aep) {
        super.mo43a(aep);
        this.f274n = null;
        this.f272l = -1;
        this.f273m = nzf.UNSET_ENUM_VALUE;
        this.f275o.m638a();
    }

    void mo69a(aek aek, aep aep, acy acy, int i) {
    }

    private int m510a(int i, aek aek, aep aep, boolean z) {
        int d = this.f270j.mo93d() - i;
        if (d <= 0) {
            return 0;
        }
        d = -m546c(-d, aek, aep);
        int i2 = i + d;
        if (!z) {
            return d;
        }
        i2 = this.f270j.mo93d() - i2;
        if (i2 <= 0) {
            return d;
        }
        this.f270j.mo89a(i2);
        return d + i2;
    }

    private int m516b(int i, aek aek, aep aep, boolean z) {
        int c = i - this.f270j.mo91c();
        if (c <= 0) {
            return 0;
        }
        c = -m546c(c, aek, aep);
        int i2 = i + c;
        if (!z) {
            return c;
        }
        i2 -= this.f270j.mo91c();
        if (i2 <= 0) {
            return c;
        }
        this.f270j.mo89a(-i2);
        return c - i2;
    }

    private void m513a(acy acy) {
        m522f(acy.f309a, acy.f310b);
    }

    private void m522f(int i, int i2) {
        this.f262a.f321c = this.f270j.mo93d() - i2;
        this.f262a.f323e = this.f271k ? -1 : 1;
        this.f262a.f322d = i;
        this.f262a.f324f = 1;
        this.f262a.f320b = i2;
        this.f262a.f325g = nzf.UNSET_ENUM_VALUE;
    }

    private void m518b(acy acy) {
        m524g(acy.f309a, acy.f310b);
    }

    private void m524g(int i, int i2) {
        this.f262a.f321c = i2 - this.f270j.mo91c();
        this.f262a.f322d = i;
        this.f262a.f323e = this.f271k ? 1 : -1;
        this.f262a.f324f = -1;
        this.f262a.f320b = i2;
        this.f262a.f325g = nzf.UNSET_ENUM_VALUE;
    }

    protected boolean m562k() {
        return m502v() == 1;
    }

    void m563l() {
        if (this.f262a == null) {
            this.f262a = m564m();
        }
        if (this.f270j == null) {
            ads adt;
            switch (this.f269i) {
                case 0:
                    adt = new adt(this);
                    break;
                case 1:
                    adt = new adu(this);
                    break;
                default:
                    throw new IllegalArgumentException("invalid orientation");
            }
            this.f270j = adt;
        }
    }

    ada m564m() {
        return new ada();
    }

    public void mo51c(int i) {
        this.f272l = i;
        this.f273m = nzf.UNSET_ENUM_VALUE;
        if (this.f274n != null) {
            this.f274n.m649b();
        }
        m500t();
    }

    public int mo41a(int i, aek aek, aep aep) {
        if (this.f269i == 1) {
            return 0;
        }
        return m546c(i, aek, aep);
    }

    public int mo48b(int i, aek aek, aep aep) {
        if (this.f269i == 0) {
            return 0;
        }
        return m546c(i, aek, aep);
    }

    public int mo50c(aep aep) {
        return m525i(aep);
    }

    public int mo53d(aep aep) {
        return m525i(aep);
    }

    public int mo54e(aep aep) {
        return m526j(aep);
    }

    public int mo56f(aep aep) {
        return m526j(aep);
    }

    public int mo58g(aep aep) {
        return m527k(aep);
    }

    public int mo60h(aep aep) {
        return m527k(aep);
    }

    private int m525i(aep aep) {
        boolean z = false;
        if (m503w() == 0) {
            return 0;
        }
        m563l();
        ads ads = this.f270j;
        View a = m511a(!this.f266e, true);
        if (!this.f266e) {
            z = true;
        }
        return gwb.m1489a(aep, ads, a, m517b(z, true), (aef) this, this.f266e, this.f271k);
    }

    private int m526j(aep aep) {
        boolean z = false;
        if (m503w() == 0) {
            return 0;
        }
        m563l();
        ads ads = this.f270j;
        View a = m511a(!this.f266e, true);
        if (!this.f266e) {
            z = true;
        }
        return gwb.m1488a(aep, ads, a, m517b(z, true), (aef) this, this.f266e);
    }

    private int m527k(aep aep) {
        boolean z = false;
        if (m503w() == 0) {
            return 0;
        }
        m563l();
        ads ads = this.f270j;
        View a = m511a(!this.f266e, true);
        if (!this.f266e) {
            z = true;
        }
        return gwb.m1965b(aep, ads, a, m517b(z, true), this, this.f266e);
    }

    public void m545b(boolean z) {
        this.f266e = true;
    }

    private void m512a(int i, int i2, boolean z, aep aep) {
        int i3 = -1;
        int i4 = 1;
        this.f262a.f330l = m565n();
        this.f262a.f326h = m543b(aep);
        this.f262a.f324f = i;
        View N;
        ada ada;
        if (i == 1) {
            ada ada2 = this.f262a;
            ada2.f326h += this.f270j.mo99g();
            N = m509N();
            ada = this.f262a;
            if (!this.f271k) {
                i3 = 1;
            }
            ada.f323e = i3;
            this.f262a.f322d = m468d(N) + this.f262a.f323e;
            this.f262a.f320b = this.f270j.mo90b(N);
            i3 = this.f270j.mo90b(N) - this.f270j.mo93d();
        } else {
            N = m508M();
            ada = this.f262a;
            ada.f326h += this.f270j.mo91c();
            ada = this.f262a;
            if (!this.f271k) {
                i4 = -1;
            }
            ada.f323e = i4;
            this.f262a.f322d = m468d(N) + this.f262a.f323e;
            this.f262a.f320b = this.f270j.mo88a(N);
            i3 = (-this.f270j.mo88a(N)) + this.f270j.mo91c();
        }
        this.f262a.f321c = i2;
        if (z) {
            ada ada3 = this.f262a;
            ada3.f321c -= i3;
        }
        this.f262a.f325g = i3;
    }

    boolean m565n() {
        return this.f270j.mo100h() == 0 && this.f270j.mo95e() == 0;
    }

    int m546c(int i, aek aek, aep aep) {
        if (m503w() == 0 || i == 0) {
            return 0;
        }
        this.f262a.f319a = true;
        m563l();
        int i2 = i > 0 ? 1 : -1;
        int abs = Math.abs(i);
        m512a(i2, abs, true, aep);
        int a = this.f262a.f325g + m529a(aek, this.f262a, aep, false);
        if (a < 0) {
            return 0;
        }
        if (abs > a) {
            i = i2 * a;
        }
        this.f270j.mo89a(-i);
        this.f262a.f328j = i;
        return i;
    }

    public void mo47a(String str) {
        if (this.f274n == null) {
            super.mo47a(str);
        }
    }

    private void m514a(aek aek, int i, int i2) {
        if (i != i2) {
            if (i2 > i) {
                for (int i3 = i2 - 1; i3 >= i; i3--) {
                    m416a(i3, aek);
                }
                return;
            }
            while (i > i2) {
                m416a(i, aek);
                i--;
            }
        }
    }

    private void m515a(aek aek, ada ada) {
        if (ada.f319a && !ada.f330l) {
            int i;
            int w;
            int e;
            View g;
            View g2;
            if (ada.f324f == -1) {
                i = ada.f325g;
                w = m503w();
                if (i >= 0) {
                    e = this.f270j.mo95e() - i;
                    if (this.f271k) {
                        for (i = 0; i < w; i++) {
                            g = m484g(i);
                            if (this.f270j.mo88a(g) < e || this.f270j.mo94d(g) < e) {
                                m514a(aek, 0, i);
                                return;
                            }
                        }
                        return;
                    }
                    for (i = w - 1; i >= 0; i--) {
                        g2 = m484g(i);
                        if (this.f270j.mo88a(g2) < e || this.f270j.mo94d(g2) < e) {
                            m514a(aek, w - 1, i);
                            return;
                        }
                    }
                    return;
                }
                return;
            }
            w = ada.f325g;
            if (w >= 0) {
                e = m503w();
                if (this.f271k) {
                    for (i = e - 1; i >= 0; i--) {
                        g2 = m484g(i);
                        if (this.f270j.mo90b(g2) > w || this.f270j.mo92c(g2) > w) {
                            m514a(aek, e - 1, i);
                            return;
                        }
                    }
                    return;
                }
                for (i = 0; i < e; i++) {
                    g = m484g(i);
                    if (this.f270j.mo90b(g) > w || this.f270j.mo92c(g) > w) {
                        m514a(aek, 0, i);
                        return;
                    }
                }
            }
        }
    }

    int m529a(aek aek, ada ada, aep aep, boolean z) {
        int i = ada.f321c;
        if (ada.f325g != nzf.UNSET_ENUM_VALUE) {
            if (ada.f321c < 0) {
                ada.f325g += ada.f321c;
            }
            m515a(aek, ada);
        }
        int i2 = ada.f321c + ada.f326h;
        acz acz = this.f268g;
        while (true) {
            if ((!ada.f330l && i2 <= 0) || !ada.m647a(aep)) {
                break;
            }
            acz.m642a();
            mo70a(aek, aep, ada, acz);
            if (!acz.f315b) {
                ada.f320b += acz.f314a * ada.f324f;
                if (!(acz.f316c && this.f262a.f329k == null && aep.m842a())) {
                    ada.f321c -= acz.f314a;
                    i2 -= acz.f314a;
                }
                if (ada.f325g != nzf.UNSET_ENUM_VALUE) {
                    ada.f325g += acz.f314a;
                    if (ada.f321c < 0) {
                        ada.f325g += ada.f321c;
                    }
                    m515a(aek, ada);
                }
                if (z && acz.f317d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i - ada.f321c;
    }

    void mo70a(aek aek, aep aep, ada ada, acz acz) {
        View a = ada.m645a(aek);
        if (a == null) {
            acz.f315b = true;
            return;
        }
        int f;
        int i;
        int i2;
        int i3;
        aeg aeg = (aeg) a.getLayoutParams();
        if (ada.f329k == null) {
            if (this.f271k == (ada.f324f == -1)) {
                m452b(a);
            } else {
                m453b(a, 0);
            }
        } else {
            boolean z;
            boolean z2 = this.f271k;
            if (ada.f324f == -1) {
                z = true;
            } else {
                z = false;
            }
            if (z2 == z) {
                m426a(a);
            } else {
                m427a(a, 0);
            }
        }
        m428a(a, 0, 0);
        acz.f314a = this.f270j.mo96e(a);
        if (this.f269i == 1) {
            int z3;
            if (m562k()) {
                z3 = m506z() - m401D();
                f = z3 - this.f270j.mo98f(a);
            } else {
                f = m399B();
                z3 = this.f270j.mo98f(a) + f;
            }
            if (ada.f324f == -1) {
                i = ada.f320b;
                i2 = ada.f320b - acz.f314a;
                i3 = z3;
            } else {
                i2 = ada.f320b;
                i = acz.f314a + ada.f320b;
                i3 = z3;
            }
        } else {
            i2 = m400C();
            i = i2 + this.f270j.mo98f(a);
            if (ada.f324f == -1) {
                f = ada.f320b - acz.f314a;
                i3 = ada.f320b;
            } else {
                f = ada.f320b;
                i3 = ada.f320b + acz.f314a;
            }
        }
        m429a(a, f, i2, i3, i);
        if (aeg.m611d() || aeg.m612e()) {
            acz.f316c = true;
        }
        acz.f317d = a.isFocusable();
    }

    boolean mo63o() {
        return (m505y() == 1073741824 || m504x() == 1073741824 || !m408K()) ? false : true;
    }

    int m550d(int i) {
        switch (i) {
            case 1:
                if (this.f269i == 1 || !m562k()) {
                    return -1;
                }
                return 1;
            case 2:
                if (this.f269i == 1) {
                    return 1;
                }
                if (m562k()) {
                    return -1;
                }
                return 1;
            case wi.dK /*17*/:
                return this.f269i != 0 ? nzf.UNSET_ENUM_VALUE : -1;
            case 33:
                return this.f269i != 1 ? nzf.UNSET_ENUM_VALUE : -1;
            case 66:
                return this.f269i == 0 ? 1 : nzf.UNSET_ENUM_VALUE;
            case 130:
                return this.f269i == 1 ? 1 : nzf.UNSET_ENUM_VALUE;
            default:
                return nzf.UNSET_ENUM_VALUE;
        }
    }

    private View m508M() {
        return m484g(this.f271k ? m503w() - 1 : 0);
    }

    private View m509N() {
        return m484g(this.f271k ? 0 : m503w() - 1);
    }

    private View m511a(boolean z, boolean z2) {
        if (this.f271k) {
            return m530a(m503w() - 1, -1, z, true);
        }
        return m530a(0, m503w(), z, true);
    }

    private View m517b(boolean z, boolean z2) {
        if (this.f271k) {
            return m530a(0, m503w(), z, true);
        }
        return m530a(m503w() - 1, -1, z, true);
    }

    private View m519d(aek aek, aep aep) {
        if (this.f271k) {
            return m521f(aek, aep);
        }
        return m523g(aek, aep);
    }

    private View m520e(aek aek, aep aep) {
        if (this.f271k) {
            return m523g(aek, aep);
        }
        return m521f(aek, aep);
    }

    private View m521f(aek aek, aep aep) {
        return mo67a(aek, aep, 0, m503w(), aep.m845d());
    }

    private View m523g(aek aek, aep aep) {
        return mo67a(aek, aep, m503w() - 1, -1, aep.m845d());
    }

    View mo67a(aek aek, aep aep, int i, int i2, int i3) {
        View view = null;
        m563l();
        int c = this.f270j.mo91c();
        int d = this.f270j.mo93d();
        int i4 = i2 > i ? 1 : -1;
        View view2 = null;
        while (i != i2) {
            View view3;
            View g = m484g(i);
            int d2 = m468d(g);
            if (d2 >= 0 && d2 < i3) {
                if (((aeg) g.getLayoutParams()).m611d()) {
                    if (view2 == null) {
                        view3 = view;
                        i += i4;
                        view = view3;
                        view2 = g;
                    }
                } else if (this.f270j.mo88a(g) < d && this.f270j.mo90b(g) >= c) {
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

    public int m567p() {
        View a = m530a(0, m503w(), false, true);
        return a == null ? -1 : m468d(a);
    }

    public int m568q() {
        View a = m530a(0, m503w(), true, false);
        return a == null ? -1 : m468d(a);
    }

    public int m569r() {
        View a = m530a(m503w() - 1, -1, false, true);
        if (a == null) {
            return -1;
        }
        return m468d(a);
    }

    public int m570s() {
        View a = m530a(m503w() - 1, -1, true, false);
        if (a == null) {
            return -1;
        }
        return m468d(a);
    }

    View m530a(int i, int i2, boolean z, boolean z2) {
        m563l();
        int c = this.f270j.mo91c();
        int d = this.f270j.mo93d();
        int i3 = i2 > i ? 1 : -1;
        View view = null;
        while (i != i2) {
            View g = m484g(i);
            int a = this.f270j.mo88a(g);
            int b = this.f270j.mo90b(g);
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

    public View mo42a(View view, int i, aek aek, aep aep) {
        m507L();
        if (m503w() == 0) {
            return null;
        }
        int d = m550d(i);
        if (d == nzf.UNSET_ENUM_VALUE) {
            return null;
        }
        View e;
        m563l();
        if (d == -1) {
            e = m520e(aek, aep);
        } else {
            e = m519d(aek, aep);
        }
        if (e == null) {
            return null;
        }
        View M;
        m563l();
        m512a(d, (int) (0.33333334f * ((float) this.f270j.mo97f())), false, aep);
        this.f262a.f325g = nzf.UNSET_ENUM_VALUE;
        this.f262a.f319a = false;
        m529a(aek, this.f262a, aep, true);
        if (d == -1) {
            M = m508M();
        } else {
            M = m509N();
        }
        if (M == e || !M.isFocusable()) {
            return null;
        }
        return M;
    }

    public boolean mo57f() {
        return this.f274n == null && this.f263b == this.f265d;
    }
}
