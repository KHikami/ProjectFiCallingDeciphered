package defpackage;

import android.content.Context;
import android.telecom.PhoneAccountHandle;
import android.telephony.PhoneNumberUtils;
import android.text.TextUtils;

/* compiled from: PG */
/* renamed from: aoc */
public final class aoc extends aob {
    private String d;

    public aoc(Context context) {
        super(context);
    }

    public final boolean a(PhoneAccountHandle phoneAccountHandle, CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            return false;
        }
        String charSequence2 = charSequence.toString();
        if (!TextUtils.isEmpty(this.d)) {
            return PhoneNumberUtils.compare(charSequence2, this.d);
        }
        if (!PhoneNumberUtils.isVoiceMailNumber(charSequence2)) {
            return false;
        }
        this.d = charSequence2;
        return true;
    }

    public final String a(PhoneAccountHandle phoneAccountHandle) {
        return null;
    }

    public final int b(PhoneAccountHandle phoneAccountHandle) {
        return 0;
    }

    public final boolean c(PhoneAccountHandle phoneAccountHandle) {
        return false;
    }
}
