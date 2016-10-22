import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SectionIndexer;
import com.android.contacts.common.list.PinnedHeaderListView;
import java.util.Iterator;

/* compiled from: PG */
public abstract class aeg extends aen implements SectionIndexer {
    private int d;
    private View e;
    private aeh f;
    public Context v;
    SectionIndexer w;
    public boolean x;

    protected abstract void a(View view, String str);

    protected abstract View b(Context context, ViewGroup viewGroup);

    public aeg(Context context) {
        super(context);
        this.d = 0;
        this.f = new aeh();
        this.v = context;
    }

    public final void a(SectionIndexer sectionIndexer) {
        this.w = sectionIndexer;
        this.f.c = -1;
    }

    public Object[] getSections() {
        if (this.w != null) {
            return this.w.getSections();
        }
        return new String[]{" "};
    }

    public int getPositionForSection(int i) {
        if (this.w == null) {
            return -1;
        }
        return this.w.getPositionForSection(i);
    }

    public int getSectionForPosition(int i) {
        if (this.w == null) {
            return -1;
        }
        return this.w.getSectionForPosition(i);
    }

    public final void a(PinnedHeaderListView pinnedHeaderListView) {
        super.a(pinnedHeaderListView);
        if (this.x) {
            int c = c() - 1;
            if (this.w == null || getCount() == 0) {
                pinnedHeaderListView.a(c, false);
                return;
            }
            int i;
            int i2;
            View childAt;
            boolean z;
            View childAt2;
            aeo aeo;
            int a;
            int c2 = pinnedHeaderListView.c(pinnedHeaderListView.a());
            int headerViewsCount = c2 - pinnedHeaderListView.getHeaderViewsCount();
            if (f(headerViewsCount) == 0) {
                b();
                Iterator it = this.b.iterator();
                i = 0;
                while (it.hasNext()) {
                    aax aax = (aax) it.next();
                    int i3 = aax.e + i;
                    if (headerViewsCount < i || headerViewsCount >= i3) {
                        i = i3;
                    } else {
                        i = headerViewsCount - i;
                        if (aax.b) {
                            i2 = i - 1;
                        } else {
                            i2 = i;
                        }
                        if (i2 != -1) {
                            i = getSectionForPosition(i2);
                            if (i == -1) {
                                pinnedHeaderListView.a(c, false);
                                return;
                            }
                            childAt = pinnedHeaderListView.getChildAt(c2);
                            if (childAt != null) {
                                this.e.setMinimumHeight(childAt.getMeasuredHeight());
                            }
                            a(this.e, (String) this.w.getSections()[i]);
                            i2 = g(0);
                            if (c(0)) {
                                i2++;
                            }
                            if (headerViewsCount == (i2 + getPositionForSection(i + 1)) - 1) {
                                z = true;
                            } else {
                                z = false;
                            }
                            pinnedHeaderListView.b(c);
                            childAt2 = pinnedHeaderListView.getChildAt(c2 - pinnedHeaderListView.getFirstVisiblePosition());
                            if (childAt2 == null) {
                                aeo = pinnedHeaderListView.a[c];
                                aeo.b = true;
                                aeo.f = 2;
                                aeo.e = 255;
                                aeo.g = false;
                                a = pinnedHeaderListView.a();
                                aeo.c = a;
                                if (!z) {
                                    i2 = childAt2.getBottom() - a;
                                    i = aeo.d;
                                    if (i2 >= i) {
                                        i2 -= i;
                                        aeo.e = ((i + i2) * 255) / i;
                                        aeo.c = i2 + a;
                                    }
                                }
                            }
                        }
                    }
                }
                i2 = -1;
                if (i2 != -1) {
                    i = getSectionForPosition(i2);
                    if (i == -1) {
                        childAt = pinnedHeaderListView.getChildAt(c2);
                        if (childAt != null) {
                            this.e.setMinimumHeight(childAt.getMeasuredHeight());
                        }
                        a(this.e, (String) this.w.getSections()[i]);
                        i2 = g(0);
                        if (c(0)) {
                            i2++;
                        }
                        if (headerViewsCount == (i2 + getPositionForSection(i + 1)) - 1) {
                            z = false;
                        } else {
                            z = true;
                        }
                        pinnedHeaderListView.b(c);
                        childAt2 = pinnedHeaderListView.getChildAt(c2 - pinnedHeaderListView.getFirstVisiblePosition());
                        if (childAt2 == null) {
                            aeo = pinnedHeaderListView.a[c];
                            aeo.b = true;
                            aeo.f = 2;
                            aeo.e = 255;
                            aeo.g = false;
                            a = pinnedHeaderListView.a();
                            aeo.c = a;
                            if (!z) {
                                i2 = childAt2.getBottom() - a;
                                i = aeo.d;
                                if (i2 >= i) {
                                    i2 -= i;
                                    aeo.e = ((i + i2) * 255) / i;
                                    aeo.c = i2 + a;
                                }
                            }
                        }
                    }
                    pinnedHeaderListView.a(c, false);
                    return;
                }
            }
            i = -1;
            if (i == -1) {
                pinnedHeaderListView.a(c, false);
                return;
            }
            childAt = pinnedHeaderListView.getChildAt(c2);
            if (childAt != null) {
                this.e.setMinimumHeight(childAt.getMeasuredHeight());
            }
            a(this.e, (String) this.w.getSections()[i]);
            i2 = g(0);
            if (c(0)) {
                i2++;
            }
            if (headerViewsCount == (i2 + getPositionForSection(i + 1)) - 1) {
                z = true;
            } else {
                z = false;
            }
            pinnedHeaderListView.b(c);
            childAt2 = pinnedHeaderListView.getChildAt(c2 - pinnedHeaderListView.getFirstVisiblePosition());
            if (childAt2 == null) {
                aeo = pinnedHeaderListView.a[c];
                aeo.b = true;
                aeo.f = 2;
                aeo.e = 255;
                aeo.g = false;
                a = pinnedHeaderListView.a();
                aeo.c = a;
                if (!z) {
                    i2 = childAt2.getBottom() - a;
                    i = aeo.d;
                    if (i2 >= i) {
                        i2 -= i;
                        aeo.e = ((i + i2) * 255) / i;
                        aeo.c = i2 + a;
                    }
                }
            }
        }
    }

    public final aeh j(int i) {
        if (this.f.c == i) {
            return this.f;
        }
        this.f.c = i;
        if (this.x) {
            int sectionForPosition = getSectionForPosition(i);
            if (sectionForPosition == -1 || getPositionForSection(sectionForPosition) != i) {
                this.f.a = false;
                this.f.b = null;
            } else {
                this.f.a = true;
                this.f.b = (String) getSections()[sectionForPosition];
            }
            getPositionForSection(sectionForPosition + 1);
        } else {
            this.f.a = false;
            this.f.b = null;
        }
        return this.f;
    }

    public final int c() {
        if (this.x) {
            return super.c() + 1;
        }
        return super.c();
    }

    public final View a(int i, View view, ViewGroup viewGroup) {
        if (!this.x || i != c() - 1) {
            return super.a(i, view, viewGroup);
        }
        if (this.e == null) {
            this.e = b(this.v, viewGroup);
        }
        return this.e;
    }
}
