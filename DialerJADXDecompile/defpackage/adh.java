package defpackage;

import android.content.Context;
import android.content.CursorLoader;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract.Contacts;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.QuickContactBadge;
import android.widget.TextView;
import java.util.HashSet;

/* compiled from: PG */
/* renamed from: adh */
public abstract class adh extends aeg {
    int d;
    int e;
    public boolean f;
    boolean g;
    public boolean h;
    boolean i;
    boolean j;
    boolean k;
    View l;
    aaz m;
    public String n;
    String o;
    boolean p;
    int q;
    int r;
    boolean s;
    public adn t;
    boolean u;
    private boolean y;
    private CharSequence z;

    public abstract void a(CursorLoader cursorLoader, long j);

    public /* synthetic */ View a(Context context, int i, Cursor cursor, int i2, ViewGroup viewGroup) {
        return b(context, i, cursor, i2, viewGroup);
    }

    public adh(Context context) {
        super(context);
        this.g = true;
        this.r = Integer.MAX_VALUE;
        this.y = true;
        this.u = false;
        h(buf.fD);
        aax aef = new aef(true, true);
        aef.f = 0;
        aef.h = this.a.getString(buf.ew);
        aef.k = true;
        aef.l = true;
        aef.o = this.z.toString();
        a(aef);
    }

    public adr b(Context context, int i, Cursor cursor, int i2, ViewGroup viewGroup) {
        adr adr = new adr(context, null);
        adr.j = this.x;
        adr.v = this.i;
        return adr;
    }

    public void a(View view, int i, Cursor cursor, int i2) {
        adr adr = (adr) view;
        adr.j = this.x;
        a(adr, i);
    }

    protected final View b(Context context, ViewGroup viewGroup) {
        return new adv(context, null, viewGroup);
    }

    protected final void a(View view, String str) {
        adv adv = (adv) view;
        if (TextUtils.isEmpty(str)) {
            adv.setVisibility(8);
            return;
        }
        adv.setText(str);
        adv.setVisibility(0);
    }

    public final void a() {
        int size = this.b.size();
        for (int i = 0; i < size; i++) {
            aax b = b(i);
            if (b instanceof aef) {
                ((aef) b).j = 0;
            }
        }
        super.a();
    }

    public void a(String str) {
        this.n = str;
        if (TextUtils.isEmpty(str)) {
            this.o = null;
        } else {
            this.o = buf.i(str.toUpperCase());
        }
    }

    public void a(Cursor cursor) {
        if (cursor.getCount() == 0) {
            Log.e("ContactEntryListAdapter", "Directory search loader returned an empty cursor, which implies we have no directory entries.", new RuntimeException());
            return;
        }
        int i;
        HashSet hashSet = new HashSet();
        int columnIndex = cursor.getColumnIndex("_id");
        int columnIndex2 = cursor.getColumnIndex("directoryType");
        int columnIndex3 = cursor.getColumnIndex("displayName");
        int columnIndex4 = cursor.getColumnIndex("photoSupport");
        cursor.moveToPosition(-1);
        while (cursor.moveToNext()) {
            long j = cursor.getLong(columnIndex);
            hashSet.add(Long.valueOf(j));
            if (a(j) == -1) {
                boolean z;
                aax aef = new aef(false, true);
                aef.f = j;
                if (buf.b(j)) {
                    if (buf.c(j)) {
                        aef.o = this.v.getString(buf.eE);
                    } else {
                        aef.o = this.v.getString(buf.eD);
                    }
                } else if (buf.c(j)) {
                    aef.o = this.v.getString(buf.fB);
                } else {
                    aef.o = this.z.toString();
                }
                aef.h = cursor.getString(columnIndex2);
                aef.i = cursor.getString(columnIndex3);
                i = cursor.getInt(columnIndex4);
                if (i == 1 || i == 3) {
                    z = true;
                } else {
                    z = false;
                }
                aef.l = z;
                a(aef);
            }
        }
        i = this.b.size();
        while (true) {
            int i2 = i - 1;
            if (i2 >= 0) {
                aax b = b(i2);
                if ((b instanceof aef) && !hashSet.contains(Long.valueOf(((aef) b).f))) {
                    a(i2);
                }
                i = i2;
            } else {
                this.c = false;
                notifyDataSetChanged();
                return;
            }
        }
    }

    public void a(int i, Cursor cursor) {
        if (i < this.b.size()) {
            aax b = b(i);
            if (b instanceof aef) {
                ((aef) b).j = 2;
            }
            if (this.f && this.m != null && i(i)) {
                this.m.c();
            }
            super.a(i, cursor);
            if (this.x && i == 0) {
                if (cursor == null || cursor.isClosed()) {
                    a(null);
                } else {
                    Bundle extras = cursor.getExtras();
                    if (extras.containsKey("android.provider.extra.ADDRESS_BOOK_INDEX_TITLES") && extras.containsKey("android.provider.extra.ADDRESS_BOOK_INDEX_COUNTS")) {
                        a(new aea(extras.getStringArray("android.provider.extra.ADDRESS_BOOK_INDEX_TITLES"), extras.getIntArray("android.provider.extra.ADDRESS_BOOK_INDEX_COUNTS")));
                    } else {
                        a(null);
                    }
                }
            }
            this.m.a(this.l);
        }
    }

    public int getViewTypeCount() {
        return 3;
    }

    public final int a(int i, int i2) {
        Object obj = 1;
        Object obj2 = null;
        int a = super.a(i, i2);
        if (i2 == 0) {
            int f = f(i2);
            if (f >= 0) {
                int position = d(f).getPosition();
                Cursor cursor = (Cursor) getItem(i2);
                if (cursor != null) {
                    int columnIndex = cursor.getColumnIndex("is_user_profile");
                    if (columnIndex == -1) {
                        obj = null;
                    } else if (cursor.getInt(columnIndex) != 1) {
                        obj = null;
                    }
                    cursor.moveToPosition(position);
                    obj2 = obj;
                }
            }
        }
        if (obj2 == null && this.x && i == 0) {
            return j(i2).a ? a : a + 1;
        } else {
            return a;
        }
    }

    public boolean isEmpty() {
        if (!this.y) {
            return false;
        }
        if (this.p) {
            return TextUtils.isEmpty(this.n);
        }
        return super.isEmpty();
    }

    public final void a(boolean z, boolean z2) {
        int size = this.b.size();
        int i = 0;
        while (i < size) {
            aax b = b(i);
            if ((b instanceof aef) && ((aef) b).f == 0) {
                break;
            }
            i++;
        }
        i = -1;
        if (i != -1) {
            ((aax) this.b.get(i)).a = false;
            this.c = false;
            a(i, z2);
        }
    }

    protected final View a(Context context, ViewGroup viewGroup) {
        View inflate = LayoutInflater.from(context).inflate(buf.du, viewGroup, false);
        if (!this.B) {
            inflate.setBackground(null);
        }
        return inflate;
    }

    protected void a(adr adr, int i) {
        aax b = b(i);
        if (b instanceof aef) {
            adr.b(abl.a(Long.valueOf(((aef) b).f), null) == 1);
        }
    }

    protected final void a(View view, int i) {
        aax b = b(i);
        if (b instanceof aef) {
            int i2;
            aef aef = (aef) b;
            long j = aef.f;
            TextView textView = (TextView) view.findViewById(cob.K);
            ((TextView) view.findViewById(cob.N)).setText(aef.o);
            if (buf.b(j)) {
                CharSequence charSequence;
                CharSequence charSequence2 = aef.i;
                if (TextUtils.isEmpty(charSequence2)) {
                    charSequence = aef.h;
                } else {
                    charSequence = charSequence2;
                }
                textView.setText(charSequence);
            } else {
                textView.setText(null);
            }
            Resources resources = this.a.getResources();
            if (i == 1) {
                if (b(0).e == 0) {
                    i2 = 1;
                } else {
                    i2 = 0;
                }
                if (i2 != 0) {
                    i2 = 0;
                    view.setPaddingRelative(view.getPaddingStart(), i2, view.getPaddingEnd(), view.getPaddingBottom());
                }
            }
            i2 = resources.getDimensionPixelOffset(buf.cQ);
            view.setPaddingRelative(view.getPaddingStart(), i2, view.getPaddingEnd(), view.getPaddingBottom());
        }
    }

    public final boolean i(int i) {
        aax b = b(i);
        if (b instanceof aef) {
            return ((aef) b).l;
        }
        return true;
    }

    protected final void a(adr adr, int i, Cursor cursor, int i2, int i3, int i4, int i5, int i6) {
        long j = 0;
        if (!cursor.isNull(i2)) {
            j = cursor.getLong(i2);
        }
        if (adr.k) {
            if (adr.l == null) {
                adr.l = new QuickContactBadge(adr.getContext());
                if (abw.h()) {
                    adr.l.setOverlay(null);
                }
                adr.l.setLayoutParams(adr.a());
                if (adr.m != null) {
                    adr.l.setContentDescription(adr.getContext().getString(buf.ey, new Object[]{adr.m.getText()}));
                }
                adr.addView(adr.l);
                adr.t = false;
            }
            ImageView imageView = adr.l;
            imageView.assignContactUri(a(i, cursor, i4, i5));
            if (abw.a()) {
                imageView.setPrioritizedMimeType("vnd.android.cursor.item/phone_v2");
            }
            if (j != 0 || i3 == -1) {
                this.m.a(imageView, j, this.u, this.g, null);
                return;
            }
            String string = cursor.getString(i3);
            Uri parse = string == null ? null : Uri.parse(string);
            abc abc = null;
            if (parse == null) {
                abc = a(cursor, i6, i5);
            }
            this.m.a(imageView, parse, -1, this.u, this.g, abc);
            return;
        }
        throw new IllegalStateException("QuickContact is disabled for this view");
    }

    public boolean hasStableIds() {
        return true;
    }

    protected static void a(adr adr, Cursor cursor, int i) {
        adr.setId((int) (cursor.getLong(0) % 2147483647L));
    }

    protected Uri a(int i, Cursor cursor, int i2, int i3) {
        long j = cursor.getLong(i2);
        String string = cursor.getString(i3);
        long j2 = ((aef) b(i)).f;
        Uri lookupUri = Contacts.getLookupUri(j, string);
        if (lookupUri == null || j2 == 0) {
            return lookupUri;
        }
        return lookupUri.buildUpon().appendQueryParameter("directory", String.valueOf(j2)).build();
    }

    public final abc a(Cursor cursor, int i, int i2) {
        return new abc(cursor.getString(i), cursor.getString(i2), this.g);
    }

    protected final void h(int i) {
        this.z = this.a.getResources().getText(i);
    }

    protected final int a(long j) {
        int size = this.b.size();
        for (int i = 0; i < size; i++) {
            aax b = b(i);
            if ((b instanceof aef) && ((aef) b).f == j) {
                return i;
            }
        }
        return -1;
    }

    protected final aef b(long j) {
        int size = this.b.size();
        for (int i = 0; i < size; i++) {
            aax b = b(i);
            if (b instanceof aef) {
                aef aef = (aef) b;
                if (aef.f == j) {
                    return aef;
                }
            }
        }
        return null;
    }

    public final int a(aef aef) {
        int i = aef.m;
        return i == -1 ? this.r : i;
    }
}
