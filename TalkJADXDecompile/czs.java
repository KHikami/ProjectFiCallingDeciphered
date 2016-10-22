import android.text.Editable;
import android.text.Spannable;
import android.text.TextWatcher;
import com.google.android.apps.hangouts.fragments.CallContactPickerFragment;

public final class czs implements TextWatcher {
    final /* synthetic */ CallContactPickerFragment a;

    public czs(CallContactPickerFragment callContactPickerFragment) {
        this.a = callContactPickerFragment;
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.a.a.a(charSequence);
        if (charSequence.length() != 0) {
            return;
        }
        if (this.a.e == 0) {
            this.a.a(0);
        } else {
            this.a.a(2);
        }
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void afterTextChanged(Editable editable) {
        gwb.a((Spannable) editable);
    }
}
