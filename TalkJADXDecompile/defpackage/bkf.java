package defpackage;

import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.apps.hangouts.content.EsProvider;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Set;

/* renamed from: bkf */
public final class bkf {
    private Set<bkg> a;
    private bko b;
    private String c;
    private final gkq<edk> d;
    private final gkq<edk> e;

    public bkf() {
        this.a = new HashSet();
        this.d = new gkq();
        this.e = new gkq();
    }

    public String a() {
        return this.c;
    }

    public static void a(bko bko, String str) {
        gwb.H().getContentResolver().notifyChange(EsProvider.c(bko, str), null);
    }

    public static ig<Cursor> a(bko bko, String str, Integer num) {
        String str2;
        String[] strArr;
        String str3 = null;
        String str4 = bko.b().b;
        if (num == bkh.a) {
            str2 = "(chat_id!=? OR chat_id IS NULL)  AND active=1";
            strArr = new String[]{str4};
            str3 = "first_name ASC";
        } else {
            strArr = null;
            str2 = null;
        }
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, str.split("\\|"));
        return new enl(gwb.H(), bko, EsProvider.a(bko, arrayList), bki.a, str2, strArr, str3);
    }

    private static int b(bko bko, String str, int i) {
        String[] strArr;
        Cursor cursor = null;
        String str2 = bko.b().b;
        if (i == bkh.a) {
            String str3 = "(chat_id!=? OR chat_id IS NULL)  AND active=1";
            strArr = new String[]{str2};
        } else {
            strArr = cursor;
            Object obj = cursor;
        }
        Uri c = EsProvider.c(bko, str);
        try {
            cursor = gwb.H().getContentResolver().query(c, new String[]{"count(*) as count"}, str3, strArr, null);
            if (cursor == null || !cursor.moveToFirst()) {
                if (cursor != null) {
                    cursor.close();
                }
                return 0;
            }
            int i2 = cursor.getInt(0);
            if (cursor == null) {
                return i2;
            }
            cursor.close();
            return i2;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
        }
    }

    public static int b(bko bko, String str) {
        return bkf.b(bko, str, bkh.a);
    }

    public static edk a(bko bko, Cursor cursor) {
        String string = cursor.getString(0);
        String string2 = cursor.getString(2);
        String string3 = cursor.getString(1);
        String string4 = cursor.getString(3);
        String string5 = cursor.getString(10);
        String string6 = cursor.getString(4);
        String string7 = cursor.getString(5);
        String string8 = cursor.getString(6);
        String string9 = cursor.getString(7);
        int i = cursor.getInt(14);
        String string10 = cursor.getString(11);
        Boolean bool = null;
        if (cursor.getInt(9) != 0) {
            bool = Boolean.TRUE;
        }
        edk a = gwb.a(gwb.H(), edq.values()[cursor.getInt(8)], string2, string3, string4, string5, string6, string7, string8, string9, string10, bool, null, i);
        ((bog) jyn.a(gwb.H(), bog.class)).a(bko).a(a, string);
        return a;
    }

    public static bkf c(bko bko, String str) {
        String str2;
        String[] strArr;
        String str3 = null;
        bkf bkf = new bkf();
        bkf.d(bko, str);
        int i = bkh.a;
        bko bko2 = bkf.b;
        String str4 = bkf.c;
        String str5 = bko2.b().b;
        if (i == bkh.a) {
            str2 = "(chat_id!=? OR chat_id IS NULL)  AND active=1";
            strArr = new String[]{str5};
            str3 = "first_name ASC";
        } else {
            strArr = null;
            str2 = null;
        }
        Cursor query = gwb.H().getContentResolver().query(EsProvider.c(bko2, str4), bki.a, str2, strArr, str3);
        if (query != null) {
            try {
                bkf.a(query);
            } finally {
                query.close();
            }
        }
        return bkf;
    }

    public void d(bko bko, String str) {
        if (this.b != bko || !TextUtils.equals(this.c, str)) {
            this.b = bko;
            this.c = str;
            this.d.clear();
            this.e.clear();
            i();
        }
    }

    public ig<Cursor> a(Integer num) {
        return bkf.a(this.b, this.c, num);
    }

    public void a(Cursor cursor) {
        this.d.clear();
        this.e.clear();
        if (cursor == null || !cursor.moveToFirst()) {
            i();
        }
        do {
            edk a = bkf.a(this.b, cursor);
            if (!((cursor.getInt(13) == 1 ? 1 : null) == null || c(a.b))) {
                this.e.put(a.b, a);
            }
            this.d.put(a.b, a);
        } while (cursor.moveToNext());
        i();
    }

    public Collection<edk> b() {
        return this.d.values();
    }

    public Collection<edk> c() {
        return this.e.values();
    }

    public boolean d() {
        return this.d.size() == 0;
    }

    public int e() {
        return this.d.size();
    }

    public boolean a(edo edo) {
        return this.d.containsKey(edo);
    }

    public ArrayList<edk> f() {
        return this.d.isEmpty() ? null : new ArrayList(this.d.values());
    }

    public edk b(edo edo) {
        return (edk) this.d.get(edo);
    }

    public boolean c(edo edo) {
        return this.b.b().a(edo);
    }

    public boolean g() {
        int i = 0;
        for (Entry entry : this.d.entrySet()) {
            if (!c((edo) entry.getKey())) {
                if (((edk) entry.getValue()).F != edm.b) {
                    return false;
                }
                i++;
            }
        }
        if (i > 0) {
            return true;
        }
        return false;
    }

    public bko h() {
        return this.b;
    }

    public String d(edo edo) {
        edk edk = (edk) this.d.get(edo);
        if (edk != null) {
            return edk.h;
        }
        return null;
    }

    public String e(edo edo) {
        edk edk = (edk) this.d.get(edo);
        if (edk != null) {
            return edk.e;
        }
        return null;
    }

    public void a(bkg bkg) {
        if (bkg != null) {
            this.a.add(bkg);
        }
    }

    public void b(bkg bkg) {
        this.a.remove(bkg);
    }

    private void i() {
        for (bkg a : this.a) {
            a.a();
        }
    }
}
