import com.google.api.client.http.ExponentialBackOffPolicy;

final class ikq implements Runnable {
    final /* synthetic */ ikp a;

    ikq(ikp ikp) {
        this.a = ikp;
    }

    public void run() {
        this.a.c.removeCallbacks(this.a.e);
        this.a.c.postDelayed(this.a.e, 1000);
        ikp ikp = this.a;
        if (ikp.b != 0) {
            int i;
            int b;
            double d;
            ikp.j = ikp.a("online");
            int i2 = 0;
            int i3 = 0;
            for (i = 0; i < ikp.j; i++) {
                String valueOf = String.valueOf("/sys/devices/system/cpu/cpu");
                String stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 11).append(valueOf).append(i).toString();
                if (ikp.d[i] == 0) {
                    String valueOf2 = String.valueOf(stringBuilder);
                    valueOf = String.valueOf("/cpufreq/cpuinfo_max_freq");
                    ikp.d[i] = ikp.b(valueOf.length() != 0 ? valueOf2.concat(valueOf) : new String(valueOf2));
                }
                i2 += ikp.d[i];
                stringBuilder = String.valueOf(stringBuilder);
                valueOf = String.valueOf("/cpufreq/scaling_cur_freq");
                b = ikp.b(valueOf.length() != 0 ? stringBuilder.concat(valueOf) : new String(stringBuilder));
                i3 += b;
                if (i == 0) {
                    ikp.h = b;
                }
            }
            double d2 = (100.0d * ((double) i3)) / ((double) i2);
            if (ikp.f > 0.0d) {
                d = (ikp.f + d2) * ExponentialBackOffPolicy.DEFAULT_RANDOMIZATION_FACTOR;
            } else {
                d = d2;
            }
            ikp.f = d2;
            ikr f = ikp.f();
            b = f.a() - ikp.g.a();
            int b2 = f.b() - ikp.g.b();
            ikp.g = f;
            i = b + b2;
            if (i == 0) {
                ikp.i = 0;
            } else {
                ikp.i = Math.max(0, Math.min((int) Math.round((d * ((double) b)) / ((double) i)), 100));
            }
        }
    }
}
