package defpackage;

import android.content.Intent;
import android.os.Bundle;

public final class jox {
    private Intent a;
    private boolean b;
    private jmb c;

    public jox a(Intent intent) {
        this.a = intent;
        return this;
    }

    public jox a(boolean z) {
        this.b = true;
        return this;
    }

    public jox a(jmb jmb) {
        this.c = jmb;
        return this;
    }

    public dr a() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("allow_no_accounts", this.b);
        bundle.putParcelable("account_filter", this.c);
        bundle.putParcelable("account_intent", this.a);
        dr jou = new jou();
        jou.setArguments(bundle);
        return jou;
    }
}
