package defpackage;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri.Builder;
import android.os.ConditionVariable;
import android.provider.ContactsContract.CommonDataKinds.Email;
import android.provider.ContactsContract.CommonDataKinds.Phone;
import android.provider.ContactsContract.Data;
import android.text.TextUtils;
import com.google.android.apps.hangouts.content.EsProvider;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.TimeUnit;

/* renamed from: dxg */
public final class dxg {
    static final String[] a;
    static final mjx<String, Integer> b;
    static final String[] c;
    private static final String e;
    private static final long f;
    private static final long g;
    final Context d;
    private final ContentResolver h;
    private final int i;
    private final boolean j;
    private mmc<String, dxj> k;
    private mmc<String, dxm> l;
    private Map<String, dxh> m;
    private Map<String, dxh> n;
    private List<dxh> o;
    private gll p;
    private int q;
    private int r;
    private int s;
    private int t;
    private int u;
    private int v;
    private int w;
    private int x;
    private boolean y;

    static {
        a = new String[]{"lookup", "contact_id", "display_name", "raw_contact_id", "account_name", "photo_uri", "mimetype", "data1", "data2", "data3", "data4"};
        b = new mjz().a("data1", Integer.valueOf(7)).a("data2", Integer.valueOf(8)).a("data3", Integer.valueOf(9)).a("data4", Integer.valueOf(10)).a();
        e = String.format(" contact_id in default_directory AND %s IN ('%s','%s','%s') AND %s is null", new Object[]{"mimetype", "vnd.android.cursor.item/phone_v2", "vnd.android.cursor.item/email_v2", "vnd.android.cursor.item/photo", "data_set"});
        c = new String[]{"name", "gaia_id", "profile_photo_url", "sequence", "logging_id", "affinity_score"};
        f = TimeUnit.DAYS.toMillis(1);
        g = TimeUnit.SECONDS.toMillis(10);
    }

    public dxg(Context context, ContentResolver contentResolver, int i, boolean z) {
        gwb.d(8, "expectedKeys");
        this.k = new mme(8).c().a();
        gwb.d(8, "expectedKeys");
        this.l = new mme(8).c().a();
        this.m = new ky();
        this.n = new ky();
        this.d = context;
        this.h = contentResolver;
        this.i = i;
        this.j = z;
    }

    public void a() {
        Throwable th;
        Cursor cursor;
        Cursor cursor2 = null;
        iil.b("Expected condition to be false", this.y);
        this.y = true;
        ehz ehz = (ehz) jyn.a(this.d, ehz.class);
        boolean z = ehz.a("android.permission.READ_CONTACTS") || ehz.a("android.permission.WRITE_CONTACTS");
        Cursor query;
        try {
            jci b = ((jcf) jyn.a(this.d, jcf.class)).b(this.i);
            long currentTimeMillis = System.currentTimeMillis() - b.a("last_merged_ts", 0);
            if (z != b.c("last_merged_read_local_contacts") || currentTimeMillis >= g || this.j) {
                this.p = new gll("MergeContactsService");
                Map kyVar = new ky();
                try {
                    dxh dxh;
                    String str;
                    Builder buildUpon = dwz.f.buildUpon();
                    buildUpon.appendQueryParameter("account_id", Integer.toString(this.i));
                    query = this.h.query(buildUpon.build(), dwz.i, null, null, null);
                    while (query.moveToNext()) {
                        try {
                            dxh = new dxh();
                            dxh.a = query.getLong(0);
                            dxh.c = query.getString(1);
                            dxh.d = Long.valueOf(query.getLong(2));
                            dxh.e = Long.valueOf(query.getLong(3));
                            dxh.f = query.getString(4);
                            dxh.g = query.getString(5);
                            dxh.h = gld.d(query.getInt(6));
                            dxh.j = bjh.values()[query.getInt(7)];
                            dxh.i = query.getInt(8);
                            dxh.k = query.getString(9);
                            dxh.l = query.getFloat(10);
                            if (!TextUtils.isEmpty(dxh.c)) {
                                this.m.put(dxh.c, dxh);
                            }
                            kyVar.put(Long.valueOf(dxh.a), dxh);
                        } catch (Throwable th2) {
                            th = th2;
                            cursor = query;
                        }
                    }
                    if (query != null) {
                        query.close();
                    }
                    buildUpon = dwz.h.buildUpon();
                    buildUpon.appendQueryParameter("account_id", Integer.toString(this.i));
                    query = this.h.query(buildUpon.build(), dwz.j, null, null, null);
                    while (query.moveToNext()) {
                        dxh = (dxh) kyVar.get(Long.valueOf(query.getLong(1)));
                        int i = query.getInt(2);
                        Object dxm;
                        if (i == 0) {
                            dxm = new dxm();
                            dxi.a(query, dxm);
                            if (!(TextUtils.isEmpty(dxm.b) || dxm.a())) {
                                this.l.a(dxm.b, dxm);
                            }
                            if (dxh != null) {
                                dxh.m.put(dxm.b != null ? dxm.b : dxm.a, dxm);
                            } else {
                                continue;
                            }
                        } else if (i == 1) {
                            dxm = new dxj();
                            dxi.a(query, dxm);
                            if (!dxm.a()) {
                                this.k.a(dxm.a, dxm);
                            }
                            if (dxh != null) {
                                dxh.n.put(dxm.a, dxm);
                            }
                        }
                    }
                    if (query != null) {
                        query.close();
                    }
                    this.p.a("retrieveOldDetails()");
                    if (z) {
                        String a = ((bbm) jyn.a(this.d, bbm.class)).a(this.i);
                        cursor2 = this.h.query(Data.CONTENT_URI, a, e, null, null);
                        if (cursor2 != null) {
                            while (cursor2.moveToNext()) {
                                dxh dxh2;
                                String string = cursor2.getString(0);
                                dxh = (dxh) this.n.get(string);
                                if (dxh == null) {
                                    dxh = new dxh();
                                    dxh.c = string;
                                    this.n.put(string, dxh);
                                    dxh.d = Long.valueOf(cursor2.getLong(1));
                                    dxh.e = Long.valueOf(cursor2.getLong(3));
                                    dxh.f = glq.i(this.d, cursor2.getString(2));
                                    dxh.j = bjh.UNKNOWN;
                                    dxh2 = dxh;
                                } else {
                                    dxh2 = dxh;
                                }
                                String string2 = cursor2.getString(6);
                                if ("vnd.android.cursor.item/photo".equals(string2)) {
                                    dxh2.g = cursor2.getString(5);
                                } else if ("vnd.android.cursor.item/phone_v2".equals(string2)) {
                                    boolean z2;
                                    r2 = this.d;
                                    r3 = cursor2.getString(gwb.a((Integer) b.get("data1")));
                                    CharSequence string3 = cursor2.getString(gwb.a((Integer) b.get("data4")));
                                    String str2 = "vnd.android.cursor.item/phone_v2";
                                    r0 = cursor2.getInt(gwb.a((Integer) b.get("data2")));
                                    if (r0 == 0) {
                                        string2 = cursor2.getString(gwb.a((Integer) b.get("data3")));
                                    } else if (str2.equals("vnd.android.cursor.item/phone_v2")) {
                                        string2 = (String) Phone.getTypeLabel(r2.getResources(), r0, null);
                                    } else if (str2.equals("vnd.android.cursor.item/email_v2")) {
                                        string2 = (String) Email.getTypeLabel(r2.getResources(), r0, null);
                                    } else {
                                        string2 = "";
                                    }
                                    r2 = glq.e(r3);
                                    Object dxm2 = new dxm();
                                    dxm2.a = r3;
                                    dxm2.b = string3;
                                    dxm2.c = r2;
                                    dxm2.d = string2;
                                    if (TextUtils.isEmpty(string3)) {
                                        z2 = false;
                                    } else {
                                        z2 = true;
                                    }
                                    dxm2.e = z2;
                                    if (!dxm2.a()) {
                                        dxh2.m.put(dxm2.b != null ? dxm2.b : dxm2.a, dxm2);
                                        if (!TextUtils.isEmpty(dxm2.b)) {
                                            this.l.a(dxm2.b, dxm2);
                                        }
                                    }
                                } else if ("vnd.android.cursor.item/email_v2".equals(string2)) {
                                    r2 = this.d;
                                    Object dxj = new dxj();
                                    dxj.a = cursor2.getString(gwb.a((Integer) b.get("data1")));
                                    str = "vnd.android.cursor.item/email_v2";
                                    r0 = cursor2.getInt(gwb.a((Integer) b.get("data2")));
                                    if (r0 == 0) {
                                        string2 = cursor2.getString(gwb.a((Integer) b.get("data3")));
                                    } else if (str.equals("vnd.android.cursor.item/phone_v2")) {
                                        string2 = (String) Phone.getTypeLabel(r2.getResources(), r0, null);
                                    } else if (str.equals("vnd.android.cursor.item/email_v2")) {
                                        string2 = (String) Email.getTypeLabel(r2.getResources(), r0, null);
                                    } else {
                                        string2 = "";
                                    }
                                    dxj.d = string2;
                                    dxj.e = true;
                                    if (!dxj.a()) {
                                        this.k.a(dxj.a, dxj);
                                        dxh2.n.put(dxj.a, dxj);
                                    }
                                } else {
                                    r2 = "Babel_db";
                                    r3 = "unexpected mime-type: ";
                                    string2 = String.valueOf(string2);
                                    glk.d(r2, string2.length() != 0 ? r3.concat(string2) : new String(r3), new Object[0]);
                                }
                                string2 = cursor2.getString(4);
                                if (!(a == null || string2 == null)) {
                                    if (a.equalsIgnoreCase(string2)) {
                                        dxh2.j = bjh.FOCUS;
                                    } else if (dxh2.j != bjh.FOCUS) {
                                        dxh2.j = bjh.CP2;
                                    }
                                }
                            }
                            Iterator it = this.n.values().iterator();
                            while (it.hasNext()) {
                                dxh = (dxh) it.next();
                                if (dxh.m.isEmpty() && dxh.n.isEmpty()) {
                                    it.remove();
                                }
                            }
                            if (cursor2 != null) {
                                cursor2.close();
                            }
                        } else if (cursor2 != null) {
                            cursor2.close();
                        }
                        this.p.a("retrieveLocalContacts()");
                    }
                    if (((fzw) jyn.a(this.d, fzw.class)).a(this.i)) {
                        this.o = Collections.EMPTY_LIST;
                    } else {
                        b();
                        this.p.a("findEmailOnHangouts()");
                        c();
                        this.p.a("findPhonesOnHangouts()");
                        this.o = d();
                        this.p.a("getSuggestedContacts()");
                    }
                    boolean e = e();
                    long currentTimeMillis2 = System.currentTimeMillis();
                    b.b("last_merged_ts", currentTimeMillis2);
                    b.b("last_merged_read_local_contacts", z);
                    b.d();
                    str = String.valueOf("last_merged_ts");
                    glk.c("Babel", new StringBuilder(String.valueOf(str).length() + 46).append("wrote ").append(currentTimeMillis2).append(" as ").append(str).append(" to accountStore").toString(), new Object[0]);
                    for (dwu a2 : jyn.c(this.d, dwu.class)) {
                        a2.a(this.i, e);
                    }
                } catch (Throwable th3) {
                    th = th3;
                    cursor = cursor2;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            }
        } catch (bmu e2) {
            th = e2;
            glk.c("Babel", "Account was logged out while MergeContactsService was running", th);
        } catch (jcj e3) {
            th = e3;
            glk.c("Babel", "Account was logged out while MergeContactsService was running", th);
        } catch (Throwable th4) {
            if (query != null) {
                query.close();
            }
        }
    }

    private void b() {
        int i = 0;
        Collection<String> a = dxg.a(this.k);
        long currentTimeMillis = System.currentTimeMillis();
        if (!a.isEmpty()) {
            if (fdq.x.b(this.i)) {
                etj a2 = etj.a(this.d, this.i, 2, 0, null, a);
                if (!a2.n()) {
                    for (Entry entry : ((fgq) a2.d()).g.entrySet()) {
                        Collection<dxi> b = this.k.b((String) entry.getKey());
                        fgr fgr = (fgr) entry.getValue();
                        for (dxi dxi : b) {
                            dxi.h = fgr.c;
                            dxi.g = fgr.b;
                            dxi.i = fgr.d;
                            dxi.f = fgr.a;
                            dxi.e = TextUtils.isEmpty(fgr.b);
                            dxi.k = fgr.e;
                            dxi.l = fgr.f;
                        }
                    }
                    i = 1;
                }
            } else {
                ConditionVariable conditionVariable = new ConditionVariable();
                dxk dxk = new dxk(this, conditionVariable);
                dxk.a(a, this.i);
                conditionVariable.block();
                exj exj = dxk.a;
                if (exj != null) {
                    for (gkv gkv : exj.k()) {
                        for (edk edk : (edk[]) gkv.b) {
                            if (edk != null) {
                                for (dxi dxi2 : this.k.b(((fbt) gkv.a).c)) {
                                    dxi2.h = edk.h;
                                    dxi2.g = edk.b();
                                    dxi2.i = edk.e;
                                    dxi2.f = edk.z;
                                    dxi2.e = TextUtils.isEmpty(edk.b());
                                    dxi2.k = edk.C;
                                    dxi2.l = edk.D;
                                }
                            }
                        }
                    }
                    i = 1;
                }
            }
            if (i != 0) {
                for (String b2 : a) {
                    for (dxi dxi3 : this.k.b(b2)) {
                        dxi3.j = currentTimeMillis;
                    }
                }
            }
        }
    }

    private void c() {
        long currentTimeMillis = System.currentTimeMillis();
        Object<String> a = dxg.a(this.l);
        if (!a.isEmpty()) {
            if (fdq.x.b(this.i)) {
                etj a2 = etj.a(this.d, this.i, 3, 0, Integer.valueOf(2), a);
                if (!a2.n()) {
                    for (Entry entry : ((fgq) a2.d()).g.entrySet()) {
                        Collection<dxi> b = this.l.b((String) entry.getKey());
                        fgr fgr = (fgr) entry.getValue();
                        for (dxi dxi : b) {
                            dxi.h = fgr.c;
                            dxi.i = fgr.d;
                            dxi.f = fgr.a;
                            dxi.k = fgr.e;
                            dxi.l = fgr.f;
                        }
                    }
                    for (String b2 : a) {
                        for (dxi dxi2 : this.l.b(b2)) {
                            dxi2.j = currentTimeMillis;
                        }
                    }
                }
            }
        }
    }

    private static List<String> a(mmc<String, ? extends dxi> mmc_java_lang_String___extends_dxi) {
        List<String> arrayList = new ArrayList();
        long currentTimeMillis = System.currentTimeMillis();
        for (String str : mmc_java_lang_String___extends_dxi.k()) {
            Collection<dxi> b = mmc_java_lang_String___extends_dxi.b(str);
            boolean z = false;
            Object obj = null;
            long j = 0;
            String str2 = null;
            String str3 = null;
            for (dxi dxi : b) {
                if (dxi.f) {
                    z = true;
                }
                if (!TextUtils.isEmpty(dxi.g)) {
                    obj = dxi.g;
                }
                if (!TextUtils.isEmpty(dxi.h)) {
                    str3 = dxi.h;
                }
                if (!TextUtils.isEmpty(dxi.i)) {
                    str2 = dxi.i;
                }
                j = Math.max(j, dxi.j);
            }
            boolean isEmpty = TextUtils.isEmpty(obj);
            if (b.size() > 1) {
                for (dxi dxi2 : b) {
                    dxi2.f = z;
                    dxi2.g = obj;
                    dxi2.h = str3;
                    dxi2.i = str2;
                    dxi2.j = j;
                    dxi2.e = isEmpty;
                }
            }
            if (!z && currentTimeMillis - j > f) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    private boolean e() {
        int i;
        bmv b = ((bnb) jyn.a(this.d, bnb.class)).a(this.i).b();
        List arrayList = new ArrayList();
        List arrayList2 = new ArrayList();
        for (dxh dxh : this.n.values()) {
            if (dxh.a()) {
                this.x++;
            }
            if (!this.m.containsKey(dxh.c)) {
                arrayList2.add(dxh);
            } else if (dxh.equals((dxh) this.m.remove(dxh.c))) {
                this.t++;
            } else {
                arrayList.add(dxh);
            }
        }
        List arrayList3 = new ArrayList(this.m.values());
        glk.c("Babel", "Leaving " + this.t + " existing mergedContacts unchanged", new Object[0]);
        boolean z = false;
        for (i = 0; i < arrayList.size(); i += 25) {
            z = true;
            List subList = arrayList.subList(i, Math.min(i + 25, arrayList.size()));
            b.a();
            dxg.a(b, subList);
            b(b, subList);
            b.b();
            b.c();
            this.r += subList.size();
            this.p.a("updateMergedContacts(" + subList.size() + ")");
            this.h.notifyChange(dwz.g, null);
        }
        glk.c("Babel", "Updated " + this.r + " existing mergedContacts", new Object[0]);
        for (i = 0; i < arrayList2.size(); i += 25) {
            z = true;
            subList = arrayList2.subList(i, Math.min(i + 25, arrayList2.size()));
            b.a();
            b(b, subList);
            b.b();
            b.c();
            this.q += subList.size();
            this.p.a("insertMergedContacts(" + subList.size() + ")");
            this.h.notifyChange(dwz.g, null);
        }
        glk.c("Babel", "Inserted " + this.q + " new mergedContacts", new Object[0]);
        for (i = 0; i < arrayList3.size(); i += 25) {
            z = true;
            subList = arrayList3.subList(i, Math.min(i + 25, arrayList3.size()));
            b.a();
            dxg.a(b, subList);
            b.b();
            b.c();
            this.s += subList.size();
            this.p.a("deleteMergedContacts(" + subList.size() + ")");
            this.h.notifyChange(dwz.g, null);
        }
        glk.c("Babel", "Deleted " + this.s + " old mergedContacts", new Object[0]);
        b.a();
        b.a("merged_contacts", "contact_lookup_key IS NULL OR contact_lookup_key = ''", null);
        this.p.a("delete old suggested contacts");
        b(b, this.o);
        this.x += this.o.size();
        b.b();
        b.c();
        this.p.a("write new suggested contacts");
        this.h.notifyChange(dwz.g, null);
        int i2 = this.u;
        int i3 = this.v;
        glk.c("Babel", "Persisted " + i2 + " phone numbers, " + i3 + " emails, and " + this.w + " gaiaIds", new Object[0]);
        long a = ((jcf) jyn.a(this.d, jcf.class)).b(this.i).a("last_merged_ts", 0);
        if (z || (this.n.isEmpty() && this.o.isEmpty() && a == 0)) {
            i3 = this.i;
            i2 = this.o.size() + this.n.size();
            iih iih = (iih) jyn.a(this.d, iih.class);
            if (i2 == 0) {
                iih.a(i3).b().a(1, TimeUnit.DAYS).c(2568);
            } else {
                iih.a(i3).b().a(Integer.valueOf(i2)).a(1, TimeUnit.DAYS).c(2549);
                if (this.x == 0) {
                    if (i2 <= 20) {
                        i2 = 2569;
                    } else if (i2 <= 100) {
                        i2 = 2743;
                    } else {
                        i2 = 2745;
                    }
                } else if (i2 <= 20) {
                    i2 = 2550;
                } else if (i2 <= 100) {
                    i2 = 2742;
                } else {
                    i2 = 2744;
                }
                iih.a(i3).b().a(Integer.valueOf(this.x)).a(1, TimeUnit.DAYS).c(i2);
            }
        }
        return z;
    }

    private static void a(bmv bmv, Collection<dxh> collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            bmv.a("merged_contacts", "contact_lookup_key = ?", new String[]{new String(String.valueOf(((dxh) it.next()).c))});
        }
    }

    private void b(bmv bmv, Collection<dxh> collection) {
        ContentValues contentValues = new ContentValues();
        ContentValues contentValues2 = new ContentValues();
        for (dxh dxh : collection) {
            contentValues.clear();
            contentValues.put("contact_lookup_key", dxh.c);
            contentValues.put("contact_id", dxh.d);
            contentValues.put("raw_contact_id", dxh.e);
            contentValues.put("display_name", dxh.f);
            contentValues.put("avatar_url", dxh.g);
            contentValues.put("is_frequent", Boolean.valueOf(dxh.h));
            contentValues.put("contact_source", Integer.valueOf(dxh.j.ordinal()));
            contentValues.put("frequent_order", Integer.valueOf(dxh.i));
            contentValues.put("person_logging_id", dxh.k);
            contentValues.put("person_affinity_score", Float.valueOf(dxh.l));
            long a = bmv.a("merged_contacts", null, contentValues);
            for (dxm dxm : dxh.m.values()) {
                Context context = this.d;
                contentValues2.clear();
                contentValues2.put("lookup_data_type", Integer.valueOf(0));
                contentValues2.put("lookup_data", dxm.a);
                contentValues2.put("lookup_data_display", glq.i(context, dxm.a));
                contentValues2.put("lookup_data_standardized", dxm.b);
                contentValues2.put("lookup_data_search", dxm.c);
                contentValues2.put("lookup_data_label", dxm.d);
                contentValues2.put("is_hangouts_user", Boolean.valueOf(dxm.f));
                contentValues2.put("gaia_id", dxm.g);
                contentValues2.put("needs_gaia_ids_resolved", Boolean.valueOf(dxm.e));
                contentValues2.put("avatar_url", dxm.h);
                contentValues2.put("display_name", dxm.i);
                contentValues2.put("last_checked_ts", Long.valueOf(dxm.j));
                contentValues2.put("detail_logging_id", dxm.k);
                contentValues2.put("detail_affinity_score", Float.valueOf(dxm.l));
                contentValues2.put("merged_contact_id", Long.valueOf(a));
                bmv.a("merged_contact_details", null, contentValues2);
                this.u++;
            }
            for (dxj dxj : dxh.n.values()) {
                contentValues2.clear();
                contentValues2.put("lookup_data_type", Integer.valueOf(1));
                contentValues2.put("lookup_data", dxj.a);
                contentValues2.putNull("lookup_data_display");
                contentValues2.putNull("lookup_data_standardized");
                contentValues2.putNull("lookup_data_search");
                contentValues2.put("lookup_data_label", dxj.d);
                contentValues2.put("is_hangouts_user", Boolean.valueOf(dxj.f));
                contentValues2.put("gaia_id", dxj.g);
                contentValues2.put("needs_gaia_ids_resolved", Boolean.valueOf(dxj.e));
                contentValues2.put("avatar_url", dxj.h);
                contentValues2.put("display_name", dxj.i);
                contentValues2.put("last_checked_ts", Long.valueOf(dxj.j));
                contentValues2.put("detail_logging_id", dxj.k);
                contentValues2.put("detail_affinity_score", Float.valueOf(dxj.l));
                contentValues2.put("merged_contact_id", Long.valueOf(a));
                bmv.a("merged_contact_details", null, contentValues2);
                this.v++;
            }
            if (!TextUtils.isEmpty(dxh.b)) {
                contentValues2.clear();
                contentValues2.put("merged_contact_id", Long.valueOf(a));
                contentValues2.put("lookup_data_type", Integer.valueOf(2));
                contentValues2.putNull("lookup_data");
                contentValues2.putNull("lookup_data_standardized");
                contentValues2.putNull("lookup_data_search");
                contentValues2.putNull("lookup_data_label");
                contentValues2.put("is_hangouts_user", Boolean.valueOf(true));
                contentValues2.put("needs_gaia_ids_resolved", Boolean.valueOf(false));
                contentValues2.put("gaia_id", dxh.b);
                contentValues2.putNull("avatar_url");
                contentValues2.putNull("display_name");
                contentValues2.put("last_checked_ts", Integer.valueOf(0));
                contentValues2.putNull("detail_logging_id");
                contentValues2.put("detail_affinity_score", Float.valueOf(0.0f));
                bmv.a("merged_contact_details", null, contentValues2);
                this.w++;
            }
        }
    }

    private List<dxh> d() {
        Throwable th;
        Cursor cursor;
        Cursor cursor2 = null;
        mmc mje = new mje();
        for (Object obj : this.n.values()) {
            for (dxi dxi : obj.m.values()) {
                if (!TextUtils.isEmpty(dxi.g)) {
                    mje.a(dxi.g, obj);
                }
            }
            for (dxi dxi2 : obj.n.values()) {
                if (!TextUtils.isEmpty(dxi2.g)) {
                    mje.a(dxi2.g, obj);
                }
            }
        }
        List<dxh> arrayList = new ArrayList();
        try {
            String string;
            String string2;
            String string3;
            cursor2 = this.h.query(EsProvider.b(EsProvider.a(EsProvider.k, this.i), 1), c, "name != '' AND chat_id != ?", new String[]{fde.e(this.i).b().b}, null);
            while (cursor2.moveToNext()) {
                try {
                    string = cursor2.getString(1);
                    if (!mje.c(string)) {
                        String string4 = cursor2.getString(0);
                        string2 = cursor2.getString(2);
                        string3 = cursor2.getString(4);
                        float f = cursor2.getFloat(5);
                        Object dxh = new dxh();
                        dxh.g = string2;
                        dxh.f = string4;
                        dxh.b = string;
                        dxh.j = bjh.SUGGESTED_ENTITY;
                        dxh.k = string3;
                        dxh.l = f;
                        arrayList.add(dxh);
                        mje.a(dxh.b, dxh);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    cursor = cursor2;
                }
            }
            if (cursor2 != null) {
                cursor2.close();
            }
            try {
                cursor2 = this.h.query(EsProvider.b(EsProvider.a(EsProvider.k, this.i), 0), c, "name != '' AND chat_id != ?", new String[]{fde.e(this.i).b().b}, null);
                while (cursor2.moveToNext()) {
                    string = cursor2.getString(1);
                    int i = cursor2.getInt(3);
                    if (mje.c(string)) {
                        for (dxh dxh2 : mje.b(string)) {
                            dxh2.h = true;
                            dxh2.i = i;
                        }
                    } else {
                        string2 = cursor2.getString(0);
                        string3 = cursor2.getString(2);
                        String string5 = cursor2.getString(4);
                        float f2 = cursor2.getFloat(5);
                        Object dxh3 = new dxh();
                        dxh3.g = string3;
                        dxh3.f = string2;
                        dxh3.b = string;
                        dxh3.j = bjh.SUGGESTED_ENTITY;
                        dxh3.h = true;
                        dxh3.i = i;
                        dxh3.k = string5;
                        dxh3.l = f2;
                        arrayList.add(dxh3);
                        mje.a(dxh3.b, dxh3);
                    }
                }
                return arrayList;
            } finally {
                if (cursor2 != null) {
                    cursor2.close();
                }
            }
        } catch (Throwable th3) {
            th = th3;
            cursor = cursor2;
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }
}
