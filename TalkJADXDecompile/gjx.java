import android.content.Context;
import java.io.File;

public final class gjx extends azv<File> {
    final Context a;
    final String b;

    public /* bridge */ /* synthetic */ void a(Object obj, bac bac) {
        a((File) obj);
    }

    public gjx(Context context, String str) {
        this.a = context;
        this.b = str;
    }

    private void a(File file) {
        new gjy(this, file).execute(new Void[0]);
    }
}
