package defpackage;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;

public final class iox extends ipe {
    private final iik i;
    private final Context j;

    public /* bridge */ /* synthetic */ void a(String str, long j) {
        super.a(str, j);
    }

    public /* bridge */ /* synthetic */ void b() {
        super.b();
    }

    public /* synthetic */ Object c() {
        return a();
    }

    iox(long j, String str, byte[] bArr, int i, iik iik, String str2, ioq ioq, Context context) {
        super(j, str, bArr, i, null, str2, ioq);
        iil.b("Expected non-null", (Object) iik);
        this.j = context;
        this.i = iik;
    }

    public byte[] a() {
        String valueOf;
        String valueOf2;
        try {
            iik iik = this.i;
            Context context = this.j;
            valueOf = String.valueOf(this.e);
            valueOf2 = String.valueOf(this.b);
            return iik.a(context, valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf), d(), this.c, this.d);
        } catch (Throwable e) {
            valueOf2 = this.e;
            valueOf = this.b;
            itx.a(5, "vclib", new StringBuilder((String.valueOf(valueOf2).length() + 29) + String.valueOf(valueOf).length()).append("Error sending cronet request ").append(valueOf2).append(valueOf).toString(), e);
            return null;
        }
    }

    public void a(byte[] bArr) {
        super.a(bArr);
    }

    private Map<String, String> d() {
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
