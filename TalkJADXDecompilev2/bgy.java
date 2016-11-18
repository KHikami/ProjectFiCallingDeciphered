package defpackage;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.hangouts.callpromos.impl.DialerPromoActivity;

final class bgy implements bgs {
    bgy() {
    }

    public Intent a(Context context) {
        int a = ((jca) jyn.a(context, jca.class)).a();
        Intent intent = new Intent(context, DialerPromoActivity.class);
        intent.putExtra("account_id", a);
        return intent;
    }
}
