package p000;

import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;
import com.google.android.apps.hangouts.peoplelistv2.impl.FastScrollingRecyclerView;

public class aeh {
    public boolean f386a;
    public final /* synthetic */ FastScrollingRecyclerView f387b;

    public boolean m785a(MotionEvent motionEvent) {
        if (motionEvent.getX() <= ((float) (this.f387b.f6528E - this.f387b.f6527D))) {
            return false;
        }
        this.f386a = true;
        return true;
    }

    public void m784a(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (this.f386a) {
            switch (motionEvent.getAction()) {
                case 0:
                case 2:
                    recyclerView.m3067b((int) ((((float) this.f387b.m3065b().mo736a()) * motionEvent.getY()) / ((float) this.f387b.f6529F)));
                    return;
                case 1:
                    this.f386a = false;
                    return;
                default:
                    return;
            }
        }
    }

    public aeh(FastScrollingRecyclerView fastScrollingRecyclerView) {
        this.f387b = fastScrollingRecyclerView;
    }
}
