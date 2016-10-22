import android.widget.TextView;
import com.google.android.apps.hangouts.hangout.BroadcastOverlayView;

public final class dgf extends itg {
    final /* synthetic */ BroadcastOverlayView a;

    public dgf(BroadcastOverlayView broadcastOverlayView) {
        this.a = broadcastOverlayView;
        super('\u0000');
    }

    public void a(itk itk) {
        BroadcastOverlayView broadcastOverlayView = this.a;
        did s = broadcastOverlayView.a.s();
        if (s.a(s.m(), s.n())) {
            int i;
            boolean o = s.o();
            TextView textView = broadcastOverlayView.b;
            if (o) {
                i = bc.fe;
            } else {
                i = bc.eW;
            }
            textView.setText(i);
            textView = broadcastOverlayView.b;
            if (o) {
                i = broadcastOverlayView.getContext().getResources().getColor(gwb.eo);
            } else {
                i = broadcastOverlayView.getContext().getResources().getColor(gwb.dO);
            }
            textView.setTextColor(i);
            textView = broadcastOverlayView.b;
            if (o) {
                i = broadcastOverlayView.getContext().getResources().getColor(gwb.en);
            } else {
                i = broadcastOverlayView.getContext().getResources().getColor(gwb.dN);
            }
            textView.setBackgroundColor(i);
            broadcastOverlayView.b.setVisibility(0);
            return;
        }
        broadcastOverlayView.b.setVisibility(8);
    }

    public void a() {
        super.a();
        BroadcastOverlayView broadcastOverlayView = this.a;
        did s = broadcastOverlayView.a.s();
        if (s.a(s.m(), s.n())) {
            int i;
            boolean o = s.o();
            TextView textView = broadcastOverlayView.b;
            if (o) {
                i = bc.fe;
            } else {
                i = bc.eW;
            }
            textView.setText(i);
            textView = broadcastOverlayView.b;
            if (o) {
                i = broadcastOverlayView.getContext().getResources().getColor(gwb.eo);
            } else {
                i = broadcastOverlayView.getContext().getResources().getColor(gwb.dO);
            }
            textView.setTextColor(i);
            textView = broadcastOverlayView.b;
            if (o) {
                i = broadcastOverlayView.getContext().getResources().getColor(gwb.en);
            } else {
                i = broadcastOverlayView.getContext().getResources().getColor(gwb.dN);
            }
            textView.setBackgroundColor(i);
            broadcastOverlayView.b.setVisibility(0);
            return;
        }
        broadcastOverlayView.b.setVisibility(8);
    }
}
