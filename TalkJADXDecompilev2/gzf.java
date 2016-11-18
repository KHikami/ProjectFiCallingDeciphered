package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.gcm.Task;
import java.util.List;

public class gzf {
    private static gzf a;
    private Context b;
    private final PendingIntent c = PendingIntent.getBroadcast(this.b, 0, new Intent(), 0);

    private gzf(Context context) {
        this.b = context;
    }

    public static gzf a(Context context) {
        gzf gzf;
        synchronized (gzf.class) {
            if (a == null) {
                a = new gzf(context.getApplicationContext());
            }
            gzf = a;
        }
        return gzf;
    }

    public void a(Task task) {
        boolean z;
        boolean z2 = true;
        Object c = task.c();
        gwb.f(c, (Object) "GcmTaskService must not be null.");
        Intent intent = new Intent("com.google.android.gms.gcm.ACTION_TASK_READY");
        intent.setPackage(this.b.getPackageName());
        List<ResolveInfo> queryIntentServices = this.b.getPackageManager().queryIntentServices(intent, 0);
        if (queryIntentServices == null || queryIntentServices.size() == 0) {
            z = false;
        } else {
            z = true;
        }
        gwb.b(z, (Object) "There is no GcmTaskService component registered within this package. Have you extended GcmTaskService correctly?");
        for (ResolveInfo resolveInfo : queryIntentServices) {
            if (resolveInfo.serviceInfo.name.equals(c)) {
                break;
            }
        }
        z2 = false;
        gwb.b(z2, new StringBuilder(String.valueOf(c).length() + 119).append("The GcmTaskService class you provided ").append(c).append(" does not seem to support receiving com.google.android.gms.gcm.ACTION_TASK_READY.").toString());
        int c2 = gzh.c(this.b);
        if (c2 < gzh.a) {
            Log.e("GcmNetworkManager", "Google Play Services is not available, dropping GcmNetworkManager request. code=" + c2);
            intent = null;
        } else {
            intent = new Intent("com.google.android.gms.gcm.ACTION_SCHEDULE");
            intent.setPackage(gzh.b(this.b));
            intent.putExtra("app", this.c);
        }
        if (intent != null) {
            Bundle extras = intent.getExtras();
            extras.putString("scheduler_action", "SCHEDULE_TASK");
            task.a(extras);
            intent.putExtras(extras);
            this.b.sendBroadcast(intent);
        }
    }
}
