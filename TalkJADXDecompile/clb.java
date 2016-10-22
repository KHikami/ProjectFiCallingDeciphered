import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.apps.hangouts.conversation.v2.livecamerapicker.impl.CameraPickerFragment;

public final class clb implements OnClickListener {
    final /* synthetic */ CameraPickerFragment a;

    public clb(CameraPickerFragment cameraPickerFragment) {
        this.a = cameraPickerFragment;
    }

    public void onClick(View view) {
        this.a.aj.setVisibility(0);
        this.a.ak.setVisibility(8);
        this.a.h.setVisibility(8);
        this.a.g.setVisibility(0);
    }
}
