package defpackage;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.widget.ArrayAdapter;

/* renamed from: cci */
final class cci implements OnClickListener {
    final /* synthetic */ ArrayAdapter a;
    final /* synthetic */ cch b;

    cci(cch cch, ArrayAdapter arrayAdapter) {
        this.b = cch;
        this.a = arrayAdapter;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        ((emv) this.a.getItem(i)).a();
    }
}
