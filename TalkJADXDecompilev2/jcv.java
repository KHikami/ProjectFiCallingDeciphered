package defpackage;

import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;

public final class jcv implements jin, jzz {
    private final List<kaa> b = Arrays.asList(new kaa[]{new jcw(this, "print")});
    private final jcf c;

    public jcv(jcf jcf) {
        this.c = jcf;
    }

    public void a(PrintWriter printWriter) {
        printWriter.append(this.c.b());
    }
}
