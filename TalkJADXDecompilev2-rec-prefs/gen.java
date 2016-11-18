package p000;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

final class gen implements gcl, Runnable {
    private final Context f14871a;
    private final long f14872b = glj.m17963b();
    private final List<lkq> f14873c = new ArrayList();

    gen(Context context) {
        this.f14871a = context;
        m17196c();
        m17197d();
    }

    lkq[] m17199a() {
        return (lkq[]) this.f14873c.toArray(new lkq[this.f14873c.size()]);
    }

    void m17200b() {
        gwb.m2042b((Runnable) this);
    }

    private void m17196c() {
        gwb.m1864a((Runnable) this, gwb.m1519a(this.f14871a, "babel_signal_strength_logging_internval_millis", gda.f14726g));
    }

    private void m17197d() {
        glk.m17979c("Babel_telephony", "TeleRemoteCallConnectionStats.logSignalStrength", new Object[0]);
        gck.m16927a(this.f14871a, this);
    }

    public void run() {
        m17197d();
        m17196c();
    }

    public void mo2190a(gcm gcm) {
        int i;
        int i2 = 4;
        String valueOf = String.valueOf(gcm);
        glk.m17979c("Babel_telephony", new StringBuilder(String.valueOf(valueOf).length() + 54).append("TeleRemoteCallConnectionStats.onCellState, cellState: ").append(valueOf).toString(), new Object[0]);
        lkq lkq = new lkq();
        long b = glj.m17963b() - this.f14872b;
        lkq.f25181b = Integer.valueOf((int) b);
        lkq.f25180a = Integer.valueOf((int) TimeUnit.MILLISECONDS.toSeconds(b));
        lkq.f25184e = new lkr[1];
        gfv a = gfq.m17570a(this.f14871a);
        lkr[] lkrArr = lkq.f25184e;
        lkr lkr = new lkr();
        lkr.f25199a = Integer.valueOf(1);
        if (!a.f15184a) {
            switch (gcm.f14663e) {
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
        lkr.f25210l = Integer.valueOf(i);
        lks lks = new lks();
        lks.f25212a = Integer.valueOf(a.f15185b);
        i = gcm.f14663e;
        int i3 = gcm.f14661c;
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
        lks.f25213b = Integer.valueOf(i);
        i = gcm.f14660b;
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
                iil.m21870a("invalid signal strength percent: " + i);
                i2 = 0;
                break;
        }
        lks.f25214c = Integer.valueOf(i2);
        lks.f25215d = Integer.valueOf(-1);
        lkr.f25211m = lks;
        lkr.f25200b = Integer.valueOf(0);
        lkr.f25201c = Integer.valueOf(0);
        lkr.f25202d = Long.valueOf(0);
        lkr.f25203e = Integer.valueOf(0);
        lkr.f25206h = Long.valueOf(0);
        lkr.f25207i = Integer.valueOf(0);
        lkn lkn = new lkn();
        lkn.f25156c = Integer.valueOf(1);
        lkn.f25155b = Integer.valueOf(0);
        lkn.f25157d = Integer.valueOf(0);
        lkr.f25208j = lkn;
        lkr.f25209k = lkn;
        lkrArr[0] = lkr;
        this.f14873c.add(lkq);
    }
}
