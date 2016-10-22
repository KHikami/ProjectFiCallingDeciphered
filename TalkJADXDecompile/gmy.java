import android.widget.Toast;

final class gmy implements Runnable {
    final /* synthetic */ gmx a;

    gmy(gmx gmx) {
        this.a = gmx;
    }

    public void run() {
        if (this.a.e == 1 || this.a.e == 2 || this.a.e == 3) {
            Toast.makeText(this.a.c, this.a.c.getString(bc.v), 0).show();
            this.a.j();
            this.a.d = null;
        }
    }
}
