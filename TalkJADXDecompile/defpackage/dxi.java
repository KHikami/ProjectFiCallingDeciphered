package defpackage;

import android.database.Cursor;
import android.text.TextUtils;

/* renamed from: dxi */
class dxi {
    public String a;
    public String b;
    public String c;
    public String d;
    public boolean e;
    public boolean f;
    public String g;
    public String h;
    public String i;
    public long j;
    public String k;
    public float l;

    dxi() {
    }

    protected static void a(Cursor cursor, dxi dxi) {
        dxi.a = cursor.getString(3);
        dxi.b = cursor.getString(4);
        dxi.c = cursor.getString(5);
        dxi.d = cursor.getString(6);
        dxi.f = gld.d(cursor.getInt(7));
        dxi.e = gld.d(cursor.getInt(8));
        dxi.g = cursor.getString(9);
        dxi.h = cursor.getString(10);
        dxi.i = cursor.getString(11);
        dxi.j = cursor.getLong(12);
        dxi.k = cursor.getString(14);
        dxi.l = cursor.getFloat(15);
    }

    boolean a() {
        return this.a == null || TextUtils.isEmpty(this.a.trim());
    }

    private Object[] b() {
        return new Object[]{Boolean.valueOf(this.e), Boolean.valueOf(this.f), Long.valueOf(this.j), this.a, this.b, this.c, this.d, this.g, this.h, this.i, this.k};
    }

    public boolean equals(Object obj) {
        return obj != null && (obj instanceof dxi) && gwb.h(b(), ((dxi) obj).b());
    }

    public int hashCode() {
        return gwb.c(b());
    }
}
