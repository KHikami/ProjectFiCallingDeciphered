package defpackage;

import android.app.Activity;
import android.content.Intent;

final class jyh implements kbb, kcq {
    private final Activity a;

    public jyh(Activity activity, kbu kbu) {
        this.a = activity;
        kbu.a((kcq) this);
    }

    static boolean a(Activity activity) {
        if (activity.getCallingActivity() != null || activity.getIntent().getBooleanExtra("task_launched_for_result", false)) {
            return true;
        }
        return false;
    }

    public void a(Intent intent) {
        if (jyh.a(this.a)) {
            intent.putExtra("task_launched_for_result", true);
        }
    }
}
