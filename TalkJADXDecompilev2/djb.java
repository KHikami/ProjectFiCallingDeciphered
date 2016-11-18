package defpackage;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.google.android.apps.hangouts.hangout.IncomingRingActivity;

public final class djb implements OnClickListener {
    final /* synthetic */ IncomingRingActivity a;

    djb(IncomingRingActivity incomingRingActivity) {
        this.a = incomingRingActivity;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.a.finish();
        this.a.n.k();
    }
}
