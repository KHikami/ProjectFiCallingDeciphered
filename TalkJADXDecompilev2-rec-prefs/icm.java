package p000;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.identity.accounts.api.AccountData;

class icm implements ick {
    icm() {
    }

    public icl mo3140a(Context context, Intent intent) {
        if (!hbk.m19140a(context, intent)) {
            return null;
        }
        AccountData b = hbk.f16518b.m19142b(context, intent);
        return new icl(b.m9760b(), b.m9761c());
    }
}
