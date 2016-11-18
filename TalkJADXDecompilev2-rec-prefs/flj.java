package p000;

import android.content.Context;

public class flj implements bhf, bhj, bhm {
    private long f13407a;
    private final int f13408b;
    private final long f13409c;
    private final bhr f13410d;

    public flj(int i, Context context) {
        this.f13408b = i;
        this.f13409c = gwb.m1519a(context, "babel_upload_analytics_refresh_period_ms", fls.f13425b);
        this.f13407a = ((jcf) jyn.m25426a(context, jcf.class)).mo3456a(i).mo3434a("last_upload_analytics_time", 0);
        long j = this.f13407a + this.f13409c;
        long a = glj.m17956a();
        if (this.f13407a == 0 || a >= j || this.f13407a > a) {
            j = 0;
        } else {
            j -= a;
        }
        this.f13410d = new bhs().m5272d(j).m5267a();
    }

    public int mo539a(Context context, bhb bhb) {
        evy[] evyArr = new evy[]{new evy(1, 10, 1, "sent_sms_count_since_last_upload"), new evy(1, 9, 1, "received_sms_count_since_last_upload"), new evy(1, 10, 2, "sent_mms_count_since_last_upload"), new evy(1, 9, 2, "received_mms_count_since_last_upload"), new evy(3, 6, 0, "shown_sms_promo_screen_launch_count_since_last_upload"), new evy(3, 7, 0, "accepted_sms_promo_screen_launch_count_since_last_upload"), new evy(3, 8, 0, "declined_sms_promo_screen_launch_count_since_last_upload"), new evy(4, 6, 0, "shown_sms_promo_screen_notify_count_since_last_upload"), new evy(4, 7, 0, "accepted_sms_promo_screen_notify_count_since_last_upload"), new evy(4, 8, 0, "declined_sms_promo_screen_notify_count_since_last_upload"), new evy(5, 6, 0, "shown_sms_promo_banner_count_since_last_upload"), new evy(5, 7, 0, "accepted_sms_promo_banner_count_since_last_upload"), new evy(5, 8, 0, "declined_sms_promo_banner_count_since_last_upload"), new evy(6, 6, 0, "shown_sms_promo_notify_count_since_last_upload")};
        int i = 0;
        int i2 = 0;
        while (i < 14) {
            try {
                int i3;
                evy evy = evyArr[i];
                String a = evy.m14695a();
                long a2 = ((jcf) jyn.m25426a(context, jcf.class)).mo3456a(this.f13408b).mo3434a(a, 0);
                evy.m14696a(a2);
                if (a2 > 0) {
                    ((jcf) jyn.m25426a(context, jcf.class)).mo3464b(this.f13408b).m23878b(a, 0).m23891d();
                    i3 = i2 + 1;
                } else {
                    i3 = i2;
                }
                i++;
                i2 = i3;
            } catch (jcj e) {
                return bhn.f3350c;
            }
        }
        if (i2 > 0) {
            ((bhl) jyn.m25426a(context, bhl.class)).mo550a(new feg(new evx(evyArr, i2), this.f13408b));
        } else if (glk.m17973a("Babel", 3)) {
            glk.m17970a("Babel", "Skip UploadAnalyticsPeriodicTask since there is nothing to upload", new Object[0]);
        }
        this.f13407a = glj.m17956a();
        ((jcf) jyn.m25426a(context, jcf.class)).mo3464b(this.f13408b).m23878b("last_upload_analytics_time", this.f13407a).m23891d();
        this.f13410d.m5261a(this.f13409c);
        return bhn.f3349b;
    }

    public bhr mo540a() {
        return this.f13410d;
    }

    public void mo541a(Context context) {
    }

    public bhu mo544d() {
        return new bhv().m5277a(true).m5276a();
    }

    public String mo542b() {
        String valueOf = String.valueOf(getClass().getName());
        return new StringBuilder(String.valueOf(valueOf).length() + 11).append(valueOf).append(this.f13408b).toString();
    }

    public bhk mo543c() {
        return bhk.NONE;
    }
}
