import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.text.TextUtils;

public class bmi extends Service {
    private static Boolean b;
    private Handler a;

    public static boolean a(Context context) {
        buf.A((Object) context);
        if (b != null) {
            return b.booleanValue();
        }
        boolean a = bpq.a(context, bmi.class);
        b = Boolean.valueOf(a);
        return a;
    }

    protected final void a(bot bot, Handler handler, int i) {
        handler.post(new bml(this, i, bot));
    }

    public IBinder onBind(Intent intent) {
        return null;
    }

    public void onCreate() {
        super.onCreate();
        bnp.a((Context) this).a().b("CampaignTrackingService is starting up");
    }

    public void onDestroy() {
        bnp.a((Context) this).a().b("CampaignTrackingService is shutting down");
        super.onDestroy();
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        try {
            synchronized (bmh.a) {
                csm csm = bmh.b;
                if (csm != null && csm.a.isHeld()) {
                    csm.a();
                }
            }
        } catch (SecurityException e) {
        }
        bnp a = bnp.a((Context) this);
        bot a2 = a.a();
        String str = null;
        if (btq.a) {
            a2.f("Unexpected installation campaign (package side)");
        } else {
            str = intent.getStringExtra("referrer");
        }
        Handler handler = this.a;
        if (handler == null) {
            handler = new Handler(getMainLooper());
            this.a = handler;
        }
        if (TextUtils.isEmpty(str)) {
            if (!btq.a) {
                a2.e("No campaign found on com.android.vending.INSTALL_REFERRER \"referrer\" extra");
            }
            a.b().a(new bmj(this, a2, handler, i2));
        } else {
            int c = bom.c();
            if (str.length() > c) {
                a2.c("Campaign data exceed the maximum supported size and will be clipped. size, limit", Integer.valueOf(str.length()), Integer.valueOf(c));
                str = str.substring(0, c);
            }
            a2.a("CampaignTrackingService called. startId, campaign", Integer.valueOf(i2), str);
            bno c2 = a.c();
            Runnable bmk = new bmk(this, a2, handler, i2);
            buf.a(str, (Object) "campaign param can't be empty");
            c2.f.b().a(new bnl(c2, str, bmk));
        }
        return 2;
    }
}
