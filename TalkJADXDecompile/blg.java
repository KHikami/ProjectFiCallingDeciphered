import android.content.Context;
import android.widget.Toast;

final class blg implements Runnable {
    final /* synthetic */ String a;

    blg(String str) {
        this.a = str;
    }

    public void run() {
        Context H = gwb.H();
        Toast.makeText(H, H.getString(bc.gI, new Object[]{this.a}), 0).show();
    }
}
