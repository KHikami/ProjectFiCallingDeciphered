package defpackage;

import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.apps.hangouts.hangout.IncomingRingActivity;

/* renamed from: dja */
public final class dja implements OnClickListener {
    final /* synthetic */ IncomingRingActivity a;

    public dja(IncomingRingActivity incomingRingActivity) {
        this.a = incomingRingActivity;
    }

    public void onClick(View view) {
        if (!this.a.isFinishing()) {
            this.a.n.l();
        }
    }
}
