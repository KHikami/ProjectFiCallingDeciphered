package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.List;

final class erf implements esn {
    private static final Handler d = new Handler(Looper.getMainLooper());
    public final String a;
    public etu b;
    final List<erh> c = new ArrayList();
    private int e;

    public erf(String str) {
        this.a = str;
    }

    void a(int i, boolean z) {
        if (z) {
            this.e = i;
        } else if (this.e == i) {
            this.e = 0;
        }
    }

    public int a(fbc fbc, int i) {
        int a = this.b.a(fbc, i);
        if (a != 0) {
            a(a);
        }
        return a;
    }

    public int a(Cursor cursor) {
        int a = this.b.a(cursor);
        if (a != 0) {
            a(a);
        }
        return a;
    }

    public boolean a(etx etx, Object obj, long j) {
        boolean a = this.b.a(etx, obj, j);
        if (a) {
            a(etx.l);
        }
        return a;
    }

    boolean a(erl erl, int i) {
        int b;
        boolean z = true;
        this.c.add(new erh(erl, i));
        long a = glj.a();
        if (this.b != null) {
            b = this.b.b(i, a);
            if (this.b.a(i, a)) {
                z = false;
            }
        } else {
            b = 0;
        }
        if (b != 0) {
            erl.a(this.b);
        }
        if (z && this.e != 0) {
            this.e = 0;
        }
        return z;
    }

    boolean a(erl erl) {
        for (int size = this.c.size() - 1; size >= 0; size--) {
            if (((erh) this.c.get(size)).b == erl) {
                this.c.remove(size);
            }
        }
        return !this.c.isEmpty();
    }

    int a(long j) {
        int i = j <= 0 ? 1 : 0;
        if (i == 0 && this.e != 0) {
            return 0;
        }
        int i2 = 0;
        for (erh erh : this.c) {
            i2 = erh.a | i2;
        }
        if (i == 0 && this.b != null && this.b.a(i2, j)) {
            return 0;
        }
        return i2;
    }

    public void a(int i, ContentValues contentValues) {
        if (this.b != null) {
            this.b.a(i, contentValues);
        }
    }

    private void a(int i) {
        d.post(new erg(this, i));
    }
}
