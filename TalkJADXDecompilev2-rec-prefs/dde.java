package p000;

import android.graphics.Bitmap;
import com.google.android.apps.hangouts.fragments.InvitationFragment;

public final class dde implements bnq {
    final /* synthetic */ InvitationFragment f9532a;

    dde(InvitationFragment invitationFragment) {
        this.f9532a = invitationFragment;
    }

    public void mo604a(gkt gkt, gjo gjo, boolean z, bnn bnn, boolean z2) {
        iil.m21872a("Expected null", (Object) gjo);
        if (z && gkt != null) {
            Bitmap d = gkt.m17897d();
            if (this.f9532a.f6275d != null && this.f9532a.f6275d.equals(bnn.m5506l())) {
                this.f9532a.f6279h.setImageBitmap(d);
            }
        }
    }
}
