import android.view.View;
import android.view.View.OnFocusChangeListener;
import android.view.inputmethod.InputMethodManager;

final class ehu implements OnFocusChangeListener {
    final /* synthetic */ eht a;

    ehu(eht eht) {
        this.a = eht;
    }

    public void onFocusChange(View view, boolean z) {
        if (!z) {
            ((InputMethodManager) this.a.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }
}
