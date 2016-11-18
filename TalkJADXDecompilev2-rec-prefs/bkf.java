package p000;

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

public final class bkf {
    private Set<bkg> f3614a = new HashSet();
    private bko f3615b;
    private String f3616c;
    private final gkq<edk> f3617d = new gkq();
    private final gkq<edk> f3618e = new gkq();

    public String m5585a() {
        return this.f3616c;
    }

    public static void m5579a(bko bko, String str) {
        gwb.m1400H().getContentResolver().notifyChange(EsProvider.m8272c(bko, str), null);
    }

    public static ig<Cursor> m5578a(bko bko, String str, Integer num) {
        String str2;
        String[] strArr;
        String str3 = null;
        String str4 = bko.m5632b().f11245b;
        if (num == bkh.f3619a) {
            str2 = "(chat_id!=? OR chat_id IS NULL)  AND active=1";
            strArr = new String[]{str4};
            str3 = "first_name ASC";
        } else {
            strArr = null;
            str2 = null;
        }
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, str.split("\\|"));
        return new enl(gwb.m1400H(), bko, EsProvider.m8254a(bko, arrayList), bki.f3622a, str2, strArr, str3);
    }

    private static int m5581b(bko bko, String str, int i) {
        String str2;
        String[] strArr;
        Cursor cursor = null;
        String str3 = bko.m5632b().f11245b;
        if (i == bkh.f3619a) {
            str2 = "(chat_id!=? OR chat_id IS NULL)  AND active=1";
            strArr = new String[]{str3};
        } else {
            strArr = null;
            str2 = null;
        }
        Uri c = EsProvider.m8272c(bko, str);
        try {
            cursor = gwb.m1400H().getContentResolver().query(c, new String[]{"count(*) as count"}, str2, strArr, null);
            if (cursor == null || !cursor.moveToFirst()) {
                if (cursor != null) {
                    cursor.close();
                }
                return 0;
            }
            int i2 = cursor.getInt(0);
            return i2;
        } finally {
            if (cursor != null) {
                cursor.close();
            }
        }
    }

    public static int m5580b(bko bko, String str) {
        return bkf.m5581b(bko, str, bkh.f3619a);
    }

    public static edk m5577a(bko bko, Cursor cursor) {
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
        edk a = gwb.m1596a(gwb.m1400H(), edq.values()[cursor.getInt(8)], string2, string3, string4, string5, string6, string7, string8, string9, string10, bool, null, i);
        ((bog) jyn.m25426a(gwb.m1400H(), bog.class)).m6289a(bko).m6287a(a, string);
        return a;
    }

    public static bkf m5582c(bko bko, String str) {
        String str2;
        String[] strArr;
        String str3 = null;
        bkf bkf = new bkf();
        bkf.m5595d(bko, str);
        int i = bkh.f3619a;
        bko bko2 = bkf.f3615b;
        String str4 = bkf.f3616c;
        String str5 = bko2.m5632b().f11245b;
        if (i == bkh.f3619a) {
            str2 = "(chat_id!=? OR chat_id IS NULL)  AND active=1";
            strArr = new String[]{str5};
            str3 = "first_name ASC";
        } else {
            strArr = null;
            str2 = null;
        }
        Cursor query = gwb.m1400H().getContentResolver().query(EsProvider.m8272c(bko2, str4), bki.f3622a, str2, strArr, str3);
        if (query != null) {
            try {
                bkf.m5586a(query);
            } finally {
                query.close();
            }
        }
        return bkf;
    }

    public void m5595d(bko bko, String str) {
        if (this.f3615b != bko || !TextUtils.equals(this.f3616c, str)) {
            this.f3615b = bko;
            this.f3616c = str;
            this.f3617d.clear();
            this.f3618e.clear();
            m5583i();
        }
    }

    public ig<Cursor> m5584a(Integer num) {
        return bkf.m5578a(this.f3615b, this.f3616c, num);
    }

    public void m5586a(Cursor cursor) {
        this.f3617d.clear();
        this.f3618e.clear();
        if (cursor == null || !cursor.moveToFirst()) {
            m5583i();
        }
        do {
            edk a = bkf.m5577a(this.f3615b, cursor);
            if (!((cursor.getInt(13) == 1 ? 1 : null) == null || m5593c(a.f11213b))) {
                this.f3618e.put(a.f11213b, a);
            }
            this.f3617d.put(a.f11213b, a);
        } while (cursor.moveToNext());
        m5583i();
    }

    public Collection<edk> m5590b() {
        return this.f3617d.values();
    }

    public Collection<edk> m5592c() {
        return this.f3618e.values();
    }

    public boolean m5596d() {
        return this.f3617d.size() == 0;
    }

    public int m5597e() {
        return this.f3617d.size();
    }

    public boolean m5588a(edo edo) {
        return this.f3617d.containsKey(edo);
    }

    public ArrayList<edk> m5599f() {
        return this.f3617d.isEmpty() ? null : new ArrayList(this.f3617d.values());
    }

    public edk m5589b(edo edo) {
        return (edk) this.f3617d.get(edo);
    }

    public boolean m5593c(edo edo) {
        return this.f3615b.m5632b().m13608a(edo);
    }

    public boolean m5600g() {
        int i = 0;
        for (Entry entry : this.f3617d.entrySet()) {
            if (!m5593c((edo) entry.getKey())) {
                if (((edk) entry.getValue()).f11208F != edm.f11239b) {
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

    public bko m5601h() {
        return this.f3615b;
    }

    public String m5594d(edo edo) {
        edk edk = (edk) this.f3617d.get(edo);
        if (edk != null) {
            return edk.f11219h;
        }
        return null;
    }

    public String m5598e(edo edo) {
        edk edk = (edk) this.f3617d.get(edo);
        if (edk != null) {
            return edk.f11216e;
        }
        return null;
    }

    public void m5587a(bkg bkg) {
        if (bkg != null) {
            this.f3614a.add(bkg);
        }
    }

    public void m5591b(bkg bkg) {
        this.f3614a.remove(bkg);
    }

    private void m5583i() {
        for (bkg a : this.f3614a) {
            a.mo764a();
        }
    }
}
