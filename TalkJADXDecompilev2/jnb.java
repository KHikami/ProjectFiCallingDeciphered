package defpackage;

import android.os.Bundle;

public final class jnb {
    String a;
    jmb b;
    private boolean c = true;
    private boolean d = false;
    private boolean e = true;
    private boolean f = false;
    private boolean g = true;

    public jnb a(String str) {
        this.a = str;
        return this;
    }

    public jnb a(boolean z) {
        this.c = z;
        return this;
    }

    public jnb b(boolean z) {
        this.e = false;
        return this;
    }

    public jnb a(jmb jmb) {
        this.b = jmb;
        return this;
    }

    public Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putString("dialog_title", this.a);
        bundle.putBoolean("add_account", this.c);
        bundle.putBoolean("add_account_button_shown", this.d);
        bundle.putBoolean("auto_select_single_logged_out_account", this.e);
        bundle.putBoolean("never_auto_select_single_account", this.f);
        bundle.putBoolean("canceled_on_outside_touch", this.g);
        bundle.putParcelable("account_filter", this.b);
        return bundle;
    }
}
