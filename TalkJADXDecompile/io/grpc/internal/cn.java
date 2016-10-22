package io.grpc.internal;

import bm;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

public final class cn {
    static final cm a;

    static {
        a = new cp(new byte[0]);
    }

    public static cm a(ByteBuffer byteBuffer) {
        return new cq(byteBuffer);
    }

    public static String a(cm cmVar, Charset charset) {
        bm.a((Object) charset, (Object) "charset");
        bm.a((Object) cmVar, (Object) "buffer");
        int a = cmVar.a();
        byte[] bArr = new byte[a];
        cmVar.a(bArr, 0, a);
        return new String(bArr, charset);
    }

    public static InputStream a(cm cmVar, boolean z) {
        return new co(cmVar);
    }
}
