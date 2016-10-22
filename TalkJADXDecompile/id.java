import android.content.ComponentName;
import android.content.Intent;
import android.os.Build.VERSION;

public final class id {
    private static final ie a;

    static {
        int i = VERSION.SDK_INT;
        if (i >= 15) {
            a = new if((byte) 0);
        } else if (i >= 11) {
            a = new if();
        } else {
            a = new ie();
        }
    }

    public static Intent a(ComponentName componentName) {
        return a.a(componentName);
    }
}
