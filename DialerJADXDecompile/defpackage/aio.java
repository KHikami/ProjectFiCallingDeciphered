package defpackage;

import android.database.Cursor;

/* compiled from: PG */
/* renamed from: aio */
public final class aio {
    public aio(Cursor cursor) {
        aio.a(cursor, "mode", -1);
        aio.a(cursor, "status");
        int columnIndex = cursor.getColumnIndex("status_ts");
        if (!cursor.isNull(columnIndex)) {
            cursor.getLong(columnIndex);
        }
        aio.a(cursor, "status_res_package");
        aio.a(cursor, "status_icon", -1);
        aio.a(cursor, "status_label", -1);
    }

    private static String a(Cursor cursor, String str) {
        return cursor.getString(cursor.getColumnIndex(str));
    }

    private static int a(Cursor cursor, String str, int i) {
        int columnIndex = cursor.getColumnIndex(str);
        return cursor.isNull(columnIndex) ? -1 : cursor.getInt(columnIndex);
    }
}
