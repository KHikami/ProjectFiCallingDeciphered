package p000;

import android.widget.ListView;

public final class su extends rn {
    private final ListView f35115f;

    public su(ListView listView) {
        super(listView);
        this.f35115f = listView;
    }

    public void mo4377e(int i) {
        gwb.a(this.f35115f, i);
    }

    public boolean mo4378f(int i) {
        ListView listView = this.f35115f;
        int count = listView.getCount();
        if (count == 0) {
            return false;
        }
        int childCount = listView.getChildCount();
        int firstVisiblePosition = listView.getFirstVisiblePosition();
        int i2 = firstVisiblePosition + childCount;
        if (i > 0) {
            if (i2 >= count && listView.getChildAt(childCount - 1).getBottom() <= listView.getHeight()) {
                return false;
            }
        } else if (i >= 0) {
            return false;
        } else {
            if (firstVisiblePosition <= 0 && listView.getChildAt(0).getTop() >= 0) {
                return false;
            }
        }
        return true;
    }
}
