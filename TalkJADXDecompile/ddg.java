import android.text.style.ClickableSpan;
import android.view.View;
import com.google.android.apps.hangouts.fragments.InvitationFragment;

public final class ddg extends ClickableSpan {
    final /* synthetic */ InvitationFragment a;

    public ddg(InvitationFragment invitationFragment) {
        this.a = invitationFragment;
    }

    public void onClick(View view) {
        this.a.a();
    }
}
