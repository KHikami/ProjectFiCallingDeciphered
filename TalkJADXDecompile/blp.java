import android.widget.Toast;

final class blp implements Runnable {
    final /* synthetic */ blo a;

    blp(blo blo) {
        this.a = blo;
    }

    public void run() {
        Toast.makeText(this.a.a, bc.aF, 0).show();
    }
}
