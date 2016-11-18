package defpackage;

import android.database.Cursor;

public final class fxr extends fxn {
    public static final String[] a = new String[]{"_id", "type", "address", "body", "date", "thread_id", "status", "read", "seen", "date_sent"};
    public static final String[] b = new String[]{"_id", "type", "address", "body", "date", "thread_id", "status", "read", "seen"};
    public static final int c = 0;
    public static final int d;
    public static final int e;
    public static final int f;
    public static final int g;
    public static final int h;
    public static final int i;
    public static final int j;
    public static final int k;
    public static final int l;
    private static int w;
    public String m;
    public String n;
    public long o;
    public long p;
    public long q;
    public int r;
    public long s;
    public int t;
    public boolean u;
    public boolean v;

    static {
        w = 0;
        w = 1;
        int i = w;
        w = i + 1;
        d = i;
        i = w;
        w = i + 1;
        e = i;
        i = w;
        w = i + 1;
        f = i;
        i = w;
        w = i + 1;
        g = i;
        i = w;
        w = i + 1;
        h = i;
        i = w;
        w = i + 1;
        i = i;
        i = w;
        w = i + 1;
        j = i;
        i = w;
        w = i + 1;
        k = i;
        i = w;
        w = i + 1;
        l = i;
    }

    public void a(Cursor cursor) {
        boolean z;
        boolean z2 = false;
        this.o = cursor.getLong(c);
        this.m = cursor.getString(e);
        this.n = cursor.getString(f);
        this.p = cursor.getLong(g) * 1000;
        this.q = fyi.f() ? cursor.getLong(l) * 1000 : 0;
        this.r = cursor.getInt(d);
        this.s = cursor.getLong(h);
        this.t = cursor.getInt(i);
        if (cursor.getInt(j) == 0) {
            z = false;
        } else {
            z = true;
        }
        this.u = z;
        if (cursor.getInt(k) != 0) {
            z2 = true;
        }
        this.v = z2;
    }

    public long b() {
        return this.o;
    }

    public int a() {
        return 0;
    }

    public long c() {
        return this.p;
    }
}
