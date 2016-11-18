package p000;

import android.app.Activity;
import android.content.Intent;

final class jyh implements kbb, kcq {
    private final Activity f21277a;

    public jyh(Activity activity, kbu kbu) {
        this.f21277a = activity;
        kbu.m25514a((kcq) this);
    }

    static boolean m25413a(Activity activity) {
        if (activity.getCallingActivity() != null || activity.getIntent().getBooleanExtra("task_launched_for_result", false)) {
            return true;
        }
        return false;
    }

    public void mo3628a(Intent intent) {
        if (jyh.m25413a(this.f21277a)) {
            intent.putExtra("task_launched_for_result", true);
        }
    }
}
