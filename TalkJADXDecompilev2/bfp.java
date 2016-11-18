package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

final class bfp extends BroadcastReceiver {
    final /* synthetic */ bfj a;

    bfp(bfj bfj) {
        this.a = bfj;
    }

    public void onReceive(Context context, Intent intent) {
        this.a.g.dismiss();
        if (intent.getIntExtra("set_callerid_result", -1) != 0) {
            Toast.makeText(context, context.getString(ba.gC), 0).show();
        } else {
            this.a.e.a_(false);
        }
        ik.a(context).a(this.a.f);
    }
}
