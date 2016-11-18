package p000;

import android.content.Context;
import android.os.ConditionVariable;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;

public final class frq implements fsg {
    static final boolean f13826a = false;
    static frq f13827b;
    static final Object f13828g = new Object();
    private static final gma f13829j = gma.m18073a("BabelPeopleCache");
    private static Runnable f13830y = new frt();
    boolean f13831c;
    final gui f13832d;
    public final Handler f13833e = new Handler(Looper.getMainLooper());
    final Object f13834f = new Object();
    public final Runnable f13835h = new fru(this);
    hsi f13836i = new hsi(this);
    private Context f13837k;
    private int f13838l;
    private boolean f13839m;
    private final ConditionVariable f13840n = new ConditionVariable();
    private final List<C0000a> f13841o = new ArrayList();
    private frx f13842p;
    private hwl f13843q;
    private hwq f13844r;
    private ky<String, ArrayList<Integer>> f13845s = new ky();
    private ky<String, ArrayList<Integer>> f13846t = new ky();
    private boolean f13847u = false;
    private long f13848v = 0;
    private boolean f13849w = false;
    private String f13850x = "N/A";

    static {
        kae kae = glk.f15570q;
    }

    private frq(Context context) {
        this.f13837k = context;
        gui gui = (gui) jyn.m25433b(context, gui.class);
        if (gui == null) {
            guj guj = new guj(gwb.m1400H());
            guj.m18640a(hsj.f17166c, new hsm().m20771a(117).m20770a());
            guj.m18641a(new frr(this));
            guj.m18642a(new frs(this));
            gui = guj.m18645b();
        }
        this.f13832d = gui;
    }

    public static frq m16057a() {
        frq frq;
        synchronized (f13828g) {
            if (f13827b == null || !Thread.holdsLock(f13827b.f13834f)) {
                if (f13827b == null) {
                    f13827b = new frq(gwb.m1400H());
                }
                f13827b.m16062h();
                frq = f13827b;
            } else {
                throw new IllegalStateException("Invalid lock ordering");
            }
        }
        return frq;
    }

    void m16067a(boolean z) {
        String b = f13829j.m18078b("refreshInternal");
        synchronized (this.f13834f) {
            if (!this.f13847u) {
                glk.m17970a("BabelPeopleCache", "GmsPeopleCache: Refresh requested. Performing now", new Object[0]);
                m16072d();
            } else if (z) {
                glk.m17970a("BabelPeopleCache", "GmsPeopleCache: Load in progress. Queueing up refresh", new Object[0]);
                this.f13849w = true;
            } else {
                glk.m17970a("BabelPeopleCache", "GmsPeopleCache: Load in progress. Piggyback refresh", new Object[0]);
            }
        }
        f13829j.m18079c(b);
    }

    public static void m16058b(boolean z) {
        frq a = frq.m16057a();
        try {
            a.m16067a(z);
        } finally {
            a.m16069b();
        }
    }

    private void m16062h() {
        synchronized (this.f13834f) {
            this.f13838l++;
            if (f13826a) {
                int i = this.f13838l;
                String valueOf = String.valueOf(Log.getStackTraceString(new Throwable()));
                new StringBuilder(String.valueOf(valueOf).length() + 40).append("GmsPeopleCache: addRef  ref:").append(i).append("\n").append(valueOf);
            }
            if (this.f13838l == 1) {
                this.f13833e.removeCallbacks(f13830y);
            }
            if (!(this.f13832d.mo2524e() || this.f13832d.mo2525f())) {
                this.f13832d.mo2518b();
            }
        }
    }

    public void m16069b() {
        synchronized (this.f13834f) {
            if (this.f13838l <= 0) {
                throw new IllegalStateException("number of clients should be bigger than 0");
            }
            this.f13838l--;
            if (f13826a) {
                new StringBuilder(43).append("GmsPeopleCache: releaseRef  ref:").append(this.f13838l);
            }
            if (this.f13838l == 0) {
                this.f13833e.postDelayed(f13830y, 60000);
            }
        }
    }

    boolean m16071c() {
        boolean z = true;
        synchronized (this.f13834f) {
            if (this.f13838l != 0) {
                z = false;
            } else {
                iil.m21874a("Expected condition to be true", this.f13841o.isEmpty());
                if (this.f13832d.mo2524e() || this.f13832d.mo2525f()) {
                    if (this.f13832d.mo2524e()) {
                        hsj.f17176m.m20765a(this.f13832d, this.f13836i);
                    }
                    this.f13832d.mo2523d();
                }
                if (this.f13843q != null) {
                    this.f13843q.mo2073b();
                    this.f13843q = null;
                }
                if (this.f13844r != null) {
                    this.f13844r.mo2073b();
                    this.f13844r = null;
                }
                this.f13833e.removeCallbacks(this.f13835h);
                this.f13846t.clear();
                this.f13845s.clear();
                this.f13831c = true;
            }
        }
        return z;
    }

    void m16072d() {
        String b = f13829j.m18078b("load");
        synchronized (this.f13834f) {
            m16062h();
            if (this.f13832d.mo2524e() || this.f13832d.mo2525f()) {
                glk.m17970a("BabelPeopleCache", "GmsPeopleCache: PeopleLoader load() begins", new Object[0]);
                this.f13847u = true;
                this.f13848v = glj.m17956a();
                new fsb(this.f13832d, null, this).m16118b();
                f13829j.m18079c(b);
                return;
            }
            glk.m17970a("BabelPeopleCache", "GmsPeopleCache: disconnected in load(). Reconnecting", new Object[0]);
            this.f13832d.mo2518b();
        }
    }

    public void mo1473a(fsb fsb, hwl hwl, hwq hwq) {
        synchronized (this.f13834f) {
            if (f13826a) {
                new StringBuilder(53).append("GmsPeopleCache: onPeopleReady ").append(glj.m17956a() - this.f13848v).append(" ms");
            }
            iiq.m4948a(new frv(this, hwl, hwq));
        }
    }

    void m16066a(hwl hwl, hwq hwq) {
        String b = f13829j.m18078b("buildCache");
        ky kyVar = new ky();
        ky kyVar2 = new ky();
        long a = glj.m17956a();
        try {
            String valueOf;
            MessageDigest instance = MessageDigest.getInstance("md5");
            if (hwl != null) {
                int a2 = gwb.m1492a(gwb.m1400H(), "babel_gms_people_cache_maximum_contacts_size", 2000);
                for (int i = 0; i < hwl.mo2074a(); i++) {
                    if (i >= a2) {
                        new StringBuilder(63).append("Maximum contacts reached. Total ").append(hwl.mo2074a()).append("; max is ").append(a2);
                        break;
                    }
                    ArrayList arrayList;
                    String valueOf2;
                    String valueOf3;
                    hwk hwk = (hwk) hwl.mo2075a(i);
                    String e = hwk.mo2081e();
                    if (!TextUtils.isEmpty(e)) {
                        if (f13826a) {
                            valueOf = String.valueOf(hwk.mo2077a());
                            new StringBuilder((String.valueOf(e).length() + 50) + String.valueOf(valueOf).length()).append("GmsPeopleCache: adding entry from gaia:").append(e).append(" to person:").append(valueOf);
                        }
                        arrayList = (ArrayList) kyVar.get(e);
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                            kyVar.put(e, arrayList);
                        } else if (f13826a && glk.m17973a("BabelPeopleCache", 3)) {
                            valueOf2 = String.valueOf(hwk.mo2077a());
                            glk.m17976b("BabelPeopleCache", new StringBuilder((String.valueOf(e).length() + 53) + String.valueOf(valueOf2).length()).append("GmsPeopleCache_Error: duplicate entry for gaia:").append(e).append(" name:").append(valueOf2).toString(), new Object[0]);
                            ArrayList arrayList2 = arrayList;
                            int size = arrayList2.size();
                            int i2 = 0;
                            while (i2 < size) {
                                Object obj = arrayList2.get(i2);
                                i2++;
                                String str = "BabelPeopleCache";
                                String str2 = "GmsPeopleCache_Error: dup person name:";
                                valueOf3 = String.valueOf(((hwk) hwl.mo2075a(gwb.m1507a((Integer) obj))).mo2077a());
                                if (valueOf3.length() != 0) {
                                    valueOf3 = str2.concat(valueOf3);
                                } else {
                                    valueOf3 = new String(str2);
                                }
                                glk.m17976b(str, valueOf3, new Object[0]);
                            }
                        }
                        arrayList.add(Integer.valueOf(i));
                    }
                    for (hwr hwr : hwk.mo2080d()) {
                        valueOf3 = glq.m18027f(hwr.mo2955b());
                        if (f13826a) {
                            valueOf = String.valueOf(hwr.mo2955b());
                            valueOf2 = String.valueOf(hwk.mo2077a());
                            new StringBuilder(((String.valueOf(valueOf).length() + 57) + String.valueOf(valueOf2).length()) + String.valueOf(valueOf3).length()).append("GmsPeopleCache: adding entry from phone:").append(valueOf).append(" to person:").append(valueOf2).append(" key: ").append(valueOf3);
                        }
                        arrayList = (ArrayList) kyVar2.get(valueOf3);
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                            kyVar2.put(valueOf3, arrayList);
                        }
                        if (!arrayList.contains(Integer.valueOf(i))) {
                            arrayList.add(Integer.valueOf(i));
                        }
                    }
                    ((fsx) hwk).m16172a(instance);
                }
                long a3 = glj.m17956a();
                if (f13826a) {
                    a3 -= a;
                    new StringBuilder(88).append("GmsPeopleCache: End building cache. Total: ").append(a3).append("ms; ").append(hwl.mo2074a()).append(" contacts.");
                }
            }
            synchronized (this.f13834f) {
                this.f13842p = new frx(this.f13841o, hwl, hwq, this.f13843q, this.f13844r);
                this.f13843q = hwl;
                this.f13844r = hwq;
                this.f13846t = kyVar2;
                this.f13845s = kyVar;
                String valueOf4 = String.valueOf(blo.m5888c(gwb.m1400H()));
                valueOf = String.valueOf(gwb.m2087c(instance.digest()));
                this.f13850x = new StringBuilder((String.valueOf(valueOf4).length() + 1) + String.valueOf(valueOf).length()).append(valueOf4).append("|").append(valueOf).toString();
                this.f13847u = false;
                this.f13839m = true;
                this.f13840n.open();
                iiq.m4948a(new frw(this));
                if (this.f13849w) {
                    glk.m17970a("BabelPeopleCache", "GmsPeopleCache: Triggering queued refresh.", new Object[0]);
                    this.f13849w = false;
                    m16072d();
                }
                synchronized (this.f13834f) {
                    long a4 = glj.m17956a();
                    if (this.f13843q != null && this.f13843q.mo2074a() > 0) {
                        this.f13843q.mo2075a(0);
                    }
                    if (f13826a) {
                        new StringBuilder(59).append("GmsPeopleCache: prefetchFirstPerson ").append(glj.m17956a() - a4).append(" ms");
                    }
                }
            }
            this.f13833e.post(this.f13842p);
            f13829j.m18079c(b);
        } catch (NoSuchAlgorithmException e2) {
            throw new IllegalStateException("md5 not available");
        }
    }

    public boolean m16073e() {
        boolean z;
        synchronized (this.f13834f) {
            z = this.f13839m;
        }
        return z;
    }

    public ArrayList<hwk> m16064a(String str) {
        m16063i();
        synchronized (this.f13834f) {
            if (this.f13845s.containsKey(str)) {
                ArrayList<hwk> arrayList = new ArrayList();
                ArrayList arrayList2 = (ArrayList) this.f13845s.get(str);
                int size = arrayList2.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList2.get(i);
                    i++;
                    arrayList.add((hwk) this.f13843q.mo2075a(gwb.m1507a((Integer) obj)));
                }
                return arrayList;
            }
            return null;
        }
    }

    private ArrayList<hwk> m16059d(String str) {
        if (str == null) {
            return null;
        }
        String f = glq.m18027f(str);
        ArrayList arrayList = (ArrayList) this.f13846t.get(f);
        if (arrayList != null) {
            ArrayList<hwk> arrayList2 = new ArrayList();
            arrayList = arrayList;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                int i2 = i + 1;
                hwk hwk = (hwk) this.f13843q.mo2075a(gwb.m1507a((Integer) arrayList.get(i)));
                for (hwr hwr : hwk.mo2080d()) {
                    if (f.equals(glq.m18027f(hwr.mo2955b()))) {
                        if (glq.m18000a().m18047a(gwb.m1400H(), str, hwr.mo2955b())) {
                            arrayList2.add(hwk);
                            i = i2;
                            break;
                        }
                    }
                }
                i = i2;
            }
            if (arrayList2.size() > 0) {
                return arrayList2;
            }
        }
        return null;
    }

    public ArrayList<hwk> m16068b(String str) {
        ArrayList<hwk> d;
        m16063i();
        synchronized (this.f13834f) {
            d = m16059d(str);
        }
        return d;
    }

    public hwk m16070c(String str) {
        if (!m16063i()) {
            return null;
        }
        synchronized (this.f13834f) {
            ArrayList d = m16059d(str);
            if (d == null) {
                return null;
            } else if (d.size() == 1) {
                hwk hwk = (hwk) d.get(0);
                return hwk;
            } else {
                d = d;
                int size = d.size();
                int i = 0;
                hwk hwk2 = null;
                while (i < size) {
                    Object obj = d.get(i);
                    i++;
                    hwk hwk3 = (hwk) obj;
                    if (TextUtils.isEmpty(hwk3.mo2081e())) {
                        hwk3 = hwk2;
                    } else if (hwk2 != null) {
                        return null;
                    }
                    hwk2 = hwk3;
                }
                return hwk2;
            }
        }
    }

    private boolean m16063i() {
        String b = f13829j.m18078b("waitForReady");
        if (Thread.holdsLock(this.f13834f)) {
            throw new IllegalStateException("Invalid lock ordering");
        } else if (giw.m17760e(this.f13837k)) {
            return false;
        } else {
            boolean block = this.f13840n.block(2000);
            f13829j.m18079c(b);
            return block;
        }
    }

    public static long m16060f() {
        return gwb.m1519a(gwb.m1400H(), "babel_gms_people_cache_notification_lag", 25000);
    }

    public static void m16061g() {
        if (!((cxg) jyn.m25426a(gwb.m1400H(), cxg.class)).mo1454a("use_merged_contacts_instead_of_gmspeoplecache")) {
            frq a = frq.m16057a();
            try {
                a.m16069b();
                String N = gwb.m1424M();
                String str = a.f13850x;
                String str2 = "GmsPeopleCache: old Thumbprint: ";
                String valueOf = String.valueOf(N);
                if (valueOf.length() != 0) {
                    str2.concat(valueOf);
                } else {
                    valueOf = new String(str2);
                }
                str2 = "GmsPeopleCache: current Thumbprint: ";
                valueOf = String.valueOf(str);
                if (valueOf.length() != 0) {
                    str2.concat(valueOf);
                } else {
                    valueOf = new String(str2);
                }
                if (!(gwb.m1906a(gwb.m1400H(), "babel_refresh_contacts_derived_data_use_thumbprint", true) && str.equals(N))) {
                    blo.m5895d(gwb.m1400H());
                }
                gwb.m1735a(glj.m17956a(), str);
            } finally {
                a.m16069b();
            }
        }
    }
}
