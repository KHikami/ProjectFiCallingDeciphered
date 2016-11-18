package p000;

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

public final class dxg {
    static final String[] f10708a = new String[]{"lookup", "contact_id", "display_name", "raw_contact_id", "account_name", "photo_uri", "mimetype", "data1", "data2", "data3", "data4"};
    static final mjx<String, Integer> f10709b = new mjz().mo3837a("data1", Integer.valueOf(7)).mo3837a("data2", Integer.valueOf(8)).mo3837a("data3", Integer.valueOf(9)).mo3837a("data4", Integer.valueOf(10)).mo3836a();
    static final String[] f10710c = new String[]{"name", "gaia_id", "profile_photo_url", "sequence", "logging_id", "affinity_score"};
    private static final String f10711e = String.format(" contact_id in default_directory AND %s IN ('%s','%s','%s') AND %s is null", new Object[]{"mimetype", "vnd.android.cursor.item/phone_v2", "vnd.android.cursor.item/email_v2", "vnd.android.cursor.item/photo", "data_set"});
    private static final long f10712f = TimeUnit.DAYS.toMillis(1);
    private static final long f10713g = TimeUnit.SECONDS.toMillis(10);
    final Context f10714d;
    private final ContentResolver f10715h;
    private final int f10716i;
    private final boolean f10717j;
    private mmc<String, dxj> f10718k = new mme(8).m32501c().mo3884a();
    private mmc<String, dxm> f10719l;
    private Map<String, dxh> f10720m;
    private Map<String, dxh> f10721n;
    private List<dxh> f10722o;
    private gll f10723p;
    private int f10724q;
    private int f10725r;
    private int f10726s;
    private int f10727t;
    private int f10728u;
    private int f10729v;
    private int f10730w;
    private int f10731x;
    private boolean f10732y;

    public dxg(Context context, ContentResolver contentResolver, int i, boolean z) {
        gwb.m2121d(8, "expectedKeys");
        gwb.m2121d(8, "expectedKeys");
        this.f10719l = new mme(8).m32501c().mo3884a();
        this.f10720m = new ky();
        this.f10721n = new ky();
        this.f10714d = context;
        this.f10715h = contentResolver;
        this.f10716i = i;
        this.f10717j = z;
    }

    public void m12971a() {
        Cursor query;
        Throwable th;
        Cursor cursor;
        Cursor cursor2 = null;
        iil.m21879b("Expected condition to be false", this.f10732y);
        this.f10732y = true;
        ehz ehz = (ehz) jyn.m25426a(this.f10714d, ehz.class);
        boolean z = ehz.mo1882a("android.permission.READ_CONTACTS") || ehz.mo1882a("android.permission.WRITE_CONTACTS");
        try {
            jci b = ((jcf) jyn.m25426a(this.f10714d, jcf.class)).mo3464b(this.f10716i);
            long currentTimeMillis = System.currentTimeMillis() - b.mo3434a("last_merged_ts", 0);
            if (z != b.mo3448c("last_merged_read_local_contacts") || currentTimeMillis >= f10713g || this.f10717j) {
                this.f10723p = new gll("MergeContactsService");
                Map kyVar = new ky();
                try {
                    dxh dxh;
                    String str;
                    Builder buildUpon = dwz.f6495f.buildUpon();
                    buildUpon.appendQueryParameter("account_id", Integer.toString(this.f10716i));
                    query = this.f10715h.query(buildUpon.build(), dwz.f6498i, null, null, null);
                    while (query.moveToNext()) {
                        try {
                            dxh = new dxh();
                            dxh.f10733a = query.getLong(0);
                            dxh.f10735c = query.getString(1);
                            dxh.f10736d = Long.valueOf(query.getLong(2));
                            dxh.f10737e = Long.valueOf(query.getLong(3));
                            dxh.f10738f = query.getString(4);
                            dxh.f10739g = query.getString(5);
                            dxh.f10740h = gld.m17948d(query.getInt(6));
                            dxh.f10742j = bjh.values()[query.getInt(7)];
                            dxh.f10741i = query.getInt(8);
                            dxh.f10743k = query.getString(9);
                            dxh.f10744l = query.getFloat(10);
                            if (!TextUtils.isEmpty(dxh.f10735c)) {
                                this.f10720m.put(dxh.f10735c, dxh);
                            }
                            kyVar.put(Long.valueOf(dxh.f10733a), dxh);
                        } catch (Throwable th2) {
                            th = th2;
                            cursor = query;
                        }
                    }
                    if (query != null) {
                        query.close();
                    }
                    buildUpon = dwz.f6497h.buildUpon();
                    buildUpon.appendQueryParameter("account_id", Integer.toString(this.f10716i));
                    query = this.f10715h.query(buildUpon.build(), dwz.f6499j, null, null, null);
                    while (query.moveToNext()) {
                        dxh = (dxh) kyVar.get(Long.valueOf(query.getLong(1)));
                        int i = query.getInt(2);
                        Object dxm;
                        if (i == 0) {
                            dxm = new dxm();
                            dxi.m12974a(query, dxm);
                            if (!(TextUtils.isEmpty(dxm.b) || dxm.m12976a())) {
                                this.f10719l.mo3776a(dxm.b, dxm);
                            }
                            if (dxh != null) {
                                dxh.f10745m.put(dxm.b != null ? dxm.b : dxm.a, dxm);
                            } else {
                                continue;
                            }
                        } else if (i == 1) {
                            dxm = new dxj();
                            dxi.m12974a(query, dxm);
                            if (!dxm.m12976a()) {
                                this.f10718k.mo3776a(dxm.a, dxm);
                            }
                            if (dxh != null) {
                                dxh.f10746n.put(dxm.a, dxm);
                            }
                        }
                    }
                    if (query != null) {
                        query.close();
                    }
                    this.f10723p.m17983a("retrieveOldDetails()");
                    if (z) {
                        String a = ((bbm) jyn.m25426a(this.f10714d, bbm.class)).mo440a(this.f10716i);
                        cursor2 = this.f10715h.query(Data.CONTENT_URI, f10708a, f10711e, null, null);
                        if (cursor2 != null) {
                            while (cursor2.moveToNext()) {
                                dxh dxh2;
                                String string = cursor2.getString(0);
                                dxh = (dxh) this.f10721n.get(string);
                                if (dxh == null) {
                                    dxh = new dxh();
                                    dxh.f10735c = string;
                                    this.f10721n.put(string, dxh);
                                    dxh.f10736d = Long.valueOf(cursor2.getLong(1));
                                    dxh.f10737e = Long.valueOf(cursor2.getLong(3));
                                    dxh.f10738f = glq.m18038i(this.f10714d, cursor2.getString(2));
                                    dxh.f10742j = bjh.UNKNOWN;
                                    dxh2 = dxh;
                                } else {
                                    dxh2 = dxh;
                                }
                                String string2 = cursor2.getString(6);
                                if ("vnd.android.cursor.item/photo".equals(string2)) {
                                    dxh2.f10739g = cursor2.getString(5);
                                } else if ("vnd.android.cursor.item/phone_v2".equals(string2)) {
                                    boolean z2;
                                    r2 = this.f10714d;
                                    r3 = cursor2.getString(gwb.m1507a((Integer) f10709b.get("data1")));
                                    CharSequence string3 = cursor2.getString(gwb.m1507a((Integer) f10709b.get("data4")));
                                    String str2 = "vnd.android.cursor.item/phone_v2";
                                    r0 = cursor2.getInt(gwb.m1507a((Integer) f10709b.get("data2")));
                                    if (r0 == 0) {
                                        string2 = cursor2.getString(gwb.m1507a((Integer) f10709b.get("data3")));
                                    } else if (str2.equals("vnd.android.cursor.item/phone_v2")) {
                                        string2 = (String) Phone.getTypeLabel(r2.getResources(), r0, null);
                                    } else if (str2.equals("vnd.android.cursor.item/email_v2")) {
                                        string2 = (String) Email.getTypeLabel(r2.getResources(), r0, null);
                                    } else {
                                        string2 = "";
                                    }
                                    r2 = glq.m18022e(r3);
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
                                    if (!dxm2.m12976a()) {
                                        dxh2.f10745m.put(dxm2.b != null ? dxm2.b : dxm2.a, dxm2);
                                        if (!TextUtils.isEmpty(dxm2.b)) {
                                            this.f10719l.mo3776a(dxm2.b, dxm2);
                                        }
                                    }
                                } else if ("vnd.android.cursor.item/email_v2".equals(string2)) {
                                    r2 = this.f10714d;
                                    Object dxj = new dxj();
                                    dxj.a = cursor2.getString(gwb.m1507a((Integer) f10709b.get("data1")));
                                    str = "vnd.android.cursor.item/email_v2";
                                    r0 = cursor2.getInt(gwb.m1507a((Integer) f10709b.get("data2")));
                                    if (r0 == 0) {
                                        string2 = cursor2.getString(gwb.m1507a((Integer) f10709b.get("data3")));
                                    } else if (str.equals("vnd.android.cursor.item/phone_v2")) {
                                        string2 = (String) Phone.getTypeLabel(r2.getResources(), r0, null);
                                    } else if (str.equals("vnd.android.cursor.item/email_v2")) {
                                        string2 = (String) Email.getTypeLabel(r2.getResources(), r0, null);
                                    } else {
                                        string2 = "";
                                    }
                                    dxj.d = string2;
                                    dxj.e = true;
                                    if (!dxj.m12976a()) {
                                        this.f10718k.mo3776a(dxj.a, dxj);
                                        dxh2.f10746n.put(dxj.a, dxj);
                                    }
                                } else {
                                    r2 = "Babel_db";
                                    r3 = "unexpected mime-type: ";
                                    string2 = String.valueOf(string2);
                                    glk.m17981d(r2, string2.length() != 0 ? r3.concat(string2) : new String(r3), new Object[0]);
                                }
                                string2 = cursor2.getString(4);
                                if (!(a == null || string2 == null)) {
                                    if (a.equalsIgnoreCase(string2)) {
                                        dxh2.f10742j = bjh.FOCUS;
                                    } else if (dxh2.f10742j != bjh.FOCUS) {
                                        dxh2.f10742j = bjh.CP2;
                                    }
                                }
                            }
                            Iterator it = this.f10721n.values().iterator();
                            while (it.hasNext()) {
                                dxh = (dxh) it.next();
                                if (dxh.f10745m.isEmpty() && dxh.f10746n.isEmpty()) {
                                    it.remove();
                                }
                            }
                            if (cursor2 != null) {
                                cursor2.close();
                            }
                        } else if (cursor2 != null) {
                            cursor2.close();
                        }
                        this.f10723p.m17983a("retrieveLocalContacts()");
                    }
                    if (((fzw) jyn.m25426a(this.f10714d, fzw.class)).mo2146a(this.f10716i)) {
                        this.f10722o = Collections.EMPTY_LIST;
                    } else {
                        m12966b();
                        this.f10723p.m17983a("findEmailOnHangouts()");
                        m12968c();
                        this.f10723p.m17983a("findPhonesOnHangouts()");
                        this.f10722o = m12969d();
                        this.f10723p.m17983a("getSuggestedContacts()");
                    }
                    boolean e = m12970e();
                    long currentTimeMillis2 = System.currentTimeMillis();
                    b.m23878b("last_merged_ts", currentTimeMillis2);
                    b.m23881b("last_merged_read_local_contacts", z);
                    b.m23891d();
                    str = String.valueOf("last_merged_ts");
                    glk.m17979c("Babel", new StringBuilder(String.valueOf(str).length() + 46).append("wrote ").append(currentTimeMillis2).append(" as ").append(str).append(" to accountStore").toString(), new Object[0]);
                    for (dwu a2 : jyn.m25438c(this.f10714d, dwu.class)) {
                        a2.mo1751a(this.f10716i, e);
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
            glk.m17978c("Babel", "Account was logged out while MergeContactsService was running", th);
        } catch (jcj e3) {
            th = e3;
            glk.m17978c("Babel", "Account was logged out while MergeContactsService was running", th);
        } catch (Throwable th4) {
            if (query != null) {
                query.close();
            }
        }
    }

    private void m12966b() {
        int i = 0;
        Collection<String> a = dxg.m12964a(this.f10718k);
        long currentTimeMillis = System.currentTimeMillis();
        if (!a.isEmpty()) {
            if (fdq.f12808x.m14370b(this.f10716i)) {
                etj a2 = etj.m14466a(this.f10714d, this.f10716i, 2, 0, null, a);
                if (!a2.m8076n()) {
                    for (Entry entry : ((fgq) a2.mo1043d()).f13016g.entrySet()) {
                        Collection<dxi> b = this.f10718k.mo3780b((String) entry.getKey());
                        fgr fgr = (fgr) entry.getValue();
                        for (dxi dxi : b) {
                            dxi.f10754h = fgr.f13020c;
                            dxi.f10753g = fgr.f13019b;
                            dxi.f10755i = fgr.f13021d;
                            dxi.f10752f = fgr.f13018a;
                            dxi.f10751e = TextUtils.isEmpty(fgr.f13019b);
                            dxi.f10757k = fgr.f13022e;
                            dxi.f10758l = fgr.f13023f;
                        }
                    }
                    i = 1;
                }
            } else {
                ConditionVariable conditionVariable = new ConditionVariable();
                dxk dxk = new dxk(this, conditionVariable);
                dxk.m12979a(a, this.f10716i);
                conditionVariable.block();
                exj exj = dxk.f10759a;
                if (exj != null) {
                    for (gkv gkv : exj.m14747k()) {
                        for (edk edk : (edk[]) gkv.f15525b) {
                            if (edk != null) {
                                for (dxi dxi2 : this.f10718k.mo3780b(((fbt) gkv.f15524a).f12660c)) {
                                    dxi2.f10754h = edk.f11219h;
                                    dxi2.f10753g = edk.m13590b();
                                    dxi2.f10755i = edk.f11216e;
                                    dxi2.f10752f = edk.f11237z;
                                    dxi2.f10751e = TextUtils.isEmpty(edk.m13590b());
                                    dxi2.f10757k = edk.f11205C;
                                    dxi2.f10758l = edk.f11206D;
                                }
                            }
                        }
                    }
                    i = 1;
                }
            }
            if (i != 0) {
                for (String b2 : a) {
                    for (dxi dxi3 : this.f10718k.mo3780b(b2)) {
                        dxi3.f10756j = currentTimeMillis;
                    }
                }
            }
        }
    }

    private void m12968c() {
        long currentTimeMillis = System.currentTimeMillis();
        Object<String> a = dxg.m12964a(this.f10719l);
        if (!a.isEmpty()) {
            if (fdq.f12808x.m14370b(this.f10716i)) {
                etj a2 = etj.m14466a(this.f10714d, this.f10716i, 3, 0, Integer.valueOf(2), a);
                if (!a2.m8076n()) {
                    for (Entry entry : ((fgq) a2.mo1043d()).f13016g.entrySet()) {
                        Collection<dxi> b = this.f10719l.mo3780b((String) entry.getKey());
                        fgr fgr = (fgr) entry.getValue();
                        for (dxi dxi : b) {
                            dxi.f10754h = fgr.f13020c;
                            dxi.f10755i = fgr.f13021d;
                            dxi.f10752f = fgr.f13018a;
                            dxi.f10757k = fgr.f13022e;
                            dxi.f10758l = fgr.f13023f;
                        }
                    }
                    for (String b2 : a) {
                        for (dxi dxi2 : this.f10719l.mo3780b(b2)) {
                            dxi2.f10756j = currentTimeMillis;
                        }
                    }
                }
            }
        }
    }

    private static List<String> m12964a(mmc<String, ? extends dxi> mmc_java_lang_String___extends_dxi) {
        List<String> arrayList = new ArrayList();
        long currentTimeMillis = System.currentTimeMillis();
        for (String str : mmc_java_lang_String___extends_dxi.mo3779k()) {
            Collection<dxi> b = mmc_java_lang_String___extends_dxi.mo3780b(str);
            boolean z = false;
            Object obj = null;
            long j = 0;
            String str2 = null;
            String str3 = null;
            for (dxi dxi : b) {
                if (dxi.f10752f) {
                    z = true;
                }
                if (!TextUtils.isEmpty(dxi.f10753g)) {
                    obj = dxi.f10753g;
                }
                if (!TextUtils.isEmpty(dxi.f10754h)) {
                    str3 = dxi.f10754h;
                }
                if (!TextUtils.isEmpty(dxi.f10755i)) {
                    str2 = dxi.f10755i;
                }
                j = Math.max(j, dxi.f10756j);
            }
            boolean isEmpty = TextUtils.isEmpty(obj);
            if (b.size() > 1) {
                for (dxi dxi2 : b) {
                    dxi2.f10752f = z;
                    dxi2.f10753g = obj;
                    dxi2.f10754h = str3;
                    dxi2.f10755i = str2;
                    dxi2.f10756j = j;
                    dxi2.f10751e = isEmpty;
                }
            }
            if (!z && currentTimeMillis - j > f10712f) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    private boolean m12970e() {
        int i;
        bmv b = ((bnb) jyn.m25426a(this.f10714d, bnb.class)).mo614a(this.f10716i).m6187b();
        List arrayList = new ArrayList();
        List arrayList2 = new ArrayList();
        for (dxh dxh : this.f10721n.values()) {
            if (dxh.m12973a()) {
                this.f10731x++;
            }
            if (!this.f10720m.containsKey(dxh.f10735c)) {
                arrayList2.add(dxh);
            } else if (dxh.equals((dxh) this.f10720m.remove(dxh.f10735c))) {
                this.f10727t++;
            } else {
                arrayList.add(dxh);
            }
        }
        List arrayList3 = new ArrayList(this.f10720m.values());
        glk.m17979c("Babel", "Leaving " + this.f10727t + " existing mergedContacts unchanged", new Object[0]);
        boolean z = false;
        for (i = 0; i < arrayList.size(); i += 25) {
            z = true;
            List subList = arrayList.subList(i, Math.min(i + 25, arrayList.size()));
            b.m6202a();
            dxg.m12965a(b, subList);
            m12967b(b, subList);
            b.m6207b();
            b.m6208c();
            this.f10725r += subList.size();
            this.f10723p.m17983a("updateMergedContacts(" + subList.size() + ")");
            this.f10715h.notifyChange(dwz.f6496g, null);
        }
        glk.m17979c("Babel", "Updated " + this.f10725r + " existing mergedContacts", new Object[0]);
        for (i = 0; i < arrayList2.size(); i += 25) {
            z = true;
            subList = arrayList2.subList(i, Math.min(i + 25, arrayList2.size()));
            b.m6202a();
            m12967b(b, subList);
            b.m6207b();
            b.m6208c();
            this.f10724q += subList.size();
            this.f10723p.m17983a("insertMergedContacts(" + subList.size() + ")");
            this.f10715h.notifyChange(dwz.f6496g, null);
        }
        glk.m17979c("Babel", "Inserted " + this.f10724q + " new mergedContacts", new Object[0]);
        for (i = 0; i < arrayList3.size(); i += 25) {
            z = true;
            subList = arrayList3.subList(i, Math.min(i + 25, arrayList3.size()));
            b.m6202a();
            dxg.m12965a(b, subList);
            b.m6207b();
            b.m6208c();
            this.f10726s += subList.size();
            this.f10723p.m17983a("deleteMergedContacts(" + subList.size() + ")");
            this.f10715h.notifyChange(dwz.f6496g, null);
        }
        glk.m17979c("Babel", "Deleted " + this.f10726s + " old mergedContacts", new Object[0]);
        b.m6202a();
        b.m6196a("merged_contacts", "contact_lookup_key IS NULL OR contact_lookup_key = ''", null);
        this.f10723p.m17983a("delete old suggested contacts");
        m12967b(b, this.f10722o);
        this.f10731x += this.f10722o.size();
        b.m6207b();
        b.m6208c();
        this.f10723p.m17983a("write new suggested contacts");
        this.f10715h.notifyChange(dwz.f6496g, null);
        int i2 = this.f10728u;
        int i3 = this.f10729v;
        glk.m17979c("Babel", "Persisted " + i2 + " phone numbers, " + i3 + " emails, and " + this.f10730w + " gaiaIds", new Object[0]);
        long a = ((jcf) jyn.m25426a(this.f10714d, jcf.class)).mo3464b(this.f10716i).mo3434a("last_merged_ts", 0);
        if (z || (this.f10721n.isEmpty() && this.f10722o.isEmpty() && a == 0)) {
            i3 = this.f10716i;
            i2 = this.f10722o.size() + this.f10721n.size();
            iih iih = (iih) jyn.m25426a(this.f10714d, iih.class);
            if (i2 == 0) {
                iih.mo1979a(i3).mo1693b().mo1697a(1, TimeUnit.DAYS).mo1714c(2568);
            } else {
                iih.mo1979a(i3).mo1693b().mo1698a(Integer.valueOf(i2)).mo1697a(1, TimeUnit.DAYS).mo1714c(2549);
                if (this.f10731x == 0) {
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
                iih.mo1979a(i3).mo1693b().mo1698a(Integer.valueOf(this.f10731x)).mo1697a(1, TimeUnit.DAYS).mo1714c(i2);
            }
        }
        return z;
    }

    private static void m12965a(bmv bmv, Collection<dxh> collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            bmv.m6196a("merged_contacts", "contact_lookup_key = ?", new String[]{new String(String.valueOf(((dxh) it.next()).f10735c))});
        }
    }

    private void m12967b(bmv bmv, Collection<dxh> collection) {
        ContentValues contentValues = new ContentValues();
        ContentValues contentValues2 = new ContentValues();
        for (dxh dxh : collection) {
            contentValues.clear();
            contentValues.put("contact_lookup_key", dxh.f10735c);
            contentValues.put("contact_id", dxh.f10736d);
            contentValues.put("raw_contact_id", dxh.f10737e);
            contentValues.put("display_name", dxh.f10738f);
            contentValues.put("avatar_url", dxh.f10739g);
            contentValues.put("is_frequent", Boolean.valueOf(dxh.f10740h));
            contentValues.put("contact_source", Integer.valueOf(dxh.f10742j.ordinal()));
            contentValues.put("frequent_order", Integer.valueOf(dxh.f10741i));
            contentValues.put("person_logging_id", dxh.f10743k);
            contentValues.put("person_affinity_score", Float.valueOf(dxh.f10744l));
            long a = bmv.m6197a("merged_contacts", null, contentValues);
            for (dxm dxm : dxh.f10745m.values()) {
                Context context = this.f10714d;
                contentValues2.clear();
                contentValues2.put("lookup_data_type", Integer.valueOf(0));
                contentValues2.put("lookup_data", dxm.a);
                contentValues2.put("lookup_data_display", glq.m18038i(context, dxm.a));
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
                bmv.m6197a("merged_contact_details", null, contentValues2);
                this.f10728u++;
            }
            for (dxj dxj : dxh.f10746n.values()) {
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
                bmv.m6197a("merged_contact_details", null, contentValues2);
                this.f10729v++;
            }
            if (!TextUtils.isEmpty(dxh.f10734b)) {
                contentValues2.clear();
                contentValues2.put("merged_contact_id", Long.valueOf(a));
                contentValues2.put("lookup_data_type", Integer.valueOf(2));
                contentValues2.putNull("lookup_data");
                contentValues2.putNull("lookup_data_standardized");
                contentValues2.putNull("lookup_data_search");
                contentValues2.putNull("lookup_data_label");
                contentValues2.put("is_hangouts_user", Boolean.valueOf(true));
                contentValues2.put("needs_gaia_ids_resolved", Boolean.valueOf(false));
                contentValues2.put("gaia_id", dxh.f10734b);
                contentValues2.putNull("avatar_url");
                contentValues2.putNull("display_name");
                contentValues2.put("last_checked_ts", Integer.valueOf(0));
                contentValues2.putNull("detail_logging_id");
                contentValues2.put("detail_affinity_score", Float.valueOf(0.0f));
                bmv.m6197a("merged_contact_details", null, contentValues2);
                this.f10730w++;
            }
        }
    }

    private List<dxh> m12969d() {
        Throwable th;
        Cursor cursor;
        Cursor cursor2 = null;
        mmc mje = new mje();
        for (Object obj : this.f10721n.values()) {
            for (dxi dxi : obj.f10745m.values()) {
                if (!TextUtils.isEmpty(dxi.f10753g)) {
                    mje.mo3776a(dxi.f10753g, obj);
                }
            }
            for (dxi dxi2 : obj.f10746n.values()) {
                if (!TextUtils.isEmpty(dxi2.f10753g)) {
                    mje.mo3776a(dxi2.f10753g, obj);
                }
            }
        }
        List<dxh> arrayList = new ArrayList();
        try {
            String string;
            String string2;
            String string3;
            cursor2 = this.f10715h.query(EsProvider.m8265b(EsProvider.m8251a(EsProvider.f6008k, this.f10716i), 1), f10710c, "name != '' AND chat_id != ?", new String[]{fde.m15018e(this.f10716i).m5632b().f11245b}, null);
            while (cursor2.moveToNext()) {
                try {
                    string = cursor2.getString(1);
                    if (!mje.mo3781c(string)) {
                        String string4 = cursor2.getString(0);
                        string2 = cursor2.getString(2);
                        string3 = cursor2.getString(4);
                        float f = cursor2.getFloat(5);
                        Object dxh = new dxh();
                        dxh.f10739g = string2;
                        dxh.f10738f = string4;
                        dxh.f10734b = string;
                        dxh.f10742j = bjh.SUGGESTED_ENTITY;
                        dxh.f10743k = string3;
                        dxh.f10744l = f;
                        arrayList.add(dxh);
                        mje.mo3776a(dxh.f10734b, dxh);
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
                cursor2 = this.f10715h.query(EsProvider.m8265b(EsProvider.m8251a(EsProvider.f6008k, this.f10716i), 0), f10710c, "name != '' AND chat_id != ?", new String[]{fde.m15018e(this.f10716i).m5632b().f11245b}, null);
                while (cursor2.moveToNext()) {
                    string = cursor2.getString(1);
                    int i = cursor2.getInt(3);
                    if (mje.mo3781c(string)) {
                        for (dxh dxh2 : mje.mo3780b(string)) {
                            dxh2.f10740h = true;
                            dxh2.f10741i = i;
                        }
                    } else {
                        string2 = cursor2.getString(0);
                        string3 = cursor2.getString(2);
                        String string5 = cursor2.getString(4);
                        float f2 = cursor2.getFloat(5);
                        Object dxh3 = new dxh();
                        dxh3.f10739g = string3;
                        dxh3.f10738f = string2;
                        dxh3.f10734b = string;
                        dxh3.f10742j = bjh.SUGGESTED_ENTITY;
                        dxh3.f10740h = true;
                        dxh3.f10741i = i;
                        dxh3.f10743k = string5;
                        dxh3.f10744l = f2;
                        arrayList.add(dxh3);
                        mje.mo3776a(dxh3.f10734b, dxh3);
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
