package defpackage;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.Context;
import java.util.ArrayList;
import java.util.List;

final class jdx implements jcq {
    private final AccountManager a;

    jdx(Context context) {
        this.a = AccountManager.get(context);
    }

    public List<jco> a() {
        Account[] accountsByType = this.a.getAccountsByType("com.google");
        List<jco> arrayList = new ArrayList(accountsByType.length);
        for (int i = 0; i < accountsByType.length; i++) {
            arrayList.add(new jcp(accountsByType[i].name, i).a());
        }
        return arrayList;
    }
}
