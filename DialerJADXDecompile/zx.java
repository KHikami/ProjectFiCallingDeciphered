import android.os.ResultReceiver;
import android.view.inputmethod.InputMethodManager;
import android.widget.AutoCompleteTextView;
import java.lang.reflect.Method;

/* compiled from: PG */
public final class zx {
    Method a;
    Method b;
    public Method c;
    private Method d;

    public zx() {
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

    public final void a(AutoCompleteTextView autoCompleteTextView) {
        if (this.a != null) {
            try {
                this.a.invoke(autoCompleteTextView, new Object[0]);
            } catch (Exception e) {
            }
        }
    }

    public final void b(AutoCompleteTextView autoCompleteTextView) {
        if (this.b != null) {
            try {
                this.b.invoke(autoCompleteTextView, new Object[0]);
            } catch (Exception e) {
            }
        }
    }
}
