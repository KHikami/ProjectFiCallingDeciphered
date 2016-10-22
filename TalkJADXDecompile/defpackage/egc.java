package defpackage;

import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.apps.hangouts.peoplelistv2.impl.EditParticipantsView;

/* renamed from: egc */
public final class egc implements OnClickListener {
    final /* synthetic */ OnClickListener a;
    final /* synthetic */ EditParticipantsView b;

    public egc(EditParticipantsView editParticipantsView, OnClickListener onClickListener) {
        this.b = editParticipantsView;
        this.a = onClickListener;
    }

    public void onClick(View view) {
        if (this.b.f == view || gld.a(this.b.getContext())) {
            this.a.onClick(view);
        } else {
            this.b.h.onClick(view);
        }
    }
}
