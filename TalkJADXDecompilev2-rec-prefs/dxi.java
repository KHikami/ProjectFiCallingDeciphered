package p000;

import android.database.Cursor;
import android.text.TextUtils;

class dxi {
    public String f10747a;
    public String f10748b;
    public String f10749c;
    public String f10750d;
    public boolean f10751e;
    public boolean f10752f;
    public String f10753g;
    public String f10754h;
    public String f10755i;
    public long f10756j;
    public String f10757k;
    public float f10758l;

    dxi() {
    }

    protected static void m12974a(Cursor cursor, dxi dxi) {
        dxi.f10747a = cursor.getString(3);
        dxi.f10748b = cursor.getString(4);
        dxi.f10749c = cursor.getString(5);
        dxi.f10750d = cursor.getString(6);
        dxi.f10752f = gld.m17948d(cursor.getInt(7));
        dxi.f10751e = gld.m17948d(cursor.getInt(8));
        dxi.f10753g = cursor.getString(9);
        dxi.f10754h = cursor.getString(10);
        dxi.f10755i = cursor.getString(11);
        dxi.f10756j = cursor.getLong(12);
        dxi.f10757k = cursor.getString(14);
        dxi.f10758l = cursor.getFloat(15);
    }

    boolean m12976a() {
        return this.f10747a == null || TextUtils.isEmpty(this.f10747a.trim());
    }

    private Object[] m12975b() {
        return new Object[]{Boolean.valueOf(this.f10751e), Boolean.valueOf(this.f10752f), Long.valueOf(this.f10756j), this.f10747a, this.f10748b, this.f10749c, this.f10750d, this.f10753g, this.f10754h, this.f10755i, this.f10757k};
    }

    public boolean equals(Object obj) {
        return obj != null && (obj instanceof dxi) && gwb.m2240h(m12975b(), ((dxi) obj).m12975b());
    }

    public int hashCode() {
        return gwb.m2074c(m12975b());
    }
}
