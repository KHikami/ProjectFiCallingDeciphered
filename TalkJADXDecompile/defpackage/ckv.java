package defpackage;

import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.apps.hangouts.conversation.v2.livecamerapicker.impl.CameraPickerFragment;

/* renamed from: ckv */
public final class ckv implements OnClickListener {
    final /* synthetic */ CameraPickerFragment a;

    public ckv(CameraPickerFragment cameraPickerFragment) {
        this.a = cameraPickerFragment;
    }

    public void onClick(View view) {
        this.a.b();
    }
}
