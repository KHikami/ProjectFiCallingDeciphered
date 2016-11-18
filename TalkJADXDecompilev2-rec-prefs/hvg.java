package p000;

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
    private IBinder f17350a;

    hvg(IBinder iBinder) {
        this.f17350a = iBinder;
    }

    public Bundle mo2961a(Uri uri) {
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
            this.f17350a.transact(8, obtain, obtain2, 0);
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

    public Bundle mo2962a(hvb hvb, boolean z, String str, String str2, int i) {
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
            this.f17350a.transact(11, obtain, obtain2, 0);
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

    public Bundle mo2963a(String str, String str2) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            obtain.writeString(str);
            obtain.writeString(str2);
            this.f17350a.transact(12, obtain, obtain2, 0);
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

    public Bundle mo2964a(String str, String str2, long j) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            obtain.writeString(str);
            obtain.writeString(str2);
            obtain.writeLong(j);
            this.f17350a.transact(20, obtain, obtain2, 0);
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

    public Bundle mo2965a(String str, String str2, long j, boolean z) {
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
            this.f17350a.transact(26, obtain, obtain2, 0);
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

    public Bundle mo2966a(String str, String str2, long j, boolean z, boolean z2) {
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
            this.f17350a.transact(205, obtain, obtain2, 0);
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

    public gws mo2967a(hvb hvb, DataHolder dataHolder, int i, int i2, long j) {
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
            this.f17350a.transact(602, obtain, obtain2, 0);
            obtain2.readException();
            gws a = gwt.m18807a(obtain2.readStrongBinder());
            return a;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public gws mo2968a(hvb hvb, AccountToken accountToken, ParcelableListOptions parcelableListOptions) {
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
            this.f17350a.transact(601, obtain, obtain2, 0);
            obtain2.readException();
            gws a = gwt.m18807a(obtain2.readStrongBinder());
            return a;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public gws mo2969a(hvb hvb, AvatarReference avatarReference, ParcelableLoadImageOptions parcelableLoadImageOptions) {
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
            this.f17350a.transact(508, obtain, obtain2, 0);
            obtain2.readException();
            gws a = gwt.m18807a(obtain2.readStrongBinder());
            return a;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public gws mo2970a(hvb hvb, String str, int i) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            obtain.writeStrongBinder(hvb != null ? hvb.asBinder() : null);
            obtain.writeString(str);
            obtain.writeInt(i);
            this.f17350a.transact(509, obtain, obtain2, 0);
            obtain2.readException();
            gws a = gwt.m18807a(obtain2.readStrongBinder());
            return a;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public gws mo2971a(hvb hvb, String str, ParcelableLoadAutocompleteResultsOptions parcelableLoadAutocompleteResultsOptions) {
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
            this.f17350a.transact(1301, obtain, obtain2, 0);
            obtain2.readException();
            gws a = gwt.m18807a(obtain2.readStrongBinder());
            return a;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public gws mo2972a(hvb hvb, String str, ParcelableLoadContactGroupFieldsOptions parcelableLoadContactGroupFieldsOptions) {
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
            this.f17350a.transact(1302, obtain, obtain2, 0);
            obtain2.readException();
            gws a = gwt.m18807a(obtain2.readStrongBinder());
            return a;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public gws mo2973a(hvb hvb, String str, String str2, boolean z, String str3, String str4, int i, int i2, int i3, boolean z2) {
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
            this.f17350a.transact(507, obtain, obtain2, 0);
            obtain2.readException();
            gws a = gwt.m18807a(obtain2.readStrongBinder());
            return a;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void mo2974a(hvb hvb, long j, boolean z) {
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
            this.f17350a.transact(6, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void mo2975a(hvb hvb, Bundle bundle) {
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
            this.f17350a.transact(HttpStatusCodes.STATUS_CODE_FOUND, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void mo2976a(hvb hvb, AccountToken accountToken, List<String> list, ParcelableGetOptions parcelableGetOptions) {
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
            this.f17350a.transact(501, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void mo2977a(hvb hvb, String str) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            obtain.writeStrongBinder(hvb != null ? hvb.asBinder() : null);
            obtain.writeString(str);
            this.f17350a.transact(24, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void mo2978a(hvb hvb, String str, int i, int i2) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            obtain.writeStrongBinder(hvb != null ? hvb.asBinder() : null);
            obtain.writeString(str);
            obtain.writeInt(i);
            obtain.writeInt(i2);
            this.f17350a.transact(5, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void mo2979a(hvb hvb, String str, String str2) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            obtain.writeStrongBinder(hvb != null ? hvb.asBinder() : null);
            obtain.writeString(str);
            obtain.writeString(str2);
            this.f17350a.transact(25, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void mo2980a(hvb hvb, String str, String str2, int i) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            obtain.writeStrongBinder(hvb != null ? hvb.asBinder() : null);
            obtain.writeString(str);
            obtain.writeString(str2);
            obtain.writeInt(i);
            this.f17350a.transact(HttpStatusCodes.STATUS_CODE_FORBIDDEN, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void mo2981a(hvb hvb, String str, String str2, int i, int i2) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            obtain.writeStrongBinder(hvb != null ? hvb.asBinder() : null);
            obtain.writeString(str);
            obtain.writeString(str2);
            obtain.writeInt(i);
            obtain.writeInt(i2);
            this.f17350a.transact(29, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void mo2982a(hvb hvb, String str, String str2, Uri uri) {
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
            this.f17350a.transact(13, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void mo2983a(hvb hvb, String str, String str2, Uri uri, boolean z) {
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
            this.f17350a.transact(18, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void mo2984a(hvb hvb, String str, String str2, Bundle bundle) {
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
            this.f17350a.transact(1102, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void mo2985a(hvb hvb, String str, String str2, String str3) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            obtain.writeStrongBinder(hvb != null ? hvb.asBinder() : null);
            obtain.writeString(str);
            obtain.writeString(str2);
            obtain.writeString(str3);
            this.f17350a.transact(HttpStatusCodes.STATUS_CODE_NO_CONTENT, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void mo2986a(hvb hvb, String str, String str2, String str3, int i, String str4) {
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
            this.f17350a.transact(3, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void mo2987a(hvb hvb, String str, String str2, String str3, int i, String str4, boolean z) {
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
            this.f17350a.transact(19, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void mo2988a(hvb hvb, String str, String str2, String str3, int i, boolean z, int i2, int i3, String str4) {
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
            this.f17350a.transact(202, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void mo2989a(hvb hvb, String str, String str2, String str3, int i, boolean z, int i2, int i3, String str4, boolean z2) {
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
            this.f17350a.transact(203, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void mo2990a(hvb hvb, String str, String str2, String str3, int i, boolean z, int i2, int i3, String str4, boolean z2, int i4, int i5) {
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
            this.f17350a.transact(402, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void mo2991a(hvb hvb, String str, String str2, String str3, String str4) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            obtain.writeStrongBinder(hvb != null ? hvb.asBinder() : null);
            obtain.writeString(str);
            obtain.writeString(str2);
            obtain.writeString(str3);
            obtain.writeString(str4);
            this.f17350a.transact(27, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void mo2992a(hvb hvb, String str, String str2, String str3, String str4, int i, String str5) {
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
            this.f17350a.transact(HttpStatusCodes.STATUS_CODE_SEE_OTHER, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void mo2993a(hvb hvb, String str, String str2, String str3, String str4, boolean z) {
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
            this.f17350a.transact(701, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void mo2994a(hvb hvb, String str, String str2, String str3, List<String> list) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            obtain.writeStrongBinder(hvb != null ? hvb.asBinder() : null);
            obtain.writeString(str);
            obtain.writeString(str2);
            obtain.writeString(str3);
            obtain.writeStringList(list);
            this.f17350a.transact(28, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void mo2995a(hvb hvb, String str, String str2, String str3, List<String> list, int i, boolean z, long j) {
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
            this.f17350a.transact(4, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void mo2996a(hvb hvb, String str, String str2, String str3, List<String> list, int i, boolean z, long j, String str4, int i2) {
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
            this.f17350a.transact(21, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void mo2997a(hvb hvb, String str, String str2, String str3, List<String> list, int i, boolean z, long j, String str4, int i2, int i3) {
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
            this.f17350a.transact(HttpStatusCodes.STATUS_CODE_UNAUTHORIZED, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void mo2998a(hvb hvb, String str, String str2, String str3, List<String> list, int i, boolean z, long j, String str4, int i2, int i3, int i4) {
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
            this.f17350a.transact(HttpStatusCodes.STATUS_CODE_NOT_FOUND, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void mo2999a(hvb hvb, String str, String str2, String str3, List<String> list, List<String> list2) {
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
            this.f17350a.transact(14, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void mo3000a(hvb hvb, String str, String str2, String str3, List<String> list, List<String> list2, FavaDiagnosticsEntity favaDiagnosticsEntity) {
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
            this.f17350a.transact(23, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void mo3001a(hvb hvb, String str, String str2, String str3, boolean z) {
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
            this.f17350a.transact(7, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void mo3002a(hvb hvb, String str, String str2, String str3, boolean z, int i) {
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
            this.f17350a.transact(9, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void mo3003a(hvb hvb, String str, String str2, String str3, boolean z, int i, int i2) {
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
            this.f17350a.transact(201, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void mo3004a(hvb hvb, String str, boolean z, String[] strArr) {
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
            this.f17350a.transact(10, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void mo3005a(hvb hvb, boolean z, boolean z2, String str, String str2) {
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
            this.f17350a.transact(2, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void mo3006a(hvb hvb, boolean z, boolean z2, String str, String str2, int i) {
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
            this.f17350a.transact(305, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void mo3007a(boolean z) {
        int i = 0;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            if (z) {
                i = 1;
            }
            obtain.writeInt(i);
            this.f17350a.transact(15, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public boolean mo3008a() {
        boolean z = false;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            this.f17350a.transact(16, obtain, obtain2, 0);
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
        return this.f17350a;
    }

    public Bundle mo3009b(String str, String str2) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            obtain.writeString(str);
            obtain.writeString(str2);
            this.f17350a.transact(17, obtain, obtain2, 0);
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

    public gws mo3010b(hvb hvb, long j, boolean z) {
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
            this.f17350a.transact(HttpStatusCodes.STATUS_CODE_SERVICE_UNAVAILABLE, obtain, obtain2, 0);
            obtain2.readException();
            gws a = gwt.m18807a(obtain2.readStrongBinder());
            return a;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public gws mo3011b(hvb hvb, String str) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            obtain.writeStrongBinder(hvb != null ? hvb.asBinder() : null);
            obtain.writeString(str);
            this.f17350a.transact(504, obtain, obtain2, 0);
            obtain2.readException();
            gws a = gwt.m18807a(obtain2.readStrongBinder());
            return a;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public gws mo3012b(hvb hvb, String str, int i, int i2) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            obtain.writeStrongBinder(hvb != null ? hvb.asBinder() : null);
            obtain.writeString(str);
            obtain.writeInt(i);
            obtain.writeInt(i2);
            this.f17350a.transact(HttpStatusCodes.STATUS_CODE_BAD_GATEWAY, obtain, obtain2, 0);
            obtain2.readException();
            gws a = gwt.m18807a(obtain2.readStrongBinder());
            return a;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public gws mo3013b(hvb hvb, String str, String str2, int i, int i2) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            obtain.writeStrongBinder(hvb != null ? hvb.asBinder() : null);
            obtain.writeString(str);
            obtain.writeString(str2);
            obtain.writeInt(i);
            obtain.writeInt(i2);
            this.f17350a.transact(505, obtain, obtain2, 0);
            obtain2.readException();
            gws a = gwt.m18807a(obtain2.readStrongBinder());
            return a;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public gws mo3014b(hvb hvb, String str, String str2, Bundle bundle) {
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
            this.f17350a.transact(1201, obtain, obtain2, 0);
            obtain2.readException();
            gws a = gwt.m18807a(obtain2.readStrongBinder());
            return a;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void mo3015b(hvb hvb, Bundle bundle) {
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
            this.f17350a.transact(HttpStatusCodes.STATUS_CODE_NOT_MODIFIED, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void mo3016b(hvb hvb, String str, String str2) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            obtain.writeStrongBinder(hvb != null ? hvb.asBinder() : null);
            obtain.writeString(str);
            obtain.writeString(str2);
            this.f17350a.transact(101, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void mo3017b(hvb hvb, String str, String str2, int i) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            obtain.writeStrongBinder(hvb != null ? hvb.asBinder() : null);
            obtain.writeString(str);
            obtain.writeString(str2);
            obtain.writeInt(i);
            this.f17350a.transact(HttpStatusCodes.STATUS_CODE_MOVED_PERMANENTLY, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void mo3018b(hvb hvb, String str, String str2, String str3, int i, String str4) {
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
            this.f17350a.transact(22, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void mo3019b(hvb hvb, String str, String str2, String str3, boolean z) {
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
            this.f17350a.transact(603, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public gws mo3020c(hvb hvb, String str, String str2, int i) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            obtain.writeStrongBinder(hvb != null ? hvb.asBinder() : null);
            obtain.writeString(str);
            obtain.writeString(str2);
            obtain.writeInt(i);
            this.f17350a.transact(506, obtain, obtain2, 0);
            obtain2.readException();
            gws a = gwt.m18807a(obtain2.readStrongBinder());
            return a;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void mo3021c(hvb hvb, String str, String str2) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            obtain.writeStrongBinder(hvb != null ? hvb.asBinder() : null);
            obtain.writeString(str);
            obtain.writeString(str2);
            this.f17350a.transact(102, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public void mo3022d(hvb hvb, String str, String str2) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleService");
            obtain.writeStrongBinder(hvb != null ? hvb.asBinder() : null);
            obtain.writeString(str);
            obtain.writeString(str2);
            this.f17350a.transact(1101, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
