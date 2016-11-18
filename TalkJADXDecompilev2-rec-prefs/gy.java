package p000;

import android.app.Notification;
import android.app.NotificationManager;

class gy {
    public void m18938a(NotificationManager notificationManager, String str, int i) {
        notificationManager.cancel(str, i);
    }

    public void m18939a(NotificationManager notificationManager, String str, int i, Notification notification) {
        notificationManager.notify(str, i, notification);
    }

    public int mo2427a() {
        return 1;
    }

    gy() {
    }
}
