import android.accounts.Account;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.auth.TokenData;
import java.io.IOException;

class bpu {
    final /* synthetic */ Account a;
    final /* synthetic */ String b;
    final /* synthetic */ Bundle c;

    public /* synthetic */ Object a(IBinder iBinder) {
        return b(iBinder);
    }

    bpu(Account account, String str, Bundle bundle) {
        this.a = account;
        this.b = str;
        this.c = bundle;
    }

    public TokenData b(IBinder iBinder) {
        cli cli;
        if (iBinder == null) {
            cli = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.auth.IAuthManagerService");
            cli = (queryLocalInterface == null || !(queryLocalInterface instanceof cli)) ? new clk(iBinder) : (cli) queryLocalInterface;
        }
        Bundle bundle = (Bundle) bpt.a(cli.a(this.a, this.b, this.c));
        TokenData a = TokenData.a(bundle, "tokenDetails");
        if (a != null) {
            return a;
        }
        Object obj;
        Object obj2;
        String string = bundle.getString("Error");
        Intent intent = (Intent) bundle.getParcelable("userRecoveryIntent");
        bqa a2 = bqa.a(string);
        if (!(bqa.BAD_AUTHENTICATION.equals(a2) || bqa.CAPTCHA.equals(a2) || bqa.NEED_PERMISSION.equals(a2) || bqa.NEEDS_BROWSER.equals(a2) || bqa.USER_CANCEL.equals(a2) || bqa.THIRD_PARTY_DEVICE_MANAGEMENT_REQUIRED.equals(a2))) {
            if (bqa.DEVICE_MANAGEMENT_REQUIRED.equals(a2) || bqa.DM_INTERNAL_ERROR.equals(a2) || bqa.DM_SYNC_DISABLED.equals(a2) || bqa.DM_ADMIN_BLOCKED.equals(a2) || bqa.DM_ADMIN_PENDING_APPROVAL.equals(a2) || bqa.DM_STALE_SYNC_REQUIRED.equals(a2) || bqa.DM_DEACTIVATED.equals(a2) || bqa.DM_REQUIRED.equals(a2)) {
                obj = 1;
            } else {
                obj = null;
            }
            if (obj == null) {
                obj = null;
                if (obj == null) {
                    throw new bpw(string, intent);
                }
                if (!bqa.NETWORK_ERROR.equals(a2) || bqa.SERVICE_UNAVAILABLE.equals(a2)) {
                    obj2 = 1;
                } else {
                    obj2 = null;
                }
                if (obj2 == null) {
                    throw new IOException(string);
                }
                throw new bpr(string);
            }
        }
        obj = 1;
        if (obj == null) {
            if (bqa.NETWORK_ERROR.equals(a2)) {
            }
            obj2 = 1;
            if (obj2 == null) {
                throw new bpr(string);
            }
            throw new IOException(string);
        }
        throw new bpw(string, intent);
    }
}
