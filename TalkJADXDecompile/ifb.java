import android.util.Log;
import java.util.Locale;

final class ifb implements iea {
    final /* synthetic */ ifa a;

    ifb(ifa ifa) {
        this.a = ifa;
    }

    public void a() {
    }

    public void a(int i) {
        Log.e("ClearcutLogger", String.format(Locale.US, "ClearcutLogger connection suspended: %d", new Object[]{Integer.valueOf(i)}));
    }
}
