package p000;

import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import com.google.android.apps.hangouts.peoplelistv2.impl.DeleteOnEmptyEditText;

public final class efr extends InputConnectionWrapper {
    final /* synthetic */ DeleteOnEmptyEditText f11381a;

    public efr(DeleteOnEmptyEditText deleteOnEmptyEditText, InputConnection inputConnection) {
        this.f11381a = deleteOnEmptyEditText;
        super(inputConnection, true);
    }

    public boolean deleteSurroundingText(int i, int i2) {
        if (i > 0) {
            this.f11381a.m8763a();
        }
        return super.deleteSurroundingText(i, i2);
    }
}
