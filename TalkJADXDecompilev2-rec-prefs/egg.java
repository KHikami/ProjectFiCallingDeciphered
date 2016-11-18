package p000;

import android.view.View;
import android.view.View.OnClickListener;
import android.view.inputmethod.InputMethodManager;
import com.google.android.apps.hangouts.peoplelistv2.impl.EditParticipantsView;

public final class egg implements OnClickListener {
    final /* synthetic */ EditParticipantsView f11410a;

    public egg(EditParticipantsView editParticipantsView) {
        this.f11410a = editParticipantsView;
    }

    public void onClick(View view) {
        int indexOfChild = this.f11410a.f6517d.indexOfChild(view);
        Object tag = view.getTag();
        if (indexOfChild == -1) {
            this.f11410a.f6519f = null;
            this.f11410a.m8771b();
        } else if (tag != null) {
            this.f11410a.f6519f = view;
        }
        this.f11410a.m8766a();
        ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        if (this.f11410a.f6519f != null) {
            this.f11410a.f6516c.requestChildFocus(this.f11410a.f6519f, this.f11410a.f6519f);
        }
    }
}
