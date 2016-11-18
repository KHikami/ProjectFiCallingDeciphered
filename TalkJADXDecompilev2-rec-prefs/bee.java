package p000;

import android.content.Context;

final class bee implements bdm {
    private final Context f3141a;

    bee(Context context) {
        this.f3141a = context;
        ((fnc) jyn.m25426a(context, fnc.class)).mo2046a(new bed(context));
    }

    public int mo501a(int i, int i2) {
        jch a = ((jcf) jyn.m25426a(this.f3141a, jcf.class)).mo3456a(i);
        if (a.mo3433a("app_upgrade_version_code", 0) < i2) {
            return 0;
        }
        return a.mo3433a("app_upgrade_type", 0);
    }

    public long mo502a(int i) {
        return ((jcf) jyn.m25426a(this.f3141a, jcf.class)).mo3456a(i).mo3434a("app_upgrade_timestamp", 0);
    }

    public String mo503b(int i) {
        return ((jcf) jyn.m25426a(this.f3141a, jcf.class)).mo3456a(i).mo3435a("app_upgrade_url", "");
    }
}
