package p000;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

final class mri extends mqw {
    private final File f28150a;
    private final mks<mrf> f28151b;

    public /* synthetic */ OutputStream mo3921a() {
        return m32754b();
    }

    mri(File file, mrf... mrfArr) {
        this.f28150a = (File) bm.m6122a((Object) file);
        this.f28151b = mks.m32258a((Object[]) mrfArr);
    }

    private FileOutputStream m32754b() {
        return new FileOutputStream(this.f28150a, this.f28151b.contains(mrf.APPEND));
    }

    public String toString() {
        String valueOf = String.valueOf(this.f28150a);
        String valueOf2 = String.valueOf(this.f28151b);
        return new StringBuilder((String.valueOf(valueOf).length() + 20) + String.valueOf(valueOf2).length()).append("Files.asByteSink(").append(valueOf).append(", ").append(valueOf2).append(")").toString();
    }
}
