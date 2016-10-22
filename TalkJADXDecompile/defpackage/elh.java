package defpackage;

import android.os.Binder;
import com.google.android.apps.hangouts.phone.DebugActivity.RecordingService;

/* renamed from: elh */
public final class elh extends Binder {
    final /* synthetic */ RecordingService a;

    public elh(RecordingService recordingService) {
        this.a = recordingService;
    }

    RecordingService a() {
        return this.a;
    }
}
