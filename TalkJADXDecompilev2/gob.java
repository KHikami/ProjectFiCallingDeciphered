package defpackage;

import android.content.Context;
import android.graphics.Paint.FontMetrics;
import android.os.Build.VERSION;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.widget.TextView;

public class gob {
    private static gob a = null;

    public static gob a(Context context) {
        if (a == null) {
            if (VERSION.SDK_INT >= 19) {
                a = new gob();
            } else {
                a = new goc(context.getApplicationContext());
            }
        }
        return a;
    }

    public int a(int i) {
        throw new UnsupportedOperationException();
    }

    public SpannableString a(CharSequence charSequence, FontMetrics fontMetrics, TextView textView) {
        return null;
    }

    public void a(Spannable spannable, FontMetrics fontMetrics, TextView textView) {
    }

    public void a(Spanned spanned) {
    }
}
