package defpackage;

import android.content.Context;
import android.os.Build.VERSION;
import java.util.List;

/* renamed from: eig */
final class eig implements ehz {
    private final Context a;

    eig(Context context) {
        this.a = context;
    }

    public boolean a(String str) {
        if (VERSION.SDK_INT < 23 || this.a.checkSelfPermission(str) == 0) {
            return true;
        }
        return false;
    }

    public boolean a(List<String> list) {
        for (String a : list) {
            if (!a(a)) {
                return false;
            }
        }
        return true;
    }
}
