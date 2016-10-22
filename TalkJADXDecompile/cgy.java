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
    private static final boolean g;
    public final bko a;
    final chh b;
    String c;
    che d;
    gll e;
    boolean f;
    private final Context h;
    private final int i;
    private final String j;
    private final boolean k;
    private final Handler l;
    private final Collection<bpd> m;
    private final boolean n;
    private final Comparator<bpd> o;

    static {
        kae kae = glk.e;
        g = false;
    }

    public cgy(Context context, chh chh, bko bko, String str, boolean z) {
        this.l = new Handler(Looper.getMainLooper());
        this.m = new HashSet();
        this.c = null;
        this.o = new chc(this);
        this.h = context;
        this.b = (chh) iil.b("Expected non-null", (Object) chh);
        this.a = (bko) iil.b("Expected non-null", (Object) bko);
        this.i = bko.g();
        this.j = str;
        this.k = z;
        this.n = ((fzw) jyn.a(context, fzw.class)).d();
        if (g || gwb.a(context, "babel_cve_logging", false)) {
            this.e = new gll("cve");
            this.e.a("created");
        }
    }

    public void a(int i, String str, Collection<cgc> collection, che che) {
        this.d = che;
        if (this.e != null) {
            this.e.a("started");
        }
        iiq.a(new cgz(this, collection, str, i));
    }

    public void a() {
        gwb.aJ();
        this.f = true;
    }

    void a(Collection<cgc> collection, String str, int i) {
        boolean z = false;
        int i2 = 1;
        bjm bjm = null;
        if (i == 2) {
            if (this.e != null) {
                this.e.a("compute group");
            }
            iil.a(Integer.valueOf(1), Integer.valueOf(collection.size()));
            cgc cgc = (cgc) collection.iterator().next();
            bpd bpd = new bpd(cgc.a, cgc.b, null, null, null, null, null, null, null, false);
            List arrayList = new ArrayList(1);
            arrayList.add(bpd);
            a(arrayList, bpd);
            return;
        }
        if (this.n) {
            bjm = ((bjn) jyn.a(this.h, bjn.class)).a(this.i);
        }
        if (this.e != null) {
            this.e.a(bjm == null ? "refnull" : "ref");
        }
        try {
            Collection a = a(str, (Collection) collection, bjm);
            if (this.e != null) {
                this.e.a("computeInternal");
            }
            if (a != null) {
                this.m.addAll(a);
            }
            if (bjm != null) {
                bjm.a();
                if (this.e != null) {
                    this.e.a("release");
                }
            }
            if (this.e != null) {
                this.e.a("computeAll done: " + this.m.size());
            }
            if (this.m.isEmpty()) {
                glk.d("Babel", new StringBuilder(String.valueOf(str).length() + 54).append("No variants! mergeKey=").append(str).append("; conversation count=").append(collection.size()).toString(), new Object[0]);
                return;
            }
            chf a2 = a((Collection) collection);
            if (this.e != null) {
                this.e.a("messageHistory");
            }
            if (this.n) {
                if (this.j != null) {
                    bpd a3 = a(this.m, this.j);
                    if (a3 == null) {
                        z = true;
                    } else if (gwb.i(a3.b) && !this.k) {
                        z = true;
                    }
                    i2 = z;
                } else if (a2.d != null && gwb.j(gwb.a(a2.d))) {
                    i2 = 0;
                }
            }
            if (i2 != 0 && this.n && ((a2.a || b()) && !a2.b && this.a.E())) {
                this.l.post(new cha(this));
            } else {
                a(this.a.a(a2.c));
            }
        } catch (Throwable th) {
            if (bjm != null) {
                bjm.a();
                if (this.e != null) {
                    this.e.a("release");
                }
            }
        }
    }

    private boolean b() {
        for (bpd bpd : this.m) {
            if (gwb.i(bpd.b)) {
                return true;
            }
        }
        return false;
    }

    private void a(List<bpd> list, bpd bpd) {
        iil.b("No variants computed", list.isEmpty());
        if (this.e != null) {
            this.e.a("finish bg");
        }
        this.l.post(new chb(this, list, bpd));
    }

    private Collection<bpd> a(String str, Collection<cgc> collection, bjm bjm) {
        try {
            if (this.e != null) {
                this.e.a("computeInternal: " + collection.size());
            }
            ky kyVar = new ky();
            edk a = gwb.a(this.a.b(), glq.f(this.h), null, null, null, null, null, Boolean.valueOf(false));
            blo blo = new blo(this.h, this.a.g());
            chd chd = new chd(this.e);
            if (this.e != null) {
                this.e.a("cI:preloop");
            }
            for (cgc cgc : collection) {
                if (this.e != null) {
                    this.e.a("cI:loopStart");
                }
                bls a2 = a(blo, cgc.a);
                if (this.e != null) {
                    this.e.a("cI:convInfo");
                }
                if (a2 == null) {
                    String str2 = cgc.a;
                    String str3 = cgc.f;
                    glk.d("Babel", new StringBuilder((String.valueOf(str2).length() + 66) + String.valueOf(str3).length()).append("Null conversationInfo for ").append(str2).append("; merge key = ").append(str3).append("; total count: ").append(collection.size()).toString(), new Object[0]);
                    return null;
                }
                edk a3 = a(a, a2, ((fzw) jyn.a(this.h, fzw.class)).a(this.i));
                if (this.e != null) {
                    this.e.a("cI:getParticipant");
                }
                if (this.n) {
                    dak a4 = a(a3, bjm, blo);
                    if (this.e != null) {
                        this.e.a("cI:getContactDetails");
                    }
                    if (a4 != null) {
                        a(a4, kyVar);
                        if (this.e != null) {
                            this.e.a("cI:maintain");
                        }
                    }
                }
                if (a3 != null) {
                    a(chd, cgc, a3, a2, kyVar);
                    if (this.e != null) {
                        this.e.a("cI:addFromPAndCI");
                    }
                }
            }
            if (this.e != null) {
                this.e.a("cI:postLoop");
            }
            if (this.n) {
                a(chd, kyVar, blo, str);
                if (this.e != null) {
                    this.e.a("cI:addMising");
                }
            }
            return chd.a();
        } catch (Throwable e) {
            glk.d("Babel", ">>>>>>>>>> got exception computing variants", e);
            return null;
        }
    }

    private void a(dak dak, ky<String, chg> kyVar) {
        for (dap dap : dak.f()) {
            kyVar.put(glq.e(this.h, dap.a), new chg(dak, dap));
        }
    }

    private void a(chd chd, ky<String, chg> kyVar, blo blo, String str) {
        Map hashMap = new HashMap();
        for (bpd bpd : chd.a()) {
            if (this.e != null) {
                this.e.a("addMissing:loopStart");
            }
            if (gwb.i(bpd.b)) {
                String e = glq.e(this.h, bpd.c);
                if (this.e != null) {
                    this.e.a("addMissing:toLegacy");
                }
                if (!hashMap.containsKey(e)) {
                    hashMap.put(e, new HashSet());
                }
                ((HashSet) hashMap.get(e)).add(Integer.valueOf(bpd.b));
                if (!kyVar.containsKey(e)) {
                    kyVar.put(e, new chg(null, new dap(e, null)));
                }
            }
        }
        for (String str2 : kyVar.keySet()) {
            if (this.e != null) {
                this.e.a("addMissing:loopStart2");
            }
            Set<Integer> hashSet = new HashSet();
            hashSet.add(Integer.valueOf(2));
            hashSet.add(Integer.valueOf(3));
            if (hashMap.containsKey(str2)) {
                hashSet.removeAll((Collection) hashMap.get(str2));
            }
            if (!hashSet.isEmpty()) {
                if (this.e != null) {
                    this.e.a("addMissing:reqMedEmpty");
                }
                CharSequence a = blo.a(null, str2);
                if (this.e != null) {
                    this.e.a("addMissing:mergeKey");
                }
                if (TextUtils.equals(str, a)) {
                    for (Integer num : hashSet) {
                        edk a2 = gwb.a(this.h, str2, null, null);
                        chg chg = (chg) kyVar.get(str2);
                        chd chd2 = chd;
                        chd2.a(new bpd(null, gwb.a(num), a2, str2, null, str2, chg.b.a(), null, chg.a, TextUtils.isEmpty(str2)));
                        if (this.e != null) {
                            this.e.a("addMissing:mergeVariant");
                        }
                    }
                }
            }
        }
    }

    private void a(chd chd, cgc cgc, edk edk, bls bls, ky<String, chg> kyVar) {
        String string;
        if (gwb.i(cgc.b)) {
            String string2;
            chg chg;
            String str;
            boolean z = false;
            string = this.h.getString(gwb.si);
            if (TextUtils.isEmpty(edk.c) || string.equals(edk.c)) {
                string2 = this.h.getResources().getString(bc.tx);
                z = true;
                chg = null;
            } else {
                string2 = glq.i(this.h, edk.c);
                chg = (chg) kyVar.get(glq.e(this.h, edk.c));
            }
            string = cgc.a;
            int i = cgc.b;
            String str2 = edk.c;
            if (chg == null || chg.b == null) {
                str = null;
            } else {
                str = chg.b.a();
            }
            chd.a(new bpd(string, i, edk, string2, null, str2, str, bls, chg != null ? chg.a : null, z));
            if (this.e != null) {
                this.e.a("addVariantFromPandCI:smsMerge");
            }
        } else if (TextUtils.isEmpty(edk.b())) {
            string = "Babel";
            String str3 = "empty gaia id for non-SMS transport type, conversation id = ";
            String valueOf = String.valueOf(cgc.a);
            glk.d(string, valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3), new Object[0]);
        } else {
            chd.a(new bpd(cgc.a, cgc.b, edk, null, edk.g, null, null, bls, null, false));
            if (this.e != null) {
                this.e.a("addVariantFromPandCI:gaiaMerge");
            }
        }
    }

    private static edk a(edk edk, bls bls, boolean z) {
        if (bls.h != null) {
            Object obj = null;
            for (edk edk2 : bls.h) {
                if (obj != null) {
                    return edk2;
                }
                if (edk2.equals(edk)) {
                    obj = 1;
                } else if (!z || TextUtils.isEmpty(edk2.c) || !edk2.c.equals(edk.c)) {
                    return edk2;
                } else {
                    obj = 1;
                }
            }
        }
        return null;
    }

    private dak a(edk edk, bjm bjm, blo blo) {
        dak dak = null;
        if (edk != null) {
            if (!TextUtils.isEmpty(edk.c)) {
                dak = blo.b(edk.c, bjm);
                if (this.e != null) {
                    this.e.a("getDetails:phone");
                }
            } else if (!TextUtils.isEmpty(edk.b())) {
                dak = dak.a(this.h, bjm.c(edk.b()));
                if (this.e != null) {
                    this.e.a("getDetails:gaia");
                }
            }
        }
        return dak;
    }

    private bls a(blo blo, String str) {
        bls f = blo.f(str);
        if (this.e != null) {
            this.e.a("getCI:getConvInfo");
        }
        if (f == null && blo.a(str)) {
            String a = RealTimeChatService.a(str);
            if (!TextUtils.isEmpty(a)) {
                f = blo.f(a);
                if (this.e != null) {
                    this.e.a("getCI:getConvInfoServer");
                }
            }
        }
        return f;
    }

    private chf a(Collection<cgc> collection) {
        boolean z = false;
        Integer num = null;
        long j = 0;
        int i = 2;
        long j2 = 0;
        for (cgc cgc : collection) {
            boolean z2;
            long j3;
            if (gwb.i(cgc.b)) {
                z2 = true;
                if (cgc.g > j2) {
                    i = cgc.b;
                    j2 = cgc.g;
                }
            } else {
                z2 = z;
            }
            if (cgc.g > j) {
                this.c = cgc.a;
                long j4 = cgc.g;
                num = Integer.valueOf(cgc.b);
                j3 = j4;
            } else {
                j3 = j;
            }
            j = j3;
            z = z2;
        }
        if (this.c == null) {
            this.c = ((cgc) collection.iterator().next()).a;
        }
        return new chf(this, z, j2 != 0, i, num);
    }

    private Collection<bpd> a(Collection<bpd> collection, int i) {
        if (this.n) {
            boolean w = this.a.w();
            boolean F = this.a.F();
            boolean E = this.a.E();
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
                boolean z3 = (bpd.h.i() || gwb.b(this.h, bpd.h)) ? false : true;
                Object obj2 = bpd.b == 2 ? 1 : null;
                Object obj3 = bpd.b == 3 ? 1 : null;
                if (bpd.a != null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (obj2 != null) {
                    if (!((w || z2) && z3 && !E)) {
                        stringBuilder.append("gv/filtered ").append(bpd.a).append(w).append(";").append(z2).append(";").append(z3).append(";").append(E).append(";true").append(";");
                        it.remove();
                        obj = 1;
                    }
                } else if (obj3 != null && (!(F || z2) || (z && z3))) {
                    stringBuilder.append("carrier/filtered ").append(bpd.a).append(F).append(";").append(z2).append(";true").append(";").append(z).append(";").append(z3).append(";");
                    obj = 1;
                    it.remove();
                }
                obj = obj;
            }
            if (obj != null) {
                glk.c("Babel", stringBuilder.toString(), new Object[0]);
            }
        }
        return collection;
    }

    private void c() {
        for (bpd bpd : this.m) {
            String valueOf = String.valueOf(bpd.a);
            glk.d("Babel", new StringBuilder(String.valueOf(valueOf).length() + 47).append("skipping candidate variant: ").append(valueOf).append("; type: ").append(bpd.b).toString(), new Object[0]);
        }
    }

    private bpd a(Collection<bpd> collection, bpd bpd, int i) {
        if (collection.size() == 1) {
            return (bpd) collection.iterator().next();
        }
        if (this.k || bpd.b == 1) {
            return bpd;
        }
        CharSequence e = glq.e(this.h, bpd.c);
        if (this.e != null) {
            this.e.a("getSelected:toLegacy");
        }
        bpd bpd2 = null;
        for (bpd bpd3 : collection) {
            bpd bpd32;
            CharSequence e2 = glq.e(this.h, bpd32.c);
            if (this.e != null) {
                this.e.a("getSelected:toLegacyLoop");
            }
            if (!TextUtils.equals(e, e2)) {
                bpd32 = bpd2;
            } else if (bpd32.b == i) {
                return bpd32;
            }
            bpd2 = bpd32;
        }
        if (bpd2 != null) {
            return bpd2;
        }
        glk.d("Babel", "Could not find valid transport, preferred = " + i, new Object[0]);
        return null;
    }

    private static bpd a(Collection<bpd> collection, String str) {
        for (bpd bpd : collection) {
            if (TextUtils.equals(str, bpd.a)) {
                return bpd;
            }
        }
        return null;
    }

    public void a(int i) {
        bpd bpd;
        if (this.m.size() == 1) {
            bpd = (bpd) this.m.iterator().next();
        } else if (this.j != null) {
            r1 = a(this.m, this.j);
            if (r1 == null) {
                r2 = "Babel";
                r3 = "Unexpected null variant matching conversationIdHint=";
                r0 = String.valueOf(this.j);
                glk.d(r2, r0.length() != 0 ? r3.concat(r0) : new String(r3), new Object[0]);
                c();
            }
            bpd = r1;
        } else {
            r1 = a(this.m, this.c);
            if (r1 == null) {
                r2 = "Babel";
                r3 = "Unexpected null variant matching latestOrFirstConversationId=";
                r0 = String.valueOf(this.c);
                if (r0.length() != 0) {
                    r0 = r3.concat(r0);
                } else {
                    r0 = new String(r3);
                }
                glk.d(r2, r0, new Object[0]);
                c();
            }
            bpd = r1;
        }
        if (bpd != null) {
            Collection a = a(this.m, i);
            bpd = a(a, bpd, i);
            List arrayList = new ArrayList(a);
            Collections.sort(arrayList, this.o);
            if (this.e != null) {
                this.e.a("sorted");
            }
            a(arrayList, bpd);
        } else if (this.e != null) {
            this.e.a("stopped--null baseVariant");
        }
    }
}
