package defpackage;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IInterface;
import com.google.android.gms.auth.AccountChangeEventsRequest;
import com.google.android.gms.auth.AccountChangeEventsResponse;

public interface hcz extends IInterface {
    Bundle a(Account account);

    Bundle a(Account account, String str, Bundle bundle);

    Bundle a(Bundle bundle);

    Bundle a(String str, Bundle bundle);

    Bundle a(String str, String str2, Bundle bundle);

    AccountChangeEventsResponse a(AccountChangeEventsRequest accountChangeEventsRequest);
}
