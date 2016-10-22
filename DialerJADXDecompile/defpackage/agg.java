package defpackage;

import android.content.ContentValues;
import android.content.Context;

/* compiled from: PG */
/* renamed from: agg */
final class agg implements agb {
    agg() {
    }

    public final CharSequence a(Context context, ContentValues contentValues) {
        CharSequence charSequence = null;
        CharSequence asString = contentValues.containsKey("data1") ? contentValues.getAsString("data1") : null;
        if (contentValues.containsKey("data4")) {
            charSequence = contentValues.getAsString("data4");
        }
        if (asString != null && charSequence != null) {
            String valueOf = String.valueOf(asString);
            String valueOf2 = String.valueOf(charSequence);
            return new StringBuilder((String.valueOf(valueOf).length() + 2) + String.valueOf(valueOf2).length()).append(valueOf).append(": ").append(valueOf2).toString();
        } else if (asString == null) {
            return charSequence;
        } else {
            return asString;
        }
    }
}
