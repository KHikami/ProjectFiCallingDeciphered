package p000;

import android.telephony.PhoneNumberUtils;
import android.text.Editable;
import android.text.Selection;
import android.text.TextWatcher;
import java.util.Locale;

public final class bbk implements TextWatcher {
    private boolean f2848a;
    private boolean f2849b;
    private jak f2850c;

    public bbk() {
        this(Locale.getDefault().getCountry());
    }

    public bbk(String str) {
        this.f2848a = false;
        if (str == null) {
            throw new IllegalArgumentException();
        }
        this.f2850c = jar.m23675b().m23708f(str);
    }

    public void m4749a(String str) {
        if (str == null) {
            throw new IllegalArgumentException();
        }
        this.f2850c = jar.m23675b().m23708f(str);
        this.f2848a = false;
        this.f2849b = false;
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (!this.f2848a && !this.f2849b && i2 > 0 && bbk.m4748a(charSequence, i, i2)) {
            m4747a();
        }
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (!this.f2848a && !this.f2849b && i3 > 0 && bbk.m4748a(charSequence, i, i3)) {
            m4747a();
        }
    }

    public synchronized void afterTextChanged(Editable editable) {
        boolean z = true;
        synchronized (this) {
            if (this.f2849b) {
                if (editable.length() == 0) {
                    z = false;
                }
                this.f2849b = z;
            } else if (!this.f2848a) {
                Object a;
                int selectionEnd = Selection.getSelectionEnd(editable) - 1;
                String str = null;
                this.f2850c.m23653a();
                int length = editable.length();
                int i = 0;
                boolean z2 = false;
                char c = '\u0000';
                while (i < length) {
                    String str2;
                    char charAt = editable.charAt(i);
                    if (PhoneNumberUtils.isNonSeparator(charAt)) {
                        if (c != '\u0000') {
                            str = m4746a(c, z2);
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
                    a = m4746a(c, z2);
                } else {
                    String str3 = str;
                }
                if (a != null) {
                    int b = this.f2850c.m23654b();
                    this.f2848a = true;
                    editable.replace(0, editable.length(), a, 0, a.length());
                    if (a.equals(editable.toString())) {
                        Selection.setSelection(editable, b);
                    }
                    this.f2848a = false;
                }
            }
        }
    }

    private String m4746a(char c, boolean z) {
        if (z) {
            return this.f2850c.m23655b(c);
        }
        return this.f2850c.m23652a(c);
    }

    private void m4747a() {
        this.f2849b = true;
        this.f2850c.m23653a();
    }

    private static boolean m4748a(CharSequence charSequence, int i, int i2) {
        for (int i3 = i; i3 < i + i2; i3++) {
            if (!PhoneNumberUtils.isNonSeparator(charSequence.charAt(i3))) {
                return true;
            }
        }
        return false;
    }
}
