package defpackage;

import java.io.File;
import java.io.IOException;

public final class axq implements aob<axo> {
    public /* bridge */ /* synthetic */ boolean a(Object obj, File file, anz anz) {
        return axq.a((aqr) obj, file);
    }

    public ans a(anz anz) {
        return ans.SOURCE;
    }

    private static boolean a(aqr aqr, File file) {
        try {
            bah.a(((axo) aqr.c()).c(), file);
            return true;
        } catch (IOException e) {
            return false;
        }
    }
}
