import android.content.Context;
import android.content.Intent;
import com.google.android.apps.hangouts.notifications.NotificationService;

public abstract class fre {
    public abstract void a(Context context, Intent intent);

    public Intent b(Context context, Intent intent) {
        intent.putExtra("ds_processor", getClass().getName());
        intent.setClass(context, a());
        return intent;
    }

    public Class<? extends frd> a() {
        return NotificationService.class;
    }

    public fre(byte b) {
        this();
    }
}
