package io.grpc.internal;

import cob;
import java.io.InputStream;
import java.nio.charset.Charset;

/* compiled from: PG */
public final class bt {
    public static final bs a;

    static {
        a = new bv(new byte[0]);
    }

    public static String a(bs bsVar, Charset charset) {
        cob.b((Object) charset, (Object) "charset");
        cob.b((Object) bsVar, (Object) "buffer");
        int a = bsVar.a();
        byte[] bArr = new byte[a];
        bsVar.a(bArr, 0, a);
        return new String(bArr, charset);
    }

    public static InputStream a(bs bsVar, boolean z) {
        return new bu(bsVar);
    }
}
