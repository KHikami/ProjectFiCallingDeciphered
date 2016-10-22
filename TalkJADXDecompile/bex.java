import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;

public final class bex implements OnClickListener {
    final /* synthetic */ fdv a;
    final /* synthetic */ Context b;
    final /* synthetic */ int c;
    final /* synthetic */ String d;
    final /* synthetic */ bgc e;

    public bex(fdv fdv, Context context, int i, String str, bgc bgc) {
        this.a = fdv;
        this.b = context;
        this.c = i;
        this.d = str;
        this.e = bgc;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        Intent a = this.a.a(this.b, this.c, this.d);
        this.e.a(2250);
        this.b.startActivity(a);
    }
}
