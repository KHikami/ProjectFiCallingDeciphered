package defpackage;

import android.app.ActivityOptions;
import android.os.Bundle;

/* renamed from: da */
final class da {
    private final ActivityOptions a;

    da(ActivityOptions activityOptions) {
        this.a = activityOptions;
    }

    public Bundle a() {
        return this.a.toBundle();
    }
}
