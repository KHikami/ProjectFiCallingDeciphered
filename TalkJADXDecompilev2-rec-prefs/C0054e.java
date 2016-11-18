package p000;

import android.graphics.Bitmap;
import android.os.Build.VERSION;
import android.os.Bundle;
import com.google.android.apps.hangouts.hangout.StressMode;

public class C0054e implements fz {
    private static final String f10982a = C0054e.class.getSimpleName();
    private Bitmap f10983b;
    private StressMode f10984c;
    private int f10985d = 0;

    public C0054e m13263a(int i) {
        this.f10985d = i;
        return this;
    }

    public C0054e m13264a(StressMode stressMode) {
        this.f10984c = stressMode;
        return this;
    }

    public fx mo1800a(fx fxVar) {
        if (VERSION.SDK_INT >= 21) {
            Bundle bundle = new Bundle();
            bundle.putParcelable("large_icon", this.f10983b);
            bundle.putInt("app_color", this.f10985d);
            bundle.putBundle("car_conversation", StressMode.m8688a(this.f10984c));
            fxVar.m16416a().putBundle("android.car.EXTENSIONS", bundle);
        }
        return fxVar;
    }
}
