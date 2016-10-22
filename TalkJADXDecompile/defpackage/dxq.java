package defpackage;

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

/* renamed from: dxq */
final class dxq extends jgc {
    private int a;
    private bjg b;

    public dxq(String str, int i, bjg bjg) {
        super(str, '\u0000');
        this.a = i;
        this.b = bjg;
    }

    public String b(Context context) {
        return context.getString(gwb.rS);
    }

    protected jgz a(Context context) {
        Throwable th;
        dth a = ((dti) jyn.a(context, dti.class)).a(17);
        a.a("gaia_id_resolution");
        Collection hashSet = new HashSet();
        Collection hashSet2 = new HashSet();
        Cursor query;
        try {
            Builder buildUpon = dwz.h.buildUpon();
            buildUpon.appendQueryParameter("account_id", Integer.toString(this.a));
            query = context.getContentResolver().query(buildUpon.build(), dwz.j, "merged_contact_id = (select _id from merged_contacts where contact_id = ?) AND needs_gaia_ids_resolved AND (lookup_data_type = 0 OR lookup_data_type = 1)", new String[]{this.b.p()}, null);
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
            iid a2 = ((iih) jyn.a(context, iih.class)).a(this.a);
            if (fdq.y.b(this.a)) {
                etj a3;
                if (!hashSet2.isEmpty()) {
                    a3 = etj.a(context, this.a, 3, 0, null, hashSet2);
                    if (!a3.n()) {
                        a(context, hashSet2, ((fgq) a3.d()).g);
                    }
                }
                if (!hashSet.isEmpty()) {
                    a3 = etj.a(context, this.a, 2, 0, null, hashSet);
                    if (!a3.n()) {
                        a(context, hashSet, ((fgq) a3.d()).g);
                    }
                }
            } else {
                ConditionVariable conditionVariable;
                dxr dxr;
                exj exj;
                if (!hashSet2.isEmpty()) {
                    conditionVariable = new ConditionVariable();
                    dxr = new dxr(context, conditionVariable);
                    dxr.a(hashSet2, this.a);
                    conditionVariable.block();
                    exj = dxr.a;
                    if (exj == null) {
                        a2.b().c(2512);
                        return new jgz(0, dxr.b, context.getResources().getString(gwb.rR));
                    }
                    a(context, exj.k());
                }
                if (!hashSet.isEmpty()) {
                    conditionVariable = new ConditionVariable();
                    dxr = new dxr(context, conditionVariable);
                    dxr.b(hashSet, this.a);
                    conditionVariable.block();
                    exj = dxr.a;
                    if (exj == null) {
                        a2.b().c(2512);
                        return new jgz(0, dxr.b, context.getResources().getString(gwb.rR));
                    }
                    a(context, exj.k());
                }
            }
            a2.b().c(2513);
            Serializable e = e(context);
            jgz jgz = new jgz(e != null);
            jgz.d().putSerializable("hangouts_contact", e);
            a.a(this.a, "gaia_id_resolution", 1013);
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

    private void a(Context context, List<gkv<fbt, edk[]>> list) {
        long currentTimeMillis = System.currentTimeMillis();
        bmv b = ((bnb) jyn.a(context, bnb.class)).a(this.a).b();
        b.a();
        ContentValues contentValues = new ContentValues();
        for (gkv gkv : list) {
            for (edk edk : (edk[]) gkv.b) {
                if (edk != null && edk.a == edq.PERSON) {
                    if (!TextUtils.isEmpty(((fbt) gkv.a).d)) {
                        dxq.a(b, contentValues, edk.z, edk.b(), edk.h, edk.e, currentTimeMillis, ((fbt) gkv.a).d);
                    }
                    if (!TextUtils.isEmpty(((fbt) gkv.a).c)) {
                        dxq.a(b, contentValues, edk.z, edk.b(), edk.h, edk.e, currentTimeMillis, ((fbt) gkv.a).c);
                    }
                }
            }
        }
        b.b();
        b.c();
        context.getContentResolver().notifyChange(dwz.g, null);
    }

    private void a(Context context, Collection<String> collection, Map<String, fgr> map) {
        long currentTimeMillis = System.currentTimeMillis();
        bmv b = ((bnb) jyn.a(context, bnb.class)).a(this.a).b();
        b.a();
        ContentValues contentValues = new ContentValues();
        for (Entry entry : map.entrySet()) {
            String str;
            fgr fgr = (fgr) entry.getValue();
            if (collection.size() == 1) {
                str = (String) collection.iterator().next();
            } else {
                str = (String) entry.getKey();
            }
            dxq.a(b, contentValues, fgr.a, fgr.b, fgr.c, fgr.d, currentTimeMillis, str);
        }
        b.b();
        b.c();
        context.getContentResolver().notifyChange(dwz.g, null);
    }

    private static void a(bmv bmv, ContentValues contentValues, boolean z, String str, String str2, String str3, long j, String str4) {
        contentValues.clear();
        contentValues.put("is_hangouts_user", Boolean.valueOf(z));
        if (!TextUtils.isEmpty(str)) {
            contentValues.put("gaia_id", str);
            contentValues.put("needs_gaia_ids_resolved", Boolean.valueOf(false));
        }
        contentValues.put("avatar_url", str2);
        contentValues.put("display_name", str3);
        contentValues.put("last_checked_ts", Long.valueOf(j));
        bmv.a("merged_contact_details", contentValues, "lookup_data = ? OR lookup_data_standardized = ?", new String[]{str4, str4});
    }

    private bjg e(Context context) {
        Throwable th;
        Cursor cursor = null;
        Builder buildUpon = dwz.g.buildUpon();
        buildUpon.appendQueryParameter("account_id", Integer.toString(this.a));
        buildUpon.appendQueryParameter("contact_lookup_key", this.b.n());
        try {
            Cursor query = context.getContentResolver().query(buildUpon.build(), dxa.c(), null, null, null);
            try {
                dxb dxb = new dxb(null, query);
                if (dxb.moveToFirst()) {
                    bjg a = dxb.a();
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
                String valueOf = String.valueOf(this.b.n());
                if (valueOf.length() != 0) {
                    valueOf = str2.concat(valueOf);
                } else {
                    valueOf = new String(str2);
                }
                glk.d(str, valueOf, new Object[0]);
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
