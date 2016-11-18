package p000;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

final class att implements ats<InputStream> {
    att() {
    }

    public /* synthetic */ void mo389a(Object obj) {
        ((InputStream) obj).close();
    }

    public Class<InputStream> mo387a() {
        return InputStream.class;
    }

    public /* synthetic */ Object mo388a(File file) {
        return new FileInputStream(file);
    }
}
