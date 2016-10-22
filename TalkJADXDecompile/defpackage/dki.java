package defpackage;

import android.view.View;
import android.view.View.OnLongClickListener;
import com.google.android.apps.hangouts.hangout.RemoteParticipantPopupMenu;

/* renamed from: dki */
final class dki implements OnLongClickListener {
    final /* synthetic */ dkf a;

    dki(dkf dkf) {
        this.a = dkf;
    }

    public boolean onLongClick(View view) {
        this.a.e.a(this.a);
        dkf dkf = this.a;
        if (!dkf.a.f()) {
            dkf.e.g();
            dkf.j.setVisibility(0);
            RemoteParticipantPopupMenu remoteParticipantPopupMenu = dkf.j;
            dkf.getContext();
            remoteParticipantPopupMenu.a(dkf.c, dkf.a, dkf.b.s());
        }
        return true;
    }
}
