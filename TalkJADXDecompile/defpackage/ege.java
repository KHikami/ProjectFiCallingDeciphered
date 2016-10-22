package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
import com.google.android.apps.hangouts.peoplelistv2.impl.EditParticipantsView;

/* renamed from: ege */
public final class ege implements TextWatcher {
    final /* synthetic */ EditParticipantsView a;

    public ege(EditParticipantsView editParticipantsView) {
        this.a = editParticipantsView;
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void afterTextChanged(Editable editable) {
        this.a.b.a(editable.toString());
    }
}
