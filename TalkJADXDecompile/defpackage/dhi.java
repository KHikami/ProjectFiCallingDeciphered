package defpackage;

import android.view.View;
import android.view.View.OnLongClickListener;
import com.google.android.apps.hangouts.hangout.FocusedParticipantView;

/* renamed from: dhi */
public final class dhi implements OnLongClickListener {
    final /* synthetic */ FocusedParticipantView a;

    public dhi(FocusedParticipantView focusedParticipantView) {
        this.a = focusedParticipantView;
    }

    public boolean onLongClick(View view) {
        boolean z;
        FocusedParticipantView focusedParticipantView = this.a;
        if (focusedParticipantView.b) {
            z = false;
        } else {
            z = true;
        }
        focusedParticipantView.b = z;
        return true;
    }
}
