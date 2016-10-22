import android.text.Editable;
import android.text.TextWatcher;
import android.widget.Button;

/* compiled from: PG */
final class ayh implements TextWatcher {
    private /* synthetic */ ayc a;

    ayh(ayc ayc) {
        this.a = ayc;
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void afterTextChanged(Editable editable) {
        Button button = this.a.d.getButton(-1);
        boolean z = (editable == null || editable.toString().trim().length() == 0) ? false : true;
        button.setEnabled(z);
    }
}
