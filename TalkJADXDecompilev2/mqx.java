package defpackage;

import java.io.InputStream;
import java.io.OutputStream;

public abstract class mqx {
    public abstract InputStream a();

    protected mqx() {
    }

    public long a(mqw mqw) {
        bm.a((Object) mqw);
        mrb mrb = new mrb(mrb.a);
        try {
            long a = mqy.a((InputStream) mrb.a(a()), (OutputStream) mrb.a(mqw.a()));
            mrb.close();
            return a;
        } catch (Throwable th) {
            mrb.close();
        }
    }
}
