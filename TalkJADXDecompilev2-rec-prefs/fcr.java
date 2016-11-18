package p000;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

public final class fcr implements OnClickListener {
    public void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.cancel();
    }
}
