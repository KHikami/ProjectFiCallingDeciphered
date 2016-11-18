package defpackage;

import android.content.Context;
import android.database.Cursor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class fmy<P extends fmz<? extends Cursor>, RVH extends aer> extends ady<RVH> implements fna {
    private final Context b;
    private final List<P> c;
    private int d;

    public fmy(Context context) {
        this(context, 2);
    }

    private fmy(Context context, int i) {
        this.d = 0;
        this.b = context;
        this.c = new ArrayList(2);
        a(true);
    }

    public Context e() {
        return this.b;
    }

    public P a(P p) {
        p.a((fna) this);
        return a(this.c.size(), (fmz) p);
    }

    public P a(int i, P p) {
        if (this.c.contains(p)) {
            return null;
        }
        this.c.add(i, p);
        int f = p.f();
        if (f <= 0) {
            return p;
        }
        int g = g(i);
        this.d += f;
        c(g, f);
        return p;
    }

    public P f(int i) {
        return (fmz) this.c.get(i);
    }

    public List<P> f() {
        return Collections.unmodifiableList(this.c);
    }

    public int a() {
        return this.d;
    }

    public int g(int i) {
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += ((fmz) this.c.get(i3)).f();
        }
        return i2;
    }

    public int h(int i) {
        ba.b(i, this.d);
        for (int i2 = 0; i2 < this.c.size(); i2++) {
            int f = ((fmz) this.c.get(i2)).f();
            if (i < f) {
                return i2;
            }
            i -= f;
        }
        return -1;
    }

    public int a(int i) {
        for (fmz fmz : this.c) {
            int f = fmz.f();
            if (i < f) {
                return fmz.a(i);
            }
            i -= f;
        }
        throw new ArrayIndexOutOfBoundsException(i);
    }

    public void a(RVH rvh, int i) {
        for (fmz fmz : this.c) {
            int f = fmz.f();
            if (i < f) {
                fmz.a(rvh, i);
                return;
            }
            i -= f;
        }
        throw new ArrayIndexOutOfBoundsException(i);
    }

    public long b(int i) {
        return (long) i;
    }

    public void i(int i) {
        this.d += i;
    }

    public ady<RVH> g() {
        return this;
    }

    public boolean b(fmz<? extends Cursor> fmz__extends_android_database_Cursor) {
        for (fmz<? extends Cursor> fmz__extends_android_database_Cursor2 : this.c) {
            if (fmz__extends_android_database_Cursor2 == fmz__extends_android_database_Cursor) {
                return true;
            }
        }
        return false;
    }

    public int c(fmz<? extends Cursor> fmz__extends_android_database_Cursor) {
        int i = 0;
        for (fmz<? extends Cursor> fmz__extends_android_database_Cursor2 : this.c) {
            if (fmz__extends_android_database_Cursor2 == fmz__extends_android_database_Cursor) {
                return i;
            }
            i = fmz__extends_android_database_Cursor2.f() + i;
        }
        return -1;
    }
}
