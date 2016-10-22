package defpackage;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

/* renamed from: mri */
final class mri extends mqw {
    private final File a;
    private final mks<mrf> b;

    public /* synthetic */ OutputStream a() {
        return b();
    }

    mri(File file, mrf... mrfArr) {
        this.a = (File) bm.a((Object) file);
        this.b = mks.a((Object[]) mrfArr);
    }

    private FileOutputStream b() {
        return new FileOutputStream(this.a, this.b.contains(mrf.APPEND));
    }

    public String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        return new StringBuilder((String.valueOf(valueOf).length() + 20) + String.valueOf(valueOf2).length()).append("Files.asByteSink(").append(valueOf).append(", ").append(valueOf2).append(")").toString();
    }
}
