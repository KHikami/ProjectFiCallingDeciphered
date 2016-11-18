package p000;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri.Builder;
import android.os.ConditionVariable;
import android.text.TextUtils;
import java.io.Serializable;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

final class dxq extends jgc {
    private int f10768a;
    private bjg f10769b;

    public dxq(String str, int i, bjg bjg) {
        super(str, '\u0000');
        this.f10768a = i;
        this.f10769b = bjg;
    }

    public String mo649b(Context context) {
        return context.getString(gwb.rS);
    }

    protected jgz mo648a(Context context) {
        Throwable th;
        dth a = ((dti) jyn.m25426a(context, dti.class)).mo1673a(17);
        a.mo1670a("gaia_id_resolution");
        Collection hashSet = new HashSet();
        Collection hashSet2 = new HashSet();
        Cursor query;
        try {
            Builder buildUpon = dwz.f6497h.buildUpon();
            buildUpon.appendQueryParameter("account_id", Integer.toString(this.f10768a));
            query = context.getContentResolver().query(buildUpon.build(), dwz.f6499j, "merged_contact_id = (select _id from merged_contacts where contact_id = ?) AND needs_gaia_ids_resolved AND (lookup_data_type = 0 OR lookup_data_type = 1)", new String[]{this.f10769b.mo582p()}, null);
            while (query.moveToNext()) {
                if (query.getInt(2) != 0 || query.isNull(4)) {
                    try {
                        if (query.getInt(2) == 1) {
                            hashSet.add(query.getString(3));
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } else {
                    hashSet2.add(query.getString(4));
                }
            }
            if (query != null) {
                query.close();
            }
            iid a2 = ((iih) jyn.m25426a(context, iih.class)).mo1979a(this.f10768a);
            if (fdq.f12809y.m14370b(this.f10768a)) {
                etj a3;
                if (!hashSet2.isEmpty()) {
                    a3 = etj.m14466a(context, this.f10768a, 3, 0, null, hashSet2);
                    if (!a3.m8076n()) {
                        m12986a(context, hashSet2, ((fgq) a3.mo1043d()).f13016g);
                    }
                }
                if (!hashSet.isEmpty()) {
                    a3 = etj.m14466a(context, this.f10768a, 2, 0, null, hashSet);
                    if (!a3.m8076n()) {
                        m12986a(context, hashSet, ((fgq) a3.mo1043d()).f13016g);
                    }
                }
            } else {
                ConditionVariable conditionVariable;
                dxr dxr;
                exj exj;
                if (!hashSet2.isEmpty()) {
                    conditionVariable = new ConditionVariable();
                    dxr = new dxr(context, conditionVariable);
                    dxr.m12994a(hashSet2, this.f10768a);
                    conditionVariable.block();
                    exj = dxr.f10770a;
                    if (exj == null) {
                        a2.mo1693b().mo1714c(2512);
                        return new jgz(0, dxr.f10771b, context.getResources().getString(gwb.rR));
                    }
                    m12987a(context, exj.m14747k());
                }
                if (!hashSet.isEmpty()) {
                    conditionVariable = new ConditionVariable();
                    dxr = new dxr(context, conditionVariable);
                    dxr.m12995b(hashSet, this.f10768a);
                    conditionVariable.block();
                    exj = dxr.f10770a;
                    if (exj == null) {
                        a2.mo1693b().mo1714c(2512);
                        return new jgz(0, dxr.f10771b, context.getResources().getString(gwb.rR));
                    }
                    m12987a(context, exj.m14747k());
                }
            }
            a2.mo1693b().mo1714c(2513);
            Serializable e = m12989e(context);
            jgz jgz = new jgz(e != null);
            jgz.m24192d().putSerializable("hangouts_contact", e);
            a.mo1668a(this.f10768a, "gaia_id_resolution", 1013);
            return jgz;
        } catch (Throwable th3) {
            th = th3;
            query = null;
            if (query != null) {
                query.close();
            }
            throw th;
        }
    }

    private void m12987a(Context context, List<gkv<fbt, edk[]>> list) {
        long currentTimeMillis = System.currentTimeMillis();
        bmv b = ((bnb) jyn.m25426a(context, bnb.class)).mo614a(this.f10768a).m6187b();
        b.m6202a();
        ContentValues contentValues = new ContentValues();
        for (gkv gkv : list) {
            for (edk edk : (edk[]) gkv.f15525b) {
                if (edk != null && edk.f11212a == edq.PERSON) {
                    if (!TextUtils.isEmpty(((fbt) gkv.f15524a).f12661d)) {
                        dxq.m12988a(b, contentValues, edk.f11237z, edk.m13590b(), edk.f11219h, edk.f11216e, currentTimeMillis, ((fbt) gkv.f15524a).f12661d);
                    }
                    if (!TextUtils.isEmpty(((fbt) gkv.f15524a).f12660c)) {
                        dxq.m12988a(b, contentValues, edk.f11237z, edk.m13590b(), edk.f11219h, edk.f11216e, currentTimeMillis, ((fbt) gkv.f15524a).f12660c);
                    }
                }
            }
        }
        b.m6207b();
        b.m6208c();
        context.getContentResolver().notifyChange(dwz.f6496g, null);
    }

    private void m12986a(Context context, Collection<String> collection, Map<String, fgr> map) {
        long currentTimeMillis = System.currentTimeMillis();
        bmv b = ((bnb) jyn.m25426a(context, bnb.class)).mo614a(this.f10768a).m6187b();
        b.m6202a();
        ContentValues contentValues = new ContentValues();
        for (Entry entry : map.entrySet()) {
            String str;
            fgr fgr = (fgr) entry.getValue();
            if (collection.size() == 1) {
                str = (String) collection.iterator().next();
            } else {
                str = (String) entry.getKey();
            }
            dxq.m12988a(b, contentValues, fgr.f13018a, fgr.f13019b, fgr.f13020c, fgr.f13021d, currentTimeMillis, str);
        }
        b.m6207b();
        b.m6208c();
        context.getContentResolver().notifyChange(dwz.f6496g, null);
    }

    private static void m12988a(bmv bmv, ContentValues contentValues, boolean z, String str, String str2, String str3, long j, String str4) {
        contentValues.clear();
        contentValues.put("is_hangouts_user", Boolean.valueOf(z));
        if (!TextUtils.isEmpty(str)) {
            contentValues.put("gaia_id", str);
            contentValues.put("needs_gaia_ids_resolved", Boolean.valueOf(false));
        }
        contentValues.put("avatar_url", str2);
        contentValues.put("display_name", str3);
        contentValues.put("last_checked_ts", Long.valueOf(j));
        bmv.m6194a("merged_contact_details", contentValues, "lookup_data = ? OR lookup_data_standardized = ?", new String[]{str4, str4});
    }

    private bjg m12989e(Context context) {
        Throwable th;
        Cursor cursor = null;
        Builder buildUpon = dwz.f6496g.buildUpon();
        buildUpon.appendQueryParameter("account_id", Integer.toString(this.f10768a));
        buildUpon.appendQueryParameter("contact_lookup_key", this.f10769b.mo580n());
        try {
            Cursor query = context.getContentResolver().query(buildUpon.build(), dxa.m12954c(), null, null, null);
            try {
                dxb dxb = new dxb(null, query);
                if (dxb.moveToFirst()) {
                    bjg a = dxb.mo592a();
                    if (query == null) {
                        return a;
                    }
                    query.close();
                    return a;
                }
                if (query != null) {
                    query.close();
                }
                String str = "Babel";
                String str2 = "After gaiaId resolution, couldn't find merged contact with lookup key:";
                String valueOf = String.valueOf(this.f10769b.mo580n());
                if (valueOf.length() != 0) {
                    valueOf = str2.concat(valueOf);
                } else {
                    valueOf = new String(str2);
                }
                glk.m17981d(str, valueOf, new Object[0]);
                return null;
            } catch (Throwable th2) {
                th = th2;
                cursor = query;
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }
}
