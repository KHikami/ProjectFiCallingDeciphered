package p000;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.apps.hangouts.settings.AccountSettingsActivity;

public final class fvq extends jvw implements jxd {
    private final jxc f14111f = new jxc(this, this.c);

    protected void mo2092a(Bundle bundle) {
        super.mo2092a(bundle);
        this.b.m25444a(jxg.class, this.f14111f);
    }

    public void mo2091a() {
        this.f14111f.m25386a(new fvt());
        this.f14111f.m25386a(new jox().m24882a(true).m24880a(new Intent(this.a, AccountSettingsActivity.class)).m24881a(new jmd().m24685a("logged_in").m24687b("sms_only")).m24879a());
    }
}
