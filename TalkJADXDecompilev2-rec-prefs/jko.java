package p000;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;

public final class jko implements ComponentCallbacks2 {
    private final Context f20352a;

    jko(Context context) {
        this.f20352a = context;
    }

    public void onLowMemory() {
    }

    public void onTrimMemory(int i) {
        if (i > 5) {
            ((jkn) jyn.m25426a(this.f20352a, jkn.class)).mo3555k();
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
    }
}
