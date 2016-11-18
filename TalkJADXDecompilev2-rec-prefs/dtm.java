package p000;

import android.content.SharedPreferences;
import android.os.SystemClock;

final class dtm implements dth {
    private static final boolean f10511a = false;
    private final SharedPreferences f10512b;
    private final int f10513c;

    static {
        kae kae = glk.f15561h;
    }

    public dtm(SharedPreferences sharedPreferences, int i) {
        this.f10512b = sharedPreferences;
        this.f10513c = i;
    }

    public void mo1670a(String str) {
        mo1671a(str, SystemClock.elapsedRealtime());
    }

    public void mo1671a(String str, long j) {
        ba.m4577a(j > 0);
        this.f10512b.edit().putLong(m12673c(str), j).apply();
        if (f10511a) {
            String str2 = "Babel_LatencyTracker";
            String str3 = "Latency tracking started for event ";
            String valueOf = String.valueOf(m12673c(str));
            glk.m17976b(str2, valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3), new Object[0]);
        }
    }

    public void mo1668a(int i, String str, int i2) {
        mo1669a(i, str, SystemClock.elapsedRealtime(), i2);
    }

    public void mo1669a(int i, String str, long j, int i2) {
        long j2 = this.f10512b.getLong(m12673c(str), 0);
        if (j2 > 0 && j > j2) {
            ba.m4548a(i, System.currentTimeMillis(), this.f10513c, ba.m4618c().m12786a(i2).m12797c(j - j2));
            this.f10512b.edit().remove(m12673c(str)).apply();
            if (f10511a) {
                String valueOf = String.valueOf(m12673c(str));
                glk.m17976b("Babel_LatencyTracker", new StringBuilder(String.valueOf(valueOf).length() + 95).append("Latency tracking ends for event ").append(valueOf).append(" with event detail ").append(i2).append(", duration ").append(j - j2).append("ms").toString(), new Object[0]);
            }
        }
    }

    public void mo1672b(String str) {
        this.f10512b.edit().remove(m12673c(str)).apply();
    }

    private String m12673c(String str) {
        ba.m4577a(str != null);
        return new StringBuilder(String.valueOf(str).length() + 12).append(this.f10513c).append(":").append(str).toString();
    }
}
