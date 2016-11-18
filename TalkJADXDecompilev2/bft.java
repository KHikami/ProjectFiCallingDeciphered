package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

final class bft extends BroadcastReceiver {
    final /* synthetic */ bfr a;

    bft(bfr bfr) {
        this.a = bfr;
    }

    public void onReceive(Context context, Intent intent) {
        this.a.e.setVisibility(8);
        if (intent.getIntExtra("set_callerid_result", -1) == 0) {
            this.a.i.a(2256);
            this.a.f.setText(context.getString(ba.gQ));
            this.a.g.setText(context.getString(ba.gO, new Object[]{glq.h(context, this.a.d)}));
            this.a.b.setVisibility(8);
            this.a.a.setText(context.getString(ba.gL));
            this.a.a.setOnClickListener(new bfu(this));
            this.a.f.sendAccessibilityEvent(32);
            return;
        }
        Toast.makeText(context, context.getString(ba.gK), 0).show();
        this.a.b.setText(context.getString(ba.gM));
        this.a.a.setText(context.getString(ba.gI));
    }
}
