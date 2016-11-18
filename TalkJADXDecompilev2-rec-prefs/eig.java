package p000;

import android.content.Context;
import android.os.Build.VERSION;
import java.util.List;

final class eig implements ehz {
    private final Context f11596a;

    eig(Context context) {
        this.f11596a = context;
    }

    public boolean mo1882a(String str) {
        if (VERSION.SDK_INT < 23 || this.f11596a.checkSelfPermission(str) == 0) {
            return true;
        }
        return false;
    }

    public boolean mo1883a(List<String> list) {
        for (String a : list) {
            if (!mo1882a(a)) {
                return false;
            }
        }
        return true;
    }
}
