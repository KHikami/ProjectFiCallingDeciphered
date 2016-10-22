import android.content.Context;
import android.content.Intent;
import com.google.android.gms.identity.accounts.api.AccountData;

class icm implements ick {
    icm() {
    }

    public icl a(Context context, Intent intent) {
        if (!hbk.a(context, intent)) {
            return null;
        }
        AccountData b = hbk.b.b(context, intent);
        return new icl(b.b(), b.c());
    }
}
