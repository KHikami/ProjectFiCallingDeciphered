package defpackage;

import com.android.dialer.app.list.PhoneFavoriteListView;

/* compiled from: PG */
/* renamed from: aqk */
public final class aqk implements Runnable {
    private /* synthetic */ PhoneFavoriteListView a;

    public aqk(PhoneFavoriteListView phoneFavoriteListView) {
        this.a = phoneFavoriteListView;
    }

    public final void run() {
        if (this.a.c <= this.a.a) {
            this.a.smoothScrollBy(-25, 5);
        } else if (this.a.c >= this.a.b) {
            this.a.smoothScrollBy(25, 5);
        }
        this.a.d.postDelayed(this, 5);
    }
}
