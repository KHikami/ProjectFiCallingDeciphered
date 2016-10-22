package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: fpl */
public abstract class fpl extends fou {
    private static final boolean d;
    private static final long serialVersionUID = 2;
    public int e;
    public final int f;
    public final int g;
    public final long h;
    public final int i;
    public final String j;
    public final String k;
    public final String l;
    public final long m;
    public final boolean n;
    public final boolean o;
    public final boolean p;
    public final int q;
    public final String r;
    public final int s;
    public final byte[] t;

    protected abstract void b(blo blo, fhc fhc);

    static {
        kae kae = glk.d;
        d = d;
    }

    public fpl(lqg lqg, int i, long j) {
        long j2;
        super(lqg.a.a, gwb.a(gwb.H(), lqg.b, null), gwb.a(lqg.c));
        this.g = i;
        this.h = j;
        this.i = gwb.a(lqg.f);
        this.l = lqg.d;
        if (gwb.a(lqg.o) == 0) {
            j2 = -1;
        } else {
            j2 = gwb.a(lqg.o);
        }
        this.m = j2;
        this.n = gwb.b(lqg.p);
        this.p = gwb.a(lqg.r, true);
        boolean z = (!this.p || gwb.a(lqg.q) == 1) ? true : d;
        this.o = z;
        this.s = gwb.a(lqg.y);
        if (lqg.e != null) {
            int i2;
            lqh lqh = lqg.e;
            this.j = lqh.a.b;
            this.k = blo.a(gwb.a(lqh.b));
            this.f = gwb.a(lqh.c);
            if (i == 2) {
                glk.a("Babel_ConversationsData", ">>> Other client is active, downgrade notification", new Object[0]);
                i2 = 10;
            } else {
                i2 = gwb.a(lqh.c);
            }
            if (!(this.n || i2 == 10)) {
                String valueOf = String.valueOf(getClass().getSimpleName());
                String valueOf2 = String.valueOf(lqg.p);
                String valueOf3 = String.valueOf(lqg.a.a);
                String valueOf4 = String.valueOf(lqg.c);
                glk.d("Babel_ConversationsData", new StringBuilder((((String.valueOf(valueOf).length() + 132) + String.valueOf(valueOf2).length()) + String.valueOf(valueOf3).length()) + String.valueOf(valueOf4).length()).append(valueOf).append(" event received hasAdvancesSortTimestamp = ").append(valueOf2).append(" advanceSortTimestamp = false, but notificationLevel = ").append(i2).append(" convId = ").append(valueOf3).append(" timestamp = ").append(valueOf4).toString(), new Object[0]);
                i2 = 10;
            }
            switch (i2) {
                case wi.dr /*10*/:
                case wi.k /*20*/:
                case wi.dz /*25*/:
                case 30:
                    this.e = i2;
                    break;
                default:
                    this.e = 30;
                    break;
            }
            if (lqh.d != null) {
                this.t = nzf.a(lqh.d);
            } else {
                this.t = null;
            }
            lpk lpk = lqg.s;
            if (lpk != null) {
                this.q = gwb.a(lpk.a, 1);
                if (lpk.b != null) {
                    this.r = lpk.b.a;
                    return;
                } else {
                    this.r = null;
                    return;
                }
            }
            this.q = 1;
            this.r = null;
            return;
        }
        this.j = null;
        this.k = null;
        this.e = 10;
        this.f = 10;
        this.t = null;
        this.q = 1;
        this.r = null;
    }

    public List<edo> f() {
        return null;
    }

    public String i() {
        return this.l;
    }

    public long j() {
        return this.m;
    }

    public int k() {
        return this.e;
    }

    public int l() {
        return this.g;
    }

    public String m() {
        return this.k;
    }

    public long n() {
        return this.h;
    }

    public byte[] o() {
        return this.t;
    }

    public boolean p() {
        return this.o;
    }

    public boolean q() {
        return this.p;
    }

    public int r() {
        return this.q;
    }

    public String s() {
        return this.r;
    }

    public int t() {
        return this.s;
    }

    public static fpl a(lqg lqg, int i, long j, boolean z, int i2, long j2, long j3, long j4) {
        Throwable e;
        fpl fpt;
        try {
            if (lqg.m != null && lqg.m.a != null) {
                fpt = new fpt(lqg, i, j, lqg.m);
            } else if (lqg.g != null) {
                if (!(i2 == -1 || !fdq.n.b(i2) || fde.e(i2) == null || lqg.w == null || lqg.w.b == null || lqg.w.d == null || lqg.w.a == null)) {
                    String str = lqg.w.a;
                    long a = gwb.a(lqg.w.d);
                    fcw fcw = new fcw(gwb.H());
                    if (!fcw.a(i2, str) && a > fcw.b(i2)) {
                        fcw.a(i2, gwb.a(lqg.w.b));
                        fcw.b(i2, str);
                    }
                }
                fpt = new fox(lqg, i, j, lqg.g, j2, j3, j4);
            } else {
                fpt = lqg.h != null ? new fpr(lqg, i, j, lqg.h) : lqg.i != null ? new fph(lqg, i, j, lqg.i) : lqg.j != null ? new fpo(lqg, i, j, lqg.j) : lqg.k != null ? new fpu(lqg, i, j, lqg.k) : lqg.n != null ? new fpn(lqg, i, j, lqg.n) : (lqg.e == null || lqg.e.d == null) ? null : new fqh(lqg, i, j);
            }
            if (fpt != null) {
                return fpt;
            }
            try {
                glk.d("Babel_ConversationsData", "Received Empty Event. Probably not implemented by server yet.", new Object[0]);
                return fpt;
            } catch (Exception e2) {
                e = e2;
            }
        } catch (Throwable e3) {
            e = e3;
            fpt = null;
            try {
                glk.d("Babel_ConversationsData", "Error parsing ClientEvent", e);
                return fpt;
            } catch (Throwable th) {
                return fpt;
            }
        } catch (Throwable th2) {
            return null;
        }
    }

    public static List<fpl> a(lqg[] lqgArr, boolean z, long j) {
        List<fpl> arrayList = new ArrayList();
        for (lqg lqg : lqgArr) {
            int i;
            if (z) {
                i = 2;
            } else {
                i = 0;
            }
            fpl a = fpl.a(lqg, i, j, d, -1, -1, -1, -1);
            if (a != null) {
                arrayList.add(a);
            }
        }
        return arrayList;
    }

    public void a(blo blo, fhc fhc) {
        boolean z = true;
        String a = a();
        long c = c();
        String valueOf;
        if (!q()) {
            edo b = blo.g().b();
            String a2 = a();
            edo b2 = b();
            if (b2.a()) {
                glk.e("Babel_ConversationsData", "Sender id for unpersisted event should not be empty", new Object[0]);
            } else if (!b2.equals(b)) {
                bmh a3 = blo.a(b2, (boolean) d, 1);
                if (a3 == null || blo.a(a3.a)) {
                    if (glk.a("Babel_ConversationsData", 3)) {
                        glk.a("Babel_ConversationsData", new StringBuilder(String.valueOf(a2).length() + 36).append("conversation ").append(a2).append(" does not exist locally").toString(), new Object[0]);
                    }
                    blo.a(a2, c(), b2);
                    blo.D(a2);
                    blo.a(a2, gwb.a(b2, null, null, null, null, null), true);
                    List arrayList = new ArrayList();
                    arrayList.add(b2);
                    arrayList.add(b);
                    fhc.a(gwb.H(), blo, a2, arrayList);
                    blf.b(blo, a2);
                    if (!z) {
                        if (!d) {
                            valueOf = String.valueOf(i());
                            new StringBuilder((String.valueOf(a).length() + 78) + String.valueOf(valueOf).length()).append("Unable to process unpersisted event ").append(a).append(" eventId: ").append(valueOf).append(" timestamp: ").append(c);
                            return;
                        }
                        return;
                    }
                }
                if (d) {
                    r4 = a3.a;
                    new StringBuilder((String.valueOf(a2).length() + 43) + String.valueOf(r4).length()).append("unpersisted conversation ").append(a2).append(" exists locally as").append(r4);
                }
                a(a3.a);
                if (z) {
                    if (!d) {
                        valueOf = String.valueOf(i());
                        new StringBuilder((String.valueOf(a).length() + 78) + String.valueOf(valueOf).length()).append("Unable to process unpersisted event ").append(a).append(" eventId: ").append(valueOf).append(" timestamp: ").append(c);
                        return;
                    }
                    return;
                }
            } else if (glk.a("Babel_ConversationsData", 3)) {
                r4 = "Babel_ConversationsData";
                String str = "Only self user Id is present, cannot determine conversation for ";
                valueOf = String.valueOf(a2);
                glk.a(r4, valueOf.length() != 0 ? str.concat(valueOf) : new String(str), new Object[0]);
            }
            z = d;
            if (z) {
                if (!d) {
                    valueOf = String.valueOf(i());
                    new StringBuilder((String.valueOf(a).length() + 78) + String.valueOf(valueOf).length()).append("Unable to process unpersisted event ").append(a).append(" eventId: ").append(valueOf).append(" timestamp: ").append(c);
                    return;
                }
                return;
            }
        } else if (!blf.a(blo, a, c, fhc, this)) {
            if (d) {
                valueOf = String.valueOf(i());
                new StringBuilder((String.valueOf(a).length() + 68) + String.valueOf(valueOf).length()).append("processEvent saving event ").append(a).append(" eventId: ").append(valueOf).append(" timestamp: ").append(c);
                return;
            }
            return;
        }
        fhc.a(gwb.H(), blo, a, f());
        b(blo, fhc);
        if (this.n) {
            blo.g(a, c);
        }
    }
}
