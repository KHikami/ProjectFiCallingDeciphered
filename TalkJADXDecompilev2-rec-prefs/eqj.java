package p000;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.hangouts.phoneverification.impl.PhoneVerificationActivity;

public final class eqj implements eqa {
    public Intent mo1930a(Context context, int i, epw epw) {
        Intent intent = new Intent(context, PhoneVerificationActivity.class);
        intent.setAction("android.intent.action.VIEW");
        intent.putExtra("account_id", i);
        intent.putExtra("source_activity", epw);
        return intent;
    }
}
