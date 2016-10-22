import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

public final class bez implements OnClickListener {
    final /* synthetic */ bfj a;
    final /* synthetic */ String b;

    public bez(bfj bfj, String str) {
        this.a = bfj;
        this.b = str;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.a.a(this.b);
    }
}
