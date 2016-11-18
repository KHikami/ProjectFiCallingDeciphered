package p000;

import android.content.Context;
import android.os.Build.VERSION;

final class cvd implements cva {
    cvd() {
    }

    public ism mo1437a(Context context, boolean z) {
        ism ism = new ism(context, z);
        ism.mo3396a(false);
        ism.c_(false);
        return ism;
    }

    public iry mo1436a(Context context) {
        iry iro;
        if (!icb.m21567a(context.getContentResolver(), "babel_hangout_enable_camera2", VERSION.SDK_INT >= 23 ? irq.m23087a(context) : false) || VERSION.SDK_INT < 21) {
            iro = new iro(context);
        } else {
            iro = new irq(context, false);
        }
        iro.m23063b(true);
        iro.m23059a(false);
        return iro;
    }
}
