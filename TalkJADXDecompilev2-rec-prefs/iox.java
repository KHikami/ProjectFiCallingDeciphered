package p000;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;

public final class iox extends ipe {
    private final iik f18624i;
    private final Context f18625j;

    public /* bridge */ /* synthetic */ void mo3352a(String str, long j) {
        super.mo3352a(str, j);
    }

    public /* bridge */ /* synthetic */ void mo3353b() {
        super.mo3353b();
    }

    public /* synthetic */ Object mo3354c() {
        return mo3356a();
    }

    iox(long j, String str, byte[] bArr, int i, iik iik, String str2, ioq ioq, Context context) {
        super(j, str, bArr, i, null, str2, ioq);
        iil.m21875b("Expected non-null", (Object) iik);
        this.f18625j = context;
        this.f18624i = iik;
    }

    public byte[] mo3356a() {
        String valueOf;
        String valueOf2;
        try {
            iik iik = this.f18624i;
            Context context = this.f18625j;
            valueOf = String.valueOf(this.e);
            valueOf2 = String.valueOf(this.b);
            return iik.mo1650a(context, valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf), m22815d(), this.c, this.d);
        } catch (Throwable e) {
            valueOf2 = this.e;
            valueOf = this.b;
            itx.m23278a(5, "vclib", new StringBuilder((String.valueOf(valueOf2).length() + 29) + String.valueOf(valueOf).length()).append("Error sending cronet request ").append(valueOf2).append(valueOf).toString(), e);
            return null;
        }
    }

    public void mo3355a(byte[] bArr) {
        super.mo3355a(bArr);
    }

    private Map<String, String> m22815d() {
        Map<String, String> hashMap = new HashMap();
        String str = "Authorization";
        String str2 = "Bearer ";
        String valueOf = String.valueOf(this.g);
        hashMap.put(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
        hashMap.put("X-Auth-Time", this.h);
        StringBuilder stringBuilder = new StringBuilder("HangoutsApiaryClient");
        stringBuilder.append("; G+ SDK/");
        stringBuilder.append("1.0.0");
        stringBuilder.append(";");
        hashMap.put("User-Agent", stringBuilder.toString());
        return hashMap;
    }
}
