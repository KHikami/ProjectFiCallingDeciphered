package defpackage;

import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import com.google.android.apps.hangouts.hangout.ParticipantTrayView;

public final class dkd extends SimpleOnGestureListener {
    final /* synthetic */ ParticipantTrayView a;

    public dkd(ParticipantTrayView participantTrayView) {
        this.a = participantTrayView;
    }

    public boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (Math.abs(motionEvent.getY() - motionEvent2.getY()) <= Math.abs(motionEvent.getX() - motionEvent2.getX()) || f2 <= 0.0f || this.a.b.c() != 2) {
            return false;
        }
        glk.a("Babel_calls", "Flinging the participant tray view down", new Object[0]);
        gwb.f(2957);
        this.a.a(false);
        this.a.c = true;
        return true;
    }
}
