package p000;

import android.content.ComponentName;
import android.os.IBinder;

public class ajk {
    public static final int f1011c = 2131558883;
    public static final int f1012d = 2131558882;
    public static final int f1013e = 2131558879;
    public static final int f1014f = 2131558878;
    final String f1015a;
    final int f1016b;
    public final C0217l f1017g;
    public final C0055i f1018h;
    public final ComponentName f1019i;

    public ajk(C0217l c0217l, C0055i c0055i, ComponentName componentName) {
        this.f1017g = c0217l;
        this.f1018h = c0055i;
        this.f1019i = componentName;
    }

    public IBinder m2639a() {
        return this.f1018h.asBinder();
    }

    public ComponentName m2640b() {
        return this.f1019i;
    }
}
