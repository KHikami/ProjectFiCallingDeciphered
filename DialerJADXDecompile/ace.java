import android.text.Editable;
import android.text.TextWatcher;
import com.android.contacts.common.dialog.CallSubjectDialog;

/* compiled from: PG */
public final class ace implements TextWatcher {
    private /* synthetic */ CallSubjectDialog a;

    public ace(CallSubjectDialog callSubjectDialog) {
        this.a = callSubjectDialog;
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.a.a();
    }

    public final void afterTextChanged(Editable editable) {
    }
}
