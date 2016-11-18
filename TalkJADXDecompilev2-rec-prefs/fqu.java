package p000;

import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;

public final class fqu extends frf {
    public static final boolean f13780a = false;
    public static final ConcurrentHashMap<Integer, fqu> f13781c = new ConcurrentHashMap();
    final bko f13782b;
    private blo f13783d;
    private final Object f13784e = new Object();

    static {
        kae kae = glk.f15570q;
    }

    protected String mo1676a() {
        return "ContactLoader";
    }

    public static fqu m16000a(bko bko) {
        int g = bko.m5638g();
        fqu fqu = (fqu) f13781c.get(Integer.valueOf(g));
        if (fqu != null) {
            return fqu;
        }
        if (f13780a) {
            new StringBuilder(37).append("Adding contact loader for ").append(g);
        }
        if (g == -1) {
            bko = null;
        }
        f13781c.putIfAbsent(Integer.valueOf(g), new fqu(bko));
        return (fqu) f13781c.get(Integer.valueOf(g));
    }

    private fqu(bko bko) {
        this.f13782b = bko;
        this.f13783d = null;
    }

    private void m16006d() {
        if (this.f13782b != null) {
            synchronized (this.f13784e) {
                if (this.f13783d == null) {
                    this.f13783d = new blo(gwb.m1400H(), this.f13782b.m5638g());
                }
            }
        }
    }

    public static void m16001a(bko bko, exj exj) {
        int i = 1;
        fqu a = fqu.m16000a(bko);
        if (a.f13782b != null) {
            HashSet hashSet = new HashSet();
            String l = exj.m14748l();
            if (l != null) {
                List c = a.m12716c(l);
                if (f13780a) {
                    int i2;
                    Locale locale = Locale.US;
                    String str = "Clearing %d request from queue: %s";
                    Object[] objArr = new Object[2];
                    if (c == null) {
                        i2 = 0;
                    } else {
                        i2 = c.size();
                    }
                    objArr[0] = Integer.valueOf(i2);
                    objArr[1] = l;
                    String.format(locale, str, objArr);
                }
            }
            if (l != null || exj.m14750n()) {
                i = 0;
            }
            a.m16006d();
            a.f13783d.m5958a();
            try {
                for (gkv gkv : exj.m14747k()) {
                    edk edk;
                    if (gkv.f15525b == null || ((edk[]) gkv.f15525b).length <= 0) {
                        edk = null;
                    } else {
                        edk = ((edk[]) gkv.f15525b)[0];
                    }
                    if (edk != null) {
                        if (a.f13783d.m6002a(edk, true)) {
                            hashSet.add(edk.f11213b);
                        }
                        if (i != 0) {
                            a.m16004a((fbt) gkv.f15524a, edk);
                        }
                    } else if (i != 0) {
                        a.m16008a((fbt) gkv.f15524a);
                    } else {
                        continue;
                    }
                }
                a.f13783d.m6015b();
                if (!hashSet.isEmpty()) {
                    a.f13783d.m5997a(hashSet);
                    blf.m5811b(a.f13783d);
                    blf.m5820d(a.f13783d);
                }
            } finally {
                a.f13783d.m6028c();
            }
        }
    }

    private void m16004a(fbt fbt, edk edk) {
        if (f13780a) {
            String valueOf = String.valueOf(fbt);
            new StringBuilder(String.valueOf(valueOf).length() + 20).append("Contact info ready: ").append(valueOf);
        }
        if (m12715b(fbt.m14924c())) {
            m12710a(new fqv(this, fbt, edk));
        }
    }

    public void m16008a(fbt fbt) {
        if (glk.m17973a("Babel", 5)) {
            String valueOf = String.valueOf(fbt);
            glk.m17981d("Babel", new StringBuilder(String.valueOf(valueOf).length() + 21).append("Contact info failed: ").append(valueOf).toString(), new Object[0]);
        }
        if (this.f13782b != null && m12715b(fbt.m14924c())) {
            m12710a(new fqw(this, fbt));
        }
    }

    private void m16002a(bol bol) {
        iil.m21876b();
        bjm a = ((bjn) jyn.m25426a(this.f13783d.m6049f(), bjn.class)).mo1757a(this.f13782b.m5638g());
        try {
            dak a2 = blo.m5853a(bol.m6300e(), a);
            m16004a(bol.m5576d(), gwb.m1597a(gwb.m1400H(), bol.m6300e(), a2 == null ? "" : a2.m11389c(), a2 == null ? null : a2.m11390d()));
        } finally {
            a.mo1753a();
        }
    }

    public static bke m15998a(edo edo, bko bko, fqx fqx) {
        fbt b = gwb.m1987b(edo);
        if (b.m14922a()) {
            frj bke = new bke(b, fqx);
            if (fqu.m16000a(bko).mo2072a(bke)) {
                return null;
            }
            return bke;
        }
        glk.m17980d("Babel", "lookup spec for participantId invalid", new Throwable());
        return null;
    }

    public static void m16003a(edo edo, bko bko) {
        fbt b = gwb.m1987b(edo);
        if (b.m14923b()) {
            List arrayList = new ArrayList();
            arrayList.add(b);
            String valueOf = String.valueOf(b.m14924c());
            fqu.m16000a(bko).m12718c(new bjz(arrayList, new StringBuilder(String.valueOf(valueOf).length() + 2).append("#").append(valueOf).append("#").toString()));
            return;
        }
        glk.m17980d("Babel", "participantId not valid for DB lookup", new Throwable());
    }

    public static void m16005a(String str, bko bko) {
        fqu.m16000a(bko).m12718c(new bkl(str, bko));
    }

    protected void mo1677a(ArrayList<String> arrayList) {
        if (this.f13782b != null) {
            m16006d();
            arrayList = arrayList;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                int i2 = i + 1;
                String str = (String) arrayList.get(i);
                ArrayList arrayList2 = new ArrayList();
                frj d = m12719d(str);
                String str2;
                if (d == null) {
                    if (f13780a) {
                        str2 = "No Contact Requests for key: ";
                        str = String.valueOf(str);
                        if (str.length() != 0) {
                            str2.concat(str);
                            i = i2;
                        } else {
                            str = new String(str2);
                            i = i2;
                        }
                    } else {
                        i = i2;
                    }
                } else if (d instanceof bol) {
                    iil.m21876b();
                    m16002a((bol) d);
                    i = i2;
                } else if (d instanceof bkl) {
                    this.f13783d.m5914F(((bkl) d).m5604a());
                    i = i2;
                } else if (d instanceof bjz) {
                    bjz bjz = (bjz) d;
                    this.f13783d.m5958a();
                    for (fbt fbt : bjz.m5570a()) {
                        edk a = this.f13783d.m5947a(fbt);
                        if (a == null || a.m13600j() != null) {
                            try {
                                if (fbt.m14922a()) {
                                    arrayList2.add(fbt);
                                } else {
                                    m16008a(fbt);
                                }
                            } finally {
                                bjz = this.f13783d;
                                bjz.m6028c();
                            }
                        } else {
                            m16004a(fbt, a);
                        }
                    }
                    this.f13783d.m6015b();
                    if (arrayList2.size() > 0) {
                        if (f13780a) {
                            str = String.valueOf(arrayList2);
                            new StringBuilder(String.valueOf(str).length() + 33).append("Sending batch request to server: ").append(str);
                        }
                        RealTimeChatService.m9055a(((fmf) jyn.m25426a(gwb.m1400H(), fmf.class)).mo2036a(-1), this.f13782b, arrayList2, bjz.mo594c(), false);
                    }
                    i = i2;
                } else {
                    if (d instanceof bke) {
                        fbt = ((bke) d).m5576d();
                        edk a2 = this.f13783d.m5947a(fbt);
                        String str3;
                        if (a2 == null || a2.m13600j() != null) {
                            if (f13780a) {
                                if (a2 == null) {
                                    str2 = String.valueOf(fbt);
                                    new StringBuilder(String.valueOf(str2).length() + 42).append("Contact info not in database, try server: ").append(str2);
                                } else {
                                    str3 = "Contact info is not in database: but we have already requested it: ";
                                    str2 = String.valueOf(a2.m13600j());
                                    if (str2.length() != 0) {
                                        str3.concat(str2);
                                    } else {
                                        str2 = new String(str3);
                                    }
                                }
                            }
                            arrayList2.add(fbt);
                            RealTimeChatService.m9055a(((fmf) jyn.m25426a(gwb.m1400H(), fmf.class)).mo2036a(-1), this.f13782b, arrayList2, null, false);
                            i = i2;
                        } else {
                            if (f13780a) {
                                String valueOf = String.valueOf(fbt.toString());
                                str3 = String.valueOf(a2.toString());
                                new StringBuilder((String.valueOf(valueOf).length() + 42) + String.valueOf(str3).length()).append("Contact info is in the database: ").append(valueOf).append(" entity: ").append(str3);
                            }
                            m16004a(fbt, a2);
                        }
                    }
                    i = i2;
                }
            }
        }
    }

    public static bke m15999a(String str, boolean z, bko bko, fqy fqy) {
        iil.m21875b("Expected non-null", (Object) fqy);
        bke bol = new bol(str, z, fqy);
        if (fqu.m16000a(bko).mo2072a((frj) bol)) {
            return null;
        }
        return bol;
    }
}
