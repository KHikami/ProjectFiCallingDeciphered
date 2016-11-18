package p000;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.Context;
import java.util.ArrayList;
import java.util.List;

final class jdx implements jcq {
    private final AccountManager f19919a;

    jdx(Context context) {
        this.f19919a = AccountManager.get(context);
    }

    public List<jco> mo1740a() {
        Account[] accountsByType = this.f19919a.getAccountsByType("com.google");
        List<jco> arrayList = new ArrayList(accountsByType.length);
        for (int i = 0; i < accountsByType.length; i++) {
            arrayList.add(new jcp(accountsByType[i].name, i).m23901a());
        }
        return arrayList;
    }
}
