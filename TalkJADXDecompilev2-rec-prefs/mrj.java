package p000;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

final class mrj extends mqx {
    private final File f28152a;

    public /* synthetic */ InputStream mo3922a() {
        return m32756b();
    }

    mrj(File file) {
        this.f28152a = (File) bm.m6122a((Object) file);
    }

    private FileInputStream m32756b() {
        return new FileInputStream(this.f28152a);
    }

    public String toString() {
        String valueOf = String.valueOf(this.f28152a);
        return new StringBuilder(String.valueOf(valueOf).length() + 20).append("Files.asByteSource(").append(valueOf).append(")").toString();
    }
}
