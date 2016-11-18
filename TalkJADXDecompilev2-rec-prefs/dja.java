package p000;

import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.apps.hangouts.hangout.IncomingRingActivity;

public final class dja implements OnClickListener {
    final /* synthetic */ IncomingRingActivity f9915a;

    public dja(IncomingRingActivity incomingRingActivity) {
        this.f9915a = incomingRingActivity;
    }

    public void onClick(View view) {
        if (!this.f9915a.isFinishing()) {
            this.f9915a.f6389n.m8643l();
        }
    }
}
