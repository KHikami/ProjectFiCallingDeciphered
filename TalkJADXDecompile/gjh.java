import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

final class gjh extends BroadcastReceiver {
    final /* synthetic */ gjg a;

    gjh(gjg gjg) {
        this.a = gjg;
    }

    public void onReceive(Context context, Intent intent) {
        this.a.a = true;
    }
}
