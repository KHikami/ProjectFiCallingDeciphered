package p000;

import android.view.View;
import android.view.View.OnLongClickListener;
import com.google.android.apps.hangouts.hangout.RemoteParticipantPopupMenu;

final class dki implements OnLongClickListener {
    final /* synthetic */ dkf f10020a;

    dki(dkf dkf) {
        this.f10020a = dkf;
    }

    public boolean onLongClick(View view) {
        this.f10020a.f9996e.m8657a(this.f10020a);
        dkf dkf = this.f10020a;
        if (!dkf.f9992a.m23242f()) {
            dkf.f9996e.m8669g();
            dkf.f10001j.setVisibility(0);
            RemoteParticipantPopupMenu remoteParticipantPopupMenu = dkf.f10001j;
            dkf.getContext();
            remoteParticipantPopupMenu.m8683a(dkf.f9994c, dkf.f9992a, dkf.f9993b.m11727s());
        }
        return true;
    }
}
