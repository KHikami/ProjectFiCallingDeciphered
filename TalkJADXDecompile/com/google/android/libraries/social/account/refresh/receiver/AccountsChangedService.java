package com.google.android.libraries.social.account.refresh.receiver;

import android.app.IntentService;
import android.content.Context;
import android.content.Intent;
import iw;
import jct;
import jdy;
import jyn;

public final class AccountsChangedService extends IntentService {
    public AccountsChangedService() {
        super("AccountsChangedService");
    }

    protected void onHandleIntent(Intent intent) {
        if (intent != null) {
            try {
                ((jdy) jyn.a((Context) this, jdy.class)).a();
            } catch (jct e) {
            } catch (Throwable th) {
                iw.a(intent);
            }
            iw.a(intent);
        }
    }
}
