package com.android.dialer.app.contact;

import aca;
import android.app.IntentService;
import android.content.Intent;

/* compiled from: PG */
public class ContactUpdateService extends IntentService {
    public ContactUpdateService() {
        super(ContactUpdateService.class.getSimpleName());
        setIntentRedelivery(true);
    }

    protected void onHandleIntent(Intent intent) {
        aca.a(this, intent.getLongExtra("phone_number_data_id", -1));
    }
}
