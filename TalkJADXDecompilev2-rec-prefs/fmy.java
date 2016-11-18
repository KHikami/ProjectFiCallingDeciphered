package p000;

import android.content.Context;
import android.database.Cursor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class fmy<P extends fmz<? extends Cursor>, RVH extends aer> extends ady<RVH> implements fna {
    private final Context f11416b;
    private final List<P> f11417c;
    private int f11418d;

    public fmy(Context context) {
        this(context, 2);
    }

    private fmy(Context context, int i) {
        this.f11418d = 0;
        this.f11416b = context;
        this.f11417c = new ArrayList(2);
        m743a(true);
    }

    public Context m13856e() {
        return this.f11416b;
    }

    public P m13851a(P p) {
        p.m13773a((fna) this);
        return m13850a(this.f11417c.size(), (fmz) p);
    }

    public P m13850a(int i, P p) {
        if (this.f11417c.contains(p)) {
            return null;
        }
        this.f11417c.add(i, p);
        int f = p.m13780f();
        if (f <= 0) {
            return p;
        }
        int g = m13859g(i);
        this.f11418d += f;
        m749c(g, f);
        return p;
    }

    public P m13857f(int i) {
        return (fmz) this.f11417c.get(i);
    }

    public List<P> m13858f() {
        return Collections.unmodifiableList(this.f11417c);
    }

    public int mo736a() {
        return this.f11418d;
    }

    public int m13859g(int i) {
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += ((fmz) this.f11417c.get(i3)).m13780f();
        }
        return i2;
    }

    public int m13861h(int i) {
        ba.m4592b(i, this.f11418d);
        for (int i2 = 0; i2 < this.f11417c.size(); i2++) {
            int f = ((fmz) this.f11417c.get(i2)).m13780f();
            if (i < f) {
                return i2;
            }
            i -= f;
        }
        return -1;
    }

    public int mo737a(int i) {
        for (fmz fmz : this.f11417c) {
            int f = fmz.m13780f();
            if (i < f) {
                return fmz.m13768a(i);
            }
            i -= f;
        }
        throw new ArrayIndexOutOfBoundsException(i);
    }

    public void mo740a(RVH rvh, int i) {
        for (fmz fmz : this.f11417c) {
            int f = fmz.m13780f();
            if (i < f) {
                fmz.m13770a(rvh, i);
                return;
            }
            i -= f;
        }
        throw new ArrayIndexOutOfBoundsException(i);
    }

    public long mo741b(int i) {
        return (long) i;
    }

    public void mo1876i(int i) {
        this.f11418d += i;
    }

    public ady<RVH> mo1875g() {
        return this;
    }

    public boolean mo1873b(fmz<? extends Cursor> fmz__extends_android_database_Cursor) {
        for (fmz<? extends Cursor> fmz__extends_android_database_Cursor2 : this.f11417c) {
            if (fmz__extends_android_database_Cursor2 == fmz__extends_android_database_Cursor) {
                return true;
            }
        }
        return false;
    }

    public int mo1874c(fmz<? extends Cursor> fmz__extends_android_database_Cursor) {
        int i = 0;
        for (fmz<? extends Cursor> fmz__extends_android_database_Cursor2 : this.f11417c) {
            if (fmz__extends_android_database_Cursor2 == fmz__extends_android_database_Cursor) {
                return i;
            }
            i = fmz__extends_android_database_Cursor2.m13780f() + i;
        }
        return -1;
    }
}
