import android.telephony.PhoneNumberUtils;
import android.text.Spanned;
import android.text.method.DialerKeyListener;

public final class dev extends DialerKeyListener {
    public static final dev a;

    static {
        a = new dev();
    }

    public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        String charSequence2 = charSequence.toString();
        StringBuilder stringBuilder = new StringBuilder(charSequence2.length());
        for (char c : charSequence2.toCharArray()) {
            int digit = Character.digit(c, 10);
            if (digit != -1) {
                stringBuilder.append(digit);
            } else {
                stringBuilder.append(c);
            }
        }
        Object convertKeypadLettersToDigits = PhoneNumberUtils.convertKeypadLettersToDigits(stringBuilder.toString());
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
