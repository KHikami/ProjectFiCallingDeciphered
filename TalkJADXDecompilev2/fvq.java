package defpackage;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.apps.hangouts.settings.AccountSettingsActivity;

public final class fvq extends jvw implements jxd {
    private final jxc f = new jxc(this, this.c);

    protected void a(Bundle bundle) {
        super.a(bundle);
        this.b.a(jxg.class, this.f);
    }

    public void a() {
        this.f.a(new fvt());
        this.f.a(new jox().a(true).a(new Intent(this.a, AccountSettingsActivity.class)).a(new jmd().a("logged_in").b("sms_only")).a());
    }
}
