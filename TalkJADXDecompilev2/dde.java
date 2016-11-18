package defpackage;

import android.graphics.Bitmap;
import com.google.android.apps.hangouts.fragments.InvitationFragment;

public final class dde implements bnq {
    final /* synthetic */ InvitationFragment a;

    dde(InvitationFragment invitationFragment) {
        this.a = invitationFragment;
    }

    public void a(gkt gkt, gjo gjo, boolean z, bnn bnn, boolean z2) {
        iil.a("Expected null", (Object) gjo);
        if (z && gkt != null) {
            Bitmap d = gkt.d();
            if (this.a.d != null && this.a.d.equals(bnn.l())) {
                this.a.h.setImageBitmap(d);
            }
        }
    }
}
