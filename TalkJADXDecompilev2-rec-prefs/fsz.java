package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import java.util.List;

public abstract class fsz<T extends BroadcastReceiver> extends bcq {
    public final Context f13951a;
    public final T f13952b;

    protected abstract List<IntentFilter> mo2087c();

    protected fsz(Context context, T t) {
        this.f13951a = context;
        this.f13952b = t;
    }

    public void k_() {
        for (IntentFilter registerReceiver : mo2087c()) {
            this.f13951a.registerReceiver(this.f13952b, registerReceiver);
        }
    }

    public void l_() {
        this.f13951a.unregisterReceiver(this.f13952b);
    }
}
