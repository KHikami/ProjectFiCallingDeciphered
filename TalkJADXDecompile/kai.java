import android.content.Context;
import java.io.File;

final class kai implements kaf {
    kai() {
    }

    public boolean a(Throwable th) {
        return th instanceof UnsatisfiedLinkError;
    }

    public dq b() {
        return new kal();
    }

    public File a(Context context) {
        return new File(context.getFilesDir(), "corrupted_install");
    }

    public /* synthetic */ Object a() {
        return "corrupted-install";
    }
}
