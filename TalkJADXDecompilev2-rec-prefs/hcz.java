package p000;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IInterface;
import com.google.android.gms.auth.AccountChangeEventsRequest;
import com.google.android.gms.auth.AccountChangeEventsResponse;

public interface hcz extends IInterface {
    Bundle mo2453a(Account account);

    Bundle mo2454a(Account account, String str, Bundle bundle);

    Bundle mo2455a(Bundle bundle);

    Bundle mo2456a(String str, Bundle bundle);

    Bundle mo2457a(String str, String str2, Bundle bundle);

    AccountChangeEventsResponse mo2458a(AccountChangeEventsRequest accountChangeEventsRequest);
}
