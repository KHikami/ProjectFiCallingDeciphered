import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import com.google.android.apps.hangouts.peoplelistv2.impl.DeleteOnEmptyEditText;

public final class efr extends InputConnectionWrapper {
    final /* synthetic */ DeleteOnEmptyEditText a;

    public efr(DeleteOnEmptyEditText deleteOnEmptyEditText, InputConnection inputConnection) {
        this.a = deleteOnEmptyEditText;
        super(inputConnection, true);
    }

    public boolean deleteSurroundingText(int i, int i2) {
        if (i > 0) {
            this.a.a();
        }
        return super.deleteSurroundingText(i, i2);
    }
}
