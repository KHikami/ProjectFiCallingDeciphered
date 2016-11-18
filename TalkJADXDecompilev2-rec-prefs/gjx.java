package p000;

import android.content.Context;
import java.io.File;

public final class gjx extends azv<File> {
    final Context f15469a;
    final String f15470b;

    public /* bridge */ /* synthetic */ void mo264a(Object obj, bac bac) {
        m17864a((File) obj);
    }

    public gjx(Context context, String str) {
        this.f15469a = context;
        this.f15470b = str;
    }

    private void m17864a(File file) {
        new gjy(this, file).execute(new Void[0]);
    }
}
