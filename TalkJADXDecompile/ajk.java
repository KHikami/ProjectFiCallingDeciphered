import android.content.ComponentName;
import android.os.IBinder;

public class ajk {
    public static final int c = 2131558883;
    public static final int d = 2131558882;
    public static final int e = 2131558879;
    public static final int f = 2131558878;
    final String a;
    final int b;
    public final l g;
    public final i h;
    public final ComponentName i;

    public ajk(l lVar, i iVar, ComponentName componentName) {
        this.g = lVar;
        this.h = iVar;
        this.i = componentName;
    }

    public IBinder a() {
        return this.h.asBinder();
    }

    public ComponentName b() {
        return this.i;
    }
}
