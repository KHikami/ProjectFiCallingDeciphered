package p000;

import android.os.ResultReceiver;
import android.view.inputmethod.InputMethodManager;
import android.widget.AutoCompleteTextView;
import java.lang.reflect.Method;

public final class afe {
    private Method f517a;
    private Method f518b;
    private Method f519c;
    private Method f520d;

    public afe() {
        try {
            this.f517a = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", new Class[0]);
            this.f517a.setAccessible(true);
        } catch (NoSuchMethodException e) {
        }
        try {
            this.f518b = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", new Class[0]);
            this.f518b.setAccessible(true);
        } catch (NoSuchMethodException e2) {
        }
        try {
            this.f519c = AutoCompleteTextView.class.getMethod("ensureImeVisible", new Class[]{Boolean.TYPE});
            this.f519c.setAccessible(true);
        } catch (NoSuchMethodException e3) {
        }
        try {
            this.f520d = InputMethodManager.class.getMethod("showSoftInputUnchecked", new Class[]{Integer.TYPE, ResultReceiver.class});
            this.f520d.setAccessible(true);
        } catch (NoSuchMethodException e4) {
        }
    }

    public void m915a(AutoCompleteTextView autoCompleteTextView) {
        if (this.f517a != null) {
            try {
                this.f517a.invoke(autoCompleteTextView, new Object[0]);
            } catch (Exception e) {
            }
        }
    }

    public void m917b(AutoCompleteTextView autoCompleteTextView) {
        if (this.f518b != null) {
            try {
                this.f518b.invoke(autoCompleteTextView, new Object[0]);
            } catch (Exception e) {
            }
        }
    }

    public void m916a(AutoCompleteTextView autoCompleteTextView, boolean z) {
        if (this.f519c != null) {
            try {
                this.f519c.invoke(autoCompleteTextView, new Object[]{Boolean.valueOf(true)});
            } catch (Exception e) {
            }
        }
    }
}
