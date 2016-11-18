package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;

public final class fzp {
    private static final ContentValues n;
    private static final ContentValues o;
    private static final String[] p = new String[]{"1"};
    public final long a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final int f;
    public final String g;
    public int h;
    public String i;
    public String j;
    public String k;
    public String l;
    public String m;

    static {
        ContentValues contentValues = new ContentValues(1);
        n = contentValues;
        contentValues.putNull("current");
        contentValues = new ContentValues(1);
        o = contentValues;
        contentValues.put("current", "1");
    }

    private fzp(long j, String str, String str2, int i, int i2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        this.a = j;
        this.b = str;
        this.d = str2;
        this.f = i;
        this.h = i2;
        this.i = str3;
        this.j = str4;
        this.k = str5;
        this.l = str6;
        if (str7 == null) {
            str7 = "";
        }
        this.g = str7;
        if (str8 == null) {
            str8 = "";
        }
        this.e = str8;
        if (str9 == null) {
            str9 = "";
        }
        this.c = str9;
        if (str10 == null) {
            str10 = "";
        }
        this.m = str10;
    }

    public fzp(String str, String str2, int i) {
        this(-1, str, str2, i, -1, null, null, null, null, null, null, null, null);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("APN[");
        stringBuilder.append("rowId=").append(this.a).append("|");
        stringBuilder.append("mmsc=").append(this.b).append("|");
        stringBuilder.append("raw mmsc=").append(this.c).append("|");
        stringBuilder.append("proxy=").append(this.d).append("|");
        stringBuilder.append("raw proxy=").append(this.e).append("|");
        stringBuilder.append("port=").append(this.f).append("|");
        stringBuilder.append("raw port=").append(this.g).append("|");
        stringBuilder.append("numeric=").append(this.i).append("|");
        stringBuilder.append("name=").append(this.j).append("|");
        stringBuilder.append("mcc=").append(this.k).append("|");
        stringBuilder.append("mnc=").append(this.l).append("|");
        stringBuilder.append("raw apn").append(this.m).append("|");
        stringBuilder.append("current=").append(this.h).append("]");
        return stringBuilder.toString();
    }

    public static fzp a(Cursor cursor, boolean z) {
        String string;
        if (cursor == null || !fzo.b(cursor.getString(0), "mms")) {
            return null;
        }
        long j = -1;
        if (z) {
            j = cursor.getLong(4);
        }
        String string2 = cursor.getString(1);
        if (string2 != null) {
            Object trim = string2.trim();
        } else {
            String str = string2;
        }
        if (TextUtils.isEmpty(trim)) {
            return null;
        }
        String str2;
        int i;
        String str3;
        int parseInt;
        int i2;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String b = fzo.b(trim);
        String string3 = cursor.getString(2);
        str = string3 != null ? string3.trim() : string3;
        if (TextUtils.isEmpty(str)) {
            str2 = null;
            i = -1;
            str3 = str;
        } else {
            String b2 = fzo.b(str);
            try {
                str3 = cursor.getString(3);
                if (str3 != null) {
                    parseInt = Integer.parseInt(str3);
                } else {
                    parseInt = -1;
                }
                str2 = str3;
                str3 = b2;
                i = parseInt;
            } catch (Exception e) {
                str = String.valueOf(e);
                glk.e("Babel_SMS", new StringBuilder(String.valueOf(str).length() + 55).append("TransactionSettings.Apn.fromCursor: invalid proxy port ").append(str).toString(), new Object[0]);
                str2 = null;
                str3 = b2;
                i = -1;
            }
        }
        parseInt = 0;
        if (z) {
            try {
                string = cursor.getString(5);
                if (string != null) {
                    parseInt = Integer.parseInt(string);
                }
                i2 = parseInt;
            } catch (Exception e2) {
                string = String.valueOf(e2);
                glk.e("Babel_SMS", new StringBuilder(String.valueOf(string).length() + 58).append("TransactionSettings.Apn.fromCursor: invalid current value ").append(string).toString(), new Object[0]);
            }
            str4 = null;
            str5 = null;
            str6 = null;
            str7 = null;
            str8 = null;
            if (cursor.getColumnCount() >= 10) {
                str4 = cursor.getString(6);
                str5 = cursor.getString(7);
                str6 = cursor.getString(8);
                str7 = cursor.getString(9);
                str8 = cursor.getString(10);
            }
            return new fzp(j, b, str3, i, i2, str4, str5, str6, str7, str2, string3, string2, str8);
        }
        i2 = 0;
        str4 = null;
        str5 = null;
        str6 = null;
        str7 = null;
        str8 = null;
        if (cursor.getColumnCount() >= 10) {
            str4 = cursor.getString(6);
            str5 = cursor.getString(7);
            str6 = cursor.getString(8);
            str7 = cursor.getString(9);
            str8 = cursor.getString(10);
        }
        return new fzp(j, b, str3, i, i2, str4, str5, str6, str7, str2, string3, string2, str8);
    }

    public boolean a() {
        return !TextUtils.isEmpty(this.b);
    }

    public boolean b() {
        return !TextUtils.isEmpty(this.d);
    }

    public void a(Context context) {
        if (glk.a("Babel_SMS", 2)) {
            new StringBuilder(59).append("TransactionSettings: set ").append(this.a).append(" to be current");
        }
        SQLiteDatabase a = bjs.a(context);
        a.beginTransaction();
        try {
            a.update("apn", n, "current =?", p);
            a.update("apn", o, "_id =?", new String[]{Long.toString(this.a)});
            a.setTransactionSuccessful();
        } finally {
            a.endTransaction();
        }
    }
}
