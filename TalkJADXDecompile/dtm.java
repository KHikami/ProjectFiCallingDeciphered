import android.content.SharedPreferences;
import android.os.SystemClock;

final class dtm implements dth {
    private static final boolean a;
    private final SharedPreferences b;
    private final int c;

    static {
        kae kae = glk.h;
        a = false;
    }

    public dtm(SharedPreferences sharedPreferences, int i) {
        this.b = sharedPreferences;
        this.c = i;
    }

    public void a(String str) {
        a(str, SystemClock.elapsedRealtime());
    }

    public void a(String str, long j) {
        ba.a(j > 0);
        this.b.edit().putLong(c(str), j).apply();
        if (a) {
            String str2 = "Babel_LatencyTracker";
            String str3 = "Latency tracking started for event ";
            String valueOf = String.valueOf(c(str));
            glk.b(str2, valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3), new Object[0]);
        }
    }

    public void a(int i, String str, int i2) {
        a(i, str, SystemClock.elapsedRealtime(), i2);
    }

    public void a(int i, String str, long j, int i2) {
        long j2 = this.b.getLong(c(str), 0);
        if (j2 > 0 && j > j2) {
            ba.a(i, System.currentTimeMillis(), this.c, ba.c().a(i2).c(j - j2));
            this.b.edit().remove(c(str)).apply();
            if (a) {
                String valueOf = String.valueOf(c(str));
                glk.b("Babel_LatencyTracker", new StringBuilder(String.valueOf(valueOf).length() + 95).append("Latency tracking ends for event ").append(valueOf).append(" with event detail ").append(i2).append(", duration ").append(j - j2).append("ms").toString(), new Object[0]);
            }
        }
    }

    public void b(String str) {
        this.b.edit().remove(c(str)).apply();
    }

    private String c(String str) {
        ba.a(str != null);
        return new StringBuilder(String.valueOf(str).length() + 12).append(this.c).append(":").append(str).toString();
    }
}
