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
                case wi.w /*0*/:
                case wi.l /*2*/:
                    recyclerView.b((int) ((((float) this.b.b().a()) * motionEvent.getY()) / ((float) this.b.F)));
                case wi.j /*1*/:
                    this.a = false;
                default:
            }
        }
    }

    public aeh(FastScrollingRecyclerView fastScrollingRecyclerView) {
        this.b = fastScrollingRecyclerView;
    }
}
