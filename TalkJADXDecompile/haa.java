import android.app.Activity;
import android.content.Intent;
import com.google.android.gms.common.api.Status;

public final class haa implements hal {
    static final Status a;

    static {
        a = new Status(13);
    }

    public gum<Status> a(gui gui, Activity activity, Intent intent) {
        return gui.a(new hab(this, gui, intent, gwb.al() ? gwb.e(activity) : null, activity));
    }
}
