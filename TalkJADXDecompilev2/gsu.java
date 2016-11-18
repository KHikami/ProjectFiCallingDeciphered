package defpackage;

import android.accounts.Account;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import com.google.android.gms.auth.TokenData;
import java.io.IOException;

final class gsu implements gsw<TokenData> {
    final /* synthetic */ Account a;
    final /* synthetic */ String b;
    final /* synthetic */ Bundle c;

    gsu(Account account, String str, Bundle bundle) {
        this.a = account;
        this.b = str;
        this.c = bundle;
    }

    private TokenData b(IBinder iBinder) {
        Bundle bundle = (Bundle) gst.a(hda.a(iBinder).a(this.a, this.b, this.c));
        TokenData a = TokenData.a(bundle, "tokenDetails");
        if (a != null) {
            return a;
        }
        String string = bundle.getString("Error");
        Intent intent = (Intent) bundle.getParcelable("userRecoveryIntent");
        gtc a2 = gtc.a(string);
        Object obj = (gtc.BAD_AUTHENTICATION.equals(a2) || gtc.CAPTCHA.equals(a2) || gtc.NEED_PERMISSION.equals(a2) || gtc.NEEDS_BROWSER.equals(a2) || gtc.USER_CANCEL.equals(a2) || gtc.DEVICE_MANAGEMENT_REQUIRED.equals(a2) || gtc.DM_INTERNAL_ERROR.equals(a2) || gtc.DM_SYNC_DISABLED.equals(a2) || gtc.DM_ADMIN_BLOCKED.equals(a2) || gtc.DM_ADMIN_PENDING_APPROVAL.equals(a2) || gtc.DM_STALE_SYNC_REQUIRED.equals(a2) || gtc.DM_DEACTIVATED.equals(a2) || gtc.DM_REQUIRED.equals(a2) || gtc.THIRD_PARTY_DEVICE_MANAGEMENT_REQUIRED.equals(a2)) ? 1 : null;
        if (obj != null) {
            throw new gsy(string, intent);
        }
        Object obj2 = (gtc.NETWORK_ERROR.equals(a2) || gtc.SERVICE_UNAVAILABLE.equals(a2)) ? 1 : null;
        if (obj2 != null) {
            throw new IOException(string);
        }
        throw new gsr(string);
    }

    public /* synthetic */ Object a(IBinder iBinder) {
        return b(iBinder);
    }
}
