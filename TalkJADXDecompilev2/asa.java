package defpackage;

import android.content.Context;
import java.io.File;

public class asa {
    final /* synthetic */ Context a;
    final /* synthetic */ String b;

    public File a() {
        File cacheDir = this.a.getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        return this.b != null ? new File(cacheDir, this.b) : cacheDir;
    }

    asa(Context context, String str) {
        this.a = context;
        this.b = str;
    }
}
