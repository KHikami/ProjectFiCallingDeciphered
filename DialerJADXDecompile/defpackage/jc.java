package defpackage;

import android.os.Build.VERSION;
import android.view.KeyEvent;

/* compiled from: PG */
/* renamed from: jc */
public final class jc {
    public static final je a;

    static {
        if (VERSION.SDK_INT >= 11) {
            a = new jd();
        } else {
            a = new je();
        }
    }

    public static boolean a(KeyEvent keyEvent, int i) {
        return a.a(keyEvent.getMetaState(), 1);
    }

    public static boolean a(KeyEvent keyEvent) {
        return a.b(keyEvent.getMetaState());
    }
}
