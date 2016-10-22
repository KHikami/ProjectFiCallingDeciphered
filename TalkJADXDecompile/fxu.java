import android.content.Context;
import android.content.res.Configuration;

public final class fxu extends Thread {
    final /* synthetic */ Context a;

    public fxu(Context context) {
        this.a = context;
    }

    public void run() {
        Configuration configuration = this.a.getResources().getConfiguration();
        int i = configuration.mcc;
        glk.c("Babel_SMS", "MmsConfig: mnc/mcc: " + i + "/" + configuration.mnc, new Object[0]);
        fxt.a(this.a);
    }
}
