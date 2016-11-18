package p000;

import java.io.File;
import java.io.FileFilter;

final class ck implements FileFilter {
    final /* synthetic */ String f5483a;

    ck(String str) {
        this.f5483a = str;
    }

    public boolean accept(File file) {
        return !file.getName().startsWith(this.f5483a);
    }
}
