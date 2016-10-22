package defpackage;

import android.view.inputmethod.InputMethodManager;
import com.google.android.apps.hangouts.peoplelistv2.impl.EditParticipantsView;

/* renamed from: egd */
public final class egd implements Runnable {
    final /* synthetic */ EditParticipantsView a;

    public egd(EditParticipantsView editParticipantsView) {
        this.a = editParticipantsView;
    }

    public void run() {
        this.a.e.clearFocus();
        this.a.e.requestFocus();
        this.a.e.setCursorVisible(true);
        ((InputMethodManager) this.a.getContext().getSystemService("input_method")).showSoftInput(this.a.e, 1);
        this.a.e.sendAccessibilityEvent(4);
    }
}
