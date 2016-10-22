package com.google.android.apps.hangouts.notifications;

import android.content.Intent;
import bmu;
import eav;
import eaw;
import ebg;
import ebh;
import ebn;
import ebo;
import ecb;
import ecc;
import frd;
import fre;
import glk;
import mfa;

public class NotificationService extends frd {
    public NotificationService() {
        super("NotificationService");
    }

    protected fre[] a() {
        return new fre[]{new ecc(), new ebo(), new ebh(), new eaw(), new ecb(), new ebn(), new ebg(), new eav()};
    }

    public void a(Intent intent, mfa<Intent> mfa_android_content_Intent) {
        try {
            super.a(intent, mfa_android_content_Intent);
        } catch (bmu e) {
            glk.d("Babel_NotifService", "Ignoring NotificationService intent for invalid account id: " + intent.getIntExtra("account_id", -1), new Object[0]);
        }
    }
}
