import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;

public final class jko implements ComponentCallbacks2 {
    private final Context a;

    jko(Context context) {
        this.a = context;
    }

    public void onLowMemory() {
    }

    public void onTrimMemory(int i) {
        if (i > 5) {
            ((jkn) jyn.a(this.a, jkn.class)).k();
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
    }
}
