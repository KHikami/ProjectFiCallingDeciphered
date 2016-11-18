package p000;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.hangouts.notifications.NotificationService;

public abstract class fre {
    public abstract void mo1823a(Context context, Intent intent);

    public Intent m13394b(Context context, Intent intent) {
        intent.putExtra("ds_processor", getClass().getName());
        intent.setClass(context, mo1822a());
        return intent;
    }

    public Class<? extends frd> mo1822a() {
        return NotificationService.class;
    }

    public fre(byte b) {
        this();
    }
}
