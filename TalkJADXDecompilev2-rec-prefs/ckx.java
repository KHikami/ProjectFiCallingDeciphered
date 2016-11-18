package p000;

import android.os.AsyncTask;
import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.apps.hangouts.conversation.v2.livecamerapicker.impl.CameraPickerFragment;

public final class ckx implements OnClickListener {
    final /* synthetic */ CameraPickerFragment f5534a;

    public ckx(CameraPickerFragment cameraPickerFragment) {
        this.f5534a = cameraPickerFragment;
    }

    public void onClick(View view) {
        new cle(this.f5534a).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }
}
