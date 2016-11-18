package p000;

import android.content.Intent;
import android.os.Bundle;

public final class jox {
    private Intent f20631a;
    private boolean f20632b;
    private jmb f20633c;

    public jox m24880a(Intent intent) {
        this.f20631a = intent;
        return this;
    }

    public jox m24882a(boolean z) {
        this.f20632b = true;
        return this;
    }

    public jox m24881a(jmb jmb) {
        this.f20633c = jmb;
        return this;
    }

    public dr m24879a() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("allow_no_accounts", this.f20632b);
        bundle.putParcelable("account_filter", this.f20633c);
        bundle.putParcelable("account_intent", this.f20631a);
        dr jou = new jou();
        jou.setArguments(bundle);
        return jou;
    }
}
