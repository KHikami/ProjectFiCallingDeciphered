package defpackage;

import android.os.Bundle;
import com.google.android.apps.hangouts.fragments.InvitationFragment;

/* renamed from: dda */
public final class dda implements guk {
    final /* synthetic */ InvitationFragment a;

    public dda(InvitationFragment invitationFragment) {
        this.a = invitationFragment;
    }

    public void a_(Bundle bundle) {
        if (this.a.getActivity() == null) {
            glk.a("Babel", "People client connected but InvitationFragment is detached.", new Object[0]);
        }
    }

    public void a(int i) {
    }
}
