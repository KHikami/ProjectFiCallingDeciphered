package p000;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.server.FavaDiagnosticsEntity;
import com.google.android.gms.people.identity.internal.AccountToken;
import com.google.android.gms.people.identity.internal.ParcelableGetOptions;
import com.google.android.gms.people.identity.internal.ParcelableListOptions;
import com.google.android.gms.people.internal.ParcelableLoadImageOptions;
import com.google.android.gms.people.internal.autocomplete.ParcelableLoadAutocompleteResultsOptions;
import com.google.android.gms.people.internal.autocomplete.ParcelableLoadContactGroupFieldsOptions;
import com.google.android.gms.people.model.AvatarReference;
import com.google.api.client.http.HttpStatusCodes;

public abstract class hvf extends Binder implements hve {
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        Bundle a;
        gws b;
        switch (i) {
            case 2:
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
                mo3005a(hvc.m20913a(parcel.readStrongBinder()), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 3:
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
                mo2986a(hvc.m20913a(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 4:
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
                mo2995a(hvc.m20913a(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.createStringArrayList(), parcel.readInt(), parcel.readInt() != 0, parcel.readLong());
                parcel2.writeNoException();
                return true;
            case 5:
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
                mo2978a(hvc.m20913a(parcel.readStrongBinder()), parcel.readString(), parcel.readInt(), parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 6:
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
                mo2974a(hvc.m20913a(parcel.readStrongBinder()), parcel.readLong(), parcel.readInt() != 0);
                parcel2.writeNoException();
                return true;
            case 7:
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
                mo3001a(hvc.m20913a(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
                parcel2.writeNoException();
                return true;
            case 8:
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
                a = mo2961a(parcel.readInt() != 0 ? (Uri) Uri.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                if (a != null) {
                    parcel2.writeInt(1);
                    a.writeToParcel(parcel2, 1);
                } else {
                    parcel2.writeInt(0);
                }
                return true;
            case 9:
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
                mo3002a(hvc.m20913a(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 10:
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
                mo3004a(hvc.m20913a(parcel.readStrongBinder()), parcel.readString(), parcel.readInt() != 0, parcel.createStringArray());
                parcel2.writeNoException();
                return true;
            case 11:
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
                a = mo2962a(hvc.m20913a(parcel.readStrongBinder()), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readInt());
                parcel2.writeNoException();
                if (a != null) {
                    parcel2.writeInt(1);
                    a.writeToParcel(parcel2, 1);
                } else {
                    parcel2.writeInt(0);
                }
                return true;
            case 12:
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
                a = mo2963a(parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                if (a != null) {
                    parcel2.writeInt(1);
                    a.writeToParcel(parcel2, 1);
                } else {
                    parcel2.writeInt(0);
                }
                return true;
            case 13:
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
                mo2982a(hvc.m20913a(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? (Uri) Uri.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case 14:
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
                mo2999a(hvc.m20913a(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.createStringArrayList(), parcel.createStringArrayList());
                parcel2.writeNoException();
                return true;
            case 15:
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
                mo3007a(parcel.readInt() != 0);
                parcel2.writeNoException();
                return true;
            case 16:
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
                boolean a2 = mo3008a();
                parcel2.writeNoException();
                parcel2.writeInt(a2 ? 1 : 0);
                return true;
            case wi.dK /*17*/:
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
                a = mo3009b(parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                if (a != null) {
                    parcel2.writeInt(1);
                    a.writeToParcel(parcel2, 1);
                } else {
                    parcel2.writeInt(0);
                }
                return true;
            case wi.dH /*18*/:
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
                mo2983a(hvc.m20913a(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? (Uri) Uri.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0);
                parcel2.writeNoException();
                return true;
            case wi.dL /*19*/:
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
                mo2987a(hvc.m20913a(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readInt() != 0);
                parcel2.writeNoException();
                return true;
            case 20:
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
                a = mo2964a(parcel.readString(), parcel.readString(), parcel.readLong());
                parcel2.writeNoException();
                if (a != null) {
                    parcel2.writeInt(1);
                    a.writeToParcel(parcel2, 1);
                } else {
                    parcel2.writeInt(0);
                }
                return true;
            case 21:
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
                mo2996a(hvc.m20913a(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.createStringArrayList(), parcel.readInt(), parcel.readInt() != 0, parcel.readLong(), parcel.readString(), parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 22:
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
                mo3018b(hvc.m20913a(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case wi.f29038do /*23*/:
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
                mo3000a(hvc.m20913a(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.createStringArrayList(), parcel.createStringArrayList(), parcel.readInt() != 0 ? (FavaDiagnosticsEntity) FavaDiagnosticsEntity.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case wi.dA /*24*/:
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
                mo2977a(hvc.m20913a(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                return true;
            case wi.dz /*25*/:
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
                mo2979a(hvc.m20913a(parcel.readStrongBinder()), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case wi.dx /*26*/:
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
                a = mo2965a(parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readInt() != 0);
                parcel2.writeNoException();
                if (a != null) {
                    parcel2.writeInt(1);
                    a.writeToParcel(parcel2, 1);
                } else {
                    parcel2.writeInt(0);
                }
                return true;
            case 27:
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
                mo2991a(hvc.m20913a(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 28:
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
                mo2994a(hvc.m20913a(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.createStringArrayList());
                parcel2.writeNoException();
                return true;
            case 29:
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
                mo2981a(hvc.m20913a(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 101:
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
                mo3016b(hvc.m20913a(parcel.readStrongBinder()), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 102:
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
                mo3021c(hvc.m20913a(parcel.readStrongBinder()), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 201:
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
                mo3003a(hvc.m20913a(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt(), parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 202:
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
                mo2988a(hvc.m20913a(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt() != 0, parcel.readInt(), parcel.readInt(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 203:
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
                mo2989a(hvc.m20913a(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt() != 0, parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readInt() != 0);
                parcel2.writeNoException();
                return true;
            case HttpStatusCodes.STATUS_CODE_NO_CONTENT /*204*/:
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
                mo2985a(hvc.m20913a(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 205:
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
                a = mo2966a(parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readInt() != 0, parcel.readInt() != 0);
                parcel2.writeNoException();
                if (a != null) {
                    parcel2.writeInt(1);
                    a.writeToParcel(parcel2, 1);
                } else {
                    parcel2.writeInt(0);
                }
                return true;
            case HttpStatusCodes.STATUS_CODE_MOVED_PERMANENTLY /*301*/:
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
                mo3017b(hvc.m20913a(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.readInt());
                parcel2.writeNoException();
                return true;
            case HttpStatusCodes.STATUS_CODE_FOUND /*302*/:
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
                mo2975a(hvc.m20913a(parcel.readStrongBinder()), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case HttpStatusCodes.STATUS_CODE_SEE_OTHER /*303*/:
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
                mo2992a(hvc.m20913a(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case HttpStatusCodes.STATUS_CODE_NOT_MODIFIED /*304*/:
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
                mo3015b(hvc.m20913a(parcel.readStrongBinder()), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case 305:
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
                mo3006a(hvc.m20913a(parcel.readStrongBinder()), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readInt());
                parcel2.writeNoException();
                return true;
            case HttpStatusCodes.STATUS_CODE_UNAUTHORIZED /*401*/:
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
                mo2997a(hvc.m20913a(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.createStringArrayList(), parcel.readInt(), parcel.readInt() != 0, parcel.readLong(), parcel.readString(), parcel.readInt(), parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 402:
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
                mo2990a(hvc.m20913a(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt() != 0, parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readInt() != 0, parcel.readInt(), parcel.readInt());
                parcel2.writeNoException();
                return true;
            case HttpStatusCodes.STATUS_CODE_FORBIDDEN /*403*/:
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
                mo2980a(hvc.m20913a(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.readInt());
                parcel2.writeNoException();
                return true;
            case HttpStatusCodes.STATUS_CODE_NOT_FOUND /*404*/:
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
                mo2998a(hvc.m20913a(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.createStringArrayList(), parcel.readInt(), parcel.readInt() != 0, parcel.readLong(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 501:
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
                mo2976a(hvc.m20913a(parcel.readStrongBinder()), parcel.readInt() != 0 ? (AccountToken) AccountToken.CREATOR.createFromParcel(parcel) : null, parcel.createStringArrayList(), parcel.readInt() != 0 ? (ParcelableGetOptions) ParcelableGetOptions.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case HttpStatusCodes.STATUS_CODE_BAD_GATEWAY /*502*/:
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
                b = mo3012b(hvc.m20913a(parcel.readStrongBinder()), parcel.readString(), parcel.readInt(), parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeStrongBinder(b != null ? b.asBinder() : null);
                return true;
            case HttpStatusCodes.STATUS_CODE_SERVICE_UNAVAILABLE /*503*/:
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
                b = mo3010b(hvc.m20913a(parcel.readStrongBinder()), parcel.readLong(), parcel.readInt() != 0);
                parcel2.writeNoException();
                parcel2.writeStrongBinder(b != null ? b.asBinder() : null);
                return true;
            case 504:
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
                b = mo3011b(hvc.m20913a(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeStrongBinder(b != null ? b.asBinder() : null);
                return true;
            case 505:
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
                b = mo3013b(hvc.m20913a(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeStrongBinder(b != null ? b.asBinder() : null);
                return true;
            case 506:
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
                b = mo3020c(hvc.m20913a(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeStrongBinder(b != null ? b.asBinder() : null);
                return true;
            case 507:
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
                b = mo2973a(hvc.m20913a(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt() != 0);
                parcel2.writeNoException();
                parcel2.writeStrongBinder(b != null ? b.asBinder() : null);
                return true;
            case 508:
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
                b = mo2969a(hvc.m20913a(parcel.readStrongBinder()), parcel.readInt() != 0 ? (AvatarReference) AvatarReference.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (ParcelableLoadImageOptions) ParcelableLoadImageOptions.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                parcel2.writeStrongBinder(b != null ? b.asBinder() : null);
                return true;
            case 509:
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
                b = mo2970a(hvc.m20913a(parcel.readStrongBinder()), parcel.readString(), parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeStrongBinder(b != null ? b.asBinder() : null);
                return true;
            case 601:
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
                b = mo2968a(hvc.m20913a(parcel.readStrongBinder()), parcel.readInt() != 0 ? (AccountToken) AccountToken.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (ParcelableListOptions) ParcelableListOptions.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                parcel2.writeStrongBinder(b != null ? b.asBinder() : null);
                return true;
            case 602:
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
                b = mo2967a(hvc.m20913a(parcel.readStrongBinder()), parcel.readInt() != 0 ? (DataHolder) DataHolder.CREATOR.createFromParcel(parcel) : null, parcel.readInt(), parcel.readInt(), parcel.readLong());
                parcel2.writeNoException();
                parcel2.writeStrongBinder(b != null ? b.asBinder() : null);
                return true;
            case 603:
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
                mo3019b(hvc.m20913a(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
                parcel2.writeNoException();
                return true;
            case 701:
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
                mo2993a(hvc.m20913a(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
                parcel2.writeNoException();
                return true;
            case 1101:
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
                mo3022d(hvc.m20913a(parcel.readStrongBinder()), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 1102:
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
                mo2984a(hvc.m20913a(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case 1201:
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
                b = mo3014b(hvc.m20913a(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                parcel2.writeStrongBinder(b != null ? b.asBinder() : null);
                return true;
            case 1301:
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
                b = mo2971a(hvc.m20913a(parcel.readStrongBinder()), parcel.readString(), parcel.readInt() != 0 ? (ParcelableLoadAutocompleteResultsOptions) ParcelableLoadAutocompleteResultsOptions.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                parcel2.writeStrongBinder(b != null ? b.asBinder() : null);
                return true;
            case 1302:
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
                b = mo2972a(hvc.m20913a(parcel.readStrongBinder()), parcel.readString(), parcel.readInt() != 0 ? (ParcelableLoadContactGroupFieldsOptions) ParcelableLoadContactGroupFieldsOptions.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                parcel2.writeStrongBinder(b != null ? b.asBinder() : null);
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.gms.people.internal.IPeopleService");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
