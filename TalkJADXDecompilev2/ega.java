package defpackage;

import android.view.View;
import android.view.View.OnFocusChangeListener;
import android.view.inputmethod.InputMethodManager;
import com.google.android.apps.hangouts.peoplelistv2.impl.EditParticipantsView;

public final class ega implements OnFocusChangeListener {
    final /* synthetic */ EditParticipantsView a;

    public ega(EditParticipantsView editParticipantsView) {
        this.a = editParticipantsView;
    }

    public void onFocusChange(View view, boolean z) {
        if (!z) {
            EditParticipantsView editParticipantsView = this.a;
            ((InputMethodManager) editParticipantsView.getContext().getSystemService("input_method")).hideSoftInputFromWindow(editParticipantsView.getWindowToken(), 0);
        }
    }
}
