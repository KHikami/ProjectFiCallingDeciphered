package defpackage;

import android.content.Context;
import android.os.Build.VERSION;
import android.provider.Settings.Secure;
import android.text.TextUtils;
import android.view.inputmethod.InputMethodManager;
import android.view.inputmethod.InputMethodSubtype;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

public class cnf {
    AtomicBoolean a = new AtomicBoolean(true);
    private final Context b;
    private List<String> c;

    cnf(Context context) {
        this.b = context;
        gwb.g(context).a(new cng(this));
    }

    public boolean a() {
        if (VERSION.SDK_INT < 19) {
            return false;
        }
        String string = Secure.getString(this.b.getContentResolver(), "default_input_method");
        if (string != null) {
            boolean z;
            if (this.a.compareAndSet(true, false)) {
                List list;
                Object b = gwb.b(this.b, "babel_allowed_emoji_imes", "com.google.android.inputmethod.latin/");
                if (TextUtils.isEmpty(b)) {
                    list = null;
                } else {
                    list = Arrays.asList(b.split(","));
                }
                this.c = list;
            }
            if (this.c != null) {
                for (String startsWith : this.c) {
                    if (string.startsWith(startsWith)) {
                        z = true;
                        break;
                    }
                }
            }
            z = false;
            if (z) {
                InputMethodSubtype currentInputMethodSubtype = ((InputMethodManager) this.b.getSystemService("input_method")).getCurrentInputMethodSubtype();
                if (currentInputMethodSubtype == null) {
                    return false;
                }
                return currentInputMethodSubtype.containsExtraValueKey("EmojiCapable");
            }
        }
        return false;
    }
}
