import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

final class fva implements OnClickListener {
    final /* synthetic */ int a;
    final /* synthetic */ Runnable b;
    final /* synthetic */ fuz c;

    fva(fuz fuz, int i, Runnable runnable) {
        this.c = fuz;
        this.a = i;
        this.b = runnable;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        fuz fuz = this.c;
        fuz.a(this.a, i);
        if (this.b != null) {
            this.b.run();
        }
    }
}
