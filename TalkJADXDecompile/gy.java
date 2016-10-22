import android.app.Notification;
import android.app.NotificationManager;

class gy {
    public void a(NotificationManager notificationManager, String str, int i) {
        notificationManager.cancel(str, i);
    }

    public void a(NotificationManager notificationManager, String str, int i, Notification notification) {
        notificationManager.notify(str, i, notification);
    }

    public int a() {
        return 1;
    }

    gy() {
    }
}
