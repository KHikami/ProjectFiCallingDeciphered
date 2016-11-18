package p000;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnKeyListener;
import android.view.KeyEvent;

final class dsb implements OnKeyListener {
    final /* synthetic */ dry f10423a;

    dsb(dry dry) {
        this.f10423a = dry;
    }

    public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        if (i != 4 || keyEvent.getAction() != 1) {
            return false;
        }
        Activity activity = this.f10423a.getActivity();
        if (activity != null) {
            activity.finish();
        }
        this.f10423a.m7002a();
        return true;
    }
}
