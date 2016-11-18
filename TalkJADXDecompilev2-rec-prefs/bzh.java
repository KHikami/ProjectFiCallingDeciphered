package p000;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.widget.EditText;

final class bzh implements OnClickListener {
    final /* synthetic */ EditText f4827a;
    final /* synthetic */ bzf f4828b;

    bzh(bzf bzf, EditText editText) {
        this.f4828b = bzf;
        this.f4827a = editText;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        if (this.f4828b.aj != null) {
            this.f4828b.aj.mo790a(this.f4827a.getText().toString().trim());
        }
    }
}
