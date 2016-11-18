package p000;

import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import com.google.android.apps.hangouts.hangout.ParticipantTrayView;

public final class dkd extends SimpleOnGestureListener {
    final /* synthetic */ ParticipantTrayView f9987a;

    public dkd(ParticipantTrayView participantTrayView) {
        this.f9987a = participantTrayView;
    }

    public boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (Math.abs(motionEvent.getY() - motionEvent2.getY()) <= Math.abs(motionEvent.getX() - motionEvent2.getX()) || f2 <= 0.0f || this.f9987a.f6408b.m11853c() != 2) {
            return false;
        }
        glk.m17970a("Babel_calls", "Flinging the participant tray view down", new Object[0]);
        gwb.m2198f(2957);
        this.f9987a.m8663a(false);
        this.f9987a.f6409c = true;
        return true;
    }
}
