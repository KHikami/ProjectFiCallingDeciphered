package defpackage;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.hangouts.phoneverification.impl.PhoneVerificationActivity;

/* renamed from: eqj */
public final class eqj implements eqa {
    public Intent a(Context context, int i, epw epw) {
        Intent intent = new Intent(context, PhoneVerificationActivity.class);
        intent.setAction("android.intent.action.VIEW");
        intent.putExtra("account_id", i);
        intent.putExtra("source_activity", epw);
        return intent;
    }
}
