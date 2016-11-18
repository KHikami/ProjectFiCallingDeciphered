package defpackage;

import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.apps.hangouts.hangout.FocusedParticipantView;

public final class dhh implements OnClickListener {
    final /* synthetic */ FocusedParticipantView a;

    public dhh(FocusedParticipantView focusedParticipantView) {
        this.a = focusedParticipantView;
    }

    public void onClick(View view) {
        this.a.a.l();
        gld.a(this.a, null, this.a.a.b(this.a.getContext()));
    }
}
