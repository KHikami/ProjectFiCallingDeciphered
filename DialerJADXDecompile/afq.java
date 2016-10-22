import android.content.ContentValues;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.provider.ContactsContract.Data;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* compiled from: PG */
public final class afq implements Parcelable {
    public static final Creator CREATOR;
    final ContentValues a;
    afb b;
    private final ArrayList c;

    static {
        CREATOR = new afr();
    }

    public afq() {
        this(new ContentValues());
    }

    public afq(ContentValues contentValues) {
        this.a = contentValues;
        this.c = new ArrayList();
    }

    afq(Parcel parcel) {
        this.a = (ContentValues) parcel.readParcelable(ContentValues.class.getClassLoader());
        this.c = new ArrayList();
        parcel.readTypedList(this.c, afs.CREATOR);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeTypedList(this.c);
    }

    public final void a(ContentValues contentValues) {
        this.c.add(new afs(Data.CONTENT_URI, contentValues));
    }

    public final ArrayList c() {
        ArrayList arrayList = new ArrayList(this.c.size());
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            afs afs = (afs) it.next();
            if (Data.CONTENT_URI.equals(afs.a)) {
                arrayList.add(afs.b);
            }
        }
        return arrayList;
    }

    public final List d() {
        List arrayList = new ArrayList(this.c.size());
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            afs afs = (afs) it.next();
            if (Data.CONTENT_URI.equals(afs.a)) {
                Object ahp;
                ContentValues contentValues = afs.b;
                String asString = contentValues.getAsString("mimetype");
                if ("vnd.android.cursor.item/group_membership".equals(asString)) {
                    ahp = new ahp(contentValues);
                } else if ("vnd.android.cursor.item/name".equals(asString)) {
                    ahp = new ahz(contentValues);
                } else if ("vnd.android.cursor.item/phone_v2".equals(asString)) {
                    ahp = new ahv(contentValues);
                } else if ("vnd.android.cursor.item/email_v2".equals(asString)) {
                    ahp = new ahn(contentValues);
                } else if ("vnd.android.cursor.item/postal-address_v2".equals(asString)) {
                    ahp = new aia(contentValues);
                } else if ("vnd.android.cursor.item/im".equals(asString)) {
                    ahp = new ahr(contentValues);
                } else if ("vnd.android.cursor.item/organization".equals(asString)) {
                    ahp = new ahu(contentValues);
                } else if ("vnd.android.cursor.item/nickname".equals(asString)) {
                    ahp = new ahs(contentValues);
                } else if ("vnd.android.cursor.item/note".equals(asString)) {
                    ahp = new aht(contentValues);
                } else if ("vnd.android.cursor.item/website".equals(asString)) {
                    ahp = new aib(contentValues);
                } else if ("vnd.android.cursor.item/sip_address".equals(asString)) {
                    ahp = new ahy(contentValues);
                } else if ("vnd.android.cursor.item/contact_event".equals(asString)) {
                    ahp = new aho(contentValues);
                } else if ("vnd.android.cursor.item/relation".equals(asString)) {
                    ahp = new ahx(contentValues);
                } else if ("vnd.android.cursor.item/identity".equals(asString)) {
                    ahp = new ahq(contentValues);
                } else if ("vnd.android.cursor.item/photo".equals(asString)) {
                    ahp = new ahw(contentValues);
                } else {
                    ahp = new ahl(contentValues);
                }
                arrayList.add(ahp);
            }
        }
        return arrayList;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("RawContact: ").append(this.a);
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            afs afs = (afs) it.next();
            stringBuilder.append("\n  ").append(afs.a);
            stringBuilder.append("\n  -> ").append(afs.b);
        }
        return stringBuilder.toString();
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.a, this.c});
    }

    public final boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        afq afq = (afq) obj;
        if (Objects.equals(this.a, afq.a) && Objects.equals(this.c, afq.c)) {
            return true;
        }
        return false;
    }

    public final String a() {
        return this.a.getAsString("account_type");
    }

    public final String b() {
        return this.a.getAsString("data_set");
    }
}
