import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.apps.hangouts.peoplelistv2.impl.EditParticipantsView;

public final class egb implements OnClickListener {
    final /* synthetic */ bcn a;
    final /* synthetic */ EditParticipantsView b;

    public egb(EditParticipantsView editParticipantsView, bcn bcn) {
        this.b = editParticipantsView;
        this.a = bcn;
    }

    public void onClick(View view) {
        this.b.b.b(this.a);
        this.b.a();
    }
}
