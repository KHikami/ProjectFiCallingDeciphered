package defpackage;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.android.dialer.app.DialtactsActivity;
import com.android.dialer.app.calllog.CallLogNotificationsService;

/* compiled from: PG */
/* renamed from: anu */
public final class anu {
    private static anu b;
    public Context a;

    private anu(Context context) {
        this.a = context;
    }

    public static anu a(Context context) {
        if (b == null) {
            b = new anu(context);
        }
        return b;
    }

    public final PendingIntent a() {
        Intent intent = new Intent(this.a, DialtactsActivity.class);
        intent.putExtra("EXTRA_SHOW_TAB", 1);
        return PendingIntent.getActivity(this.a, 0, intent, 134217728);
    }

    public final PendingIntent b() {
        Intent intent = new Intent(this.a, CallLogNotificationsService.class);
        intent.setAction("com.android.dialer.calllog.ACTION_MARK_NEW_MISSED_CALLS_AS_OLD");
        return PendingIntent.getService(this.a, 0, intent, 0);
    }

    public static void b(Context context) {
        context.sendBroadcast(new Intent("android.intent.action.CLOSE_SYSTEM_DIALOGS"));
    }

    public final NotificationManager c() {
        return (NotificationManager) this.a.getSystemService("notification");
    }
}
