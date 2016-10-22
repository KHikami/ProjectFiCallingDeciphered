package defpackage;

import android.text.SpannableString;
import android.text.style.CharacterStyle;
import android.text.style.StyleSpan;
import android.widget.TextView;

/* compiled from: PG */
/* renamed from: acx */
public class acx {
    private int a;
    private CharacterStyle b;

    public acx(int i) {
        acx.class.getSimpleName();
        this.a = 1;
        this.b = a();
    }

    public final void a(TextView textView, String str, String str2) {
        textView.setText(a(str, str2));
    }

    private final CharacterStyle a() {
        return new StyleSpan(this.a);
    }

    public final void a(SpannableString spannableString, int i, int i2) {
        spannableString.setSpan(a(), i, i2, 0);
    }

    public final CharSequence a(CharSequence charSequence, String str) {
        if (str == null) {
            return charSequence;
        }
        int i = 0;
        while (i < str.length() && !Character.isLetterOrDigit(str.charAt(i))) {
            i++;
        }
        String substring = str.substring(i);
        int a = buf.a(charSequence, substring);
        if (a == -1) {
            return charSequence;
        }
        CharSequence spannableString = new SpannableString(charSequence);
        spannableString.setSpan(this.b, a, substring.length() + a, 0);
        return spannableString;
    }
}
