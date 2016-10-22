package defpackage;

import android.content.Context;
import android.os.SystemClock;
import com.google.android.libraries.hangouts.video.internal.Stats;
import com.google.android.libraries.hangouts.video.internal.Stats.AggregatePrintStats;
import com.google.android.libraries.hangouts.video.internal.Stats.BandwidthEstimationStats;
import com.google.android.libraries.hangouts.video.internal.Stats.ConnectionInfoStats;
import com.google.android.libraries.hangouts.video.internal.Stats.VideoReceiverStats;
import com.google.android.libraries.hangouts.video.internal.Stats.VideoSenderStats;
import com.google.android.libraries.hangouts.video.internal.Stats.VoiceReceiverStats;
import com.google.android.libraries.hangouts.video.internal.Stats.VoiceSenderStats;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: ikh */
public final class ikh {
    final ikj a;
    final Map<String, ikk> b;
    final iin<ikn> c;
    int d;
    lld e;
    int f;
    int g;
    private long h;
    private ikn i;

    public ikh(ikj ikj) {
        this.h = 0;
        this.d = 0;
        this.f = 0;
        this.g = 0;
        this.a = ikj;
        this.b = new HashMap();
        this.c = new iin(1200);
    }

    public void a() {
        e();
    }

    private void e() {
        if (this.b.isEmpty()) {
            iil.b("Expected non-null", this.a.e());
            this.b.put(this.a.e(), new ikk());
        }
        if (this.h == 0) {
            this.h = SystemClock.elapsedRealtime();
        }
    }

    public void a(int i) {
        this.d = i;
    }

    public void a(int i, String str) {
        lld lld = new lld();
        lld.a = Integer.valueOf(i);
        lld.c = str;
        a(lld);
    }

    private void a(lld lld) {
        this.e = lld;
    }

    public void b(int i) {
        this.f = i;
    }

    public void c(int i) {
        this.g = i;
    }

    public void b() {
        g().f = SystemClock.elapsedRealtime();
    }

    public void c() {
        g().g = SystemClock.elapsedRealtime();
    }

    public void a(Stats stats) {
        iil.a();
        e();
        if (stats instanceof inv) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.i = new ikn(elapsedRealtime, (elapsedRealtime - this.h) / 1000, this.i != null ? elapsedRealtime - this.i.a : elapsedRealtime - this.h, stats);
            return;
        }
        ikk g = g();
        elapsedRealtime = SystemClock.elapsedRealtime();
        ikn ikn = new ikn(elapsedRealtime, (elapsedRealtime - g.e) / 1000, g.j != -1 ? elapsedRealtime - g.j : elapsedRealtime - g.e, stats);
        if (stats instanceof VoiceSenderStats) {
            g.i.a = ikn;
        } else if (stats instanceof VoiceReceiverStats) {
            g.i.b.put(Integer.valueOf(((VoiceReceiverStats) stats).a), ikn);
        } else if (stats instanceof VideoSenderStats) {
            g.i.c = ikn;
        } else if (stats instanceof VideoReceiverStats) {
            g.i.d.put(Integer.valueOf(((VideoReceiverStats) stats).a), ikn);
        } else if (stats instanceof BandwidthEstimationStats) {
            g.i.e = ikn;
        } else if (stats instanceof ConnectionInfoStats) {
            g.i.f = ikn;
        } else {
            String valueOf = String.valueOf(stats);
            itx.a(5, "vclib", new StringBuilder(String.valueOf(valueOf).length() + 36).append("Received unrecognized stats update, ").append(valueOf).toString());
        }
    }

    public void b(Stats stats) {
        iil.a();
        if (stats instanceof inv) {
            iil.b("Expected non-null", this.i);
            d();
            return;
        }
        Object obj;
        ikk g = g();
        if (stats instanceof VoiceSenderStats) {
            obj = g.i.a;
            g.i.a = null;
        } else if (stats instanceof VoiceReceiverStats) {
            VoiceReceiverStats voiceReceiverStats = (VoiceReceiverStats) stats;
            r1 = (ikn) g.i.b.get(Integer.valueOf(voiceReceiverStats.a));
            g.i.b.remove(Integer.valueOf(voiceReceiverStats.a));
        } else if (stats instanceof VideoSenderStats) {
            obj = g.i.c;
            g.i.c = null;
        } else if (stats instanceof VideoReceiverStats) {
            VideoReceiverStats videoReceiverStats = (VideoReceiverStats) stats;
            r1 = (ikn) g.i.d.get(Integer.valueOf(videoReceiverStats.a));
            g.i.d.remove(Integer.valueOf(videoReceiverStats.a));
        } else if (stats instanceof BandwidthEstimationStats) {
            obj = g.i.e;
            g.i.e = null;
        } else if (stats instanceof ConnectionInfoStats) {
            obj = g.i.f;
            g.i.f = null;
        } else {
            itx.b("vclib", "Received unrecognized stats log, %s", stats);
            obj = null;
        }
        if (obj != null) {
            g.h.a(obj);
            return;
        }
        itx.c("vclib", "Received stats object, %s that wasn't already in latestStatsUpdate", stats);
    }

    void d() {
        if (this.i != null) {
            this.c.a(this.i);
            this.i = null;
        }
    }

    private void f() {
        iil.a();
        d();
        for (Entry key : this.b.entrySet()) {
            itx.a(3, "vclib", "logLatestStats for session id = %s", key.getKey());
            ((ikk) key.getValue()).a();
        }
    }

    private ikk g() {
        Object e = this.a.e();
        iil.b("Expected non-null", e);
        ikk ikk = (ikk) this.b.get(e);
        if (ikk != null) {
            return ikk;
        }
        ikk = new ikk();
        this.b.put(e, ikk);
        return ikk;
    }

    static List<lkq> a(iin<ikn> iin_ikn) {
        Object obj;
        Object obj2;
        boolean z;
        List<lkq> arrayList = new ArrayList();
        lkq lkq = null;
        long j = Long.MIN_VALUE;
        int a = iin_ikn.a();
        int i = 0;
        while (i < a) {
            lkq lkq2;
            ikn ikn = (ikn) iin_ikn.a(i);
            if (ikn.b == j) {
                iil.b("Expected non-null", (Object) lkq);
                lkq2 = lkq;
            } else {
                lkq = new lkq();
                lkq.a = Integer.valueOf((int) ikn.b);
                lkq.b = Integer.valueOf((int) ikn.c);
                j = ikn.b;
                arrayList.add(lkq);
                lkq2 = lkq;
            }
            ikn.d.addTo(lkq);
            i++;
            lkq = lkq2;
        }
        if (lkq == null) {
            obj = 1;
        } else {
            obj = null;
        }
        if (a == 0) {
            obj2 = 1;
        } else {
            obj2 = null;
        }
        if (obj == obj2) {
            z = true;
        } else {
            z = false;
        }
        iil.a("Expected condition to be true", z);
        return arrayList;
    }

    public void a(String str) {
        iil.a();
        f();
        if (this.b.get(str) == null) {
            this.b.put(str, new ikk());
        }
    }

    public void a(String str, String str2, int i) {
        iil.a();
        f();
        ikk ikk = (ikk) this.b.get(str2);
        if (ikk == null) {
            ikk = new ikk();
        }
        int d = ikh.d(i);
        iil.b("Expected condition to be false", ikk.a);
        ikk.a = true;
        ikk.b = d;
        ikk.c = (long) ((int) ((SystemClock.elapsedRealtime() - ikk.e) / 1000));
        this.b.put(str2, ikk);
        a(str);
    }

    public iki a(Context context, int i, int i2, long j, String str) {
        long currentTimeMillis;
        if (j <= 0) {
            currentTimeMillis = System.currentTimeMillis();
        } else {
            currentTimeMillis = j;
        }
        return new iki(this, context, i, i2, currentTimeMillis, str);
    }

    static int d(int i) {
        int i2 = 6;
        if (i < 10000) {
            return i;
        }
        switch (i) {
            case 51:
                i2 = 51;
                break;
            case 67:
                i2 = 67;
                break;
            case 10000:
                iil.a("endCause is not set");
                break;
            case 10001:
                i2 = 29;
                break;
            case 10003:
            case 10010:
            case 10015:
                i2 = 47;
                break;
            case 10022:
                i2 = 22;
                break;
            case 10023:
                i2 = 10;
                break;
            case 10024:
                i2 = 65;
                break;
            case 10025:
                i2 = 37;
                break;
            case 10029:
                i2 = 26;
                break;
            case 10030:
                i2 = 0;
                break;
            case 11001:
            case 11003:
                i2 = 31;
                break;
            case 11004:
                i2 = 0;
                break;
            case 11005:
                i2 = 61;
                break;
            case 11006:
                i2 = 62;
                break;
            case 11009:
                i2 = 18;
                break;
            case 11010:
                i2 = 2;
                break;
            case 11011:
                i2 = 2;
                break;
            case 11012:
                i2 = 60;
                break;
            case 11014:
                i2 = 2;
                break;
            case 11015:
                i2 = 65;
                break;
            case 11018:
                i2 = 68;
                break;
            default:
                itx.a(6, "vclib", "endCauseMap unexpected: " + i);
                break;
        }
        return i2;
    }

    private static void a(ikn ikn, PrintWriter printWriter, AggregatePrintStats aggregatePrintStats) {
        printWriter.print(new Date(ikn.a).toString());
        ikn.d.print(printWriter, aggregatePrintStats);
    }

    void a(PrintWriter printWriter) {
        iil.a();
        AggregatePrintStats aggregatePrintStats = new AggregatePrintStats();
        printWriter.println("Stats history");
        if (this.c.a() > 0) {
            printWriter.println("Global stats legend:");
            printWriter.println("  GlobalStats -- pcpu, tcpu, online cores, util per cpu, cpu freq, on battery, battery level");
        }
        for (int i = 0; i < this.c.a(); i++) {
            ikh.a((ikn) this.c.a(i), printWriter, aggregatePrintStats);
        }
        if (this.i != null) {
            ikh.a(this.i, printWriter, aggregatePrintStats);
        }
        String str = "Active media session: ";
        String valueOf = String.valueOf(this.a.e());
        printWriter.println(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
        for (Entry entry : this.b.entrySet()) {
            String str2 = "Stats history for session: ";
            str = String.valueOf((String) entry.getKey());
            if (str.length() != 0) {
                str = str2.concat(str);
            } else {
                str = new String(str2);
            }
            printWriter.println(str);
            ikk ikk = (ikk) entry.getValue();
            iin iin = ikk.h;
            if (iin.a() > 0) {
                printWriter.println("Legend:");
                VoiceSenderStats.printLegend(printWriter);
                VoiceReceiverStats.printLegend(printWriter);
                VideoSenderStats.printLegend(printWriter);
                VideoReceiverStats.printLegend(printWriter);
                BandwidthEstimationStats.printLegend(printWriter);
                ConnectionInfoStats.printLegend(printWriter);
            }
            for (int i2 = 0; i2 < iin.a(); i2++) {
                ikh.a((ikn) iin.a(i2), printWriter, aggregatePrintStats);
            }
            for (ikn a : ikk.i.c()) {
                ikh.a(a, printWriter, aggregatePrintStats);
            }
        }
        aggregatePrintStats.a(printWriter);
    }
}
