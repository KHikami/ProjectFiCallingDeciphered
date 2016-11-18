package defpackage;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.apps.hangouts.settings.CustomizeInvitesActivity;
import com.google.android.libraries.social.settings.PreferenceCategory;

public final class fut extends jzn implements jwg {
    private jca a;

    public fut() {
        jwf jwf = new jwf(this, this.lifecycle);
    }

    protected void onAttachBinder(Bundle bundle) {
        super.onAttachBinder(bundle);
        this.a = (jca) this.binder.a(jca.class);
    }

    public void a() {
        bko e = fde.e(this.a.a());
        jwo jwo = new jwo(this.context);
        if (gwb.a(e, bnc.CHANGE_INVITE_SETTINGS)) {
            PreferenceCategory a = jwo.a(bc.fz);
            Intent intent = new Intent(this.context, CustomizeInvitesActivity.class);
            intent.putExtra("account_id", this.a.a());
            jwo.a(a, bc.aA, intent);
        }
    }
}
