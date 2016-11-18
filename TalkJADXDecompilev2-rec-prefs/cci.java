package p000;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.widget.ArrayAdapter;

final class cci implements OnClickListener {
    final /* synthetic */ ArrayAdapter f5004a;
    final /* synthetic */ cch f5005b;

    cci(cch cch, ArrayAdapter arrayAdapter) {
        this.f5005b = cch;
        this.f5004a = arrayAdapter;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        ((emv) this.f5004a.getItem(i)).mo811a();
    }
}
