import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.android.dialer.app.list.AllContactsFragment;

/* compiled from: PG */
public final class apu extends BroadcastReceiver {
    private /* synthetic */ AllContactsFragment a;

    public apu(AllContactsFragment allContactsFragment) {
        this.a = allContactsFragment;
    }

    public final void onReceive(Context context, Intent intent) {
        this.a.c_();
    }
}
