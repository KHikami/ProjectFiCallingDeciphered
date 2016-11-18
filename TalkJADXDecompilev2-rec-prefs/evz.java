package p000;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import java.io.Serializable;

public class evz implements Serializable {
    static final boolean f5798a = false;
    private static final eze f5799g = new eze();
    private static final long serialVersionUID = 1;
    public fok f5800b;
    public final eze f5801c;
    public final long f5802d;
    public final long f5803e;
    public boolean f5804f;
    private long f5805h;
    private long f5806i;
    private long f5807j;
    private long f5808k;
    private long f5809l;
    private byte[] f5810m;
    private transient nzf f5811n;

    static {
        kae kae = glk.f15565l;
    }

    public void mo1047a(blo blo, fhc fhc) {
        this.f5804f = true;
        evz.m8117a((blo != null ? blo.m6056g() : null).m5638g(), this.f5801c);
    }

    public eze m8122a() {
        return this.f5801c;
    }

    public evz() {
        this.f5801c = f5799g;
        this.f5802d = -1;
        this.f5803e = 0;
    }

    public evz(nzf nzf, kmu kmu) {
        long j = -1;
        this.f5811n = nzf;
        if (kmu != null) {
            this.f5801c = new eze(kmu);
            if (!(kmu.f22402b == null || kmu.f22402b.a == null || kmu.f22402b.a.length <= 0 || kmu.f22402b.a[0].a == null)) {
                j = gwb.m1523a(kmu.f22402b.a[0].a);
            }
            this.f5802d = j;
            j = (kmu.f22404d == null || kmu.f22404d.a == null) ? 0 : (long) gwb.m1507a(kmu.f22404d.a);
            this.f5803e = j;
            return;
        }
        this.f5801c = f5799g;
        this.f5802d = -1;
        this.f5803e = 0;
    }

    public evz(nzf nzf, luq luq, long j) {
        this.f5811n = nzf;
        this.f5801c = new eze(luq);
        this.f5802d = j;
        this.f5803e = gwb.m1523a(luq.f26522h);
    }

    public evz(nzf nzf, luq luq, long j, lnw lnw) {
        this.f5811n = nzf;
        this.f5801c = new eze(luq);
        this.f5802d = -1;
        this.f5803e = gwb.m1523a(luq.f26522h);
        if (lnw == null || lnw.f25832c == null || lnw.f25833d == null) {
            this.f5808k = -1;
            this.f5809l = -1;
            return;
        }
        this.f5808k = gwb.m1523a(lnw.f25832c);
        this.f5809l = gwb.m1523a(lnw.f25833d);
    }

    public int m8127b() {
        return this.f5800b.L_();
    }

    public fok m8129c() {
        return this.f5800b;
    }

    public long m8131d() {
        return this.f5808k;
    }

    public long m8132e() {
        return this.f5809l;
    }

    public byte[] m8133f() {
        if (this.f5810m == null) {
            this.f5810m = foh.m15796a(this);
        }
        return this.f5810m;
    }

    public static boolean m8120a(luq luq) {
        int a = gwb.m1507a(luq.f26515a);
        if (a == 1 || a == 0 || a == 6) {
            return false;
        }
        return true;
    }

    public static boolean m8119a(kmu kmu) {
        return (kmu == null || kmu.f22401a == null) ? false : true;
    }

    public void mo1960a(fok fok) {
        this.f5800b = fok;
    }

    public void mo1958a(Context context, bko bko) {
    }

    protected static void m8118a(bko bko, String str, fox fox) {
        if (!TextUtils.isEmpty(str)) {
            for (flt flt : flt.values()) {
                if (str.startsWith(flt.toString())) {
                    break;
                }
            }
            flt flt2 = flt.UNKNOWN_TYPE;
            if (flt2 == flt.HASH_SYNC) {
                gwb.m1823a(bko, 2317);
            }
            fox.m15855b(flt2.mo2030a());
            ba.m4548a(bko.m5638g(), glj.m17963b(), 10, ba.m4618c().m12786a(481).m12798c(fox.m15842i()).m12794b(fox.m15846m()).m12789a(fox.m15827a()));
        }
    }

    protected long m8134g() {
        return ((biw) jyn.m25426a(gwb.m1400H(), biw.class)).mo561a("babel_yieldtime", 2000);
    }

    protected static edk[] m8121a(lqc[] lqcArr, lox[] loxArr) {
        int i = 0;
        if (lqcArr == null) {
            return null;
        }
        int i2 = 0;
        int i3 = 0;
        while (i2 < lqcArr.length) {
            if (lqcArr[i2].f26067g == null || !gwb.m2061b(lqcArr[i2].f26067g)) {
                int i4;
                int i5;
                if (lqcArr[i2].f26061a == null || gwb.m1507a(lqcArr[i2].f26061a) != 3) {
                    i4 = 0;
                    while (i4 < lqcArr.length) {
                        if (!(i4 == i2 || lqcArr[i4] == null)) {
                            i5 = (lqcArr[i4].f26061a == null || gwb.m1507a(lqcArr[i4].f26061a) != 3) ? 0 : 1;
                            if (i5 != 0 && TextUtils.equals(lqcArr[i2].f26063c.f26403b, lqcArr[i4].f26063c.f26403b)) {
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
                            lom = loxArr[i4].f25954c;
                        } else {
                            lom = null;
                        }
                        if (lom != null) {
                            lotArr = lom.f25897l;
                        } else {
                            lotArr = null;
                        }
                        if (lotArr != null) {
                            i5 = 0;
                            while (i5 < lotArr.length) {
                                if (TextUtils.equals(lotArr[i5].f25934a.f26403b, lqcArr[i2].f26063c.f26403b) && lotArr[i5].f25938e != null) {
                                    if (lqcArr[i2].f26064d == null) {
                                        lqcArr[i2].f26064d = new lqe();
                                    }
                                    lqcArr[i2].f26064d.f26091g = new String[1];
                                    lqcArr[i2].f26064d.f26091g[0] = lotArr[i5].f25938e.f28411a;
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
        return gwb.m2066b(gwb.m1400H(), lqcArr, null);
    }

    public void m8123a(long j) {
        this.f5805h = j;
    }

    public long m8135h() {
        return this.f5806i;
    }

    public void m8128b(long j) {
        this.f5806i = j;
    }

    public long m8136i() {
        return this.f5807j;
    }

    public void m8130c(long j) {
        this.f5807j = j;
    }

    protected dth m8137j() {
        dti dti = (dti) jyn.m25433b(gwb.m1400H(), dti.class);
        if (dti != null) {
            return dti.mo1673a(18);
        }
        return null;
    }

    public static void m8116a(int i, evz evz) {
        long d = evz.m8131d();
        long e = evz.m8132e();
        if (fdq.f12798n.m14370b(i) && d != -1 && e != -1) {
            new fcw(gwb.m1400H()).m14979a(i, d, e);
        }
    }

    public static void m8117a(int i, eze eze) {
        if (fdq.f12798n.m14370b(i) && eze != null) {
            if (eze.f12532e == ezf.f12535b) {
                glk.m17979c("Babel", "Perform warm sync based on ClientSyncHint from the server for account " + i, new Object[0]);
                RealTimeChatService.m9005a(i, false, fjl.HASH_SYNC_DELAY, eze.f12533f, flt.HASH_SYNC);
                ((iih) jyn.m25426a(gwb.m1400H(), iih.class)).mo1979a(i).mo1693b().mo1714c(2308);
            } else if (eze.f12532e == ezf.f12537d) {
                glk.m17979c("Babel", "Clear all the local hash state based on the server request for account " + i, new Object[0]);
                new fcw(gwb.m1400H()).m14983c(i);
                ((iih) jyn.m25426a(gwb.m1400H(), iih.class)).mo1979a(i).mo1693b().mo1714c(2311);
            }
        }
    }
}
