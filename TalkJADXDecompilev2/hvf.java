package defpackage;

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
                a(hvc.a(parcel.readStrongBinder()), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 3:
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
                a(hvc.a(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 4:
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
                a(hvc.a(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.createStringArrayList(), parcel.readInt(), parcel.readInt() != 0, parcel.readLong());
                parcel2.writeNoException();
                return true;
            case 5:
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
                a(hvc.a(parcel.readStrongBinder()), parcel.readString(), parcel.readInt(), parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 6:
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
                a(hvc.a(parcel.readStrongBinder()), parcel.readLong(), parcel.readInt() != 0);
                parcel2.writeNoException();
                return true;
            case 7:
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
                a(hvc.a(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
                parcel2.writeNoException();
                return true;
            case 8:
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
                a = a(parcel.readInt() != 0 ? (Uri) Uri.CREATOR.createFromParcel(parcel) : null);
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
                a(hvc.a(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 10:
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
                a(hvc.a(parcel.readStrongBinder()), parcel.readString(), parcel.readInt() != 0, parcel.createStringArray());
                parcel2.writeNoException();
                return true;
            case 11:
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
                a = a(hvc.a(parcel.readStrongBinder()), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readInt());
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
                a = a(parcel.readString(), parcel.readString());
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
                a(hvc.a(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? (Uri) Uri.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case 14:
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
                a(hvc.a(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.createStringArrayList(), parcel.createStringArrayList());
                parcel2.writeNoException();
                return true;
            case 15:
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
                a(parcel.readInt() != 0);
                parcel2.writeNoException();
                return true;
            case 16:
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
                boolean a2 = a();
                parcel2.writeNoException();
                parcel2.writeInt(a2 ? 1 : 0);
                return true;
            case wi.dK /*17*/:
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
                a = b(parcel.readString(), parcel.readString());
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
                a(hvc.a(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? (Uri) Uri.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0);
                parcel2.writeNoException();
                return true;
            case wi.dL /*19*/:
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
                a(hvc.a(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readInt() != 0);
                parcel2.writeNoException();
                return true;
            case 20:
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
                a = a(parcel.readString(), parcel.readString(), parcel.readLong());
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
                a(hvc.a(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.createStringArrayList(), parcel.readInt(), parcel.readInt() != 0, parcel.readLong(), parcel.readString(), parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 22:
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
                b(hvc.a(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case wi.do /*23*/:
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
                a(hvc.a(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.createStringArrayList(), parcel.createStringArrayList(), parcel.readInt() != 0 ? (FavaDiagnosticsEntity) FavaDiagnosticsEntity.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case wi.dA /*24*/:
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
                a(hvc.a(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                return true;
            case wi.dz /*25*/:
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
                a(hvc.a(parcel.readStrongBinder()), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case wi.dx /*26*/:
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
                a = a(parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readInt() != 0);
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
                a(hvc.a(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 28:
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
                a(hvc.a(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.createStringArrayList());
                parcel2.writeNoException();
                return true;
            case 29:
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
                a(hvc.a(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 101:
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
                b(hvc.a(parcel.readStrongBinder()), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 102:
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
                c(hvc.a(parcel.readStrongBinder()), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 201:
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
                a(hvc.a(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt(), parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 202:
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
                a(hvc.a(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt() != 0, parcel.readInt(), parcel.readInt(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 203:
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
                a(hvc.a(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt() != 0, parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readInt() != 0);
                parcel2.writeNoException();
                return true;
            case HttpStatusCodes.STATUS_CODE_NO_CONTENT /*204*/:
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
                a(hvc.a(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 205:
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
                a = a(parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readInt() != 0, parcel.readInt() != 0);
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
                b(hvc.a(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.readInt());
                parcel2.writeNoException();
                return true;
            case HttpStatusCodes.STATUS_CODE_FOUND /*302*/:
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
                a(hvc.a(parcel.readStrongBinder()), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case HttpStatusCodes.STATUS_CODE_SEE_OTHER /*303*/:
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
                a(hvc.a(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case HttpStatusCodes.STATUS_CODE_NOT_MODIFIED /*304*/:
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
                b(hvc.a(parcel.readStrongBinder()), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case 305:
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
                a(hvc.a(parcel.readStrongBinder()), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readInt());
                parcel2.writeNoException();
                return true;
            case HttpStatusCodes.STATUS_CODE_UNAUTHORIZED /*401*/:
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
                a(hvc.a(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.createStringArrayList(), parcel.readInt(), parcel.readInt() != 0, parcel.readLong(), parcel.readString(), parcel.readInt(), parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 402:
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
                a(hvc.a(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt() != 0, parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readInt() != 0, parcel.readInt(), parcel.readInt());
                parcel2.writeNoException();
                return true;
            case HttpStatusCodes.STATUS_CODE_FORBIDDEN /*403*/:
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
                a(hvc.a(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.readInt());
                parcel2.writeNoException();
                return true;
            case HttpStatusCodes.STATUS_CODE_NOT_FOUND /*404*/:
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
                a(hvc.a(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.createStringArrayList(), parcel.readInt(), parcel.readInt() != 0, parcel.readLong(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 501:
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
                a(hvc.a(parcel.readStrongBinder()), parcel.readInt() != 0 ? (AccountToken) AccountToken.CREATOR.createFromParcel(parcel) : null, parcel.createStringArrayList(), parcel.readInt() != 0 ? (ParcelableGetOptions) ParcelableGetOptions.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case HttpStatusCodes.STATUS_CODE_BAD_GATEWAY /*502*/:
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
                b = b(hvc.a(parcel.readStrongBinder()), parcel.readString(), parcel.readInt(), parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeStrongBinder(b != null ? b.asBinder() : null);
                return true;
            case HttpStatusCodes.STATUS_CODE_SERVICE_UNAVAILABLE /*503*/:
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
                b = b(hvc.a(parcel.readStrongBinder()), parcel.readLong(), parcel.readInt() != 0);
                parcel2.writeNoException();
                parcel2.writeStrongBinder(b != null ? b.asBinder() : null);
                return true;
            case 504:
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
                b = b(hvc.a(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeStrongBinder(b != null ? b.asBinder() : null);
                return true;
            case 505:
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
                b = b(hvc.a(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeStrongBinder(b != null ? b.asBinder() : null);
                return true;
            case 506:
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
                b = c(hvc.a(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeStrongBinder(b != null ? b.asBinder() : null);
                return true;
            case 507:
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
                b = a(hvc.a(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt() != 0);
                parcel2.writeNoException();
                parcel2.writeStrongBinder(b != null ? b.asBinder() : null);
                return true;
            case 508:
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
                b = a(hvc.a(parcel.readStrongBinder()), parcel.readInt() != 0 ? (AvatarReference) AvatarReference.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (ParcelableLoadImageOptions) ParcelableLoadImageOptions.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                parcel2.writeStrongBinder(b != null ? b.asBinder() : null);
                return true;
            case 509:
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
                b = a(hvc.a(parcel.readStrongBinder()), parcel.readString(), parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeStrongBinder(b != null ? b.asBinder() : null);
                return true;
            case 601:
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
                b = a(hvc.a(parcel.readStrongBinder()), parcel.readInt() != 0 ? (AccountToken) AccountToken.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (ParcelableListOptions) ParcelableListOptions.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                parcel2.writeStrongBinder(b != null ? b.asBinder() : null);
                return true;
            case 602:
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
                b = a(hvc.a(parcel.readStrongBinder()), parcel.readInt() != 0 ? (DataHolder) DataHolder.CREATOR.createFromParcel(parcel) : null, parcel.readInt(), parcel.readInt(), parcel.readLong());
                parcel2.writeNoException();
                parcel2.writeStrongBinder(b != null ? b.asBinder() : null);
                return true;
            case 603:
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
                b(hvc.a(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
                parcel2.writeNoException();
                return true;
            case 701:
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
                a(hvc.a(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
                parcel2.writeNoException();
                return true;
            case 1101:
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
                d(hvc.a(parcel.readStrongBinder()), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 1102:
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
                a(hvc.a(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case 1201:
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
                b = b(hvc.a(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                parcel2.writeStrongBinder(b != null ? b.asBinder() : null);
                return true;
            case 1301:
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
                b = a(hvc.a(parcel.readStrongBinder()), parcel.readString(), parcel.readInt() != 0 ? (ParcelableLoadAutocompleteResultsOptions) ParcelableLoadAutocompleteResultsOptions.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                parcel2.writeStrongBinder(b != null ? b.asBinder() : null);
                return true;
            case 1302:
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
                b = a(hvc.a(parcel.readStrongBinder()), parcel.readString(), parcel.readInt() != 0 ? (ParcelableLoadContactGroupFieldsOptions) ParcelableLoadContactGroupFieldsOptions.CREATOR.createFromParcel(parcel) : null);
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
