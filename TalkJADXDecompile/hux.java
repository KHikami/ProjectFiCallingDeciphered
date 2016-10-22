import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.people.internal.autocomplete.ParcelableLoadAutocompleteResultsOptions;

public final class hux implements Creator<ParcelableLoadAutocompleteResultsOptions> {
    public /* synthetic */ Object[] newArray(int i) {
        return new ParcelableLoadAutocompleteResultsOptions[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i = 0;
        int b = gwb.b(parcel);
        long j = 0;
        String str = null;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int a = gwb.a(parcel);
            switch (gwb.y(a)) {
                case wi.j /*1*/:
                    i2 = gwb.f(parcel, a);
                    break;
                case wi.l /*2*/:
                    i = gwb.f(parcel, a);
                    break;
                case wi.z /*3*/:
                    j = gwb.h(parcel, a);
                    break;
                case wi.h /*4*/:
                    str = gwb.l(parcel, a);
                    break;
                default:
                    gwb.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new ParcelableLoadAutocompleteResultsOptions(i2, i, j, str);
        }
        throw new dt("Overread allowed size end=" + b, parcel);
    }
}
