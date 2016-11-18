package p000;

import android.view.inputmethod.InputMethodManager;
import com.google.android.apps.hangouts.peoplelistv2.impl.EditParticipantsView;

public final class egd implements Runnable {
    final /* synthetic */ EditParticipantsView f11407a;

    public egd(EditParticipantsView editParticipantsView) {
        this.f11407a = editParticipantsView;
    }

    public void run() {
        this.f11407a.f6518e.clearFocus();
        this.f11407a.f6518e.requestFocus();
        this.f11407a.f6518e.setCursorVisible(true);
        ((InputMethodManager) this.f11407a.getContext().getSystemService("input_method")).showSoftInput(this.f11407a.f6518e, 1);
        this.f11407a.f6518e.sendAccessibilityEvent(4);
    }
}
