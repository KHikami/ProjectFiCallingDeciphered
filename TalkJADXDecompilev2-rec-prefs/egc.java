package p000;

import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.apps.hangouts.peoplelistv2.impl.EditParticipantsView;

public final class egc implements OnClickListener {
    final /* synthetic */ OnClickListener f11405a;
    final /* synthetic */ EditParticipantsView f11406b;

    public egc(EditParticipantsView editParticipantsView, OnClickListener onClickListener) {
        this.f11406b = editParticipantsView;
        this.f11405a = onClickListener;
    }

    public void onClick(View view) {
        if (this.f11406b.f6519f == view || gld.m17937a(this.f11406b.getContext())) {
            this.f11405a.onClick(view);
        } else {
            this.f11406b.f6521h.onClick(view);
        }
    }
}
