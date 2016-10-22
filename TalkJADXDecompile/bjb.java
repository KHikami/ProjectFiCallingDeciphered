import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

final class bjb extends BroadcastReceiver {
    final /* synthetic */ biz a;

    bjb(biz biz) {
        this.a = biz;
    }

    public void onReceive(Context context, Intent intent) {
        if (intent.getAction().equals("com.google.gservices.intent.action.GSERVICES_CHANGED")) {
            new bjc(this).execute(new Void[0]);
        }
    }
}
