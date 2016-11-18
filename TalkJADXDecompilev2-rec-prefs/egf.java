package p000;

import android.text.TextUtils;
import com.google.android.apps.hangouts.peoplelistv2.impl.EditParticipantsView;

public final class egf extends bcm {
    final /* synthetic */ EditParticipantsView f11409a;

    public egf(EditParticipantsView editParticipantsView) {
        this.f11409a = editParticipantsView;
    }

    public void mo1868a() {
        if (this.f11409a.f6515b.m4877f().m4857a()) {
            this.f11409a.f6519f = null;
            this.f11409a.m8766a();
            gwb.m1863a(this.f11409a.f6516c.f6533d);
        }
    }

    public void mo1870a(String str) {
        if (!TextUtils.equals(str, this.f11409a.f6518e.getText().toString())) {
            this.f11409a.f6518e.setText(str);
        }
    }
}
