package p000;

import android.content.Context;
import android.graphics.Paint.FontMetrics;
import android.os.Build.VERSION;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.widget.TextView;

public class gob {
    private static gob f15770a = null;

    public static gob m18199a(Context context) {
        if (f15770a == null) {
            if (VERSION.SDK_INT >= 19) {
                f15770a = new gob();
            } else {
                f15770a = new goc(context.getApplicationContext());
            }
        }
        return f15770a;
    }

    public int mo2306a(int i) {
        throw new UnsupportedOperationException();
    }

    public SpannableString mo2307a(CharSequence charSequence, FontMetrics fontMetrics, TextView textView) {
        return null;
    }

    public void mo2308a(Spannable spannable, FontMetrics fontMetrics, TextView textView) {
    }

    public void mo2309a(Spanned spanned) {
    }
}
