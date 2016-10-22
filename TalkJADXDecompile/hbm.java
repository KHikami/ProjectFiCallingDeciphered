import android.content.Context;
import android.content.Intent;
import com.google.android.gms.identity.accounts.api.AccountData;

public final class hbm {
    private final hbn a;

    public hbm(hbn hbn) {
        gwb.f((Object) hbn, (Object) "Callbacks must not be null.");
        this.a = hbn;
    }

    public static boolean a(Context context, Intent intent) {
        gwb.f((Object) context, (Object) "Context must not be null.");
        gwb.f((Object) intent, (Object) "Intent must not be null.");
        return intent.hasExtra("com.google.android.gms.accounts.ACCOUNT_DATA");
    }

    public AccountData b(Context context, Intent intent) {
        gwb.f((Object) context, (Object) "Context must not be null.");
        gwb.f((Object) intent, (Object) "Intent must not be null.");
        return !a(context, intent) ? null : (AccountData) gwb.a(intent, "com.google.android.gms.accounts.ACCOUNT_DATA", AccountData.CREATOR);
    }
}
