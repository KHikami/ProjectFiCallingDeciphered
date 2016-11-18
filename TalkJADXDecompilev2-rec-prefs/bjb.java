package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

final class bjb extends BroadcastReceiver {
    final /* synthetic */ biz f3470a;

    bjb(biz biz) {
        this.f3470a = biz;
    }

    public void onReceive(Context context, Intent intent) {
        if (intent.getAction().equals("com.google.gservices.intent.action.GSERVICES_CHANGED")) {
            new bjc(this).execute(new Void[0]);
        }
    }
}
