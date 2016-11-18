package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
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
import java.util.List;

final class hvg implements hve {
    private IBinder a;

    hvg(IBinder iBinder) {
        this.a = iBinder;
    }

    public Bundle a(Uri uri) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            if (uri != null) {
                obtain.writeInt(1);
                uri.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.a.transact(8, obtain, obtain2, 0);
            obtain2.readException();
            Bundle bundle = obtain2.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(obtain2) : null;
            obtain2.recycle();
            obtain.recycle();
            return bundle;
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public Bundle a(hvb hvb, boolean z, String str, String str2, int i) {
        Bundle bundle = null;
        int i2 = 0;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            obtain.writeStrongBinder(hvb != null ? hvb.asBinder() : null);
            if (z) {
                i2 = 1;
            }
            obtain.writeInt(i2);
            obtain.writeString(str);
            obtain.writeString(str2);
            obtain.writeInt(i);
            this.a.transact(11, obtain, obtain2, 0);
            obtain2.readException();
            if (obtain2.readInt() != 0) {
                bundle = (Bundle) Bundle.CREATOR.createFromParcel(obtain2);
            }
            obtain2.recycle();
            obtain.recycle();
            return bundle;
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public Bundle a(String str, String str2) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            obtain.writeString(str);
            obtain.writeString(str2);
            this.a.transact(12, obtain, obtain2, 0);
            obtain2.readException();
            Bundle bundle = obtain2.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(obtain2) : null;
            obtain2.recycle();
            obtain.recycle();
            return bundle;
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public Bundle a(String str, String str2, long j) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            obtain.writeString(str);
            obtain.writeString(str2);
            obtain.writeLong(j);
            this.a.transact(20, obtain, obtain2, 0);
            obtain2.readException();
            Bundle bundle = obtain2.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(obtain2) : null;
            obtain2.recycle();
            obtain.recycle();
            return bundle;
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public Bundle a(String str, String str2, long j, boolean z) {
        int i = 0;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            obtain.writeString(str);
            obtain.writeString(str2);
            obtain.writeLong(j);
            if (z) {
                i = 1;
            }
            obtain.writeInt(i);
            this.a.transact(26, obtain, obtain2, 0);
            obtain2.readException();
            Bundle bundle = obtain2.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(obtain2) : null;
            obtain2.recycle();
            obtain.recycle();
            return bundle;
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public Bundle a(String str, String str2, long j, boolean z, boolean z2) {
        int i = 1;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            obtain.writeString(str);
            obtain.writeString(str2);
            obtain.writeLong(j);
            obtain.writeInt(z ? 1 : 0);
            if (!z2) {
                i = 0;
            }
            obtain.writeInt(i);
            this.a.transact(205, obtain, obtain2, 0);
            obtain2.readException();
            Bundle bundle = obtain2.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(obtain2) : null;
            obtain2.recycle();
            obtain.recycle();
            return bundle;
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public gws a(hvb hvb, DataHolder dataHolder, int i, int i2, long j) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            obtain.writeStrongBinder(hvb != null ? hvb.asBinder() : null);
            if (dataHolder != null) {
                obtain.writeInt(1);
                dataHolder.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            obtain.writeInt(i);
            obtain.writeInt(i2);
            obtain.writeLong(j);
            this.a.transact(602, obtain, obtain2, 0);
            obtain2.readException();
            gws a = gwt.a(obtain2.readStrongBinder());
            return a;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public gws a(hvb hvb, AccountToken accountToken, ParcelableListOptions parcelableListOptions) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            obtain.writeStrongBinder(hvb != null ? hvb.asBinder() : null);
            if (accountToken != null) {
                obtain.writeInt(1);
                accountToken.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            if (parcelableListOptions != null) {
                obtain.writeInt(1);
                parcelableListOptions.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.a.transact(601, obtain, obtain2, 0);
            obtain2.readException();
            gws a = gwt.a(obtain2.readStrongBinder());
            return a;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public gws a(hvb hvb, AvatarReference avatarReference, ParcelableLoadImageOptions parcelableLoadImageOptions) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            obtain.writeStrongBinder(hvb != null ? hvb.asBinder() : null);
            if (avatarReference != null) {
                obtain.writeInt(1);
                avatarReference.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            if (parcelableLoadImageOptions != null) {
                obtain.writeInt(1);
                parcelableLoadImageOptions.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.a.transact(508, obtain, obtain2, 0);
            obtain2.readException();
            gws a = gwt.a(obtain2.readStrongBinder());
            return a;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public gws a(hvb hvb, String str, int i) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            obtain.writeStrongBinder(hvb != null ? hvb.asBinder() : null);
            obtain.writeString(str);
            obtain.writeInt(i);
            this.a.transact(509, obtain, obtain2, 0);
            obtain2.readException();
            gws a = gwt.a(obtain2.readStrongBinder());
            return a;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public gws a(hvb hvb, String str, ParcelableLoadAutocompleteResultsOptions parcelableLoadAutocompleteResultsOptions) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            obtain.writeStrongBinder(hvb != null ? hvb.asBinder() : null);
            obtain.writeString(str);
            if (parcelableLoadAutocompleteResultsOptions != null) {
                obtain.writeInt(1);
                parcelableLoadAutocompleteResultsOptions.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.a.transact(1301, obtain, obtain2, 0);
            obtain2.readException();
            gws a = gwt.a(obtain2.readStrongBinder());
            return a;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public gws a(hvb hvb, String str, ParcelableLoadContactGroupFieldsOptions parcelableLoadContactGroupFieldsOptions) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            obtain.writeStrongBinder(hvb != null ? hvb.asBinder() : null);
            obtain.writeString(str);
            if (parcelableLoadContactGroupFieldsOptions != null) {
                obtain.writeInt(1);
                parcelableLoadContactGroupFieldsOptions.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.a.transact(1302, obtain, obtain2, 0);
            obtain2.readException();
            gws a = gwt.a(obtain2.readStrongBinder());
            return a;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public gws a(hvb hvb, String str, String str2, boolean z, String str3, String str4, int i, int i2, int i3, boolean z2) {
        int i4 = 1;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            obtain.writeStrongBinder(hvb != null ? hvb.asBinder() : null);
            obtain.writeString(str);
            obtain.writeString(str2);
            obtain.writeInt(z ? 1 : 0);
            obtain.writeString(str3);
            obtain.writeString(str4);
            obtain.writeInt(i);
            obtain.writeInt(i2);
            obtain.writeInt(i3);
            if (!z2) {
                i4 = 0;
            }
            obtain.writeInt(i4);
            this.a.transact(507, obtain, obtain2, 0);
            obtain2.readException();
            gws a = gwt.a(obtain2.readStrongBinder());
            return a;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void a(hvb hvb, long j, boolean z) {
        int i = 0;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            obtain.writeStrongBinder(hvb != null ? hvb.asBinder() : null);
            obtain.writeLong(j);
            if (z) {
                i = 1;
            }
            obtain.writeInt(i);
            this.a.transact(6, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void a(hvb hvb, Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            obtain.writeStrongBinder(hvb != null ? hvb.asBinder() : null);
            if (bundle != null) {
                obtain.writeInt(1);
                bundle.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.a.transact(HttpStatusCodes.STATUS_CODE_FOUND, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void a(hvb hvb, AccountToken accountToken, List<String> list, ParcelableGetOptions parcelableGetOptions) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            obtain.writeStrongBinder(hvb != null ? hvb.asBinder() : null);
            if (accountToken != null) {
                obtain.writeInt(1);
                accountToken.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            obtain.writeStringList(list);
            if (parcelableGetOptions != null) {
                obtain.writeInt(1);
                parcelableGetOptions.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.a.transact(501, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void a(hvb hvb, String str) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            obtain.writeStrongBinder(hvb != null ? hvb.asBinder() : null);
            obtain.writeString(str);
            this.a.transact(24, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void a(hvb hvb, String str, int i, int i2) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            obtain.writeStrongBinder(hvb != null ? hvb.asBinder() : null);
            obtain.writeString(str);
            obtain.writeInt(i);
            obtain.writeInt(i2);
            this.a.transact(5, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void a(hvb hvb, String str, String str2) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            obtain.writeStrongBinder(hvb != null ? hvb.asBinder() : null);
            obtain.writeString(str);
            obtain.writeString(str2);
            this.a.transact(25, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void a(hvb hvb, String str, String str2, int i) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            obtain.writeStrongBinder(hvb != null ? hvb.asBinder() : null);
            obtain.writeString(str);
            obtain.writeString(str2);
            obtain.writeInt(i);
            this.a.transact(HttpStatusCodes.STATUS_CODE_FORBIDDEN, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void a(hvb hvb, String str, String str2, int i, int i2) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            obtain.writeStrongBinder(hvb != null ? hvb.asBinder() : null);
            obtain.writeString(str);
            obtain.writeString(str2);
            obtain.writeInt(i);
            obtain.writeInt(i2);
            this.a.transact(29, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void a(hvb hvb, String str, String str2, Uri uri) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            obtain.writeStrongBinder(hvb != null ? hvb.asBinder() : null);
            obtain.writeString(str);
            obtain.writeString(str2);
            if (uri != null) {
                obtain.writeInt(1);
                uri.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.a.transact(13, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void a(hvb hvb, String str, String str2, Uri uri, boolean z) {
        int i = 1;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            obtain.writeStrongBinder(hvb != null ? hvb.asBinder() : null);
            obtain.writeString(str);
            obtain.writeString(str2);
            if (uri != null) {
                obtain.writeInt(1);
                uri.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            if (!z) {
                i = 0;
            }
            obtain.writeInt(i);
            this.a.transact(18, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void a(hvb hvb, String str, String str2, Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            obtain.writeStrongBinder(hvb != null ? hvb.asBinder() : null);
            obtain.writeString(str);
            obtain.writeString(str2);
            if (bundle != null) {
                obtain.writeInt(1);
                bundle.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.a.transact(1102, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void a(hvb hvb, String str, String str2, String str3) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            obtain.writeStrongBinder(hvb != null ? hvb.asBinder() : null);
            obtain.writeString(str);
            obtain.writeString(str2);
            obtain.writeString(str3);
            this.a.transact(HttpStatusCodes.STATUS_CODE_NO_CONTENT, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void a(hvb hvb, String str, String str2, String str3, int i, String str4) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            obtain.writeStrongBinder(hvb != null ? hvb.asBinder() : null);
            obtain.writeString(str);
            obtain.writeString(str2);
            obtain.writeString(str3);
            obtain.writeInt(i);
            obtain.writeString(str4);
            this.a.transact(3, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void a(hvb hvb, String str, String str2, String str3, int i, String str4, boolean z) {
        int i2 = 0;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            obtain.writeStrongBinder(hvb != null ? hvb.asBinder() : null);
            obtain.writeString(str);
            obtain.writeString(str2);
            obtain.writeString(str3);
            obtain.writeInt(i);
            obtain.writeString(str4);
            if (z) {
                i2 = 1;
            }
            obtain.writeInt(i2);
            this.a.transact(19, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void a(hvb hvb, String str, String str2, String str3, int i, boolean z, int i2, int i3, String str4) {
        int i4 = 0;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            obtain.writeStrongBinder(hvb != null ? hvb.asBinder() : null);
            obtain.writeString(str);
            obtain.writeString(str2);
            obtain.writeString(str3);
            obtain.writeInt(i);
            if (z) {
                i4 = 1;
            }
            obtain.writeInt(i4);
            obtain.writeInt(i2);
            obtain.writeInt(i3);
            obtain.writeString(str4);
            this.a.transact(202, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void a(hvb hvb, String str, String str2, String str3, int i, boolean z, int i2, int i3, String str4, boolean z2) {
        int i4 = 1;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            obtain.writeStrongBinder(hvb != null ? hvb.asBinder() : null);
            obtain.writeString(str);
            obtain.writeString(str2);
            obtain.writeString(str3);
            obtain.writeInt(i);
            obtain.writeInt(z ? 1 : 0);
            obtain.writeInt(i2);
            obtain.writeInt(i3);
            obtain.writeString(str4);
            if (!z2) {
                i4 = 0;
            }
            obtain.writeInt(i4);
            this.a.transact(203, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void a(hvb hvb, String str, String str2, String str3, int i, boolean z, int i2, int i3, String str4, boolean z2, int i4, int i5) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            obtain.writeStrongBinder(hvb != null ? hvb.asBinder() : null);
            obtain.writeString(str);
            obtain.writeString(str2);
            obtain.writeString(str3);
            obtain.writeInt(i);
            obtain.writeInt(z ? 1 : 0);
            obtain.writeInt(i2);
            obtain.writeInt(i3);
            obtain.writeString(str4);
            obtain.writeInt(z2 ? 1 : 0);
            obtain.writeInt(i4);
            obtain.writeInt(i5);
            this.a.transact(402, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void a(hvb hvb, String str, String str2, String str3, String str4) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            obtain.writeStrongBinder(hvb != null ? hvb.asBinder() : null);
            obtain.writeString(str);
            obtain.writeString(str2);
            obtain.writeString(str3);
            obtain.writeString(str4);
            this.a.transact(27, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void a(hvb hvb, String str, String str2, String str3, String str4, int i, String str5) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            obtain.writeStrongBinder(hvb != null ? hvb.asBinder() : null);
            obtain.writeString(str);
            obtain.writeString(str2);
            obtain.writeString(str3);
            obtain.writeString(str4);
            obtain.writeInt(i);
            obtain.writeString(str5);
            this.a.transact(HttpStatusCodes.STATUS_CODE_SEE_OTHER, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void a(hvb hvb, String str, String str2, String str3, String str4, boolean z) {
        int i = 0;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            obtain.writeStrongBinder(hvb != null ? hvb.asBinder() : null);
            obtain.writeString(str);
            obtain.writeString(str2);
            obtain.writeString(str3);
            obtain.writeString(str4);
            if (z) {
                i = 1;
            }
            obtain.writeInt(i);
            this.a.transact(701, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void a(hvb hvb, String str, String str2, String str3, List<String> list) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            obtain.writeStrongBinder(hvb != null ? hvb.asBinder() : null);
            obtain.writeString(str);
            obtain.writeString(str2);
            obtain.writeString(str3);
            obtain.writeStringList(list);
            this.a.transact(28, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void a(hvb hvb, String str, String str2, String str3, List<String> list, int i, boolean z, long j) {
        int i2 = 0;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            obtain.writeStrongBinder(hvb != null ? hvb.asBinder() : null);
            obtain.writeString(str);
            obtain.writeString(str2);
            obtain.writeString(str3);
            obtain.writeStringList(list);
            obtain.writeInt(i);
            if (z) {
                i2 = 1;
            }
            obtain.writeInt(i2);
            obtain.writeLong(j);
            this.a.transact(4, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void a(hvb hvb, String str, String str2, String str3, List<String> list, int i, boolean z, long j, String str4, int i2) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            obtain.writeStrongBinder(hvb != null ? hvb.asBinder() : null);
            obtain.writeString(str);
            obtain.writeString(str2);
            obtain.writeString(str3);
            obtain.writeStringList(list);
            obtain.writeInt(i);
            obtain.writeInt(z ? 1 : 0);
            obtain.writeLong(j);
            obtain.writeString(str4);
            obtain.writeInt(i2);
            this.a.transact(21, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void a(hvb hvb, String str, String str2, String str3, List<String> list, int i, boolean z, long j, String str4, int i2, int i3) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            obtain.writeStrongBinder(hvb != null ? hvb.asBinder() : null);
            obtain.writeString(str);
            obtain.writeString(str2);
            obtain.writeString(str3);
            obtain.writeStringList(list);
            obtain.writeInt(i);
            obtain.writeInt(z ? 1 : 0);
            obtain.writeLong(j);
            obtain.writeString(str4);
            obtain.writeInt(i2);
            obtain.writeInt(i3);
            this.a.transact(HttpStatusCodes.STATUS_CODE_UNAUTHORIZED, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void a(hvb hvb, String str, String str2, String str3, List<String> list, int i, boolean z, long j, String str4, int i2, int i3, int i4) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            obtain.writeStrongBinder(hvb != null ? hvb.asBinder() : null);
            obtain.writeString(str);
            obtain.writeString(str2);
            obtain.writeString(str3);
            obtain.writeStringList(list);
            obtain.writeInt(i);
            obtain.writeInt(z ? 1 : 0);
            obtain.writeLong(j);
            obtain.writeString(str4);
            obtain.writeInt(i2);
            obtain.writeInt(i3);
            obtain.writeInt(i4);
            this.a.transact(HttpStatusCodes.STATUS_CODE_NOT_FOUND, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void a(hvb hvb, String str, String str2, String str3, List<String> list, List<String> list2) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            obtain.writeStrongBinder(hvb != null ? hvb.asBinder() : null);
            obtain.writeString(str);
            obtain.writeString(str2);
            obtain.writeString(str3);
            obtain.writeStringList(list);
            obtain.writeStringList(list2);
            this.a.transact(14, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void a(hvb hvb, String str, String str2, String str3, List<String> list, List<String> list2, FavaDiagnosticsEntity favaDiagnosticsEntity) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            obtain.writeStrongBinder(hvb != null ? hvb.asBinder() : null);
            obtain.writeString(str);
            obtain.writeString(str2);
            obtain.writeString(str3);
            obtain.writeStringList(list);
            obtain.writeStringList(list2);
            if (favaDiagnosticsEntity != null) {
                obtain.writeInt(1);
                favaDiagnosticsEntity.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.a.transact(23, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void a(hvb hvb, String str, String str2, String str3, boolean z) {
        int i = 0;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            obtain.writeStrongBinder(hvb != null ? hvb.asBinder() : null);
            obtain.writeString(str);
            obtain.writeString(str2);
            obtain.writeString(str3);
            if (z) {
                i = 1;
            }
            obtain.writeInt(i);
            this.a.transact(7, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void a(hvb hvb, String str, String str2, String str3, boolean z, int i) {
        int i2 = 0;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            obtain.writeStrongBinder(hvb != null ? hvb.asBinder() : null);
            obtain.writeString(str);
            obtain.writeString(str2);
            obtain.writeString(str3);
            if (z) {
                i2 = 1;
            }
            obtain.writeInt(i2);
            obtain.writeInt(i);
            this.a.transact(9, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void a(hvb hvb, String str, String str2, String str3, boolean z, int i, int i2) {
        int i3 = 0;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            obtain.writeStrongBinder(hvb != null ? hvb.asBinder() : null);
            obtain.writeString(str);
            obtain.writeString(str2);
            obtain.writeString(str3);
            if (z) {
                i3 = 1;
            }
            obtain.writeInt(i3);
            obtain.writeInt(i);
            obtain.writeInt(i2);
            this.a.transact(201, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void a(hvb hvb, String str, boolean z, String[] strArr) {
        int i = 0;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            obtain.writeStrongBinder(hvb != null ? hvb.asBinder() : null);
            obtain.writeString(str);
            if (z) {
                i = 1;
            }
            obtain.writeInt(i);
            obtain.writeStringArray(strArr);
            this.a.transact(10, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void a(hvb hvb, boolean z, boolean z2, String str, String str2) {
        int i = 1;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            obtain.writeStrongBinder(hvb != null ? hvb.asBinder() : null);
            obtain.writeInt(z ? 1 : 0);
            if (!z2) {
                i = 0;
            }
            obtain.writeInt(i);
            obtain.writeString(str);
            obtain.writeString(str2);
            this.a.transact(2, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void a(hvb hvb, boolean z, boolean z2, String str, String str2, int i) {
        int i2 = 1;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            obtain.writeStrongBinder(hvb != null ? hvb.asBinder() : null);
            obtain.writeInt(z ? 1 : 0);
            if (!z2) {
                i2 = 0;
            }
            obtain.writeInt(i2);
            obtain.writeString(str);
            obtain.writeString(str2);
            obtain.writeInt(i);
            this.a.transact(305, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void a(boolean z) {
        int i = 0;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            if (z) {
                i = 1;
            }
            obtain.writeInt(i);
            this.a.transact(15, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public boolean a() {
        boolean z = false;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            this.a.transact(16, obtain, obtain2, 0);
            obtain2.readException();
            if (obtain2.readInt() != 0) {
                z = true;
            }
            obtain2.recycle();
            obtain.recycle();
            return z;
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public IBinder asBinder() {
        return this.a;
    }

    public Bundle b(String str, String str2) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            obtain.writeString(str);
            obtain.writeString(str2);
            this.a.transact(17, obtain, obtain2, 0);
            obtain2.readException();
            Bundle bundle = obtain2.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(obtain2) : null;
            obtain2.recycle();
            obtain.recycle();
            return bundle;
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public gws b(hvb hvb, long j, boolean z) {
        int i = 0;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            obtain.writeStrongBinder(hvb != null ? hvb.asBinder() : null);
            obtain.writeLong(j);
            if (z) {
                i = 1;
            }
            obtain.writeInt(i);
            this.a.transact(HttpStatusCodes.STATUS_CODE_SERVICE_UNAVAILABLE, obtain, obtain2, 0);
            obtain2.readException();
            gws a = gwt.a(obtain2.readStrongBinder());
            return a;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public gws b(hvb hvb, String str) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            obtain.writeStrongBinder(hvb != null ? hvb.asBinder() : null);
            obtain.writeString(str);
            this.a.transact(504, obtain, obtain2, 0);
            obtain2.readException();
            gws a = gwt.a(obtain2.readStrongBinder());
            return a;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public gws b(hvb hvb, String str, int i, int i2) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            obtain.writeStrongBinder(hvb != null ? hvb.asBinder() : null);
            obtain.writeString(str);
            obtain.writeInt(i);
            obtain.writeInt(i2);
            this.a.transact(HttpStatusCodes.STATUS_CODE_BAD_GATEWAY, obtain, obtain2, 0);
            obtain2.readException();
            gws a = gwt.a(obtain2.readStrongBinder());
            return a;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public gws b(hvb hvb, String str, String str2, int i, int i2) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            obtain.writeStrongBinder(hvb != null ? hvb.asBinder() : null);
            obtain.writeString(str);
            obtain.writeString(str2);
            obtain.writeInt(i);
            obtain.writeInt(i2);
            this.a.transact(505, obtain, obtain2, 0);
            obtain2.readException();
            gws a = gwt.a(obtain2.readStrongBinder());
            return a;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public gws b(hvb hvb, String str, String str2, Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            obtain.writeStrongBinder(hvb != null ? hvb.asBinder() : null);
            obtain.writeString(str);
            obtain.writeString(str2);
            if (bundle != null) {
                obtain.writeInt(1);
                bundle.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.a.transact(1201, obtain, obtain2, 0);
            obtain2.readException();
            gws a = gwt.a(obtain2.readStrongBinder());
            return a;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void b(hvb hvb, Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            obtain.writeStrongBinder(hvb != null ? hvb.asBinder() : null);
            if (bundle != null) {
                obtain.writeInt(1);
                bundle.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.a.transact(HttpStatusCodes.STATUS_CODE_NOT_MODIFIED, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void b(hvb hvb, String str, String str2) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            obtain.writeStrongBinder(hvb != null ? hvb.asBinder() : null);
            obtain.writeString(str);
            obtain.writeString(str2);
            this.a.transact(101, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void b(hvb hvb, String str, String str2, int i) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            obtain.writeStrongBinder(hvb != null ? hvb.asBinder() : null);
            obtain.writeString(str);
            obtain.writeString(str2);
            obtain.writeInt(i);
            this.a.transact(HttpStatusCodes.STATUS_CODE_MOVED_PERMANENTLY, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void b(hvb hvb, String str, String str2, String str3, int i, String str4) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            obtain.writeStrongBinder(hvb != null ? hvb.asBinder() : null);
            obtain.writeString(str);
            obtain.writeString(str2);
            obtain.writeString(str3);
            obtain.writeInt(i);
            obtain.writeString(str4);
            this.a.transact(22, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void b(hvb hvb, String str, String str2, String str3, boolean z) {
        int i = 0;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            obtain.writeStrongBinder(hvb != null ? hvb.asBinder() : null);
            obtain.writeString(str);
            obtain.writeString(str2);
            obtain.writeString(str3);
            if (z) {
                i = 1;
            }
            obtain.writeInt(i);
            this.a.transact(603, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public gws c(hvb hvb, String str, String str2, int i) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            obtain.writeStrongBinder(hvb != null ? hvb.asBinder() : null);
            obtain.writeString(str);
            obtain.writeString(str2);
            obtain.writeInt(i);
            this.a.transact(506, obtain, obtain2, 0);
            obtain2.readException();
            gws a = gwt.a(obtain2.readStrongBinder());
            return a;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void c(hvb hvb, String str, String str2) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            obtain.writeStrongBinder(hvb != null ? hvb.asBinder() : null);
            obtain.writeString(str);
            obtain.writeString(str2);
            this.a.transact(102, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void d(hvb hvb, String str, String str2) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            obtain.writeStrongBinder(hvb != null ? hvb.asBinder() : null);
            obtain.writeString(str);
            obtain.writeString(str2);
            this.a.transact(1101, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
