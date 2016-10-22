package com.google.android.apps.hangouts.phone;

import gkw;
import glk;

public class ConversationIntentWhitelistActivity extends ConversationIntentSecureActivity {
    protected boolean g() {
        String callingPackage = getCallingPackage();
        if (callingPackage == null) {
            glk.e("Babel_ConvIntSecureAct", "must use startActivityForResult", new Object[0]);
            return false;
        } else if (gkw.a(this, callingPackage)) {
            return true;
        } else {
            glk.e("Babel_ConvIntSecureAct", "Bad signature", new Object[0]);
            return false;
        }
    }
}
