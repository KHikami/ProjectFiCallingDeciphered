package defpackage;

import android.content.Context;
import android.os.Build.VERSION;

final class cvd implements cva {
    cvd() {
    }

    public ism a(Context context, boolean z) {
        ism ism = new ism(context, z);
        ism.a(false);
        ism.c_(false);
        return ism;
    }

    public iry a(Context context) {
        iry iro;
        if (!icb.a(context.getContentResolver(), "babel_hangout_enable_camera2", VERSION.SDK_INT >= 23 ? irq.a(context) : false) || VERSION.SDK_INT < 21) {
            iro = new iro(context);
        } else {
            iro = new irq(context, false);
        }
        iro.b(true);
        iro.a(false);
        return iro;
    }
}
