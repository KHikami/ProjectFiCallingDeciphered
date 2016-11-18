package p000;

import android.database.Cursor;

public abstract class fmz<C extends Cursor> {
    private boolean f11358a;
    private boolean f11359b;
    public fna f11360c;
    private final int f11361d;
    private final int f11362e;
    private C f11363f;
    private boolean f11364g;
    private int f11365h;

    public abstract void mo1861a(aer aer);

    public abstract void mo1862a(aer aer, C c, int i);

    public fmz(int i, int i2, boolean z, boolean z2, fna fna) {
        this.f11361d = i;
        this.f11362e = i2;
        this.f11359b = z2;
        this.f11358a = z;
        this.f11360c = fna;
        mo1872a();
    }

    public int m13775b() {
        return this.f11361d;
    }

    public int m13777c() {
        return this.f11362e;
    }

    public void m13773a(fna fna) {
        this.f11360c = fna;
    }

    public void m13774a(boolean z) {
        if (this.f11358a != z) {
            boolean d = m13778d();
            this.f11358a = z;
            if (d != m13778d()) {
                int c = this.f11360c.mo1874c(this);
                if (d) {
                    this.f11365h--;
                    if (this.f11360c.mo1873b(this)) {
                        this.f11360c.mo1876i(-1);
                        this.f11360c.mo1875g().m752e(c);
                        return;
                    }
                    return;
                }
                this.f11365h++;
                if (this.f11360c.mo1873b(this)) {
                    this.f11360c.mo1876i(1);
                    this.f11360c.mo1875g().m750d(c);
                }
            }
        }
    }

    public boolean m13778d() {
        return this.f11358a && (this.f11359b || m13767j() > 0);
    }

    public boolean m13779e() {
        return this.f11365h == 0;
    }

    public int m13780f() {
        return this.f11365h;
    }

    public boolean m13781g() {
        return this.f11363f != null;
    }

    public boolean m13782h() {
        return this.f11364g;
    }

    public void m13776b(boolean z) {
        this.f11364g = true;
    }

    public C m13783i() {
        return this.f11363f;
    }

    public void m13772a(C c) {
        int i = 0;
        if (this.f11363f != c) {
            if (this.f11364g && c != null) {
                this.f11364g = false;
            }
            boolean b = this.f11360c.mo1873b(this);
            int c2 = this.f11360c.mo1874c(this);
            if (b) {
                b = m13778d();
                int i2 = this.f11365h;
                this.f11363f = c;
                mo1872a();
                boolean d = m13778d();
                int i3 = this.f11365h;
                this.f11360c.mo1876i(i3 - i2);
                if (b && d) {
                    i = 1;
                }
                if (i3 > i2) {
                    this.f11360c.mo1875g().m738a(c2 + i, i2 - i);
                    this.f11360c.mo1875g().m749c(c2 + i2, i3 - i2);
                    return;
                } else if (i2 > i3) {
                    this.f11360c.mo1875g().m738a(c2 + i, i3 - i);
                    this.f11360c.mo1875g().m751d(c2 + i3, i2 - i3);
                    return;
                } else {
                    this.f11360c.mo1875g().m738a(c2 + i, i3 - i);
                    return;
                }
            }
            this.f11363f = c;
        }
    }

    private void mo1872a() {
        int j = m13767j();
        if (this.f11358a && (this.f11359b || j > 0)) {
            j++;
        }
        this.f11365h = j;
    }

    private int m13767j() {
        if (this.f11363f == null || this.f11363f.isClosed()) {
            return 0;
        }
        return this.f11363f.getCount();
    }

    public int m13768a(int i) {
        if (this.f11358a) {
            i--;
        }
        if (i == -1) {
            return this.f11361d;
        }
        return this.f11362e;
    }

    public void m13770a(aer aer, int i) {
        if (this.f11358a) {
            i--;
        }
        if (i == -1) {
            mo1861a(aer);
        } else if (this.f11363f.moveToPosition(i)) {
            mo1862a(aer, this.f11363f, i);
        } else {
            throw new IllegalStateException("Couldn't move cursor to position " + i);
        }
    }
}
