package p000;

import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.apps.hangouts.peoplelistv2.impl.EditParticipantsView;

public final class egb implements OnClickListener {
    final /* synthetic */ bcn f11403a;
    final /* synthetic */ EditParticipantsView f11404b;

    public egb(EditParticipantsView editParticipantsView, bcn bcn) {
        this.f11404b = editParticipantsView;
        this.f11403a = bcn;
    }

    public void onClick(View view) {
        this.f11404b.f6515b.m4868b(this.f11403a);
        this.f11404b.m8766a();
    }
}
