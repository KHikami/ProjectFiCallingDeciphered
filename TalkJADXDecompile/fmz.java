import android.database.Cursor;

public abstract class fmz<C extends Cursor> {
    private boolean a;
    private boolean b;
    public fna c;
    private final int d;
    private final int e;
    private C f;
    private boolean g;
    private int h;

    public abstract void a(aer aer);

    public abstract void a(aer aer, C c, int i);

    public fmz(int i, int i2, boolean z, boolean z2, fna fna) {
        this.d = i;
        this.e = i2;
        this.b = z2;
        this.a = z;
        this.c = fna;
        a();
    }

    public int b() {
        return this.d;
    }

    public int c() {
        return this.e;
    }

    public void a(fna fna) {
        this.c = fna;
    }

    public void a(boolean z) {
        if (this.a != z) {
            boolean d = d();
            this.a = z;
            if (d != d()) {
                int c = this.c.c(this);
                if (d) {
                    this.h--;
                    if (this.c.b(this)) {
                        this.c.i(-1);
                        this.c.g().e(c);
                        return;
                    }
                    return;
                }
                this.h++;
                if (this.c.b(this)) {
                    this.c.i(1);
                    this.c.g().d(c);
                }
            }
        }
    }

    public boolean d() {
        return this.a && (this.b || j() > 0);
    }

    public boolean e() {
        return this.h == 0;
    }

    public int f() {
        return this.h;
    }

    public boolean g() {
        return this.f != null;
    }

    public boolean h() {
        return this.g;
    }

    public void b(boolean z) {
        this.g = true;
    }

    public C i() {
        return this.f;
    }

    public void a(C c) {
        int i = 0;
        if (this.f != c) {
            if (this.g && c != null) {
                this.g = false;
            }
            boolean b = this.c.b(this);
            int c2 = this.c.c(this);
            if (b) {
                b = d();
                int i2 = this.h;
                this.f = c;
                a();
                boolean d = d();
                int i3 = this.h;
                this.c.i(i3 - i2);
                if (b && d) {
                    i = 1;
                }
                if (i3 > i2) {
                    this.c.g().a(c2 + i, i2 - i);
                    this.c.g().c(c2 + i2, i3 - i2);
                    return;
                } else if (i2 > i3) {
                    this.c.g().a(c2 + i, i3 - i);
                    this.c.g().d(c2 + i3, i2 - i3);
                    return;
                } else {
                    this.c.g().a(c2 + i, i3 - i);
                    return;
                }
            }
            this.f = c;
        }
    }

    private void a() {
        int j = j();
        if (this.a && (this.b || j > 0)) {
            j++;
        }
        this.h = j;
    }

    private int j() {
        if (this.f == null || this.f.isClosed()) {
            return 0;
        }
        return this.f.getCount();
    }

    public int a(int i) {
        if (this.a) {
            i--;
        }
        if (i == -1) {
            return this.d;
        }
        return this.e;
    }

    public void a(aer aer, int i) {
        if (this.a) {
            i--;
        }
        if (i == -1) {
            a(aer);
        } else if (this.f.moveToPosition(i)) {
            a(aer, this.f, i);
        } else {
            throw new IllegalStateException("Couldn't move cursor to position " + i);
        }
    }
}
