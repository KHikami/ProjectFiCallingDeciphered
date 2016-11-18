package defpackage;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.widget.EditText;

final class bzh implements OnClickListener {
    final /* synthetic */ EditText a;
    final /* synthetic */ bzf b;

    bzh(bzf bzf, EditText editText) {
        this.b = bzf;
        this.a = editText;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        if (this.b.aj != null) {
            this.b.aj.a(this.a.getText().toString().trim());
        }
    }
}
