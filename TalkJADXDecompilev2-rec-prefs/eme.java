package p000;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.widget.ArrayAdapter;

final class eme implements OnClickListener {
    final /* synthetic */ ArrayAdapter f11842a;
    final /* synthetic */ elk f11843b;

    eme(elk elk, ArrayAdapter arrayAdapter) {
        this.f11843b = elk;
        this.f11842a = arrayAdapter;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        ((emv) this.f11842a.getItem(i)).mo811a();
    }
}
