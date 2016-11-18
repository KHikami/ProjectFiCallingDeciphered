package p000;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.gcm.Task;
import java.util.List;

public class gzf {
    private static gzf f16421a;
    private Context f16422b;
    private final PendingIntent f16423c = PendingIntent.getBroadcast(this.f16422b, 0, new Intent(), 0);

    private gzf(Context context) {
        this.f16422b = context;
    }

    public static gzf m19019a(Context context) {
        gzf gzf;
        synchronized (gzf.class) {
            if (f16421a == null) {
                f16421a = new gzf(context.getApplicationContext());
            }
            gzf = f16421a;
        }
        return gzf;
    }

    public void m19020a(Task task) {
        boolean z;
        boolean z2 = true;
        Object c = task.m9741c();
        gwb.m2195f(c, (Object) "GcmTaskService must not be null.");
        Intent intent = new Intent("com.google.android.gms.gcm.ACTION_TASK_READY");
        intent.setPackage(this.f16422b.getPackageName());
        List<ResolveInfo> queryIntentServices = this.f16422b.getPackageManager().queryIntentServices(intent, 0);
        if (queryIntentServices == null || queryIntentServices.size() == 0) {
            z = false;
        } else {
            z = true;
        }
        gwb.m2048b(z, (Object) "There is no GcmTaskService component registered within this package. Have you extended GcmTaskService correctly?");
        for (ResolveInfo resolveInfo : queryIntentServices) {
            if (resolveInfo.serviceInfo.name.equals(c)) {
                break;
            }
        }
        z2 = false;
        gwb.m2048b(z2, new StringBuilder(String.valueOf(c).length() + 119).append("The GcmTaskService class you provided ").append(c).append(" does not seem to support receiving com.google.android.gms.gcm.ACTION_TASK_READY.").toString());
        int c2 = gzh.m19029c(this.f16422b);
        if (c2 < gzh.f16427a) {
            Log.e("GcmNetworkManager", "Google Play Services is not available, dropping GcmNetworkManager request. code=" + c2);
            intent = null;
        } else {
            intent = new Intent("com.google.android.gms.gcm.ACTION_SCHEDULE");
            intent.setPackage(gzh.m19028b(this.f16422b));
            intent.putExtra("app", this.f16423c);
        }
        if (intent != null) {
            Bundle extras = intent.getExtras();
            extras.putString("scheduler_action", "SCHEDULE_TASK");
            task.mo1281a(extras);
            intent.putExtras(extras);
            this.f16422b.sendBroadcast(intent);
        }
    }
}
