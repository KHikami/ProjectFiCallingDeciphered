package defpackage;

import android.content.Context;
import android.widget.ArrayAdapter;

final class un extends ArrayAdapter<CharSequence> {
    public un(Context context, int i, int i2, CharSequence[] charSequenceArr) {
        super(context, i, 16908308, charSequenceArr);
    }

    public boolean hasStableIds() {
        return true;
    }

    public long getItemId(int i) {
        return (long) i;
    }
}
