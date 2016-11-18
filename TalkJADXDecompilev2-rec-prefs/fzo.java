package p000;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import java.util.List;
import java.util.Locale;

public final class fzo {
    public static final String[] f14483a = new String[]{"type", "mmsc", "mmsproxy", "mmsport"};
    private List<fzp> f14484b;
    private boolean f14485c;

    private fzo() {
        this(false);
    }

    private fzo(boolean z) {
        this.f14484b = ba.m4633e();
        this.f14485c = z;
    }

    private void m16707a(fzp fzp) {
        synchronized (this) {
            if (fzp != null) {
                if (fzp.m16717a()) {
                    this.f14484b.add(fzp);
                }
            }
        }
    }

    public List<fzp> m16712a() {
        List a;
        synchronized (this) {
            a = mjq.m32314a(this.f14484b);
        }
        return a;
    }

    public boolean m16714b() {
        boolean z;
        synchronized (this) {
            z = this.f14484b.size() > 0;
        }
        return z;
    }

    private static fzo m16709b(Context context, String str) {
        fzo fzo = null;
        if (!fyi.m16622b(context)) {
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
            Cursor a = gwb.m1558a(context.getContentResolver(), fyi.f14369b, f14483a, str2, strArr, null);
            if (a != null) {
                while (a.moveToNext()) {
                    fzp a2 = fzp.m16715a(a, false);
                    if (a2 != null) {
                        fzo2.m16707a(a2);
                        break;
                    }
                }
            }
            if (a != null) {
                a.close();
            }
        } catch (Throwable e) {
            String valueOf3 = String.valueOf(e);
            glk.m17980d("Babel_SMS", new StringBuilder(String.valueOf(valueOf3).length() + 52).append("TransactionSettings.getFromSystem: failed to query. ").append(valueOf3).toString(), e);
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

    private static Cursor m16708b(SQLiteDatabase sQLiteDatabase, String str) {
        try {
            return sQLiteDatabase.query("apn", bjs.f3544a, "numeric =?", new String[]{str}, null, null, "current DESC", null);
        } catch (Throwable e) {
            glk.m17978c("Babel_SMS", "TransactionSettings.queryLocalApns: table not exist? Try rebuilding.", e);
            bjs.m5485b(sQLiteDatabase);
            return sQLiteDatabase.query("apn", bjs.f3544a, "numeric =?", new String[]{str}, null, null, "current DESC", null);
        }
    }

    public static String m16705a(String str) {
        if (!TextUtils.isEmpty(str) && str.length() <= 6) {
            return fzo.m16706a(str.substring(0, 3), str.substring(3));
        }
        String str2 = "Babel_SMS";
        String str3 = "canonicalizeMccMnc: invalid mccmnc ";
        String valueOf = String.valueOf(str);
        glk.m17982e(str2, valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3), new Object[0]);
        return str;
    }

    public static String m16706a(String str, String str2) {
        try {
            return String.format(Locale.US, "%03d%03d", new Object[]{Integer.valueOf(Integer.parseInt(str)), Integer.valueOf(Integer.parseInt(str2))});
        } catch (NumberFormatException e) {
            glk.m17982e("Babel_SMS", new StringBuilder((String.valueOf(str).length() + 35) + String.valueOf(str2).length()).append("canonicalizeMccMnc: invalid mccmnc ").append(str).append(str2).toString(), new Object[0]);
            String valueOf = String.valueOf(str);
            String valueOf2 = String.valueOf(str2);
            return valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
        }
    }

    private static fzo m16702a(Context context) {
        String a = fzo.m16705a(glq.m18041k(gwb.m1400H()));
        String str = "Babel_SMS";
        String str2 = "TransactionSettings: loaded from local APN table, mcc/mnc=";
        String valueOf = String.valueOf(a);
        if (valueOf.length() != 0) {
            valueOf = str2.concat(valueOf);
        } else {
            valueOf = new String(str2);
        }
        glk.m17979c(str, valueOf, new Object[0]);
        SQLiteDatabase a2 = bjs.m5482a(context);
        Cursor cursor = null;
        fzo fzo = new fzo(true);
        try {
            cursor = fzo.m16708b(a2, a);
            if (cursor != null) {
                while (cursor.moveToNext()) {
                    fzp a3 = fzp.m16715a(cursor, true);
                    if (a3 != null) {
                        fzo.m16707a(a3);
                    }
                }
            }
            if (cursor != null) {
                cursor.close();
            }
        } catch (Throwable e) {
            String valueOf2 = String.valueOf(e);
            glk.m17980d("Babel_SMS", new StringBuilder(String.valueOf(valueOf2).length() + 56).append("TransactionSettings.getFromLocalTable: failed to query. ").append(valueOf2).toString(), e);
            return fzo;
        } finally {
            if (cursor != null) {
                cursor.close();
            }
        }
        return fzo;
    }

    public static String m16710b(String str) {
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

    public static boolean m16711b(String str, String str2) {
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

    public void m16713a(Context context, fzp fzp) {
        Object obj = 1;
        synchronized (this) {
            if (!this.f14485c || fzp.f14496h > 0) {
                obj = null;
            } else {
                fzp.f14496h = 1;
                if (this.f14484b.size() > 1) {
                    this.f14484b.remove(fzp);
                    this.f14484b.add(0, fzp);
                }
            }
        }
        if (obj != null) {
            fzp.m16716a(context);
        }
    }

    public static String m16704a(SQLiteDatabase sQLiteDatabase, String str) {
        Cursor b;
        Throwable e;
        Throwable th;
        String str2 = null;
        try {
            b = fzo.m16708b(sQLiteDatabase, str);
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
                    glk.m17980d("Babel_SMS", "Failed to query local APN database", e);
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
            glk.m17980d("Babel_SMS", "Failed to query local APN database", e);
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

    public static fzo m16703a(Context context, String str) {
        fzo fzo;
        Object b = gwb.m1998b(gwb.m1400H(), "babel_mms_mmsc", fls.f13434k);
        if (TextUtils.isEmpty(b)) {
            fzo = null;
        } else {
            fzo = new fzo();
            fzo.m16707a(new fzp(b, fzo.m16710b(gwb.m1998b(gwb.m1400H(), "babel_mms_proxy_address", fls.f13435l)), gwb.m1492a(gwb.m1400H(), "babel_mms_proxy_port", -1)));
        }
        if (fzo == null || !fzo.m16714b()) {
            fzo = fzo.m16709b(context, str);
            if (fzo == null || !fzo.m16714b()) {
                return fzo.m16702a(context);
            }
            glk.m17979c("Babel_SMS", "TransactionSettings: loaded from system", new Object[0]);
            return fzo;
        }
        glk.m17979c("Babel_SMS", "TransactionSettings: loaded from Gservcies", new Object[0]);
        return fzo;
    }
}
