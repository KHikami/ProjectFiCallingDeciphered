package p000;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Build.VERSION;

public final class id {
    private static final ie f17588a;

    static {
        int i = VERSION.SDK_INT;
        if (i >= 15) {
            f17588a = new C0188if((byte) 0);
        } else if (i >= 11) {
            f17588a = new C0188if();
        } else {
            f17588a = new ie();
        }
    }

    public static Intent m21610a(ComponentName componentName) {
        return f17588a.mo3173a(componentName);
    }
}
