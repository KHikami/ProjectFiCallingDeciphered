package defpackage;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.widget.CheckBox;

/* compiled from: PG */
/* renamed from: aue */
final class aue implements OnClickListener {
    private /* synthetic */ CheckBox a;
    private /* synthetic */ auc b;

    aue(auc auc, CheckBox checkBox) {
        this.b = auc;
        this.a = checkBox;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.b.dismiss();
        this.b.a.a(this.a.isChecked());
    }
}
