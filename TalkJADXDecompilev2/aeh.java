package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;
import com.google.android.apps.hangouts.peoplelistv2.impl.FastScrollingRecyclerView;

public class aeh {
    public boolean a;
    public final /* synthetic */ FastScrollingRecyclerView b;

    public boolean a(MotionEvent motionEvent) {
        if (motionEvent.getX() <= ((float) (this.b.E - this.b.D))) {
            return false;
        }
        this.a = true;
        return true;
    }

    public void a(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (this.a) {
            switch (motionEvent.getAction()) {
                case 0:
                case 2:
                    recyclerView.b((int) ((((float) this.b.b().a()) * motionEvent.getY()) / ((float) this.b.F)));
                    return;
                case 1:
                    this.a = false;
                    return;
                default:
                    return;
            }
        }
    }

    public aeh(FastScrollingRecyclerView fastScrollingRecyclerView) {
        this.b = fastScrollingRecyclerView;
    }
}
