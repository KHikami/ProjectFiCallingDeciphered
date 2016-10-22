package defpackage;

import java.io.File;
import java.io.FilenameFilter;
import java.util.regex.Pattern;

/* renamed from: asn */
final class asn implements FilenameFilter {
    final /* synthetic */ Pattern a;

    asn(Pattern pattern) {
        this.a = pattern;
    }

    public boolean accept(File file, String str) {
        return this.a.matcher(str).matches();
    }
}
