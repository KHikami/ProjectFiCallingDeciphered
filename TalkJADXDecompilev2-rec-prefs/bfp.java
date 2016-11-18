package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

final class bfp extends BroadcastReceiver {
    final /* synthetic */ bfj f3221a;

    bfp(bfj bfj) {
        this.f3221a = bfj;
    }

    public void onReceive(Context context, Intent intent) {
        this.f3221a.f3208g.dismiss();
        if (intent.getIntExtra("set_callerid_result", -1) != 0) {
            Toast.makeText(context, context.getString(ba.gC), 0).show();
        } else {
            this.f3221a.f3206e.a_(false);
        }
        ik.m22097a(context).m22099a(this.f3221a.f3207f);
    }
}
