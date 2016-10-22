package defpackage;

import android.os.AsyncTask;
import android.telephony.PhoneNumberFormattingTextWatcher;
import android.widget.TextView;

/* compiled from: PG */
/* renamed from: ait */
public final class ait extends AsyncTask {
    private final String a;
    private final TextView b;
    private final boolean c;

    protected final /* synthetic */ void onPostExecute(Object obj) {
        PhoneNumberFormattingTextWatcher phoneNumberFormattingTextWatcher = (PhoneNumberFormattingTextWatcher) obj;
        if (phoneNumberFormattingTextWatcher != null && !isCancelled()) {
            this.b.addTextChangedListener(phoneNumberFormattingTextWatcher);
            if (this.c) {
                phoneNumberFormattingTextWatcher.afterTextChanged(this.b.getEditableText());
            }
        }
    }

    public ait(String str, TextView textView, boolean z) {
        this.a = str;
        this.b = textView;
        this.c = z;
    }

    protected final /* synthetic */ Object doInBackground(Object[] objArr) {
        return buf.f(this.a);
    }
}
