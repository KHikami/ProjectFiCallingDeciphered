package p000;

import java.io.InputStream;
import java.io.OutputStream;

public abstract class mqx {
    public abstract InputStream mo3922a();

    protected mqx() {
    }

    public long m32741a(mqw mqw) {
        bm.m6122a((Object) mqw);
        mrb mrb = new mrb(mrb.f28140a);
        try {
            long a = mqy.m32743a((InputStream) mrb.m32747a(mo3922a()), (OutputStream) mrb.m32747a(mqw.mo3921a()));
            mrb.close();
            return a;
        } catch (Throwable th) {
            mrb.close();
        }
    }
}
