package p000;

import android.os.Bundle;

public final class jnb {
    String f20521a;
    jmb f20522b;
    private boolean f20523c = true;
    private boolean f20524d = false;
    private boolean f20525e = true;
    private boolean f20526f = false;
    private boolean f20527g = true;

    public jnb m24745a(String str) {
        this.f20521a = str;
        return this;
    }

    public jnb m24747a(boolean z) {
        this.f20523c = z;
        return this;
    }

    public jnb m24748b(boolean z) {
        this.f20525e = false;
        return this;
    }

    public jnb m24746a(jmb jmb) {
        this.f20522b = jmb;
        return this;
    }

    public Bundle m24744a() {
        Bundle bundle = new Bundle();
        bundle.putString("dialog_title", this.f20521a);
        bundle.putBoolean("add_account", this.f20523c);
        bundle.putBoolean("add_account_button_shown", this.f20524d);
        bundle.putBoolean("auto_select_single_logged_out_account", this.f20525e);
        bundle.putBoolean("never_auto_select_single_account", this.f20526f);
        bundle.putBoolean("canceled_on_outside_touch", this.f20527g);
        bundle.putParcelable("account_filter", this.f20522b);
        return bundle;
    }
}
