package defpackage;

import android.telephony.PhoneNumberUtils;
import android.text.Spanned;
import android.text.method.DialerKeyListener;

/* compiled from: PG */
/* renamed from: apa */
public final class apa extends DialerKeyListener {
    public static final apa a;

    static {
        a = new apa();
    }

    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        Object convertKeypadLettersToDigits = PhoneNumberUtils.convertKeypadLettersToDigits(PhoneNumberUtils.replaceUnicodeDigits(charSequence.toString()));
        CharSequence filter = super.filter(convertKeypadLettersToDigits, i, i2, spanned, i3, i4);
        if (filter != null) {
            return filter;
        }
        if (charSequence.equals(convertKeypadLettersToDigits)) {
            return null;
        }
        return convertKeypadLettersToDigits.subSequence(i, i2);
    }
}
