package p000;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.identity.accounts.api.AccountData;

public final class hbm {
    private final hbn f16519a;

    public hbm(hbn hbn) {
        gwb.m2195f((Object) hbn, (Object) "Callbacks must not be null.");
        this.f16519a = hbn;
    }

    public static boolean m19141a(Context context, Intent intent) {
        gwb.m2195f((Object) context, (Object) "Context must not be null.");
        gwb.m2195f((Object) intent, (Object) "Intent must not be null.");
        return intent.hasExtra("com.google.android.gms.accounts.ACCOUNT_DATA");
    }

    public AccountData m19142b(Context context, Intent intent) {
        gwb.m2195f((Object) context, (Object) "Context must not be null.");
        gwb.m2195f((Object) intent, (Object) "Intent must not be null.");
        return !hbm.m19141a(context, intent) ? null : (AccountData) gwb.m1588a(intent, "com.google.android.gms.accounts.ACCOUNT_DATA", AccountData.CREATOR);
    }
}
