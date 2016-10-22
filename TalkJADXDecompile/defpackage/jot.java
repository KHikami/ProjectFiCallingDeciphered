package defpackage;

import android.content.Intent;
import android.os.Bundle;

/* renamed from: jot */
public final class jot extends jvw implements jxd {
    private final jxc f;

    public jot() {
        this.f = new jxc(this, this.c);
    }

    public static Bundle a(Intent intent) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("LoginSettingsFragment.account_view_intent", intent.getParcelableExtra("LoginSettingsFragment.account_view_intent"));
        return bundle;
    }

    protected void a(Bundle bundle) {
        super.a(bundle);
        this.b.a(jxg.class, this.f);
    }

    public void a() {
        Intent intent = null;
        Bundle arguments = getArguments();
        if (arguments != null) {
            intent = (Intent) arguments.getParcelable("LoginSettingsFragment.account_view_intent");
        }
        this.f.a(new jox().a(intent).a());
    }
}
