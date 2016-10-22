package defpackage;

import android.content.ContentUris;
import android.content.Context;
import android.content.CursorLoader;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.net.Uri.Builder;
import android.preference.PreferenceManager;
import android.provider.ContactsContract.Contacts;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* renamed from: aeb */
public class aeb extends adl {
    public aeb(Context context) {
        super(context);
    }

    public final void a(CursorLoader cursorLoader, long j) {
        String str;
        if (cursorLoader instanceof aeq) {
            ((aeq) cursorLoader).a = this.j;
        }
        if (this.p) {
            str = this.n;
            if (str == null) {
                str = "";
            }
            Object trim = str.trim();
            if (TextUtils.isEmpty(trim)) {
                cursorLoader.setUri(Contacts.CONTENT_URI);
                cursorLoader.setProjection(a(false));
                cursorLoader.setSelection("0");
            } else {
                Builder buildUpon = abx.a().buildUpon();
                buildUpon.appendPath(trim);
                buildUpon.appendQueryParameter("directory", String.valueOf(j));
                if (!(j == 0 || j == 1)) {
                    buildUpon.appendQueryParameter("limit", String.valueOf(a(b(j))));
                }
                buildUpon.appendQueryParameter("deferred_snippeting", "1");
                cursorLoader.setUri(buildUpon.build());
                cursorLoader.setProjection(a(true));
            }
        } else {
            adn adn = this.t;
            Uri uri = Contacts.CONTENT_URI;
            if (adn != null && adn.a == -6) {
                uri = null != null ? Uri.withAppendedPath(Contacts.CONTENT_LOOKUP_URI, null) : ContentUris.withAppendedId(Contacts.CONTENT_URI, 0);
            }
            if (j == 0 && this.x) {
                uri = uri.buildUpon().appendQueryParameter("android.provider.extra.ADDRESS_BOOK_INDEX", "true").build();
            }
            if (!(adn == null || adn.a == -3 || adn.a == -6)) {
                Builder buildUpon2 = uri.buildUpon();
                buildUpon2.appendQueryParameter("directory", "0");
                if (adn.a == 0) {
                    adn.a(buildUpon2);
                }
                uri = buildUpon2.build();
            }
            cursorLoader.setUri(uri);
            cursorLoader.setProjection(a(false));
            if (adn != null && j == 0) {
                StringBuilder stringBuilder = new StringBuilder();
                List arrayList = new ArrayList();
                switch (adn.a) {
                    case -5:
                        stringBuilder.append("has_phone_number=1");
                        break;
                    case -4:
                        stringBuilder.append("starred!=0");
                        break;
                    case -3:
                        stringBuilder.append("in_visible_group=1");
                        if (PreferenceManager.getDefaultSharedPreferences(this.a).getBoolean("only_phones", false)) {
                            stringBuilder.append(" AND has_phone_number=1");
                            break;
                        }
                        break;
                }
                cursorLoader.setSelection(stringBuilder.toString());
                cursorLoader.setSelectionArgs((String[]) arrayList.toArray(new String[0]));
            }
        }
        if (this.e == 1) {
            str = "sort_key";
        } else {
            str = "sort_key_alt";
        }
        cursorLoader.setSortOrder(str);
    }

    public void a(View view, int i, Cursor cursor, int i2) {
        String str;
        Drawable drawable;
        int i3;
        super.a(view, i, cursor, i2);
        adr adr = (adr) view;
        if (this.p) {
            str = this.o;
        } else {
            str = null;
        }
        adr.e = str;
        if (this.s) {
            boolean z;
            long j = ((aef) b(i)).f;
            if (0 == j) {
                if (null != null && TextUtils.equals(null, cursor.getString(6))) {
                    z = true;
                    adr.setActivated(z);
                } else if (!(j == 0 || j == 1 || 0 != cursor.getLong(0))) {
                    z = true;
                    adr.setActivated(z);
                }
            }
            z = false;
            adr.setActivated(z);
        }
        adr.j = this.x;
        if (this.x) {
            adr.a(j(i2).b);
        } else {
            adr.a(null);
        }
        if (this.h) {
            a(adr, i, cursor, 4, 5, 0, 6, 1);
        } else if (this.f) {
            if (i(i)) {
                long j2 = 0;
                if (!cursor.isNull(4)) {
                    j2 = cursor.getLong(4);
                }
                if (j2 != 0) {
                    this.m.a(adr.b(), j2, false, this.g, null);
                } else {
                    str = cursor.getString(5);
                    Uri parse = str == null ? null : Uri.parse(str);
                    abc abc = null;
                    if (parse == null) {
                        abc = a(cursor, 1, 6);
                    }
                    this.m.a(adr.b(), parse, false, this.g, abc);
                }
            } else {
                adr.a(false, true);
            }
        }
        adr.a(cursor, 1);
        adh.a(adr, cursor, 0);
        if (cursor.isNull(2)) {
            drawable = null;
            i3 = 0;
        } else {
            int i4 = cursor.getInt(2);
            int i5 = i4;
            drawable = buf.d(adr.getContext(), i4);
            i3 = i5;
        }
        if (drawable != null) {
            if (adr.q == null) {
                adr.q = new ImageView(adr.getContext());
                adr.addView(adr.q);
            }
            adr.q.setImageDrawable(drawable);
            adr.q.setScaleType(ScaleType.CENTER);
            adr.q.setVisibility(0);
        } else if (adr.q != null) {
            adr.q.setVisibility(8);
        }
        CharSequence charSequence = null;
        if (!cursor.isNull(3)) {
            charSequence = cursor.getString(3);
        }
        if (charSequence == null && i3 != 0) {
            charSequence = buf.e(adr.getContext(), i3);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            if (adr.p == null) {
                adr.p = new TextView(adr.getContext());
                adr.p.setSingleLine(true);
                adr.p.setEllipsize(adr.e());
                adr.p.setTextAppearance(adr.getContext(), 16973894);
                adr.p.setTextColor(adr.s);
                adr.p.setActivated(adr.isActivated());
                adr.p.setTextAlignment(5);
                adr.addView(adr.p);
            }
            TextView textView = adr.p;
            adr.a(adr.p, charSequence);
            adr.p.setVisibility(0);
        } else if (adr.p != null) {
            adr.p.setVisibility(8);
        }
        if (this.p) {
            adl.a(adr, cursor);
        } else {
            adr.b(null);
        }
    }
}
