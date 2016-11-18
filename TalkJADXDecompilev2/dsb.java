package defpackage;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnKeyListener;
import android.view.KeyEvent;

final class dsb implements OnKeyListener {
    final /* synthetic */ dry a;

    dsb(dry dry) {
        this.a = dry;
    }

    public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        if (i != 4 || keyEvent.getAction() != 1) {
            return false;
        }
        Activity activity = this.a.getActivity();
        if (activity != null) {
            activity.finish();
        }
        this.a.a();
        return true;
    }
}
