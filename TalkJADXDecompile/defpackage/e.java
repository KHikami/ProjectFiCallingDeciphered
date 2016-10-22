package defpackage;

import android.graphics.Bitmap;
import android.os.Build.VERSION;
import android.os.Bundle;
import com.google.android.apps.hangouts.hangout.StressMode;

/* renamed from: e */
public class e implements fz {
    private static final String a;
    private Bitmap b;
    private StressMode c;
    private int d;

    static {
        a = e.class.getSimpleName();
    }

    public e() {
        this.d = 0;
    }

    public e a(int i) {
        this.d = i;
        return this;
    }

    public e a(StressMode stressMode) {
        this.c = stressMode;
        return this;
    }

    public fx a(fx fxVar) {
        if (VERSION.SDK_INT >= 21) {
            Bundle bundle = new Bundle();
            bundle.putParcelable("large_icon", this.b);
            bundle.putInt("app_color", this.d);
            bundle.putBundle("car_conversation", StressMode.a(this.c));
            fxVar.a().putBundle("android.car.EXTENSIONS", bundle);
        }
        return fxVar;
    }
}
