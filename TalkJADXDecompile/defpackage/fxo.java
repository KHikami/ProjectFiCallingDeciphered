package defpackage;

import android.database.Cursor;

/* renamed from: fxo */
public final class fxo {
    public static final String[] a;
    public static final int b;
    public static final int c;
    private static int d;

    static {
        a = new String[]{"address", "charset"};
        d = 0;
        d = 1;
        b = 0;
        int i = d;
        d = i + 1;
        c = i;
    }

    public static String a(Cursor cursor) {
        return gwb.a(gwb.c(cursor.getString(b), 4), cursor.getInt(c));
    }
}
