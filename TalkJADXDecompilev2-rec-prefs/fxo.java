package p000;

import android.database.Cursor;

public final class fxo {
    public static final String[] f14254a = new String[]{"address", "charset"};
    public static final int f14255b = 0;
    public static final int f14256c;
    private static int f14257d;

    static {
        f14257d = 0;
        f14257d = 1;
        int i = f14257d;
        f14257d = i + 1;
        f14256c = i;
    }

    public static String m16482a(Cursor cursor) {
        return gwb.m1676a(gwb.m2118c(cursor.getString(f14255b), 4), cursor.getInt(f14256c));
    }
}
