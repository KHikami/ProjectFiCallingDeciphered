package p000;

import android.content.ContentValues;
import android.database.Cursor;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.List;

final class erf implements esn {
    private static final Handler f12114d = new Handler(Looper.getMainLooper());
    public final String f12115a;
    public etu f12116b;
    final List<erh> f12117c = new ArrayList();
    private int f12118e;

    public erf(String str) {
        this.f12115a = str;
    }

    void m14323a(int i, boolean z) {
        if (z) {
            this.f12118e = i;
        } else if (this.f12118e == i) {
            this.f12118e = 0;
        }
    }

    public int mo1938a(fbc fbc, int i) {
        int a = this.f12116b.mo1938a(fbc, i);
        if (a != 0) {
            m14318a(a);
        }
        return a;
    }

    public int mo1937a(Cursor cursor) {
        int a = this.f12116b.mo1937a(cursor);
        if (a != 0) {
            m14318a(a);
        }
        return a;
    }

    public boolean mo1940a(etx etx, Object obj, long j) {
        boolean a = this.f12116b.mo1940a(etx, obj, j);
        if (a) {
            m14318a(etx.f12271l);
        }
        return a;
    }

    boolean m14325a(erl erl, int i) {
        int b;
        boolean z = true;
        this.f12117c.add(new erh(erl, i));
        long a = glj.m17956a();
        if (this.f12116b != null) {
            b = this.f12116b.m14518b(i, a);
            if (this.f12116b.m14514a(i, a)) {
                z = false;
            }
        } else {
            b = 0;
        }
        if (b != 0) {
            erl.mo982a(this.f12116b);
        }
        if (z && this.f12118e != 0) {
            this.f12118e = 0;
        }
        return z;
    }

    boolean m14324a(erl erl) {
        for (int size = this.f12117c.size() - 1; size >= 0; size--) {
            if (((erh) this.f12117c.get(size)).f12122b == erl) {
                this.f12117c.remove(size);
            }
        }
        return !this.f12117c.isEmpty();
    }

    int m14319a(long j) {
        int i = j <= 0 ? 1 : 0;
        if (i == 0 && this.f12118e != 0) {
            return 0;
        }
        int i2 = 0;
        for (erh erh : this.f12117c) {
            i2 = erh.f12121a | i2;
        }
        if (i == 0 && this.f12116b != null && this.f12116b.m14514a(i2, j)) {
            return 0;
        }
        return i2;
    }

    public void mo1939a(int i, ContentValues contentValues) {
        if (this.f12116b != null) {
            this.f12116b.mo1939a(i, contentValues);
        }
    }

    private void m14318a(int i) {
        f12114d.post(new erg(this, i));
    }
}
