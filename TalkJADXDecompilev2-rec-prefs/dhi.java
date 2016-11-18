package p000;

import android.view.View;
import android.view.View.OnLongClickListener;
import com.google.android.apps.hangouts.hangout.FocusedParticipantView;

public final class dhi implements OnLongClickListener {
    final /* synthetic */ FocusedParticipantView f9752a;

    public dhi(FocusedParticipantView focusedParticipantView) {
        this.f9752a = focusedParticipantView;
    }

    public boolean onLongClick(View view) {
        boolean z;
        FocusedParticipantView focusedParticipantView = this.f9752a;
        if (focusedParticipantView.f6317b) {
            z = false;
        } else {
            z = true;
        }
        focusedParticipantView.f6317b = z;
        return true;
    }
}
