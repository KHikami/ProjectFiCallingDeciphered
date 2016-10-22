package defpackage;

import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.BackgroundColorSpan;
import android.text.style.CharacterStyle;
import android.text.style.StyleSpan;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: gkb */
public final class gkb {
    public static CharacterStyle[] a;

    static {
        a = new CharacterStyle[]{new StyleSpan(1), new BackgroundColorSpan(2013265664)};
    }

    public static Spanned a(Spanned spanned, String str) {
        if (TextUtils.isEmpty(spanned) || TextUtils.isEmpty(str)) {
            return spanned;
        }
        Matcher matcher = Pattern.compile(str, 66).matcher(spanned);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(spanned);
        while (matcher.find()) {
            int start = matcher.start();
            int end = matcher.end();
            for (CharacterStyle wrap : a) {
                spannableStringBuilder.setSpan(CharacterStyle.wrap(wrap), start, end, 0);
            }
        }
        return spannableStringBuilder;
    }
}
