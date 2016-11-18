package p000;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import java.util.concurrent.TimeUnit;

public class idh implements idc {
    public static final iev<ied, Status> f17590a = new idi();
    private final gti f17591b;

    idh(Context context, String str, String str2) {
        this.f17591b = new gti(context, str, str2, null);
    }

    public final idb mo3146a(byte[] bArr) {
        return new idm(this.f17591b, bArr);
    }

    public final boolean mo3147a(idx idx, long j, TimeUnit timeUnit) {
        return this.f17591b.m18528a(((ieu) idx).m21679d(), 5000, timeUnit);
    }

    public idh(Context context, String str, String str2, byte b) {
        this(context, str, str2);
    }
}
