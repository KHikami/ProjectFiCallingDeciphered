package p000;

import android.os.Bundle;
import com.google.android.apps.hangouts.fragments.InvitationFragment;

public final class dda implements guk {
    final /* synthetic */ InvitationFragment f9528a;

    public dda(InvitationFragment invitationFragment) {
        this.f9528a = invitationFragment;
    }

    public void a_(Bundle bundle) {
        if (this.f9528a.getActivity() == null) {
            glk.m17970a("Babel", "People client connected but InvitationFragment is detached.", new Object[0]);
        }
    }

    public void mo1150a(int i) {
    }
}
