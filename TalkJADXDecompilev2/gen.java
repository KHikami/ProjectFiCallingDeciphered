package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

final class gen implements gcl, Runnable {
    private final Context a;
    private final long b = glj.b();
    private final List<lkq> c = new ArrayList();

    gen(Context context) {
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
                case 1:
                case 2:
                case 4:
                case 7:
                case 11:
                    i = 6;
                    break;
                case 3:
                case 5:
                case 6:
                case 8:
                case 9:
                case 10:
                case 12:
                case 14:
                case 15:
                    i = 7;
                    break;
                case 13:
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
            case 0:
                i = 0;
                break;
            case 2:
                i = 2;
                break;
            case 3:
                i = 4;
                break;
            case 4:
                i = 1;
                break;
            case 13:
                i = 3;
                break;
            default:
                switch (i3) {
                    case 1:
                        i = 2;
                        break;
                    case 2:
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
            case 0:
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
