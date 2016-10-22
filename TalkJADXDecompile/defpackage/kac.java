package defpackage;

import java.io.PrintWriter;
import java.io.StringWriter;

/* renamed from: kac */
public final class kac extends PrintWriter {
    public kac() {
        super(new StringWriter());
    }

    public String toString() {
        return this.out.toString();
    }
}
