package p000;

import android.app.Application.ActivityLifecycleCallbacks;
import android.content.Context;

final class bcw {
    private bcy f3056a;

    bcw() {
    }

    private bcy m4921d(Context context) {
        if (this.f3056a == null) {
            this.f3056a = new bcy(context);
        }
        return this.f3056a;
    }

    bcr m4922a(Context context) {
        return m4921d(context);
    }

    ActivityLifecycleCallbacks[] m4923b(Context context) {
        return new ActivityLifecycleCallbacks[]{m4921d(context)};
    }

    bcp[] m4924c(Context context) {
        return new bcp[]{m4921d(context)};
    }
}
