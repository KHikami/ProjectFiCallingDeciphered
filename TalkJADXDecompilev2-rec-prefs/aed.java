package p000;

import android.view.View;

public class aed {
    public int f382a;
    public int f383b;
    public int f384c;
    public int f385d;

    public aed mo745a(aer aer) {
        return mo746a(aer, 0);
    }

    public aed mo746a(aer aer, int i) {
        View view = aer.f438a;
        this.f382a = view.getLeft();
        this.f383b = view.getTop();
        this.f384c = view.getRight();
        this.f385d = view.getBottom();
        return this;
    }
}
