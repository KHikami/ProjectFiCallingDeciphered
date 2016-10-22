import android.content.Context;

public class flj implements bhf, bhj, bhm {
    private long a;
    private final int b;
    private final long c;
    private final bhr d;

    public flj(int i, Context context) {
        this.b = i;
        this.c = gwb.a(context, "babel_upload_analytics_refresh_period_ms", fls.b);
        this.a = ((jcf) jyn.a(context, jcf.class)).a(i).a("last_upload_analytics_time", 0);
        long j = this.a + this.c;
        long a = glj.a();
        if (this.a == 0 || a >= j || this.a > a) {
            j = 0;
        } else {
            j -= a;
        }
        this.d = new bhs().d(j).a();
    }

    public int a(Context context, bhb bhb) {
        evy[] evyArr = new evy[]{new evy(1, 10, 1, "sent_sms_count_since_last_upload"), new evy(1, 9, 1, "received_sms_count_since_last_upload"), new evy(1, 10, 2, "sent_mms_count_since_last_upload"), new evy(1, 9, 2, "received_mms_count_since_last_upload"), new evy(3, 6, 0, "shown_sms_promo_screen_launch_count_since_last_upload"), new evy(3, 7, 0, "accepted_sms_promo_screen_launch_count_since_last_upload"), new evy(3, 8, 0, "declined_sms_promo_screen_launch_count_since_last_upload"), new evy(4, 6, 0, "shown_sms_promo_screen_notify_count_since_last_upload"), new evy(4, 7, 0, "accepted_sms_promo_screen_notify_count_since_last_upload"), new evy(4, 8, 0, "declined_sms_promo_screen_notify_count_since_last_upload"), new evy(5, 6, 0, "shown_sms_promo_banner_count_since_last_upload"), new evy(5, 7, 0, "accepted_sms_promo_banner_count_since_last_upload"), new evy(5, 8, 0, "declined_sms_promo_banner_count_since_last_upload"), new evy(6, 6, 0, "shown_sms_promo_notify_count_since_last_upload")};
        int i = 0;
        int i2 = 0;
        while (i < 14) {
            try {
                int i3;
                evy evy = evyArr[i];
                String a = evy.a();
                long a2 = ((jcf) jyn.a(context, jcf.class)).a(this.b).a(a, 0);
                evy.a(a2);
                if (a2 > 0) {
                    ((jcf) jyn.a(context, jcf.class)).b(this.b).b(a, 0).d();
                    i3 = i2 + 1;
                } else {
                    i3 = i2;
                }
                i++;
                i2 = i3;
            } catch (jcj e) {
                return bhn.c;
            }
        }
        if (i2 > 0) {
            ((bhl) jyn.a(context, bhl.class)).a(new feg(new evx(evyArr, i2), this.b));
        } else if (glk.a("Babel", 3)) {
            glk.a("Babel", "Skip UploadAnalyticsPeriodicTask since there is nothing to upload", new Object[0]);
        }
        this.a = glj.a();
        ((jcf) jyn.a(context, jcf.class)).b(this.b).b("last_upload_analytics_time", this.a).d();
        this.d.a(this.c);
        return bhn.b;
    }

    public bhr a() {
        return this.d;
    }

    public void a(Context context) {
    }

    public bhu d() {
        return new bhv().a(true).a();
    }

    public String b() {
        String valueOf = String.valueOf(getClass().getName());
        return new StringBuilder(String.valueOf(valueOf).length() + 11).append(valueOf).append(this.b).toString();
    }

    public bhk c() {
        return bhk.NONE;
    }
}
