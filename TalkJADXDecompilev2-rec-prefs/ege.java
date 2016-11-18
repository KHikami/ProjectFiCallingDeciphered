package p000;

import android.text.Editable;
import android.text.TextWatcher;
import com.google.android.apps.hangouts.peoplelistv2.impl.EditParticipantsView;

public final class ege implements TextWatcher {
    final /* synthetic */ EditParticipantsView f11408a;

    public ege(EditParticipantsView editParticipantsView) {
        this.f11408a = editParticipantsView;
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void afterTextChanged(Editable editable) {
        this.f11408a.f6515b.m4866a(editable.toString());
    }
}
