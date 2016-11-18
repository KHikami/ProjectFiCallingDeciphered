package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import java.util.List;
import java.util.Locale;

public final class fzo {
    public static final String[] a = new String[]{"type", "mmsc", "mmsproxy", "mmsport"};
    private List<fzp> b;
    private boolean c;

    private fzo() {
        this(false);
    }

    private fzo(boolean z) {
        this.b = ba.e();
        this.c = z;
    }

    private void a(fzp fzp) {
        synchronized (this) {
            if (fzp != null) {
                if (fzp.a()) {
                    this.b.add(fzp);
                }
            }
        }
    }

    public List<fzp> a() {
        List a;
        synchronized (this) {
            a = mjq.a(this.b);
        }
        return a;
    }

    public boolean b() {
        boolean z;
        synchronized (this) {
            z = this.b.size() > 0;
        }
        return z;
    }

    private static fzo b(Context context, String str) {
        fzo fzo = null;
        if (!fyi.b(context)) {
            return fzo;
        }
        String[] strArr;
        String str2 = "current IS NOT NULL";
        if (TextUtils.isEmpty(str)) {
            strArr = fzo;
        } else {
            String valueOf = String.valueOf(str2);
            String valueOf2 = String.valueOf(" AND apn=?");
            if (valueOf2.length() != 0) {
                valueOf2 = valueOf.concat(valueOf2);
            } else {
                valueOf2 = new String(valueOf);
            }
            strArr = new String[]{str.trim()};
            str2 = valueOf2;
        }
        fzo fzo2 = new fzo();
        try {
            Cursor a = gwb.a(context.getContentResolver(), fyi.b, a, str2, strArr, null);
            if (a != null) {
                while (a.moveToNext()) {
                    fzp a2 = fzp.a(a, false);
                    if (a2 != null) {
                        fzo2.a(a2);
                        break;
                    }
                }
            }
            if (a != null) {
                a.close();
            }
        } catch (Throwable e) {
            String valueOf3 = String.valueOf(e);
            glk.d("Babel_SMS", new StringBuilder(String.valueOf(valueOf3).length() + 52).append("TransactionSettings.getFromSystem: failed to query. ").append(valueOf3).toString(), e);
            if (fzo != null) {
                fzo.close();
            }
        } catch (Throwable th) {
            if (fzo != null) {
                fzo.close();
            }
        }
        return fzo2;
    }

    private static Cursor b(SQLiteDatabase sQLiteDatabase, String str) {
        try {
            return sQLiteDatabase.query("apn", bjs.a, "numeric =?", new String[]{str}, null, null, "current DESC", null);
        } catch (Throwable e) {
            glk.c("Babel_SMS", "TransactionSettings.queryLocalApns: table not exist? Try rebuilding.", e);
            bjs.b(sQLiteDatabase);
            return sQLiteDatabase.query("apn", bjs.a, "numeric =?", new String[]{str}, null, null, "current DESC", null);
        }
    }

    public static String a(String str) {
        if (!TextUtils.isEmpty(str) && str.length() <= 6) {
            return fzo.a(str.substring(0, 3), str.substring(3));
        }
        String str2 = "Babel_SMS";
        String str3 = "canonicalizeMccMnc: invalid mccmnc ";
        String valueOf = String.valueOf(str);
        glk.e(str2, valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3), new Object[0]);
        return str;
    }

    public static String a(String str, String str2) {
        try {
            return String.format(Locale.US, "%03d%03d", new Object[]{Integer.valueOf(Integer.parseInt(str)), Integer.valueOf(Integer.parseInt(str2))});
        } catch (NumberFormatException e) {
            glk.e("Babel_SMS", new StringBuilder((String.valueOf(str).length() + 35) + String.valueOf(str2).length()).append("canonicalizeMccMnc: invalid mccmnc ").append(str).append(str2).toString(), new Object[0]);
            String valueOf = String.valueOf(str);
            String valueOf2 = String.valueOf(str2);
            return valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
        }
    }

    private static fzo a(Context context) {
        String a = fzo.a(glq.k(gwb.H()));
        String str = "Babel_SMS";
        String str2 = "TransactionSettings: loaded from local APN table, mcc/mnc=";
        String valueOf = String.valueOf(a);
        if (valueOf.length() != 0) {
            valueOf = str2.concat(valueOf);
        } else {
            valueOf = new String(str2);
        }
        glk.c(str, valueOf, new Object[0]);
        SQLiteDatabase a2 = bjs.a(context);
        Cursor cursor = null;
        fzo fzo = new fzo(true);
        try {
            cursor = fzo.b(a2, a);
            if (cursor != null) {
                while (cursor.moveToNext()) {
                    fzp a3 = fzp.a(cursor, true);
                    if (a3 != null) {
                        fzo.a(a3);
                    }
                }
            }
            if (cursor != null) {
                cursor.close();
            }
        } catch (Throwable e) {
            String valueOf2 = String.valueOf(e);
            glk.d("Babel_SMS", new StringBuilder(String.valueOf(valueOf2).length() + 56).append("TransactionSettings.getFromLocalTable: failed to query. ").append(valueOf2).toString(), e);
            return fzo;
        } finally {
            if (cursor != null) {
                cursor.close();
            }
        }
        return fzo;
    }

    public static String b(String str) {
        if (str == null) {
            return null;
        }
        String[] split = str.split("\\.");
        if (split.length != 4) {
            return str;
        }
        StringBuilder stringBuilder = new StringBuilder(16);
        int i = 0;
        while (i < 4) {
            try {
                if (split[i].length() > 3) {
                    return str;
                }
                stringBuilder.append(Integer.parseInt(split[i]));
                if (i < 3) {
                    stringBuilder.append('.');
                }
                i++;
            } catch (NumberFormatException e) {
                return str;
            }
        }
        return stringBuilder.toString();
    }

    public static boolean b(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        for (String str3 : str.split(",")) {
            if (str3.equals(str2) || str3.equals("*")) {
                return true;
            }
        }
        return false;
    }

    public void a(Context context, fzp fzp) {
        Object obj = 1;
        synchronized (this) {
            if (!this.c || fzp.h > 0) {
                obj = null;
            } else {
                fzp.h = 1;
                if (this.b.size() > 1) {
                    this.b.remove(fzp);
                    this.b.add(0, fzp);
                }
            }
        }
        if (obj != null) {
            fzp.a(context);
        }
    }

    public static String a(SQLiteDatabase sQLiteDatabase, String str) {
        Throwable e;
        Throwable th;
        String str2 = null;
        Cursor b;
        try {
            b = fzo.b(sQLiteDatabase, str);
            try {
                if (b.moveToFirst()) {
                    str2 = b.getString(4);
                }
                if (b != null) {
                    b.close();
                }
            } catch (Exception e2) {
                e = e2;
                try {
                    glk.d("Babel_SMS", "Failed to query local APN database", e);
                    if (b != null) {
                        b.close();
                    }
                    return str2;
                } catch (Throwable th2) {
                    th = th2;
                    if (b != null) {
                        b.close();
                    }
                    throw th;
                }
            }
        } catch (Exception e3) {
            e = e3;
            b = null;
            glk.d("Babel_SMS", "Failed to query local APN database", e);
            if (b != null) {
                b.close();
            }
            return str2;
        } catch (Throwable e4) {
            b = null;
            th = e4;
            if (b != null) {
                b.close();
            }
            throw th;
        }
        return str2;
    }

    public static fzo a(Context context, String str) {
        fzo fzo;
        Object b = gwb.b(gwb.H(), "babel_mms_mmsc", fls.k);
        if (TextUtils.isEmpty(b)) {
            fzo = null;
        } else {
            fzo = new fzo();
            fzo.a(new fzp(b, fzo.b(gwb.b(gwb.H(), "babel_mms_proxy_address", fls.l)), gwb.a(gwb.H(), "babel_mms_proxy_port", -1)));
        }
        if (fzo == null || !fzo.b()) {
            fzo = fzo.b(context, str);
            if (fzo == null || !fzo.b()) {
                return fzo.a(context);
            }
            glk.c("Babel_SMS", "TransactionSettings: loaded from system", new Object[0]);
            return fzo;
        }
        glk.c("Babel_SMS", "TransactionSettings: loaded from Gservcies", new Object[0]);
        return fzo;
    }
}
