package p000;

import android.content.Intent;
import android.os.Bundle;

public final class jot extends jvw implements jxd {
    private final jxc f20620f = new jxc(this, this.c);

    public static Bundle m24870a(Intent intent) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("LoginSettingsFragment.account_view_intent", intent.getParcelableExtra("LoginSettingsFragment.account_view_intent"));
        return bundle;
    }

    protected void mo2092a(Bundle bundle) {
        super.mo2092a(bundle);
        this.b.m25444a(jxg.class, this.f20620f);
    }

    public void mo2091a() {
        Intent intent = null;
        Bundle arguments = getArguments();
        if (arguments != null) {
            intent = (Intent) arguments.getParcelable("LoginSettingsFragment.account_view_intent");
        }
        this.f20620f.m25386a(new jox().m24880a(intent).m24879a());
    }
}
