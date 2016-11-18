package p000;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class cgy {
    private static final boolean f5286g = false;
    public final bko f5287a;
    final chh f5288b;
    String f5289c = null;
    che f5290d;
    gll f5291e;
    boolean f5292f;
    private final Context f5293h;
    private final int f5294i;
    private final String f5295j;
    private final boolean f5296k;
    private final Handler f5297l = new Handler(Looper.getMainLooper());
    private final Collection<bpd> f5298m = new HashSet();
    private final boolean f5299n;
    private final Comparator<bpd> f5300o = new chc(this);

    static {
        kae kae = glk.f15558e;
    }

    public cgy(Context context, chh chh, bko bko, String str, boolean z) {
        this.f5293h = context;
        this.f5288b = (chh) iil.m21875b("Expected non-null", (Object) chh);
        this.f5287a = (bko) iil.m21875b("Expected non-null", (Object) bko);
        this.f5294i = bko.m5638g();
        this.f5295j = str;
        this.f5296k = z;
        this.f5299n = ((fzw) jyn.m25426a(context, fzw.class)).mo2155d();
        if (f5286g || gwb.m1906a(context, "babel_cve_logging", false)) {
            this.f5291e = new gll("cve");
            this.f5291e.m17983a("created");
        }
    }

    public void m7629a(int i, String str, Collection<cgc> collection, che che) {
        this.f5290d = che;
        if (this.f5291e != null) {
            this.f5291e.m17983a("started");
        }
        iiq.m4948a(new cgz(this, collection, str, i));
    }

    public void m7627a() {
        gwb.aJ();
        this.f5292f = true;
    }

    void m7630a(Collection<cgc> collection, String str, int i) {
        boolean z = false;
        int i2 = 1;
        bjm bjm = null;
        if (i == 2) {
            if (this.f5291e != null) {
                this.f5291e.m17983a("compute group");
            }
            iil.m21869a(Integer.valueOf(1), Integer.valueOf(collection.size()));
            cgc cgc = (cgc) collection.iterator().next();
            bpd bpd = new bpd(cgc.f5231a, cgc.f5232b, null, null, null, null, null, null, null, false);
            List arrayList = new ArrayList(1);
            arrayList.add(bpd);
            m7624a(arrayList, bpd);
            return;
        }
        if (this.f5299n) {
            bjm = ((bjn) jyn.m25426a(this.f5293h, bjn.class)).mo1757a(this.f5294i);
        }
        if (this.f5291e != null) {
            this.f5291e.m17983a(bjm == null ? "refnull" : "ref");
        }
        try {
            Collection a = m7619a(str, (Collection) collection, bjm);
            if (this.f5291e != null) {
                this.f5291e.m17983a("computeInternal");
            }
            if (a != null) {
                this.f5298m.addAll(a);
            }
            if (bjm != null) {
                bjm.mo1753a();
                if (this.f5291e != null) {
                    this.f5291e.m17983a("release");
                }
            }
            if (this.f5291e != null) {
                this.f5291e.m17983a("computeAll done: " + this.f5298m.size());
            }
            if (this.f5298m.isEmpty()) {
                glk.m17981d("Babel", new StringBuilder(String.valueOf(str).length() + 54).append("No variants! mergeKey=").append(str).append("; conversation count=").append(collection.size()).toString(), new Object[0]);
                return;
            }
            chf a2 = m7616a((Collection) collection);
            if (this.f5291e != null) {
                this.f5291e.m17983a("messageHistory");
            }
            if (this.f5299n) {
                if (this.f5295j != null) {
                    bpd a3 = cgy.m7615a(this.f5298m, this.f5295j);
                    if (a3 == null) {
                        z = true;
                    } else if (gwb.m2254i(a3.f4147b) && !this.f5296k) {
                        z = true;
                    }
                    i2 = z;
                } else if (a2.f5317d != null && gwb.m2267j(gwb.m1507a(a2.f5317d))) {
                    i2 = 0;
                }
            }
            if (i2 != 0 && this.f5299n && ((a2.f5314a || m7625b()) && !a2.f5315b && this.f5287a.m5618E())) {
                this.f5297l.post(new cha(this));
            } else {
                m7628a(this.f5287a.m5628a(a2.f5316c));
            }
        } catch (Throwable th) {
            if (bjm != null) {
                bjm.mo1753a();
                if (this.f5291e != null) {
                    this.f5291e.m17983a("release");
                }
            }
        }
    }

    private boolean m7625b() {
        for (bpd bpd : this.f5298m) {
            if (gwb.m2254i(bpd.f4147b)) {
                return true;
            }
        }
        return false;
    }

    private void m7624a(List<bpd> list, bpd bpd) {
        iil.m21879b("No variants computed", list.isEmpty());
        if (this.f5291e != null) {
            this.f5291e.m17983a("finish bg");
        }
        this.f5297l.post(new chb(this, list, bpd));
    }

    private Collection<bpd> m7619a(String str, Collection<cgc> collection, bjm bjm) {
        try {
            if (this.f5291e != null) {
                this.f5291e.m17983a("computeInternal: " + collection.size());
            }
            ky kyVar = new ky();
            edk a = gwb.m1602a(this.f5287a.m5632b(), glq.m18025f(this.f5293h), null, null, null, null, null, Boolean.valueOf(false));
            blo blo = new blo(this.f5293h, this.f5287a.m5638g());
            chd chd = new chd(this.f5291e);
            if (this.f5291e != null) {
                this.f5291e.m17983a("cI:preloop");
            }
            for (cgc cgc : collection) {
                if (this.f5291e != null) {
                    this.f5291e.m17983a("cI:loopStart");
                }
                bls a2 = m7613a(blo, cgc.f5231a);
                if (this.f5291e != null) {
                    this.f5291e.m17983a("cI:convInfo");
                }
                if (a2 == null) {
                    String str2 = cgc.f5231a;
                    String str3 = cgc.f5236f;
                    glk.m17981d("Babel", new StringBuilder((String.valueOf(str2).length() + 66) + String.valueOf(str3).length()).append("Null conversationInfo for ").append(str2).append("; merge key = ").append(str3).append("; total count: ").append(collection.size()).toString(), new Object[0]);
                    return null;
                }
                edk a3 = cgy.m7618a(a, a2, ((fzw) jyn.m25426a(this.f5293h, fzw.class)).mo2146a(this.f5294i));
                if (this.f5291e != null) {
                    this.f5291e.m17983a("cI:getParticipant");
                }
                if (this.f5299n) {
                    dak a4 = m7617a(a3, bjm, blo);
                    if (this.f5291e != null) {
                        this.f5291e.m17983a("cI:getContactDetails");
                    }
                    if (a4 != null) {
                        m7623a(a4, kyVar);
                        if (this.f5291e != null) {
                            this.f5291e.m17983a("cI:maintain");
                        }
                    }
                }
                if (a3 != null) {
                    m7621a(chd, cgc, a3, a2, kyVar);
                    if (this.f5291e != null) {
                        this.f5291e.m17983a("cI:addFromPAndCI");
                    }
                }
            }
            if (this.f5291e != null) {
                this.f5291e.m17983a("cI:postLoop");
            }
            if (this.f5299n) {
                m7622a(chd, kyVar, blo, str);
                if (this.f5291e != null) {
                    this.f5291e.m17983a("cI:addMising");
                }
            }
            return chd.m7631a();
        } catch (Throwable e) {
            glk.m17980d("Babel", ">>>>>>>>>> got exception computing variants", e);
            return null;
        }
    }

    private void m7623a(dak dak, ky<String, chg> kyVar) {
        for (dap dap : dak.m11392f()) {
            kyVar.put(glq.m18021e(this.f5293h, dap.f9435a), new chg(dak, dap));
        }
    }

    private void m7622a(chd chd, ky<String, chg> kyVar, blo blo, String str) {
        Map hashMap = new HashMap();
        for (bpd bpd : chd.m7631a()) {
            if (this.f5291e != null) {
                this.f5291e.m17983a("addMissing:loopStart");
            }
            if (gwb.m2254i(bpd.f4147b)) {
                String e = glq.m18021e(this.f5293h, bpd.f4148c);
                if (this.f5291e != null) {
                    this.f5291e.m17983a("addMissing:toLegacy");
                }
                if (!hashMap.containsKey(e)) {
                    hashMap.put(e, new HashSet());
                }
                ((HashSet) hashMap.get(e)).add(Integer.valueOf(bpd.f4147b));
                if (!kyVar.containsKey(e)) {
                    kyVar.put(e, new chg(null, new dap(e, null)));
                }
            }
        }
        for (String str2 : kyVar.keySet()) {
            if (this.f5291e != null) {
                this.f5291e.m17983a("addMissing:loopStart2");
            }
            Set<Integer> hashSet = new HashSet();
            hashSet.add(Integer.valueOf(2));
            hashSet.add(Integer.valueOf(3));
            if (hashMap.containsKey(str2)) {
                hashSet.removeAll((Collection) hashMap.get(str2));
            }
            if (!hashSet.isEmpty()) {
                if (this.f5291e != null) {
                    this.f5291e.m17983a("addMissing:reqMedEmpty");
                }
                CharSequence a = blo.m5951a(null, str2);
                if (this.f5291e != null) {
                    this.f5291e.m17983a("addMissing:mergeKey");
                }
                if (TextUtils.equals(str, a)) {
                    for (Integer num : hashSet) {
                        chg chg = (chg) kyVar.get(str2);
                        chd chd2 = chd;
                        chd2.m7632a(new bpd(null, gwb.m1507a(num), gwb.m1597a(this.f5293h, str2, null, null), str2, null, str2, chg.f5320b.m11395a(), null, chg.f5319a, TextUtils.isEmpty(str2)));
                        if (this.f5291e != null) {
                            this.f5291e.m17983a("addMissing:mergeVariant");
                        }
                    }
                }
            }
        }
    }

    private void m7621a(chd chd, cgc cgc, edk edk, bls bls, ky<String, chg> kyVar) {
        String string;
        if (gwb.m2254i(cgc.f5232b)) {
            String string2;
            chg chg;
            String str;
            boolean z = false;
            string = this.f5293h.getString(gwb.si);
            if (TextUtils.isEmpty(edk.f11214c) || string.equals(edk.f11214c)) {
                string2 = this.f5293h.getResources().getString(bc.tx);
                z = true;
                chg = null;
            } else {
                string2 = glq.m18038i(this.f5293h, edk.f11214c);
                chg = (chg) kyVar.get(glq.m18021e(this.f5293h, edk.f11214c));
            }
            string = cgc.f5231a;
            int i = cgc.f5232b;
            String str2 = edk.f11214c;
            if (chg == null || chg.f5320b == null) {
                str = null;
            } else {
                str = chg.f5320b.m11395a();
            }
            chd.m7632a(new bpd(string, i, edk, string2, null, str2, str, bls, chg != null ? chg.f5319a : null, z));
            if (this.f5291e != null) {
                this.f5291e.m17983a("addVariantFromPandCI:smsMerge");
            }
        } else if (TextUtils.isEmpty(edk.m13590b())) {
            string = "Babel";
            String str3 = "empty gaia id for non-SMS transport type, conversation id = ";
            String valueOf = String.valueOf(cgc.f5231a);
            glk.m17981d(string, valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3), new Object[0]);
        } else {
            chd.m7632a(new bpd(cgc.f5231a, cgc.f5232b, edk, null, edk.f11218g, null, null, bls, null, false));
            if (this.f5291e != null) {
                this.f5291e.m17983a("addVariantFromPandCI:gaiaMerge");
            }
        }
    }

    private static edk m7618a(edk edk, bls bls, boolean z) {
        if (bls.f3762h != null) {
            Object obj = null;
            for (edk edk2 : bls.f3762h) {
                if (obj != null) {
                    return edk2;
                }
                if (edk2.equals(edk)) {
                    obj = 1;
                } else if (!z || TextUtils.isEmpty(edk2.f11214c) || !edk2.f11214c.equals(edk.f11214c)) {
                    return edk2;
                } else {
                    obj = 1;
                }
            }
        }
        return null;
    }

    private dak m7617a(edk edk, bjm bjm, blo blo) {
        dak dak = null;
        if (edk != null) {
            if (!TextUtils.isEmpty(edk.f11214c)) {
                dak = blo.m6010b(edk.f11214c, bjm);
                if (this.f5291e != null) {
                    this.f5291e.m17983a("getDetails:phone");
                }
            } else if (!TextUtils.isEmpty(edk.m13590b())) {
                dak = dak.m11379a(this.f5293h, bjm.mo1756c(edk.m13590b()));
                if (this.f5291e != null) {
                    this.f5291e.m17983a("getDetails:gaia");
                }
            }
        }
        return dak;
    }

    private bls m7613a(blo blo, String str) {
        bls f = blo.m6050f(str);
        if (this.f5291e != null) {
            this.f5291e.m17983a("getCI:getConvInfo");
        }
        if (f == null && blo.m5871a(str)) {
            String a = RealTimeChatService.m8987a(str);
            if (!TextUtils.isEmpty(a)) {
                f = blo.m6050f(a);
                if (this.f5291e != null) {
                    this.f5291e.m17983a("getCI:getConvInfoServer");
                }
            }
        }
        return f;
    }

    private chf m7616a(Collection<cgc> collection) {
        boolean z = false;
        Integer num = null;
        long j = 0;
        int i = 2;
        long j2 = 0;
        for (cgc cgc : collection) {
            boolean z2;
            long j3;
            if (gwb.m2254i(cgc.f5232b)) {
                z2 = true;
                if (cgc.f5237g > j2) {
                    i = cgc.f5232b;
                    j2 = cgc.f5237g;
                }
            } else {
                z2 = z;
            }
            if (cgc.f5237g > j) {
                this.f5289c = cgc.f5231a;
                long j4 = cgc.f5237g;
                num = Integer.valueOf(cgc.f5232b);
                j3 = j4;
            } else {
                j3 = j;
            }
            j = j3;
            z = z2;
        }
        if (this.f5289c == null) {
            this.f5289c = ((cgc) collection.iterator().next()).f5231a;
        }
        return new chf(this, z, j2 != 0, i, num);
    }

    private Collection<bpd> m7620a(Collection<bpd> collection, int i) {
        if (this.f5299n) {
            boolean w = this.f5287a.m5654w();
            boolean F = this.f5287a.m5619F();
            boolean E = this.f5287a.m5618E();
            boolean z = !E && w && i == 2;
            if (!E && F && i == 3) {
                E = true;
            } else {
                E = false;
            }
            StringBuilder stringBuilder = new StringBuilder();
            Iterator it = collection.iterator();
            Object obj = null;
            while (it.hasNext()) {
                boolean z2;
                bpd bpd = (bpd) it.next();
                boolean z3 = (bpd.f4153h.m13599i() || gwb.m2054b(this.f5293h, bpd.f4153h)) ? false : true;
                Object obj2 = bpd.f4147b == 2 ? 1 : null;
                Object obj3 = bpd.f4147b == 3 ? 1 : null;
                if (bpd.f4146a != null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (obj2 != null) {
                    if (!((w || z2) && z3 && !E)) {
                        stringBuilder.append("gv/filtered ").append(bpd.f4146a).append(w).append(";").append(z2).append(";").append(z3).append(";").append(E).append(";true").append(";");
                        it.remove();
                        obj = 1;
                    }
                } else if (obj3 != null && (!(F || z2) || (z && z3))) {
                    stringBuilder.append("carrier/filtered ").append(bpd.f4146a).append(F).append(";").append(z2).append(";true").append(";").append(z).append(";").append(z3).append(";");
                    obj = 1;
                    it.remove();
                }
                obj = obj;
            }
            if (obj != null) {
                glk.m17979c("Babel", stringBuilder.toString(), new Object[0]);
            }
        }
        return collection;
    }

    private void m7626c() {
        for (bpd bpd : this.f5298m) {
            String valueOf = String.valueOf(bpd.f4146a);
            glk.m17981d("Babel", new StringBuilder(String.valueOf(valueOf).length() + 47).append("skipping candidate variant: ").append(valueOf).append("; type: ").append(bpd.f4147b).toString(), new Object[0]);
        }
    }

    private bpd m7614a(Collection<bpd> collection, bpd bpd, int i) {
        if (collection.size() == 1) {
            return (bpd) collection.iterator().next();
        }
        if (this.f5296k || bpd.f4147b == 1) {
            return bpd;
        }
        CharSequence e = glq.m18021e(this.f5293h, bpd.f4148c);
        if (this.f5291e != null) {
            this.f5291e.m17983a("getSelected:toLegacy");
        }
        bpd bpd2 = null;
        for (bpd bpd3 : collection) {
            bpd bpd32;
            CharSequence e2 = glq.m18021e(this.f5293h, bpd32.f4148c);
            if (this.f5291e != null) {
                this.f5291e.m17983a("getSelected:toLegacyLoop");
            }
            if (!TextUtils.equals(e, e2)) {
                bpd32 = bpd2;
            } else if (bpd32.f4147b == i) {
                return bpd32;
            }
            bpd2 = bpd32;
        }
        if (bpd2 != null) {
            return bpd2;
        }
        glk.m17981d("Babel", "Could not find valid transport, preferred = " + i, new Object[0]);
        return null;
    }

    private static bpd m7615a(Collection<bpd> collection, String str) {
        for (bpd bpd : collection) {
            if (TextUtils.equals(str, bpd.f4146a)) {
                return bpd;
            }
        }
        return null;
    }

    public void m7628a(int i) {
        bpd bpd;
        if (this.f5298m.size() == 1) {
            bpd = (bpd) this.f5298m.iterator().next();
        } else if (this.f5295j != null) {
            r1 = cgy.m7615a(this.f5298m, this.f5295j);
            if (r1 == null) {
                r2 = "Babel";
                r3 = "Unexpected null variant matching conversationIdHint=";
                r0 = String.valueOf(this.f5295j);
                glk.m17981d(r2, r0.length() != 0 ? r3.concat(r0) : new String(r3), new Object[0]);
                m7626c();
            }
            bpd = r1;
        } else {
            r1 = cgy.m7615a(this.f5298m, this.f5289c);
            if (r1 == null) {
                r2 = "Babel";
                r3 = "Unexpected null variant matching latestOrFirstConversationId=";
                r0 = String.valueOf(this.f5289c);
                if (r0.length() != 0) {
                    r0 = r3.concat(r0);
                } else {
                    r0 = new String(r3);
                }
                glk.m17981d(r2, r0, new Object[0]);
                m7626c();
            }
            bpd = r1;
        }
        if (bpd != null) {
            Collection a = m7620a(this.f5298m, i);
            bpd = m7614a(a, bpd, i);
            List arrayList = new ArrayList(a);
            Collections.sort(arrayList, this.f5300o);
            if (this.f5291e != null) {
                this.f5291e.m17983a("sorted");
            }
            m7624a(arrayList, bpd);
        } else if (this.f5291e != null) {
            this.f5291e.m17983a("stopped--null baseVariant");
        }
    }
}
