package p000;

import android.content.Context;
import android.widget.Toast;

final class coz implements Runnable {
    final /* synthetic */ Context f8755a;

    coz(Context context) {
        this.f8755a = context;
    }

    public void run() {
        Toast.makeText(this.f8755a, bc.kg, 0).show();
    }
}
