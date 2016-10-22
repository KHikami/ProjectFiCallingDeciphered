package defpackage;

import android.content.Context;
import android.telecom.PhoneAccountHandle;

/* compiled from: PG */
/* renamed from: alc */
public final class alc extends akd {
    private final Context a;
    private final String b;

    public alc(Context context, String str) {
        this.a = context.getApplicationContext();
        this.b = str;
    }

    public final void a(PhoneAccountHandle phoneAccountHandle, boolean z) {
        axk.a(this.a, this.b, phoneAccountHandle);
    }
}
