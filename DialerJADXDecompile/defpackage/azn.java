package defpackage;

import android.view.View;
import android.view.View.OnLayoutChangeListener;

/* compiled from: PG */
/* renamed from: azn */
final class azn implements OnLayoutChangeListener {
    azn(ayv ayv) {
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.setLeft(i5);
        view.setRight(i7);
        view.setTop(i6);
        view.setBottom(i8);
    }
}
