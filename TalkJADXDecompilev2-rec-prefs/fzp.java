package p000;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;

public final class fzp {
    private static final ContentValues f14486n;
    private static final ContentValues f14487o;
    private static final String[] f14488p = new String[]{"1"};
    public final long f14489a;
    public final String f14490b;
    public final String f14491c;
    public final String f14492d;
    public final String f14493e;
    public final int f14494f;
    public final String f14495g;
    public int f14496h;
    public String f14497i;
    public String f14498j;
    public String f14499k;
    public String f14500l;
    public String f14501m;

    static {
        ContentValues contentValues = new ContentValues(1);
        f14486n = contentValues;
        contentValues.putNull("current");
        contentValues = new ContentValues(1);
        f14487o = contentValues;
        contentValues.put("current", "1");
    }

    private fzp(long j, String str, String str2, int i, int i2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        this.f14489a = j;
        this.f14490b = str;
        this.f14492d = str2;
        this.f14494f = i;
        this.f14496h = i2;
        this.f14497i = str3;
        this.f14498j = str4;
        this.f14499k = str5;
        this.f14500l = str6;
        if (str7 == null) {
            str7 = "";
        }
        this.f14495g = str7;
        if (str8 == null) {
            str8 = "";
        }
        this.f14493e = str8;
        if (str9 == null) {
            str9 = "";
        }
        this.f14491c = str9;
        if (str10 == null) {
            str10 = "";
        }
        this.f14501m = str10;
    }

    public fzp(String str, String str2, int i) {
        this(-1, str, str2, i, -1, null, null, null, null, null, null, null, null);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("APN[");
        stringBuilder.append("rowId=").append(this.f14489a).append("|");
        stringBuilder.append("mmsc=").append(this.f14490b).append("|");
        stringBuilder.append("raw mmsc=").append(this.f14491c).append("|");
        stringBuilder.append("proxy=").append(this.f14492d).append("|");
        stringBuilder.append("raw proxy=").append(this.f14493e).append("|");
        stringBuilder.append("port=").append(this.f14494f).append("|");
        stringBuilder.append("raw port=").append(this.f14495g).append("|");
        stringBuilder.append("numeric=").append(this.f14497i).append("|");
        stringBuilder.append("name=").append(this.f14498j).append("|");
        stringBuilder.append("mcc=").append(this.f14499k).append("|");
        stringBuilder.append("mnc=").append(this.f14500l).append("|");
        stringBuilder.append("raw apn").append(this.f14501m).append("|");
        stringBuilder.append("current=").append(this.f14496h).append("]");
        return stringBuilder.toString();
    }

    public static fzp m16715a(Cursor cursor, boolean z) {
        String string;
        if (cursor == null || !fzo.m16711b(cursor.getString(0), "mms")) {
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
        String b = fzo.m16710b(trim);
        String string3 = cursor.getString(2);
        str = string3 != null ? string3.trim() : string3;
        if (TextUtils.isEmpty(str)) {
            str2 = null;
            i = -1;
            str3 = str;
        } else {
            String b2 = fzo.m16710b(str);
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
                glk.m17982e("Babel_SMS", new StringBuilder(String.valueOf(str).length() + 55).append("TransactionSettings.Apn.fromCursor: invalid proxy port ").append(str).toString(), new Object[0]);
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
                glk.m17982e("Babel_SMS", new StringBuilder(String.valueOf(string).length() + 58).append("TransactionSettings.Apn.fromCursor: invalid current value ").append(string).toString(), new Object[0]);
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

    public boolean m16717a() {
        return !TextUtils.isEmpty(this.f14490b);
    }

    public boolean m16718b() {
        return !TextUtils.isEmpty(this.f14492d);
    }

    public void m16716a(Context context) {
        if (glk.m17973a("Babel_SMS", 2)) {
            new StringBuilder(59).append("TransactionSettings: set ").append(this.f14489a).append(" to be current");
        }
        SQLiteDatabase a = bjs.m5482a(context);
        a.beginTransaction();
        try {
            a.update("apn", f14486n, "current =?", f14488p);
            a.update("apn", f14487o, "_id =?", new String[]{Long.toString(this.f14489a)});
            a.setTransactionSuccessful();
        } finally {
            a.endTransaction();
        }
    }
}
