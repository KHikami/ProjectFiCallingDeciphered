import android.text.TextUtils;
import com.google.android.apps.hangouts.peoplelistv2.impl.EditParticipantsView;

public final class egf extends bcm {
    final /* synthetic */ EditParticipantsView a;

    public egf(EditParticipantsView editParticipantsView) {
        this.a = editParticipantsView;
    }

    public void a() {
        if (this.a.b.f().a()) {
            this.a.f = null;
            this.a.a();
            gwb.a(this.a.c.d);
        }
    }

    public void a(String str) {
        if (!TextUtils.equals(str, this.a.e.getText().toString())) {
            this.a.e.setText(str);
        }
    }
}
