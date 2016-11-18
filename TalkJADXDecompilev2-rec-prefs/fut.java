package p000;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.apps.hangouts.settings.CustomizeInvitesActivity;
import com.google.android.libraries.social.settings.PreferenceCategory;

public final class fut extends jzn implements jwg {
    private jca f14049a;

    public fut() {
        jwf jwf = new jwf(this, this.lifecycle);
    }

    protected void onAttachBinder(Bundle bundle) {
        super.onAttachBinder(bundle);
        this.f14049a = (jca) this.binder.m25443a(jca.class);
    }

    public void mo495a() {
        bko e = fde.m15018e(this.f14049a.mo2317a());
        jwo jwo = new jwo(this.context);
        if (gwb.m1923a(e, bnc.CHANGE_INVITE_SETTINGS)) {
            PreferenceCategory a = jwo.m25341a(bc.fz);
            Intent intent = new Intent(this.context, CustomizeInvitesActivity.class);
            intent.putExtra("account_id", this.f14049a.mo2317a());
            jwo.m25345a(a, bc.aA, intent);
        }
    }
}
