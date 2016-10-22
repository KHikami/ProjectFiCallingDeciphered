import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

final class fty implements OnClickListener {
    final /* synthetic */ ftx a;

    fty(ftx ftx) {
        this.a = ftx;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.a.startActivityForResult(gwb.d(this.a.a, this.a.a.b().a), 1);
    }
}
