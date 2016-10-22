package defpackage;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.google.android.apps.hangouts.phone.BabelHomeActivity;

/* renamed from: ejh */
public final class ejh implements OnClickListener {
    final /* synthetic */ BabelHomeActivity a;

    public ejh(BabelHomeActivity babelHomeActivity) {
        this.a = babelHomeActivity;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.cancel();
    }
}
