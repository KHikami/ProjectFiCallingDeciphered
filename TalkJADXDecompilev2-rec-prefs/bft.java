package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

final class bft extends BroadcastReceiver {
    final /* synthetic */ bfr f3233a;

    bft(bfr bfr) {
        this.f3233a = bfr;
    }

    public void onReceive(Context context, Intent intent) {
        this.f3233a.f3227e.setVisibility(8);
        if (intent.getIntExtra("set_callerid_result", -1) == 0) {
            this.f3233a.f3231i.m5185a(2256);
            this.f3233a.f3228f.setText(context.getString(ba.gQ));
            this.f3233a.f3229g.setText(context.getString(ba.gO, new Object[]{glq.m18033h(context, this.f3233a.f3226d)}));
            this.f3233a.f3224b.setVisibility(8);
            this.f3233a.f3223a.setText(context.getString(ba.gL));
            this.f3233a.f3223a.setOnClickListener(new bfu(this));
            this.f3233a.f3228f.sendAccessibilityEvent(32);
            return;
        }
        Toast.makeText(context, context.getString(ba.gK), 0).show();
        this.f3233a.f3224b.setText(context.getString(ba.gM));
        this.f3233a.f3223a.setText(context.getString(ba.gI));
    }
}
