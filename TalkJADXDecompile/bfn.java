import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

final class bfn implements OnClickListener {
    final /* synthetic */ String[] a;
    final /* synthetic */ bfj b;

    bfn(bfj bfj, String[] strArr) {
        this.b = bfj;
        this.a = strArr;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        bfj bfj = this.b;
        bfj.b.startActivity(gwb.a(bfj.b, false, bfj.c, glq.c(this.b.b, this.a[i])));
    }
}
