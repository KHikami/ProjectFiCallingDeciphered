import android.content.Context;
import android.widget.Toast;

final class coz implements Runnable {
    final /* synthetic */ Context a;

    coz(Context context) {
        this.a = context;
    }

    public void run() {
        Toast.makeText(this.a, bc.kg, 0).show();
    }
}
