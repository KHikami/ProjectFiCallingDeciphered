package p000;

import android.database.Cursor;

public final class fxr extends fxn {
    public static final String[] f14305a = new String[]{"_id", "type", "address", "body", "date", "thread_id", "status", "read", "seen", "date_sent"};
    public static final String[] f14306b = new String[]{"_id", "type", "address", "body", "date", "thread_id", "status", "read", "seen"};
    public static final int f14307c = 0;
    public static final int f14308d;
    public static final int f14309e;
    public static final int f14310f;
    public static final int f14311g;
    public static final int f14312h;
    public static final int f14313i;
    public static final int f14314j;
    public static final int f14315k;
    public static final int f14316l;
    private static int f14317w;
    public String f14318m;
    public String f14319n;
    public long f14320o;
    public long f14321p;
    public long f14322q;
    public int f14323r;
    public long f14324s;
    public int f14325t;
    public boolean f14326u;
    public boolean f14327v;

    static {
        f14317w = 0;
        f14317w = 1;
        int i = f14317w;
        f14317w = i + 1;
        f14308d = i;
        i = f14317w;
        f14317w = i + 1;
        f14309e = i;
        i = f14317w;
        f14317w = i + 1;
        f14310f = i;
        i = f14317w;
        f14317w = i + 1;
        f14311g = i;
        i = f14317w;
        f14317w = i + 1;
        f14312h = i;
        i = f14317w;
        f14317w = i + 1;
        f14313i = i;
        i = f14317w;
        f14317w = i + 1;
        f14314j = i;
        i = f14317w;
        f14317w = i + 1;
        f14315k = i;
        i = f14317w;
        f14317w = i + 1;
        f14316l = i;
    }

    public void m16507a(Cursor cursor) {
        boolean z;
        boolean z2 = false;
        this.f14320o = cursor.getLong(f14307c);
        this.f14318m = cursor.getString(f14309e);
        this.f14319n = cursor.getString(f14310f);
        this.f14321p = cursor.getLong(f14311g) * 1000;
        this.f14322q = fyi.m16634f() ? cursor.getLong(f14316l) * 1000 : 0;
        this.f14323r = cursor.getInt(f14308d);
        this.f14324s = cursor.getLong(f14312h);
        this.f14325t = cursor.getInt(f14313i);
        if (cursor.getInt(f14314j) == 0) {
            z = false;
        } else {
            z = true;
        }
        this.f14326u = z;
        if (cursor.getInt(f14315k) != 0) {
            z2 = true;
        }
        this.f14327v = z2;
    }

    public long mo2113b() {
        return this.f14320o;
    }

    public int mo2112a() {
        return 0;
    }

    public long mo2114c() {
        return this.f14321p;
    }
}
