package p000;

import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.apps.hangouts.fragments.CallContactPickerFragment;

public final class czy implements OnClickListener {
    final /* synthetic */ CallContactPickerFragment f9399a;

    public czy(CallContactPickerFragment callContactPickerFragment) {
        this.f9399a = callContactPickerFragment;
    }

    public void onClick(View view) {
        if (this.f9399a.getActivity() != null) {
            this.f9399a.m8468a(1, true);
        }
    }
}
