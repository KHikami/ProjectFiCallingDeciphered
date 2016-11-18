package p000;

import android.text.style.ClickableSpan;
import android.view.View;
import com.google.android.apps.hangouts.fragments.InvitationFragment;

public final class ddg extends ClickableSpan {
    final /* synthetic */ InvitationFragment f9535a;

    public ddg(InvitationFragment invitationFragment) {
        this.f9535a = invitationFragment;
    }

    public void onClick(View view) {
        this.f9535a.mo495a();
    }
}
