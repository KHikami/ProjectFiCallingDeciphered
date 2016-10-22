package com.google.android.libraries.social.account.refresh.receiver;

import android.content.Context;
import android.content.Intent;
import iw;

public final class AccountsChangedReceiver extends iw {
    public void onReceive(Context context, Intent intent) {
        iw.a(context, new Intent(context, AccountsChangedService.class));
    }
}
