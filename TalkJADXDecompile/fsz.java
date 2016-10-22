import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import java.util.List;

public abstract class fsz<T extends BroadcastReceiver> extends bcq {
    public final Context a;
    public final T b;

    protected abstract List<IntentFilter> c();

    protected fsz(Context context, T t) {
        this.a = context;
        this.b = t;
    }

    public void k_() {
        for (IntentFilter registerReceiver : c()) {
            this.a.registerReceiver(this.b, registerReceiver);
        }
    }

    public void l_() {
        this.a.unregisterReceiver(this.b);
    }
}
