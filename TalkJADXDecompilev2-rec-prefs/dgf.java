package p000;

import android.widget.TextView;
import com.google.android.apps.hangouts.hangout.BroadcastOverlayView;

public final class dgf extends itg {
    final /* synthetic */ BroadcastOverlayView f9675a;

    public dgf(BroadcastOverlayView broadcastOverlayView) {
        this.f9675a = broadcastOverlayView;
        super('\u0000');
    }

    public void mo1386a(itk itk) {
        BroadcastOverlayView broadcastOverlayView = this.f9675a;
        did s = broadcastOverlayView.f6303a.m11727s();
        if (s.m11972a(s.m11991m(), s.m11992n())) {
            int i;
            boolean o = s.m11993o();
            TextView textView = broadcastOverlayView.f6304b;
            if (o) {
                i = bc.fe;
            } else {
                i = bc.eW;
            }
            textView.setText(i);
            textView = broadcastOverlayView.f6304b;
            if (o) {
                i = broadcastOverlayView.getContext().getResources().getColor(gwb.eo);
            } else {
                i = broadcastOverlayView.getContext().getResources().getColor(gwb.dO);
            }
            textView.setTextColor(i);
            textView = broadcastOverlayView.f6304b;
            if (o) {
                i = broadcastOverlayView.getContext().getResources().getColor(gwb.en);
            } else {
                i = broadcastOverlayView.getContext().getResources().getColor(gwb.dN);
            }
            textView.setBackgroundColor(i);
            broadcastOverlayView.f6304b.setVisibility(0);
            return;
        }
        broadcastOverlayView.f6304b.setVisibility(8);
    }

    public void mo1537a() {
        super.mo1537a();
        BroadcastOverlayView broadcastOverlayView = this.f9675a;
        did s = broadcastOverlayView.f6303a.m11727s();
        if (s.m11972a(s.m11991m(), s.m11992n())) {
            int i;
            boolean o = s.m11993o();
            TextView textView = broadcastOverlayView.f6304b;
            if (o) {
                i = bc.fe;
            } else {
                i = bc.eW;
            }
            textView.setText(i);
            textView = broadcastOverlayView.f6304b;
            if (o) {
                i = broadcastOverlayView.getContext().getResources().getColor(gwb.eo);
            } else {
                i = broadcastOverlayView.getContext().getResources().getColor(gwb.dO);
            }
            textView.setTextColor(i);
            textView = broadcastOverlayView.f6304b;
            if (o) {
                i = broadcastOverlayView.getContext().getResources().getColor(gwb.en);
            } else {
                i = broadcastOverlayView.getContext().getResources().getColor(gwb.dN);
            }
            textView.setBackgroundColor(i);
            broadcastOverlayView.f6304b.setVisibility(0);
            return;
        }
        broadcastOverlayView.f6304b.setVisibility(8);
    }
}
