package defpackage;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;

/* renamed from: jkk */
final class jkk implements Runnable {
    final /* synthetic */ jkj a;

    jkk(jkj jkj) {
        this.a = jkj;
    }

    public void run() {
        String valueOf = String.valueOf(this.a.g);
        new StringBuilder(String.valueOf(valueOf).length() + 36).append("Out of memory while decoding image: ").append(valueOf);
        if (this.a.a instanceof jin) {
            Writer stringWriter = new StringWriter();
            ((jin) this.a.a).a(new PrintWriter(stringWriter));
            gwb.a(4, "ImageResource", stringWriter.toString());
        }
    }
}
