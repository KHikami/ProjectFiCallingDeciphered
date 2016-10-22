package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* renamed from: bil */
public final class bil {
    public final boolean a;
    public final String b;
    public final String c;
    public final int d;

    bil(String str, Bundle bundle) {
        if (bundle.containsKey("no_response") || bundle.isEmpty()) {
            this.d = 3;
        } else if (bundle.containsKey("invalid_number")) {
            this.d = 2;
        } else if (bundle.containsKey("request_timeout")) {
            this.d = 1;
        } else {
            this.d = 0;
        }
        this.a = bundle.getBoolean("is_free");
        bundle.getInt("fmf_promo");
        bundle.getInt("initial_free_display_duration_ms");
        bundle.getInt("rate_ttl_ms");
        bundle.getBoolean("does_rate_expire");
        this.b = bundle.getString("rate_display");
        this.c = bundle.getString("country_display");
    }
}
