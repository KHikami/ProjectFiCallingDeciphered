import android.content.ContentProviderOperation;
import android.content.ContentValues;
import android.content.Context;
import android.content.OperationApplicationException;
import android.content.res.Resources;
import android.net.Uri;
import android.os.RemoteException;
import android.provider.ContactsContract.Contacts;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.android.dialer.app.list.PhoneFavoriteSquareTileView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;

/* compiled from: PG */
public class aqq extends BaseAdapter implements aqi {
    private static final String u;
    private int A;
    private int B;
    private boolean C;
    public ArrayList a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    aqs j;
    Resources k;
    aic l;
    boolean m;
    boolean n;
    aaz o;
    int p;
    int q;
    int r;
    int s;
    int t;
    private adz v;
    private Context w;
    private Comparator x;
    private adg y;
    private int z;

    public /* synthetic */ Object getItem(int i) {
        return b(i);
    }

    static {
        u = aqq.class.getSimpleName();
    }

    public aqq(Context context, adz adz, aqs aqs) {
        this.a = null;
        this.x = new aqr(this);
        this.y = null;
        this.z = -1;
        this.A = -1;
        this.B = -1;
        this.m = false;
        this.n = false;
        this.C = false;
        this.j = aqs;
        this.v = adz;
        this.w = context;
        this.k = context.getResources();
        this.l = new aic(this.w);
        this.b = 0;
        this.a = new ArrayList();
        this.f = 1;
        this.g = 11;
        this.t = 2;
        this.e = 3;
        this.d = 4;
        this.p = 5;
        this.q = 6;
        this.r = 7;
        this.h = 9;
        this.i = 10;
        this.s = 8;
    }

    private void a(boolean z) {
        this.n = z;
        this.C = z;
    }

    public int getCount() {
        if (this.a == null) {
            return 0;
        }
        return this.a.size();
    }

    private adg b(int i) {
        return (adg) this.a.get(i);
    }

    public long getItemId(int i) {
        return b(i).k;
    }

    public boolean hasStableIds() {
        return true;
    }

    public boolean areAllItemsEnabled() {
        return true;
    }

    public boolean isEnabled(int i) {
        return getCount() > 0;
    }

    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        View view2;
        getItemViewType(i);
        if (view instanceof aqn) {
            view2 = (aqn) view;
        } else {
            view2 = null;
        }
        if (view2 == null) {
            view2 = (aqn) View.inflate(this.w, buf.hK, null);
        }
        view2.f = this.o;
        view2.b = this.v;
        view2.a(b(i));
        return view2;
    }

    public int getViewTypeCount() {
        return 1;
    }

    public int getItemViewType(int i) {
        return 0;
    }

    public final boolean a(int i) {
        return i >= 0 && i < this.a.size();
    }

    private final void c(int i) {
        if (this.y != null && a(this.B) && a(i)) {
            this.j.a();
            this.a.remove(this.B);
            this.B = i;
            this.a.add(this.B, adg.a);
            adg.a.k = this.y.k;
            this.j.a(new long[0]);
            notifyDataSetChanged();
        }
    }

    final void a(ArrayList arrayList) {
        int i;
        PriorityQueue priorityQueue = new PriorityQueue(21, this.x);
        Collection linkedList = new LinkedList();
        int size = arrayList.size();
        for (i = 0; i < size; i++) {
            adg adg = (adg) arrayList.get(i);
            if (adg.l > 21 || adg.l == 0) {
                linkedList.add(adg);
            } else if (adg.l >= 0) {
                priorityQueue.add(adg);
            }
        }
        size = Math.min(21, priorityQueue.size() + linkedList.size());
        arrayList.clear();
        i = 1;
        while (i < size + 1) {
            if (!priorityQueue.isEmpty() && ((adg) priorityQueue.peek()).l <= i) {
                adg = (adg) priorityQueue.poll();
                adg.l = i;
                arrayList.add(adg);
            } else if (!linkedList.isEmpty()) {
                arrayList.add((adg) linkedList.remove(0));
            }
            i++;
        }
        while (!priorityQueue.isEmpty()) {
            adg = (adg) priorityQueue.poll();
            adg.l = 0;
            arrayList.add(adg);
        }
        arrayList.addAll(linkedList);
    }

    public final void a(int i, int i2, PhoneFavoriteSquareTileView phoneFavoriteSquareTileView) {
        a(true);
        int indexOf = this.a.indexOf(phoneFavoriteSquareTileView.a);
        if (a(indexOf)) {
            this.y = (adg) this.a.get(indexOf);
            this.z = indexOf;
            this.B = indexOf;
            c(this.B);
        }
    }

    public final void b(int i, int i2, PhoneFavoriteSquareTileView phoneFavoriteSquareTileView) {
        if (phoneFavoriteSquareTileView != null) {
            int indexOf = this.a.indexOf(phoneFavoriteSquareTileView.a);
            if (this.C && this.B != indexOf && a(indexOf) && indexOf < 21 && indexOf >= 0) {
                c(indexOf);
            }
        }
    }

    public final void q() {
        Throwable e;
        boolean z = false;
        a(false);
        if (!this.m && this.y != null) {
            if (a(this.B) && this.B != this.z) {
                this.A = this.B;
                this.a.set(this.A, this.y);
                this.j.a();
                z = true;
            } else if (a(this.z)) {
                this.a.remove(this.B);
                this.a.add(this.z, this.y);
                this.A = this.z;
                notifyDataSetChanged();
            }
            if (z && this.A < 21) {
                ArrayList arrayList = this.a;
                int i = this.z;
                int i2 = this.A;
                ArrayList arrayList2 = new ArrayList();
                int min = Math.min(i, i2);
                i2 = Math.max(i, i2);
                for (i = min; i <= i2; i++) {
                    adg adg = (adg) arrayList.get(i);
                    int i3 = i + 1;
                    if (adg.l != i3) {
                        Uri withAppendedPath = Uri.withAppendedPath(Contacts.CONTENT_URI, String.valueOf(adg.k));
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("pinned", Integer.valueOf(i3));
                        arrayList2.add(ContentProviderOperation.newUpdate(withAppendedPath).withValues(contentValues).build());
                    }
                }
                if (!arrayList2.isEmpty()) {
                    try {
                        this.w.getContentResolver().applyBatch("com.android.contacts", arrayList2);
                    } catch (RemoteException e2) {
                        e = e2;
                        Log.e(u, "Exception thrown when pinning contacts", e);
                        this.y = null;
                    } catch (OperationApplicationException e3) {
                        e = e3;
                        Log.e(u, "Exception thrown when pinning contacts", e);
                        this.y = null;
                    }
                }
            }
            this.y = null;
        }
    }

    public final void r() {
        if (this.y != null) {
            Uri uri = this.y.i;
            ContentValues contentValues = new ContentValues(2);
            contentValues.put("starred", Boolean.valueOf(false));
            contentValues.put("pinned", Integer.valueOf(-1));
            this.w.getContentResolver().update(uri, contentValues, null, null);
            this.m = true;
        }
    }
}
