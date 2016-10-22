package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Objects;

/* compiled from: PG */
/* renamed from: auk */
public final class auk {
    public final Context a;
    public final SharedPreferences b;
    public final aup c;

    public auk(Context context, SharedPreferences sharedPreferences, aup aup) {
        this.a = (Context) Objects.requireNonNull(context);
        this.b = (SharedPreferences) Objects.requireNonNull(sharedPreferences);
        this.c = (aup) Objects.requireNonNull(aup);
    }
}
