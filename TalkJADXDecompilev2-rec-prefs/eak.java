package p000;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import com.google.android.apps.hangouts.service.NetworkConnectionCheckingService;

class eak implements ActivityLifecycleCallbacks, eaj {
    private final Context f11010a;
    private volatile eai f11011b = eai.UNKNOWN;

    public eak(Context context) {
        this.f11010a = context;
    }

    public void mo1804a(eai eai) {
        if (eai != this.f11011b) {
            String valueOf = String.valueOf(this.f11011b);
            String valueOf2 = String.valueOf(eai);
            glk.m17979c("Babel", new StringBuilder((String.valueOf(valueOf).length() + 34) + String.valueOf(valueOf2).length()).append("connection state changed from ").append(valueOf).append(" to ").append(valueOf2).toString(), new Object[0]);
            this.f11011b = eai;
            if (((biw) jyn.m25426a(this.f11010a, biw.class)).mo564a("babel_network_change_notification", false)) {
                RealTimeChatService.f6752i.post(new fhj());
            }
        }
    }

    public void mo1803a(Context context, boolean z) {
        Intent intent = new Intent(context, NetworkConnectionCheckingService.class);
        if (z) {
            intent.putExtra("update_type", "initialize_connection_state");
        } else {
            intent.putExtra("update_type", "update_connection_state");
        }
        context.startService(intent);
    }

    public void mo1805a(boolean z) {
        if (this.f11011b.m13284a() != z) {
            Intent intent = new Intent(this.f11010a, NetworkConnectionCheckingService.class);
            intent.putExtra("update_type", "verify_connection_state");
            intent.putExtra("expected_connectivity", z);
            this.f11010a.startService(intent);
        }
    }

    public void onActivityResumed(Activity activity) {
        Context applicationContext = activity.getApplicationContext();
        if (mo1802a() == eai.CAPTIVE_PORTAL) {
            mo1803a(applicationContext, false);
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

    public eai mo1802a() {
        if (eai.UNKNOWN == this.f11011b) {
            mo1803a(this.f11010a, true);
        }
        return this.f11011b;
    }
}
