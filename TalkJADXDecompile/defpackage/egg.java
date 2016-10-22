package defpackage;

import android.view.View;
import android.view.View.OnClickListener;
import android.view.inputmethod.InputMethodManager;
import com.google.android.apps.hangouts.peoplelistv2.impl.EditParticipantsView;

/* renamed from: egg */
public final class egg implements OnClickListener {
    final /* synthetic */ EditParticipantsView a;

    public egg(EditParticipantsView editParticipantsView) {
        this.a = editParticipantsView;
    }

    public void onClick(View view) {
        int indexOfChild = this.a.d.indexOfChild(view);
        Object tag = view.getTag();
        if (indexOfChild == -1) {
            this.a.f = null;
            this.a.b();
        } else if (tag != null) {
            this.a.f = view;
        }
        this.a.a();
        ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        if (this.a.f != null) {
            this.a.c.requestChildFocus(this.a.f, this.a.f);
        }
    }
}
