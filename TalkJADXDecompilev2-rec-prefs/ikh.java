package p000;

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

public final class ikh {
    final ikj f17869a;
    final Map<String, ikk> f17870b;
    final iin<ikn> f17871c;
    int f17872d = 0;
    lld f17873e;
    int f17874f = 0;
    int f17875g = 0;
    private long f17876h = 0;
    private ikn f17877i;

    public ikh(ikj ikj) {
        this.f17869a = ikj;
        this.f17870b = new HashMap();
        this.f17871c = new iin(1200);
    }

    public void m22156a() {
        m22152e();
    }

    private void m22152e() {
        if (this.f17870b.isEmpty()) {
            iil.m21875b("Expected non-null", this.f17869a.mo2236e());
            this.f17870b.put(this.f17869a.mo2236e(), new ikk());
        }
        if (this.f17876h == 0) {
            this.f17876h = SystemClock.elapsedRealtime();
        }
    }

    public void m22157a(int i) {
        this.f17872d = i;
    }

    public void m22158a(int i, String str) {
        lld lld = new lld();
        lld.f25319a = Integer.valueOf(i);
        lld.f25321c = str;
        m22150a(lld);
    }

    private void m22150a(lld lld) {
        this.f17873e = lld;
    }

    public void m22164b(int i) {
        this.f17874f = i;
    }

    public void m22167c(int i) {
        this.f17875g = i;
    }

    public void m22163b() {
        m22154g().f17899f = SystemClock.elapsedRealtime();
    }

    public void m22166c() {
        m22154g().f17900g = SystemClock.elapsedRealtime();
    }

    public void m22159a(Stats stats) {
        iil.m21867a();
        m22152e();
        if (stats instanceof inv) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.f17877i = new ikn(elapsedRealtime, (elapsedRealtime - this.f17876h) / 1000, this.f17877i != null ? elapsedRealtime - this.f17877i.f17911a : elapsedRealtime - this.f17876h, stats);
            return;
        }
        ikk g = m22154g();
        elapsedRealtime = SystemClock.elapsedRealtime();
        ikn ikn = new ikn(elapsedRealtime, (elapsedRealtime - g.f17898e) / 1000, g.f17903j != -1 ? elapsedRealtime - g.f17903j : elapsedRealtime - g.f17898e, stats);
        if (stats instanceof VoiceSenderStats) {
            g.f17902i.f17904a = ikn;
        } else if (stats instanceof VoiceReceiverStats) {
            g.f17902i.f17905b.put(Integer.valueOf(((VoiceReceiverStats) stats).f8556a), ikn);
        } else if (stats instanceof VideoSenderStats) {
            g.f17902i.f17906c = ikn;
        } else if (stats instanceof VideoReceiverStats) {
            g.f17902i.f17907d.put(Integer.valueOf(((VideoReceiverStats) stats).f8517a), ikn);
        } else if (stats instanceof BandwidthEstimationStats) {
            g.f17902i.f17908e = ikn;
        } else if (stats instanceof ConnectionInfoStats) {
            g.f17902i.f17909f = ikn;
        } else {
            String valueOf = String.valueOf(stats);
            itx.m23277a(5, "vclib", new StringBuilder(String.valueOf(valueOf).length() + 36).append("Received unrecognized stats update, ").append(valueOf).toString());
        }
    }

    public void m22165b(Stats stats) {
        iil.m21867a();
        if (stats instanceof inv) {
            iil.m21875b("Expected non-null", this.f17877i);
            m22168d();
            return;
        }
        Object obj;
        ikk g = m22154g();
        if (stats instanceof VoiceSenderStats) {
            obj = g.f17902i.f17904a;
            g.f17902i.f17904a = null;
        } else if (stats instanceof VoiceReceiverStats) {
            VoiceReceiverStats voiceReceiverStats = (VoiceReceiverStats) stats;
            r1 = (ikn) g.f17902i.f17905b.get(Integer.valueOf(voiceReceiverStats.f8556a));
            g.f17902i.f17905b.remove(Integer.valueOf(voiceReceiverStats.f8556a));
        } else if (stats instanceof VideoSenderStats) {
            obj = g.f17902i.f17906c;
            g.f17902i.f17906c = null;
        } else if (stats instanceof VideoReceiverStats) {
            VideoReceiverStats videoReceiverStats = (VideoReceiverStats) stats;
            r1 = (ikn) g.f17902i.f17907d.get(Integer.valueOf(videoReceiverStats.f8517a));
            g.f17902i.f17907d.remove(Integer.valueOf(videoReceiverStats.f8517a));
        } else if (stats instanceof BandwidthEstimationStats) {
            obj = g.f17902i.f17908e;
            g.f17902i.f17908e = null;
        } else if (stats instanceof ConnectionInfoStats) {
            obj = g.f17902i.f17909f;
            g.f17902i.f17909f = null;
        } else {
            itx.m23287b("vclib", "Received unrecognized stats log, %s", stats);
            obj = null;
        }
        if (obj != null) {
            g.f17901h.m21890a(obj);
            return;
        }
        itx.m23288c("vclib", "Received stats object, %s that wasn't already in latestStatsUpdate", stats);
    }

    void m22168d() {
        if (this.f17877i != null) {
            this.f17871c.m21890a(this.f17877i);
            this.f17877i = null;
        }
    }

    private void m22153f() {
        iil.m21867a();
        m22168d();
        for (Entry key : this.f17870b.entrySet()) {
            itx.m23279a(3, "vclib", "logLatestStats for session id = %s", key.getKey());
            ((ikk) key.getValue()).m22182a();
        }
    }

    private ikk m22154g() {
        Object e = this.f17869a.mo2236e();
        iil.m21875b("Expected non-null", e);
        ikk ikk = (ikk) this.f17870b.get(e);
        if (ikk != null) {
            return ikk;
        }
        ikk = new ikk();
        this.f17870b.put(e, ikk);
        return ikk;
    }

    static List<lkq> m22148a(iin<ikn> iin_ikn) {
        Object obj;
        Object obj2;
        boolean z;
        List<lkq> arrayList = new ArrayList();
        lkq lkq = null;
        long j = Long.MIN_VALUE;
        int a = iin_ikn.m21888a();
        int i = 0;
        while (i < a) {
            lkq lkq2;
            ikn ikn = (ikn) iin_ikn.m21889a(i);
            if (ikn.f17912b == j) {
                iil.m21875b("Expected non-null", (Object) lkq);
                lkq2 = lkq;
            } else {
                lkq = new lkq();
                lkq.f25180a = Integer.valueOf((int) ikn.f17912b);
                lkq.f25181b = Integer.valueOf((int) ikn.f17913c);
                j = ikn.f17912b;
                arrayList.add(lkq);
                lkq2 = lkq;
            }
            ikn.f17914d.addTo(lkq);
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
        iil.m21874a("Expected condition to be true", z);
        return arrayList;
    }

    public void m22161a(String str) {
        iil.m21867a();
        m22153f();
        if (this.f17870b.get(str) == null) {
            this.f17870b.put(str, new ikk());
        }
    }

    public void m22162a(String str, String str2, int i) {
        iil.m21867a();
        m22153f();
        ikk ikk = (ikk) this.f17870b.get(str2);
        if (ikk == null) {
            ikk = new ikk();
        }
        int d = ikh.m22151d(i);
        iil.m21879b("Expected condition to be false", ikk.f17894a);
        ikk.f17894a = true;
        ikk.f17895b = d;
        ikk.f17896c = (long) ((int) ((SystemClock.elapsedRealtime() - ikk.f17898e) / 1000));
        this.f17870b.put(str2, ikk);
        m22161a(str);
    }

    public iki m22155a(Context context, int i, int i2, long j, String str) {
        long currentTimeMillis;
        if (j <= 0) {
            currentTimeMillis = System.currentTimeMillis();
        } else {
            currentTimeMillis = j;
        }
        return new iki(this, context, i, i2, currentTimeMillis, str);
    }

    static int m22151d(int i) {
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
                iil.m21870a("endCause is not set");
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
                itx.m23277a(6, "vclib", "endCauseMap unexpected: " + i);
                break;
        }
        return i2;
    }

    private static void m22149a(ikn ikn, PrintWriter printWriter, AggregatePrintStats aggregatePrintStats) {
        printWriter.print(new Date(ikn.f17911a).toString());
        ikn.f17914d.print(printWriter, aggregatePrintStats);
    }

    void m22160a(PrintWriter printWriter) {
        iil.m21867a();
        AggregatePrintStats aggregatePrintStats = new AggregatePrintStats();
        printWriter.println("Stats history");
        if (this.f17871c.m21888a() > 0) {
            printWriter.println("Global stats legend:");
            printWriter.println("  GlobalStats -- pcpu, tcpu, online cores, util per cpu, cpu freq, on battery, battery level");
        }
        for (int i = 0; i < this.f17871c.m21888a(); i++) {
            ikh.m22149a((ikn) this.f17871c.m21889a(i), printWriter, aggregatePrintStats);
        }
        if (this.f17877i != null) {
            ikh.m22149a(this.f17877i, printWriter, aggregatePrintStats);
        }
        String str = "Active media session: ";
        String valueOf = String.valueOf(this.f17869a.mo2236e());
        printWriter.println(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
        for (Entry entry : this.f17870b.entrySet()) {
            String str2 = "Stats history for session: ";
            str = String.valueOf((String) entry.getKey());
            if (str.length() != 0) {
                str = str2.concat(str);
            } else {
                str = new String(str2);
            }
            printWriter.println(str);
            ikk ikk = (ikk) entry.getValue();
            iin iin = ikk.f17901h;
            if (iin.m21888a() > 0) {
                printWriter.println("Legend:");
                VoiceSenderStats.printLegend(printWriter);
                VoiceReceiverStats.printLegend(printWriter);
                VideoSenderStats.printLegend(printWriter);
                VideoReceiverStats.printLegend(printWriter);
                BandwidthEstimationStats.printLegend(printWriter);
                ConnectionInfoStats.printLegend(printWriter);
            }
            for (int i2 = 0; i2 < iin.m21888a(); i2++) {
                ikh.m22149a((ikn) iin.m21889a(i2), printWriter, aggregatePrintStats);
            }
            for (ikn a : ikk.f17902i.m22185c()) {
                ikh.m22149a(a, printWriter, aggregatePrintStats);
            }
        }
        aggregatePrintStats.m10407a(printWriter);
    }
}
