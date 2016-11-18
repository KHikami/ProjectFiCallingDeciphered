package p000;

import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.apps.hangouts.conversation.v2.livecamerapicker.impl.CameraPickerFragment;

public final class clb implements OnClickListener {
    final /* synthetic */ CameraPickerFragment f5540a;

    public clb(CameraPickerFragment cameraPickerFragment) {
        this.f5540a = cameraPickerFragment;
    }

    public void onClick(View view) {
        this.f5540a.aj.setVisibility(0);
        this.f5540a.ak.setVisibility(8);
        this.f5540a.f6108h.setVisibility(8);
        this.f5540a.f6107g.setVisibility(0);
    }
}
