package defpackage;

import android.telephony.PhoneNumberUtils;
import android.text.Editable;
import android.text.Selection;
import android.text.TextWatcher;
import java.util.Locale;

/* renamed from: bbk */
public final class bbk implements TextWatcher {
    private boolean a;
    private boolean b;
    private jak c;

    public bbk() {
        this(Locale.getDefault().getCountry());
    }

    public bbk(String str) {
        this.a = false;
        if (str == null) {
            throw new IllegalArgumentException();
        }
        this.c = jar.b().f(str);
    }

    public void a(String str) {
        if (str == null) {
            throw new IllegalArgumentException();
        }
        this.c = jar.b().f(str);
        this.a = false;
        this.b = false;
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (!this.a && !this.b && i2 > 0 && bbk.a(charSequence, i, i2)) {
            a();
        }
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (!this.a && !this.b && i3 > 0 && bbk.a(charSequence, i, i3)) {
            a();
        }
    }

    public synchronized void afterTextChanged(Editable editable) {
        boolean z = true;
        synchronized (this) {
            if (this.b) {
                if (editable.length() == 0) {
                    z = false;
                }
                this.b = z;
            } else if (!this.a) {
                Object a;
                int selectionEnd = Selection.getSelectionEnd(editable) - 1;
                String str = null;
                this.c.a();
                int length = editable.length();
                int i = 0;
                boolean z2 = false;
                char c = '\u0000';
                while (i < length) {
                    String str2;
                    char charAt = editable.charAt(i);
                    if (PhoneNumberUtils.isNonSeparator(charAt)) {
                        if (c != '\u0000') {
                            str = a(c, z2);
                            z2 = false;
                        }
                        c = charAt;
                        str2 = str;
                    } else {
                        str2 = str;
                    }
                    if (i == selectionEnd) {
                        z2 = true;
                    }
                    i++;
                    str = str2;
                }
                if (c != '\u0000') {
                    a = a(c, z2);
                } else {
                    String str3 = str;
                }
                if (a != null) {
                    int b = this.c.b();
                    this.a = true;
                    editable.replace(0, editable.length(), a, 0, a.length());
                    if (a.equals(editable.toString())) {
                        Selection.setSelection(editable, b);
                    }
                    this.a = false;
                }
            }
        }
    }

    private String a(char c, boolean z) {
        if (z) {
            return this.c.b(c);
        }
        return this.c.a(c);
    }

    private void a() {
        this.b = true;
        this.c.a();
    }

    private static boolean a(CharSequence charSequence, int i, int i2) {
        for (int i3 = i; i3 < i + i2; i3++) {
            if (!PhoneNumberUtils.isNonSeparator(charSequence.charAt(i3))) {
                return true;
            }
        }
        return false;
    }
}
