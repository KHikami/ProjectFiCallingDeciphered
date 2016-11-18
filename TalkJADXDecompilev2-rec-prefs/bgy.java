package p000;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.hangouts.callpromos.impl.DialerPromoActivity;

final class bgy implements bgs {
    bgy() {
    }

    public Intent mo549a(Context context) {
        int a = ((jca) jyn.m25426a(context, jca.class)).mo2317a();
        Intent intent = new Intent(context, DialerPromoActivity.class);
        intent.putExtra("account_id", a);
        return intent;
    }
}
