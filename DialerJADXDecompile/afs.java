import android.content.ContentValues;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.Objects;

/* compiled from: PG */
public final class afs implements Parcelable {
    public static final Creator CREATOR;
    public final Uri a;
    public final ContentValues b;

    static {
        CREATOR = new aft();
    }

    public afs(Uri uri, ContentValues contentValues) {
        this.a = uri;
        this.b = contentValues;
    }

    public afs(Parcel parcel) {
        this.a = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.b = (ContentValues) parcel.readParcelable(ContentValues.class.getClassLoader());
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeParcelable(this.b, i);
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.a, this.b});
    }

    public final boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        afs afs = (afs) obj;
        if (Objects.equals(this.a, afs.a) && Objects.equals(this.b, afs.b)) {
            return true;
        }
        return false;
    }
}
