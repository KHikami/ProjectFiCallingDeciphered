package defpackage;

import android.content.ContentUris;
import android.content.Context;
import android.content.CursorLoader;
import android.database.Cursor;
import android.net.Uri;
import android.net.Uri.Builder;
import android.provider.ContactsContract.CommonDataKinds.Callable;
import android.provider.ContactsContract.CommonDataKinds.Phone;
import android.provider.ContactsContract.Contacts;
import android.provider.ContactsContract.Data;
import android.text.SpannableString;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* renamed from: aej */
public class aej extends adh {
    private static final String C;
    public aek A;
    private final List D;
    private final CharSequence E;
    private final String F;
    private long G;
    private boolean H;
    private boolean I;
    public int y;
    public boolean z;

    public /* synthetic */ View a(Context context, int i, Cursor cursor, int i2, ViewGroup viewGroup) {
        return b(context, i, cursor, i2, viewGroup);
    }

    static {
        C = aej.class.getSimpleName();
    }

    public aej(Context context) {
        boolean z;
        boolean z2 = true;
        super(context);
        this.G = Long.MAX_VALUE;
        h(buf.fA);
        this.E = context.getText(17039374);
        this.F = buf.g(context);
        acv acv = acw.b;
        if (acv != null) {
            this.D = acv.a(this.v);
        } else {
            this.D = new ArrayList();
        }
        int d = buf.d(context);
        if ((d & 1) != 0) {
            z = true;
        } else {
            z = false;
        }
        this.H = z;
        if ((d & 2) == 0) {
            z2 = false;
        }
        this.I = z2;
    }

    public final void a(CursorLoader cursorLoader, long j) {
        String str;
        String str2 = this.n;
        if (str2 == null) {
            str = "";
        } else {
            str = str2;
        }
        String str3;
        if (c(j)) {
            aef aef = (aef) this.D.get((int) (j - this.G));
            str3 = aef.g;
            if (str3 == null) {
                str2 = String.valueOf(aef);
                throw new IllegalStateException(new StringBuilder(String.valueOf(str2).length() + 44).append("Extended directory must have a content URL: ").append(str2).toString());
            }
            Builder buildUpon = Uri.parse(str3).buildUpon();
            buildUpon.appendPath(str);
            buildUpon.appendQueryParameter("limit", String.valueOf(a(aef)));
            cursorLoader.setUri(buildUpon.build());
            cursorLoader.setProjection(ael.a);
            return;
        }
        Builder buildUpon2;
        boolean b = buf.b(j);
        if (this.p) {
            Uri a;
            if (b || !this.z) {
                a = abz.a();
            } else {
                a = abv.a();
            }
            buildUpon2 = a.buildUpon();
            buildUpon2.appendPath(str);
            buildUpon2.appendQueryParameter("directory", String.valueOf(j));
            if (b) {
                buildUpon2.appendQueryParameter("limit", String.valueOf(a(b(j))));
            }
        } else {
            Builder appendQueryParameter = (this.z ? Callable.CONTENT_URI : Phone.CONTENT_URI).buildUpon().appendQueryParameter("directory", "0");
            if (this.x) {
                appendQueryParameter.appendQueryParameter("android.provider.extra.ADDRESS_BOOK_INDEX", "true");
            }
            adn adn = this.t;
            if (adn == null || j != 0) {
                buildUpon2 = appendQueryParameter;
            } else {
                StringBuilder stringBuilder = new StringBuilder();
                List arrayList = new ArrayList();
                switch (adn.a) {
                    case -5:
                    case -2:
                    case oe.HOST_ID /*-1*/:
                        break;
                    case -3:
                        stringBuilder.append("in_visible_group=1");
                        stringBuilder.append(" AND has_phone_number=1");
                        break;
                    case rl.c /*0*/:
                        adn.a(appendQueryParameter);
                        break;
                    default:
                        String str4 = C;
                        int i = adn.a;
                        str2 = String.valueOf(adn);
                        Log.w(str4, new StringBuilder(String.valueOf(str2).length() + 82).append("Unsupported filter type came (type: ").append(i).append(", toString: ").append(str2).append(") showing all contacts.").toString());
                        break;
                }
                cursorLoader.setSelection(stringBuilder.toString());
                cursorLoader.setSelectionArgs((String[]) arrayList.toArray(new String[0]));
                buildUpon2 = appendQueryParameter;
            }
        }
        Object selection = cursorLoader.getSelection();
        if (TextUtils.isEmpty(selection)) {
            str = "length(data1) < 1000";
        } else {
            str3 = String.valueOf("length(data1) < 1000");
            str = new StringBuilder((String.valueOf(selection).length() + 5) + String.valueOf(str3).length()).append(selection).append(" AND ").append(str3).toString();
        }
        cursorLoader.setSelection(str);
        buildUpon2.appendQueryParameter("remove_duplicate_entries", "true");
        cursorLoader.setUri(buildUpon2.build());
        if (this.d == 1) {
            cursorLoader.setProjection(ael.a);
        } else {
            cursorLoader.setProjection(ael.b);
        }
        if (this.e == 1) {
            cursorLoader.setSortOrder("sort_key");
        } else {
            cursorLoader.setSortOrder("sort_key_alt");
        }
    }

    public final boolean c(long j) {
        return j >= this.G;
    }

    public final String k(int i) {
        Cursor cursor = (Cursor) getItem(i);
        return cursor != null ? cursor.getString(3) : null;
    }

    public Uri l(int i) {
        int f = f(i);
        Cursor cursor = (Cursor) getItem(i);
        if (cursor != null) {
            long j = ((aef) b(f)).f;
            if (!(buf.b(j) || buf.c(j))) {
                return ContentUris.withAppendedId(Data.CONTENT_URI, cursor.getLong(0));
            }
        }
        return null;
    }

    public adr b(Context context, int i, Cursor cursor, int i2, ViewGroup viewGroup) {
        adr b = super.b(context, i, cursor, i2, viewGroup);
        b.w = this.E;
        b.k = this.h;
        b.i = this.y;
        return b;
    }

    public void a(View view, int i, Cursor cursor, int i2) {
        super.a(view, i, cursor, i2);
        adr adr = (adr) view;
        a(adr, cursor);
        cursor.moveToPosition(i2);
        Object obj = 1;
        long j = cursor.getLong(4);
        if (cursor.moveToPrevious() && !cursor.isBeforeFirst() && j == cursor.getLong(4)) {
            obj = null;
        }
        cursor.moveToPosition(i2);
        if (cursor.moveToNext() && !cursor.isAfterLast()) {
            cursor.getLong(4);
        }
        cursor.moveToPosition(i2);
        adh.a(adr, cursor, 0);
        if (this.x) {
            String str;
            aeh j2 = j(i2);
            if (j2.a) {
                str = j2.b;
            } else {
                str = null;
            }
            adr.a(str);
        } else {
            adr.a(null);
        }
        if (obj != null) {
            adr.a(cursor, 7);
            if (this.h) {
                a(adr, i, cursor, 6, 8, 4, 5, 7);
            } else if (this.f) {
                if (i(i)) {
                    long j3 = 0;
                    if (!cursor.isNull(6)) {
                        j3 = cursor.getLong(6);
                    }
                    if (j3 != 0) {
                        this.m.a(adr.b(), j3, false, this.g, null);
                    } else {
                        String string = cursor.getString(8);
                        Uri parse = string == null ? null : Uri.parse(string);
                        abc abc = null;
                        if (parse == null) {
                            abc = new abc(cursor.getString(7), cursor.getString(5), this.g);
                        }
                        this.m.a(adr.b(), parse, false, this.g, abc);
                    }
                } else {
                    adr.a(false, true);
                }
            }
        } else {
            if (adr.m != null) {
                adr.removeView(adr.m);
                adr.m = null;
            }
            adr.a(true, false);
        }
        boolean z = ((aef) b(i)).n;
        CharSequence charSequence = null;
        if (z && !cursor.isNull(1)) {
            charSequence = Phone.getTypeLabel(this.a.getResources(), cursor.getInt(1), cursor.getString(2));
        }
        if (!TextUtils.isEmpty(charSequence)) {
            adr.c();
            adr.a(adr.n, charSequence);
            adr.n.setVisibility(0);
        } else if (adr.n != null) {
            adr.n.setVisibility(8);
        }
        if (z) {
            charSequence = cursor.getString(3);
        } else {
            charSequence = cursor.getString(2);
            if (charSequence == null) {
                charSequence = buf.b(this.v, cursor.getString(3));
            }
        }
        if (charSequence != null) {
            adr.d();
            CharSequence spannableString = new SpannableString(charSequence);
            if (adr.d.size() != 0) {
                adt adt = (adt) adr.d.get(0);
                adr.b.a((SpannableString) spannableString, adt.a, adt.b);
            }
            adr.a(adr.o, spannableString);
            adr.o.setVisibility(0);
            adr.o.setTextDirection(3);
            adr.o.setTextAlignment(5);
        } else if (adr.o != null) {
            adr.o.setVisibility(8);
        }
        if (abw.c()) {
            boolean z2 = this.H && ((this.I && ((cursor.getInt(9) & 1) != 0 ? 1 : null) != null) || !this.I);
            aek aek = this.A;
            adr.g = z2;
            adr.f = aek;
            adr.x = i2;
            if (adr.g) {
                if (adr.r == null) {
                    adr.r = new ImageView(adr.getContext());
                    adr.addView(adr.r);
                }
                adr.r.setContentDescription(adr.getContext().getString(buf.ez));
                adr.r.setImageResource(buf.de);
                adr.r.setScaleType(ScaleType.CENTER);
                adr.r.setVisibility(0);
                adr.r.setOnClickListener(new ads(adr));
            } else if (adr.r != null) {
                adr.r.setVisibility(8);
            }
        }
    }

    protected final void a(adr adr, int i) {
        long j = ((aef) b(i)).f;
        boolean z = !c(j) && abl.a(Long.valueOf(j), null) == 1;
        adr.b(z);
    }

    public final void a(Cursor cursor) {
        super.a(cursor);
        if (this.q != 0) {
            int size = this.D.size();
            if (this.b.size() != cursor.getCount() + size) {
                this.G = Long.MAX_VALUE;
                if (size > 0) {
                    long j;
                    int size2 = this.b.size();
                    int i = 0;
                    int i2 = 0;
                    long j2 = 1;
                    while (i < size2) {
                        long j3;
                        int i3;
                        j = ((aef) b(i)).f;
                        if (j > j2) {
                            j3 = j;
                        } else {
                            j3 = j2;
                        }
                        if (buf.b(j)) {
                            i3 = i2;
                        } else {
                            i3 = i + 1;
                        }
                        i++;
                        i2 = i3;
                        j2 = j3;
                    }
                    this.G = j2 + 1;
                    for (int i4 = 0; i4 < size; i4++) {
                        j = this.G + ((long) i4);
                        aef aef = (aef) this.D.get(i4);
                        if (a(j) == -1) {
                            this.b.add(i2, aef);
                            this.c = false;
                            notifyDataSetChanged();
                            aef.f = j;
                        }
                    }
                }
            }
        }
    }

    protected final Uri a(int i, Cursor cursor, int i2, int i3) {
        aef aef = (aef) b(i);
        long j = aef.f;
        if (c(j)) {
            return Contacts.CONTENT_LOOKUP_URI.buildUpon().appendPath("encoded").appendQueryParameter("displayName", aef.o).appendQueryParameter("directory", String.valueOf(j)).encodedFragment(cursor.getString(i3)).build();
        }
        return super.a(i, cursor, i2, i3);
    }

    public void a(adr adr, Cursor cursor) {
        String str;
        if (this.p) {
            str = this.o;
        } else {
            str = null;
        }
        adr.e = str;
    }
}
