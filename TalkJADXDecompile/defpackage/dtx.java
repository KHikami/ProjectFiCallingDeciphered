package defpackage;

import android.content.Context;

/* renamed from: dtx */
final class dtx implements dtu {
    dtx() {
    }

    public dye a(Context context, int i, boolean z, String str) {
        if (!dtv.b(str)) {
            return null;
        }
        dye dtv = new dtv(context);
        dtv.a(i, z, str);
        return dtv;
    }
}
