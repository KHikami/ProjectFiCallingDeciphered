package defpackage;

import android.os.ResultReceiver;
import android.view.inputmethod.InputMethodManager;
import android.widget.AutoCompleteTextView;
import java.lang.reflect.Method;

/* renamed from: afe */
public final class afe {
    private Method a;
    private Method b;
    private Method c;
    private Method d;

    public afe() {
        try {
            this.a = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", new Class[0]);
            this.a.setAccessible(true);
        } catch (NoSuchMethodException e) {
        }
        try {
            this.b = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", new Class[0]);
            this.b.setAccessible(true);
        } catch (NoSuchMethodException e2) {
        }
        try {
            this.c = AutoCompleteTextView.class.getMethod("ensureImeVisible", new Class[]{Boolean.TYPE});
            this.c.setAccessible(true);
        } catch (NoSuchMethodException e3) {
        }
        try {
            this.d = InputMethodManager.class.getMethod("showSoftInputUnchecked", new Class[]{Integer.TYPE, ResultReceiver.class});
            this.d.setAccessible(true);
        } catch (NoSuchMethodException e4) {
        }
    }

    public void a(AutoCompleteTextView autoCompleteTextView) {
        if (this.a != null) {
            try {
                this.a.invoke(autoCompleteTextView, new Object[0]);
            } catch (Exception e) {
            }
        }
    }

    public void b(AutoCompleteTextView autoCompleteTextView) {
        if (this.b != null) {
            try {
                this.b.invoke(autoCompleteTextView, new Object[0]);
            } catch (Exception e) {
            }
        }
    }

    public void a(AutoCompleteTextView autoCompleteTextView, boolean z) {
        if (this.c != null) {
            try {
                this.c.invoke(autoCompleteTextView, new Object[]{Boolean.valueOf(true)});
            } catch (Exception e) {
            }
        }
    }
}
