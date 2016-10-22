import android.text.Editable;
import android.text.TextWatcher;

/* compiled from: PG */
final class apz implements TextWatcher {
    private /* synthetic */ apy a;

    apz(apy apy) {
        this.a = apy;
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.a.a(charSequence.toString());
    }

    public final void afterTextChanged(Editable editable) {
    }
}
