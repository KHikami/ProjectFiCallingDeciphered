package p000;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.google.android.apps.hangouts.hangout.IncomingRingActivity;

public final class djb implements OnClickListener {
    final /* synthetic */ IncomingRingActivity f9916a;

    djb(IncomingRingActivity incomingRingActivity) {
        this.f9916a = incomingRingActivity;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.f9916a.finish();
        this.f9916a.f6389n.m8642k();
    }
}
