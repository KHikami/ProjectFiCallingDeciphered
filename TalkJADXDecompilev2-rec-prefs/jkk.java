package p000;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;

final class jkk implements Runnable {
    final /* synthetic */ jkj f20351a;

    jkk(jkj jkj) {
        this.f20351a = jkj;
    }

    public void run() {
        String valueOf = String.valueOf(this.f20351a.g);
        new StringBuilder(String.valueOf(valueOf).length() + 36).append("Out of memory while decoding image: ").append(valueOf);
        if (this.f20351a.f20096a instanceof jin) {
            Writer stringWriter = new StringWriter();
            ((jin) this.f20351a.f20096a).mo3452a(new PrintWriter(stringWriter));
            gwb.m1734a(4, "ImageResource", stringWriter.toString());
        }
    }
}
