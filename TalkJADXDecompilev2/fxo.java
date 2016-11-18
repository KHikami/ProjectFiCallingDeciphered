package defpackage;

import android.database.Cursor;

public final class fxo {
    public static final String[] a = new String[]{"address", "charset"};
    public static final int b = 0;
    public static final int c;
    private static int d;

    static {
        d = 0;
        d = 1;
        int i = d;
        d = i + 1;
        c = i;
    }

    public static String a(Cursor cursor) {
        return gwb.a(gwb.c(cursor.getString(b), 4), cursor.getInt(c));
    }
}
