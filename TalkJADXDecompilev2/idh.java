package defpackage;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import java.util.concurrent.TimeUnit;

public class idh implements idc {
    public static final iev<ied, Status> a = new idi();
    private final gti b;

    idh(Context context, String str, String str2) {
        this.b = new gti(context, str, str2, null);
    }

    public final idb a(byte[] bArr) {
        return new idm(this.b, bArr);
    }

    public final boolean a(idx idx, long j, TimeUnit timeUnit) {
        return this.b.a(((ieu) idx).d(), 5000, timeUnit);
    }

    public idh(Context context, String str, String str2, byte b) {
        this(context, str, str2);
    }
}
