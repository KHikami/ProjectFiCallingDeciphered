package defpackage;

import java.io.PrintWriter;
import java.io.StringWriter;

public final class kac extends PrintWriter {
    public kac() {
        super(new StringWriter());
    }

    public String toString() {
        return this.out.toString();
    }
}
