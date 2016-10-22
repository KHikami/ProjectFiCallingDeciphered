import android.app.Application.ActivityLifecycleCallbacks;
import android.content.Context;

final class bcw {
    private bcy a;

    bcw() {
    }

    private bcy d(Context context) {
        if (this.a == null) {
            this.a = new bcy(context);
        }
        return this.a;
    }

    bcr a(Context context) {
        return d(context);
    }

    ActivityLifecycleCallbacks[] b(Context context) {
        return new ActivityLifecycleCallbacks[]{d(context)};
    }

    bcp[] c(Context context) {
        return new bcp[]{d(context)};
    }
}
