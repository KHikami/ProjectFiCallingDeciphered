package p000;

import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import com.google.android.apps.hangouts.phone.DebugActivity;

public final class ela implements OnCheckedChangeListener {
    final /* synthetic */ DebugActivity f11793a;

    ela(DebugActivity debugActivity) {
        this.f11793a = debugActivity;
    }

    public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        bkq.m5677b(this.f11793a.getApplicationContext(), this.f11793a.f6670g.m5638g(), "DEBUG_RTCS", z ? 1 : 0);
        this.f11793a.f6671h = z;
    }
}
