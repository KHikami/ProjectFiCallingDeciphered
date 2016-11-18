package defpackage;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import org.chromium.base.MemoryPressureListener;

public final class ott implements ComponentCallbacks2 {
    public void onTrimMemory(int i) {
        MemoryPressureListener.a(i);
    }

    public void onLowMemory() {
        MemoryPressureListener.nativeOnMemoryPressure(2);
    }

    public void onConfigurationChanged(Configuration configuration) {
    }
}
