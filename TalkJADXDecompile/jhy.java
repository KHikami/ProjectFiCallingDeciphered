import android.os.SystemClock;

public class jhy {
    private volatile jhz a;

    public String a() {
        jhz jhz = this.a;
        if (jhz != null && SystemClock.elapsedRealtime() < jhz.b) {
            return jhz.a;
        }
        return null;
    }
}
