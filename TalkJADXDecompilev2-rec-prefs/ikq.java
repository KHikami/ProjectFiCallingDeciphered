package p000;

import com.google.api.client.http.ExponentialBackOffPolicy;

final class ikq implements Runnable {
    final /* synthetic */ ikp f17935a;

    ikq(ikp ikp) {
        this.f17935a = ikp;
    }

    public void run() {
        this.f17935a.f17926c.removeCallbacks(this.f17935a.f17928e);
        this.f17935a.f17926c.postDelayed(this.f17935a.f17928e, 1000);
        ikp ikp = this.f17935a;
        if (ikp.f17925b != 0) {
            int i;
            int b;
            double d;
            ikp.f17933j = ikp.m22190a("online");
            int i2 = 0;
            int i3 = 0;
            for (i = 0; i < ikp.f17933j; i++) {
                String valueOf = String.valueOf("/sys/devices/system/cpu/cpu");
                String stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 11).append(valueOf).append(i).toString();
                if (ikp.f17927d[i] == 0) {
                    String valueOf2 = String.valueOf(stringBuilder);
                    valueOf = String.valueOf("/cpufreq/cpuinfo_max_freq");
                    ikp.f17927d[i] = ikp.m22191b(valueOf.length() != 0 ? valueOf2.concat(valueOf) : new String(valueOf2));
                }
                i2 += ikp.f17927d[i];
                stringBuilder = String.valueOf(stringBuilder);
                valueOf = String.valueOf("/cpufreq/scaling_cur_freq");
                b = ikp.m22191b(valueOf.length() != 0 ? stringBuilder.concat(valueOf) : new String(stringBuilder));
                i3 += b;
                if (i == 0) {
                    ikp.f17931h = b;
                }
            }
            double d2 = (100.0d * ((double) i3)) / ((double) i2);
            if (ikp.f17929f > 0.0d) {
                d = (ikp.f17929f + d2) * ExponentialBackOffPolicy.DEFAULT_RANDOMIZATION_FACTOR;
            } else {
                d = d2;
            }
            ikp.f17929f = d2;
            ikr f = ikp.m22198f();
            b = f.m22199a() - ikp.f17930g.m22199a();
            int b2 = f.m22200b() - ikp.f17930g.m22200b();
            ikp.f17930g = f;
            i = b + b2;
            if (i == 0) {
                ikp.f17932i = 0;
            } else {
                ikp.f17932i = Math.max(0, Math.min((int) Math.round((d * ((double) b)) / ((double) i)), 100));
            }
        }
    }
}
