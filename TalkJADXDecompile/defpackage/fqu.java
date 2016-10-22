package defpackage;

import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: fqu */
public final class fqu extends frf {
    public static final boolean a;
    public static final ConcurrentHashMap<Integer, fqu> c;
    final bko b;
    private blo d;
    private final Object e;

    static {
        kae kae = glk.q;
        a = false;
        c = new ConcurrentHashMap();
    }

    protected String a() {
        return "ContactLoader";
    }

    public static fqu a(bko bko) {
        int g = bko.g();
        fqu fqu = (fqu) c.get(Integer.valueOf(g));
        if (fqu != null) {
            return fqu;
        }
        if (a) {
            new StringBuilder(37).append("Adding contact loader for ").append(g);
        }
        if (g == -1) {
            bko = null;
        }
        c.putIfAbsent(Integer.valueOf(g), new fqu(bko));
        return (fqu) c.get(Integer.valueOf(g));
    }

    private fqu(bko bko) {
        this.e = new Object();
        this.b = bko;
        this.d = null;
    }

    private void d() {
        if (this.b != null) {
            synchronized (this.e) {
                if (this.d == null) {
                    this.d = new blo(gwb.H(), this.b.g());
                }
            }
        }
    }

    public static void a(bko bko, exj exj) {
        int i = 1;
        fqu a = fqu.a(bko);
        if (a.b != null) {
            HashSet hashSet = new HashSet();
            String l = exj.l();
            if (l != null) {
                List c = a.c(l);
                if (a) {
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
            if (l != null || exj.n()) {
                i = 0;
            }
            a.d();
            a.d.a();
            try {
                for (gkv gkv : exj.k()) {
                    edk edk;
                    if (gkv.b == null || ((edk[]) gkv.b).length <= 0) {
                        edk = null;
                    } else {
                        edk = ((edk[]) gkv.b)[0];
                    }
                    if (edk != null) {
                        if (a.d.a(edk, true)) {
                            hashSet.add(edk.b);
                        }
                        if (i != 0) {
                            a.a((fbt) gkv.a, edk);
                        }
                    } else if (i != 0) {
                        a.a((fbt) gkv.a);
                    } else {
                        continue;
                    }
                }
                a.d.b();
                if (!hashSet.isEmpty()) {
                    a.d.a(hashSet);
                    blf.b(a.d);
                    blf.d(a.d);
                }
            } finally {
                a.d.c();
            }
        }
    }

    private void a(fbt fbt, edk edk) {
        if (a) {
            String valueOf = String.valueOf(fbt);
            new StringBuilder(String.valueOf(valueOf).length() + 20).append("Contact info ready: ").append(valueOf);
        }
        if (b(fbt.c())) {
            a(new fqv(this, fbt, edk));
        }
    }

    public void a(fbt fbt) {
        if (glk.a("Babel", 5)) {
            String valueOf = String.valueOf(fbt);
            glk.d("Babel", new StringBuilder(String.valueOf(valueOf).length() + 21).append("Contact info failed: ").append(valueOf).toString(), new Object[0]);
        }
        if (this.b != null && b(fbt.c())) {
            a(new fqw(this, fbt));
        }
    }

    private void a(bol bol) {
        iil.b();
        bjm a = ((bjn) jyn.a(this.d.f(), bjn.class)).a(this.b.g());
        try {
            dak a2 = blo.a(bol.e(), a);
            a(bol.d(), gwb.a(gwb.H(), bol.e(), a2 == null ? "" : a2.c(), a2 == null ? null : a2.d()));
        } finally {
            a.a();
        }
    }

    public static bke a(edo edo, bko bko, fqx fqx) {
        fbt b = gwb.b(edo);
        if (b.a()) {
            frj bke = new bke(b, fqx);
            if (fqu.a(bko).a(bke)) {
                return null;
            }
            return bke;
        }
        glk.d("Babel", "lookup spec for participantId invalid", new Throwable());
        return null;
    }

    public static void a(edo edo, bko bko) {
        fbt b = gwb.b(edo);
        if (b.b()) {
            List arrayList = new ArrayList();
            arrayList.add(b);
            String valueOf = String.valueOf(b.c());
            fqu.a(bko).c(new bjz(arrayList, new StringBuilder(String.valueOf(valueOf).length() + 2).append("#").append(valueOf).append("#").toString()));
            return;
        }
        glk.d("Babel", "participantId not valid for DB lookup", new Throwable());
    }

    public static void a(String str, bko bko) {
        fqu.a(bko).c(new bkl(str, bko));
    }

    protected void a(ArrayList<String> arrayList) {
        if (this.b != null) {
            d();
            arrayList = arrayList;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                int i2 = i + 1;
                String str = (String) arrayList.get(i);
                ArrayList arrayList2 = new ArrayList();
                frj d = d(str);
                String str2;
                if (d == null) {
                    if (a) {
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
                    iil.b();
                    a((bol) d);
                    i = i2;
                } else if (d instanceof bkl) {
                    this.d.F(((bkl) d).a());
                    i = i2;
                } else if (d instanceof bjz) {
                    bjz bjz = (bjz) d;
                    this.d.a();
                    for (fbt fbt : bjz.a()) {
                        edk a = this.d.a(fbt);
                        if (a == null || a.j() != null) {
                            try {
                                if (fbt.a()) {
                                    arrayList2.add(fbt);
                                } else {
                                    a(fbt);
                                }
                            } finally {
                                bjz = this.d;
                                bjz.c();
                            }
                        } else {
                            a(fbt, a);
                        }
                    }
                    this.d.b();
                    if (arrayList2.size() > 0) {
                        if (a) {
                            str = String.valueOf(arrayList2);
                            new StringBuilder(String.valueOf(str).length() + 33).append("Sending batch request to server: ").append(str);
                        }
                        RealTimeChatService.a(((fmf) jyn.a(gwb.H(), fmf.class)).a(-1), this.b, arrayList2, bjz.c(), false);
                    }
                    i = i2;
                } else {
                    if (d instanceof bke) {
                        fbt = ((bke) d).d();
                        edk a2 = this.d.a(fbt);
                        String str3;
                        if (a2 == null || a2.j() != null) {
                            if (a) {
                                if (a2 == null) {
                                    str2 = String.valueOf(fbt);
                                    new StringBuilder(String.valueOf(str2).length() + 42).append("Contact info not in database, try server: ").append(str2);
                                } else {
                                    str3 = "Contact info is not in database: but we have already requested it: ";
                                    str2 = String.valueOf(a2.j());
                                    if (str2.length() != 0) {
                                        str3.concat(str2);
                                    } else {
                                        str2 = new String(str3);
                                    }
                                }
                            }
                            arrayList2.add(fbt);
                            RealTimeChatService.a(((fmf) jyn.a(gwb.H(), fmf.class)).a(-1), this.b, arrayList2, null, false);
                            i = i2;
                        } else {
                            if (a) {
                                String valueOf = String.valueOf(fbt.toString());
                                str3 = String.valueOf(a2.toString());
                                new StringBuilder((String.valueOf(valueOf).length() + 42) + String.valueOf(str3).length()).append("Contact info is in the database: ").append(valueOf).append(" entity: ").append(str3);
                            }
                            a(fbt, a2);
                        }
                    }
                    i = i2;
                }
            }
        }
    }

    public static bke a(String str, boolean z, bko bko, fqy fqy) {
        iil.b("Expected non-null", (Object) fqy);
        bke bol = new bol(str, z, fqy);
        if (fqu.a(bko).a((frj) bol)) {
            return null;
        }
        return bol;
    }
}
