import android.content.Context;
import android.text.TextUtils;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import java.io.Serializable;

public class evz implements Serializable {
    static final boolean a;
    private static final eze g;
    private static final long serialVersionUID = 1;
    public fok b;
    public final eze c;
    public final long d;
    public final long e;
    public boolean f;
    private long h;
    private long i;
    private long j;
    private long k;
    private long l;
    private byte[] m;
    private transient nzf n;

    static {
        kae kae = glk.l;
        a = a;
        g = new eze();
    }

    public void a(blo blo, fhc fhc) {
        this.f = true;
        a((blo != null ? blo.g() : null).g(), this.c);
    }

    public eze a() {
        return this.c;
    }

    public evz() {
        this.c = g;
        this.d = -1;
        this.e = 0;
    }

    public evz(nzf nzf, kmu kmu) {
        long j = -1;
        this.n = nzf;
        if (kmu != null) {
            this.c = new eze(kmu);
            if (!(kmu.b == null || kmu.b.a == null || kmu.b.a.length <= 0 || kmu.b.a[0].a == null)) {
                j = gwb.a(kmu.b.a[0].a);
            }
            this.d = j;
            j = (kmu.d == null || kmu.d.a == null) ? 0 : (long) gwb.a(kmu.d.a);
            this.e = j;
            return;
        }
        this.c = g;
        this.d = -1;
        this.e = 0;
    }

    public evz(nzf nzf, luq luq, long j) {
        this.n = nzf;
        this.c = new eze(luq);
        this.d = j;
        this.e = gwb.a(luq.h);
    }

    public evz(nzf nzf, luq luq, long j, lnw lnw) {
        this.n = nzf;
        this.c = new eze(luq);
        this.d = -1;
        this.e = gwb.a(luq.h);
        if (lnw == null || lnw.c == null || lnw.d == null) {
            this.k = -1;
            this.l = -1;
            return;
        }
        this.k = gwb.a(lnw.c);
        this.l = gwb.a(lnw.d);
    }

    public int b() {
        return this.b.L_();
    }

    public fok c() {
        return this.b;
    }

    public long d() {
        return this.k;
    }

    public long e() {
        return this.l;
    }

    public byte[] f() {
        if (this.m == null) {
            this.m = foh.a(this);
        }
        return this.m;
    }

    public static boolean a(luq luq) {
        int a = gwb.a(luq.a);
        if (a == 1 || a == 0 || a == 6) {
            return a;
        }
        return true;
    }

    public static boolean a(kmu kmu) {
        return (kmu == null || kmu.a == null) ? a : true;
    }

    public void a(fok fok) {
        this.b = fok;
    }

    public void a(Context context, bko bko) {
    }

    protected static void a(bko bko, String str, fox fox) {
        if (!TextUtils.isEmpty(str)) {
            for (flt flt : flt.values()) {
                if (str.startsWith(flt.toString())) {
                    break;
                }
            }
            flt flt2 = flt.UNKNOWN_TYPE;
            if (flt2 == flt.HASH_SYNC) {
                gwb.a(bko, 2317);
            }
            fox.b(flt2.a());
            ba.a(bko.g(), glj.b(), 10, ba.c().a(481).c(fox.i()).b(fox.m()).a(fox.a()));
        }
    }

    protected long g() {
        return ((biw) jyn.a(gwb.H(), biw.class)).a("babel_yieldtime", 2000);
    }

    protected static edk[] a(lqc[] lqcArr, lox[] loxArr) {
        int i = 0;
        if (lqcArr == null) {
            return null;
        }
        int i2 = 0;
        int i3 = 0;
        while (i2 < lqcArr.length) {
            if (lqcArr[i2].g == null || !gwb.b(lqcArr[i2].g)) {
                int i4;
                int i5;
                if (lqcArr[i2].a == null || gwb.a(lqcArr[i2].a) != 3) {
                    i4 = 0;
                    while (i4 < lqcArr.length) {
                        if (!(i4 == i2 || lqcArr[i4] == null)) {
                            i5 = (lqcArr[i4].a == null || gwb.a(lqcArr[i4].a) != 3) ? 0 : 1;
                            if (i5 != 0 && TextUtils.equals(lqcArr[i2].c.b, lqcArr[i4].c.b)) {
                                lqcArr[i2] = null;
                                i3++;
                                break;
                            }
                        }
                        i4++;
                    }
                } else if (loxArr != null) {
                    for (i4 = 0; i4 < loxArr.length; i4++) {
                        lom lom;
                        lot[] lotArr;
                        if (loxArr[i4] != null) {
                            lom = loxArr[i4].c;
                        } else {
                            lom = null;
                        }
                        if (lom != null) {
                            lotArr = lom.l;
                        } else {
                            lotArr = null;
                        }
                        if (lotArr != null) {
                            i5 = 0;
                            while (i5 < lotArr.length) {
                                if (TextUtils.equals(lotArr[i5].a.b, lqcArr[i2].c.b) && lotArr[i5].e != null) {
                                    if (lqcArr[i2].d == null) {
                                        lqcArr[i2].d = new lqe();
                                    }
                                    lqcArr[i2].d.g = new String[1];
                                    lqcArr[i2].d.g[0] = lotArr[i5].e.a;
                                }
                                i5++;
                            }
                        }
                    }
                }
            }
            i2++;
        }
        if (i3 > 0) {
            lqc[] lqcArr2 = new lqc[(lqcArr.length - i3)];
            for (i2 = 0; i2 < lqcArr.length; i2++) {
                if (lqcArr[i2] != null) {
                    lqcArr2[i] = lqcArr[i2];
                    i++;
                }
            }
            lqcArr = lqcArr2;
        }
        return gwb.b(gwb.H(), lqcArr, null);
    }

    public void a(long j) {
        this.h = j;
    }

    public long h() {
        return this.i;
    }

    public void b(long j) {
        this.i = j;
    }

    public long i() {
        return this.j;
    }

    public void c(long j) {
        this.j = j;
    }

    protected dth j() {
        dti dti = (dti) jyn.b(gwb.H(), dti.class);
        if (dti != null) {
            return dti.a(18);
        }
        return null;
    }

    public static void a(int i, evz evz) {
        long d = evz.d();
        long e = evz.e();
        if (fdq.n.b(i) && d != -1 && e != -1) {
            new fcw(gwb.H()).a(i, d, e);
        }
    }

    public static void a(int i, eze eze) {
        if (fdq.n.b(i) && eze != null) {
            if (eze.e == ezf.b) {
                glk.c("Babel", "Perform warm sync based on ClientSyncHint from the server for account " + i, new Object[0]);
                RealTimeChatService.a(i, (boolean) a, fjl.HASH_SYNC_DELAY, eze.f, flt.HASH_SYNC);
                ((iih) jyn.a(gwb.H(), iih.class)).a(i).b().c(2308);
            } else if (eze.e == ezf.d) {
                glk.c("Babel", "Clear all the local hash state based on the server request for account " + i, new Object[0]);
                new fcw(gwb.H()).c(i);
                ((iih) jyn.a(gwb.H(), iih.class)).a(i).b().c(2311);
            }
        }
    }
}
