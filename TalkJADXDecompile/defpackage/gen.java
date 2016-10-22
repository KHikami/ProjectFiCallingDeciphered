package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: gen */
final class gen implements gcl, Runnable {
    private final Context a;
    private final long b;
    private final List<lkq> c;

    gen(Context context) {
        this.b = glj.b();
        this.c = new ArrayList();
        this.a = context;
        c();
        d();
    }

    lkq[] a() {
        return (lkq[]) this.c.toArray(new lkq[this.c.size()]);
    }

    void b() {
        gwb.b((Runnable) this);
    }

    private void c() {
        gwb.a((Runnable) this, gwb.a(this.a, "babel_signal_strength_logging_internval_millis", gda.g));
    }

    private void d() {
        glk.c("Babel_telephony", "TeleRemoteCallConnectionStats.logSignalStrength", new Object[0]);
        gck.a(this.a, this);
    }

    public void run() {
        d();
        c();
    }

    public void a(gcm gcm) {
        int i;
        int i2 = 4;
        String valueOf = String.valueOf(gcm);
        glk.c("Babel_telephony", new StringBuilder(String.valueOf(valueOf).length() + 54).append("TeleRemoteCallConnectionStats.onCellState, cellState: ").append(valueOf).toString(), new Object[0]);
        lkq lkq = new lkq();
        long b = glj.b() - this.b;
        lkq.b = Integer.valueOf((int) b);
        lkq.a = Integer.valueOf((int) TimeUnit.MILLISECONDS.toSeconds(b));
        lkq.e = new lkr[1];
        gfv a = gfq.a(this.a);
        lkr[] lkrArr = lkq.e;
        lkr lkr = new lkr();
        lkr.a = Integer.valueOf(1);
        if (!a.a) {
            switch (gcm.e) {
                case wi.j /*1*/:
                case wi.l /*2*/:
                case wi.h /*4*/:
                case wi.q /*7*/:
                case wi.dB /*11*/:
                    i = 6;
                    break;
                case wi.z /*3*/:
                case wi.p /*5*/:
                case wi.s /*6*/:
                case wi.m /*8*/:
                case wi.n /*9*/:
                case wi.dr /*10*/:
                case wi.dM /*12*/:
                case wi.g /*14*/:
                case wi.dJ /*15*/:
                    i = 7;
                    break;
                case wi.dD /*13*/:
                    i = 8;
                    break;
                default:
                    i = 5;
                    break;
            }
        }
        i = 2;
        lkr.l = Integer.valueOf(i);
        lks lks = new lks();
        lks.a = Integer.valueOf(a.b);
        i = gcm.e;
        int i3 = gcm.c;
        switch (i) {
            case wi.w /*0*/:
                i = 0;
                break;
            case wi.l /*2*/:
                i = 2;
                break;
            case wi.z /*3*/:
                i = 4;
                break;
            case wi.h /*4*/:
                i = 1;
                break;
            case wi.dD /*13*/:
                i = 3;
                break;
            default:
                switch (i3) {
                    case wi.j /*1*/:
                        i = 2;
                        break;
                    case wi.l /*2*/:
                        i = 1;
                        break;
                    default:
                        i = 0;
                        break;
                }
        }
        lks.b = Integer.valueOf(i);
        i = gcm.b;
        switch (i) {
            case -1:
            case wi.w /*0*/:
                i2 = 0;
                break;
            case wi.dz /*25*/:
                i2 = 1;
                break;
            case 50:
                i2 = 2;
                break;
            case 75:
                i2 = 3;
                break;
            case 100:
                break;
            default:
                iil.a("invalid signal strength percent: " + i);
                i2 = 0;
                break;
        }
        lks.c = Integer.valueOf(i2);
        lks.d = Integer.valueOf(-1);
        lkr.m = lks;
        lkr.b = Integer.valueOf(0);
        lkr.c = Integer.valueOf(0);
        lkr.d = Long.valueOf(0);
        lkr.e = Integer.valueOf(0);
        lkr.h = Long.valueOf(0);
        lkr.i = Integer.valueOf(0);
        lkn lkn = new lkn();
        lkn.c = Integer.valueOf(1);
        lkn.b = Integer.valueOf(0);
        lkn.d = Integer.valueOf(0);
        lkr.j = lkn;
        lkr.k = lkn;
        lkrArr[0] = lkr;
        this.c.add(lkq);
    }
}
