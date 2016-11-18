package defpackage;

import android.content.Context;

public class ayj {
    public ayo a(Context context, ayi ayi) {
        if ((context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0 ? 1 : null) != null) {
            return new ayk(context, ayi);
        }
        return new ayp();
    }
}
