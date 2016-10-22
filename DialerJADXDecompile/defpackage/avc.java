package defpackage;

import android.app.Notification.Builder;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.preference.PreferenceManager;

/* compiled from: PG */
/* renamed from: avc */
public final class avc implements auy {
    private /* synthetic */ Context a;

    public avc(Context context) {
        this.a = context;
    }

    public final void a(boolean z) {
        if (this.a != null && z) {
            NotificationManager notificationManager = (NotificationManager) this.a.getSystemService("notification");
            Builder autoCancel = new Builder(this.a).setSmallIcon(buf.hZ).setContentTitle(this.a.getString(buf.in)).setContentText(this.a.getString(buf.im)).setAutoCancel(true);
            autoCancel.setContentIntent(PendingIntent.getActivity(this.a, 0, buf.z(this.a), 134217728));
            notificationManager.notify("call_blocking", 10, autoCancel.build());
            PreferenceManager.getDefaultSharedPreferences(this.a).edit().putBoolean("notified_call_blocking_disabled_by_emergency_call", true).apply();
        }
    }
}
