import android.content.Intent;
import android.util.Log;

public class ihh {
    public final /* synthetic */ kdb a;

    public void a(int i, Intent intent) {
        Log.e("SslGuard", "Failed to install security updates: error=" + i);
        if (intent != null) {
            this.a.b.a(i, kdd.a.b);
        }
    }

    public ihh(kdb kdb) {
        this.a = kdb;
    }
}
