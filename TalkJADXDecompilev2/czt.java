package defpackage;

import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.apps.hangouts.fragments.CallContactPickerFragment;

public final class czt implements OnClickListener {
    final /* synthetic */ CallContactPickerFragment a;

    public czt(CallContactPickerFragment callContactPickerFragment) {
        this.a = callContactPickerFragment;
    }

    public void onClick(View view) {
        this.a.a(0, true);
    }
}
