package defpackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

/* renamed from: mrj */
final class mrj extends mqx {
    private final File a;

    public /* synthetic */ InputStream a() {
        return b();
    }

    mrj(File file) {
        this.a = (File) bm.a((Object) file);
    }

    private FileInputStream b() {
        return new FileInputStream(this.a);
    }

    public String toString() {
        String valueOf = String.valueOf(this.a);
        return new StringBuilder(String.valueOf(valueOf).length() + 20).append("Files.asByteSource(").append(valueOf).append(")").toString();
    }
}
