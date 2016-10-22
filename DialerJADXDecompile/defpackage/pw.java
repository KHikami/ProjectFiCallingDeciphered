package defpackage;

import android.content.Context;
import android.widget.ArrayAdapter;

/* compiled from: PG */
/* renamed from: pw */
public final class pw extends ArrayAdapter {
    public pw(Context context, int i, int i2, CharSequence[] charSequenceArr) {
        super(context, i, 16908308, charSequenceArr);
    }

    public final boolean hasStableIds() {
        return true;
    }

    public final long getItemId(int i) {
        return (long) i;
    }
}
