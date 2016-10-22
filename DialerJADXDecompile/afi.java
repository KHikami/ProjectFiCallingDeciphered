import android.os.SystemClock;
import java.util.Map;

/* compiled from: PG */
final class afi {
    Map a;
    long b;

    afi() {
    }

    public final void a(Map map) {
        this.a = map;
        this.b = SystemClock.elapsedRealtime();
    }
}
