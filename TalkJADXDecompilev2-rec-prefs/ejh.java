package p000;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.google.android.apps.hangouts.phone.BabelHomeActivity;

public final class ejh implements OnClickListener {
    final /* synthetic */ BabelHomeActivity f11642a;

    public ejh(BabelHomeActivity babelHomeActivity) {
        this.f11642a = babelHomeActivity;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.cancel();
    }
}
