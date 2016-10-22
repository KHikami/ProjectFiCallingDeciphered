import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import com.google.android.apps.hangouts.service.NetworkConnectionCheckingService;

class eak implements ActivityLifecycleCallbacks, eaj {
    private final Context a;
    private volatile eai b;

    public eak(Context context) {
        this.b = eai.UNKNOWN;
        this.a = context;
    }

    public void a(eai eai) {
        if (eai != this.b) {
            String valueOf = String.valueOf(this.b);
            String valueOf2 = String.valueOf(eai);
            glk.c("Babel", new StringBuilder((String.valueOf(valueOf).length() + 34) + String.valueOf(valueOf2).length()).append("connection state changed from ").append(valueOf).append(" to ").append(valueOf2).toString(), new Object[0]);
            this.b = eai;
            if (((biw) jyn.a(this.a, biw.class)).a("babel_network_change_notification", false)) {
                RealTimeChatService.i.post(new fhj());
            }
        }
    }

    public void a(Context context, boolean z) {
        Intent intent = new Intent(context, NetworkConnectionCheckingService.class);
        if (z) {
            intent.putExtra("update_type", "initialize_connection_state");
        } else {
            intent.putExtra("update_type", "update_connection_state");
        }
        context.startService(intent);
    }

    public void a(boolean z) {
        if (this.b.a() != z) {
            Intent intent = new Intent(this.a, NetworkConnectionCheckingService.class);
            intent.putExtra("update_type", "verify_connection_state");
            intent.putExtra("expected_connectivity", z);
            this.a.startService(intent);
        }
    }

    public void onActivityResumed(Activity activity) {
        Context applicationContext = activity.getApplicationContext();
        if (a() == eai.CAPTIVE_PORTAL) {
            a(applicationContext, false);
        }
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public void onActivityDestroyed(Activity activity) {
    }

    public void onActivityPaused(Activity activity) {
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public void onActivityStarted(Activity activity) {
    }

    public void onActivityStopped(Activity activity) {
    }

    public eai a() {
        if (eai.UNKNOWN == this.b) {
            a(this.a, true);
        }
        return this.b;
    }
}
