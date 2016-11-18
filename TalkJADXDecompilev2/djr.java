package defpackage;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnShowListener;
import android.widget.Button;

final class djr implements OnShowListener {
    final /* synthetic */ djq a;

    djr(djq djq) {
        this.a = djq;
    }

    public void onShow(DialogInterface dialogInterface) {
        AlertDialog alertDialog = (AlertDialog) dialogInterface;
        if (alertDialog != null) {
            Button button = alertDialog.getButton(-1);
            if (button != null) {
                button.setAllCaps(true);
            }
            button = alertDialog.getButton(-2);
            if (button != null) {
                button.setAllCaps(true);
            }
        }
    }
}
