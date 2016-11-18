package p000;

import java.util.ArrayList;
import java.util.List;

public abstract class fpl extends fou {
    private static final boolean f13599d = false;
    private static final long serialVersionUID = 2;
    public int f13600e;
    public final int f13601f;
    public final int f13602g;
    public final long f13603h;
    public final int f13604i;
    public final String f13605j;
    public final String f13606k;
    public final String f13607l;
    public final long f13608m;
    public final boolean f13609n;
    public final boolean f13610o;
    public final boolean f13611p;
    public final int f13612q;
    public final String f13613r;
    public final int f13614s;
    public final byte[] f13615t;

    protected abstract void mo2062b(blo blo, fhc fhc);

    static {
        kae kae = glk.f15557d;
    }

    public fpl(lqg lqg, int i, long j) {
        long j2;
        super(lqg.f26106a.f25931a, gwb.m1604a(gwb.m1400H(), lqg.f26107b, null), gwb.m1523a(lqg.f26108c));
        this.f13602g = i;
        this.f13603h = j;
        this.f13604i = gwb.m1507a(lqg.f26111f);
        this.f13607l = lqg.f26109d;
        if (gwb.m1523a(lqg.f26120o) == 0) {
            j2 = -1;
        } else {
            j2 = gwb.m1523a(lqg.f26120o);
        }
        this.f13608m = j2;
        this.f13609n = gwb.m2061b(lqg.f26121p);
        this.f13611p = gwb.m1929a(lqg.f26123r, true);
        boolean z = !this.f13611p || gwb.m1507a(lqg.f26122q) == 1;
        this.f13610o = z;
        this.f13614s = gwb.m1507a(lqg.f26130y);
        if (lqg.f26110e != null) {
            int i2;
            lqh lqh = lqg.f26110e;
            this.f13605j = lqh.f26131a.f26403b;
            this.f13606k = blo.m5857a(gwb.m1523a(lqh.f26132b));
            this.f13601f = gwb.m1507a(lqh.f26133c);
            if (i == 2) {
                glk.m17970a("Babel_ConversationsData", ">>> Other client is active, downgrade notification", new Object[0]);
                i2 = 10;
            } else {
                i2 = gwb.m1507a(lqh.f26133c);
            }
            if (!(this.f13609n || i2 == 10)) {
                String valueOf = String.valueOf(getClass().getSimpleName());
                String valueOf2 = String.valueOf(lqg.f26121p);
                String valueOf3 = String.valueOf(lqg.f26106a.f25931a);
                String valueOf4 = String.valueOf(lqg.f26108c);
                glk.m17981d("Babel_ConversationsData", new StringBuilder((((String.valueOf(valueOf).length() + 132) + String.valueOf(valueOf2).length()) + String.valueOf(valueOf3).length()) + String.valueOf(valueOf4).length()).append(valueOf).append(" event received hasAdvancesSortTimestamp = ").append(valueOf2).append(" advanceSortTimestamp = false, but notificationLevel = ").append(i2).append(" convId = ").append(valueOf3).append(" timestamp = ").append(valueOf4).toString(), new Object[0]);
                i2 = 10;
            }
            switch (i2) {
                case 10:
                case 20:
                case wi.dz /*25*/:
                case 30:
                    this.f13600e = i2;
                    break;
                default:
                    this.f13600e = 30;
                    break;
            }
            if (lqh.f26134d != null) {
                this.f13615t = nzf.m1029a(lqh.f26134d);
            } else {
                this.f13615t = null;
            }
            lpk lpk = lqg.f26124s;
            if (lpk != null) {
                this.f13612q = gwb.m1508a(lpk.f26004a, 1);
                if (lpk.f26005b != null) {
                    this.f13613r = lpk.f26005b.f28411a;
                    return;
                } else {
                    this.f13613r = null;
                    return;
                }
            }
            this.f13612q = 1;
            this.f13613r = null;
            return;
        }
        this.f13605j = null;
        this.f13606k = null;
        this.f13600e = 10;
        this.f13601f = 10;
        this.f13615t = null;
        this.f13612q = 1;
        this.f13613r = null;
    }

    public List<edo> mo2063f() {
        return null;
    }

    public String m15842i() {
        return this.f13607l;
    }

    public long m15843j() {
        return this.f13608m;
    }

    public int m15844k() {
        return this.f13600e;
    }

    public int m15845l() {
        return this.f13602g;
    }

    public String m15846m() {
        return this.f13606k;
    }

    public long m15847n() {
        return this.f13603h;
    }

    public byte[] m15848o() {
        return this.f13615t;
    }

    public boolean m15849p() {
        return this.f13610o;
    }

    public boolean m15850q() {
        return this.f13611p;
    }

    public int m15851r() {
        return this.f13612q;
    }

    public String m15852s() {
        return this.f13613r;
    }

    public int m15853t() {
        return this.f13614s;
    }

    public static fpl m15837a(lqg lqg, int i, long j, boolean z, int i2, long j2, long j3, long j4) {
        Throwable e;
        fpl fpt;
        try {
            if (lqg.f26118m != null && lqg.f26118m.f26389a != null) {
                fpt = new fpt(lqg, i, j, lqg.f26118m);
            } else if (lqg.f26112g != null) {
                if (!(i2 == -1 || !fdq.f12798n.m14370b(i2) || fde.m15018e(i2) == null || lqg.f26128w == null || lqg.f26128w.f25831b == null || lqg.f26128w.f25833d == null || lqg.f26128w.f25830a == null)) {
                    String str = lqg.f26128w.f25830a;
                    long a = gwb.m1523a(lqg.f26128w.f25833d);
                    fcw fcw = new fcw(gwb.m1400H());
                    if (!fcw.m14980a(i2, str) && a > fcw.m14981b(i2)) {
                        fcw.m14978a(i2, gwb.m1523a(lqg.f26128w.f25831b));
                        fcw.m14982b(i2, str);
                    }
                }
                fpt = new fox(lqg, i, j, lqg.f26112g, j2, j3, j4);
            } else {
                fpt = lqg.f26113h != null ? new fpr(lqg, i, j, lqg.f26113h) : lqg.f26114i != null ? new fph(lqg, i, j, lqg.f26114i) : lqg.f26115j != null ? new fpo(lqg, i, j, lqg.f26115j) : lqg.f26116k != null ? new fpu(lqg, i, j, lqg.f26116k) : lqg.f26119n != null ? new fpn(lqg, i, j, lqg.f26119n) : (lqg.f26110e == null || lqg.f26110e.f26134d == null) ? null : new fqh(lqg, i, j);
            }
            if (fpt != null) {
                return fpt;
            }
            try {
                glk.m17981d("Babel_ConversationsData", "Received Empty Event. Probably not implemented by server yet.", new Object[0]);
                return fpt;
            } catch (Exception e2) {
                e = e2;
            }
        } catch (Throwable e3) {
            e = e3;
            fpt = null;
            try {
                glk.m17980d("Babel_ConversationsData", "Error parsing ClientEvent", e);
                return fpt;
            } catch (Throwable th) {
                return fpt;
            }
        } catch (Throwable th2) {
            return null;
        }
    }

    public static List<fpl> m15838a(lqg[] lqgArr, boolean z, long j) {
        List<fpl> arrayList = new ArrayList();
        for (lqg lqg : lqgArr) {
            int i;
            if (z) {
                i = 2;
            } else {
                i = 0;
            }
            fpl a = fpl.m15837a(lqg, i, j, false, -1, -1, -1, -1);
            if (a != null) {
                arrayList.add(a);
            }
        }
        return arrayList;
    }

    public void mo2061a(blo blo, fhc fhc) {
        boolean z = true;
        String a = m15827a();
        long c = m15832c();
        String valueOf;
        if (!m15850q()) {
            edo b = blo.m6056g().m5632b();
            String a2 = m15827a();
            edo b2 = m15831b();
            if (b2.m13607a()) {
                glk.m17982e("Babel_ConversationsData", "Sender id for unpersisted event should not be empty", new Object[0]);
            } else if (!b2.equals(b)) {
                bmh a3 = blo.m5946a(b2, false, 1);
                if (a3 == null || blo.m5871a(a3.f3963a)) {
                    if (glk.m17973a("Babel_ConversationsData", 3)) {
                        glk.m17970a("Babel_ConversationsData", new StringBuilder(String.valueOf(a2).length() + 36).append("conversation ").append(a2).append(" does not exist locally").toString(), new Object[0]);
                    }
                    blo.m5977a(a2, m15832c(), b2);
                    blo.m5912D(a2);
                    blo.m5981a(a2, gwb.m1601a(b2, null, null, null, null, null), true);
                    List arrayList = new ArrayList();
                    arrayList.add(b2);
                    arrayList.add(b);
                    fhc.m15306a(gwb.m1400H(), blo, a2, arrayList);
                    blf.m5813b(blo, a2);
                    if (!z) {
                        if (!f13599d) {
                            valueOf = String.valueOf(m15842i());
                            new StringBuilder((String.valueOf(a).length() + 78) + String.valueOf(valueOf).length()).append("Unable to process unpersisted event ").append(a).append(" eventId: ").append(valueOf).append(" timestamp: ").append(c);
                            return;
                        }
                        return;
                    }
                }
                if (f13599d) {
                    r4 = a3.f3963a;
                    new StringBuilder((String.valueOf(a2).length() + 43) + String.valueOf(r4).length()).append("unpersisted conversation ").append(a2).append(" exists locally as").append(r4);
                }
                m15830a(a3.f3963a);
                if (z) {
                    if (!f13599d) {
                        valueOf = String.valueOf(m15842i());
                        new StringBuilder((String.valueOf(a).length() + 78) + String.valueOf(valueOf).length()).append("Unable to process unpersisted event ").append(a).append(" eventId: ").append(valueOf).append(" timestamp: ").append(c);
                        return;
                    }
                    return;
                }
            } else if (glk.m17973a("Babel_ConversationsData", 3)) {
                r4 = "Babel_ConversationsData";
                String str = "Only self user Id is present, cannot determine conversation for ";
                valueOf = String.valueOf(a2);
                glk.m17970a(r4, valueOf.length() != 0 ? str.concat(valueOf) : new String(str), new Object[0]);
            }
            z = false;
            if (z) {
                if (!f13599d) {
                    valueOf = String.valueOf(m15842i());
                    new StringBuilder((String.valueOf(a).length() + 78) + String.valueOf(valueOf).length()).append("Unable to process unpersisted event ").append(a).append(" eventId: ").append(valueOf).append(" timestamp: ").append(c);
                    return;
                }
                return;
            }
        } else if (!blf.m5801a(blo, a, c, fhc, this)) {
            if (f13599d) {
                valueOf = String.valueOf(m15842i());
                new StringBuilder((String.valueOf(a).length() + 68) + String.valueOf(valueOf).length()).append("processEvent saving event ").append(a).append(" eventId: ").append(valueOf).append(" timestamp: ").append(c);
                return;
            }
            return;
        }
        fhc.m15306a(gwb.m1400H(), blo, a, mo2063f());
        mo2062b(blo, fhc);
        if (this.f13609n) {
            blo.m6060g(a, c);
        }
    }
}
