package p000;

import android.net.Uri;
import android.os.Bundle;
import android.os.IInterface;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.server.FavaDiagnosticsEntity;
import com.google.android.gms.people.identity.internal.AccountToken;
import com.google.android.gms.people.identity.internal.ParcelableGetOptions;
import com.google.android.gms.people.identity.internal.ParcelableListOptions;
import com.google.android.gms.people.internal.ParcelableLoadImageOptions;
import com.google.android.gms.people.internal.autocomplete.ParcelableLoadAutocompleteResultsOptions;
import com.google.android.gms.people.internal.autocomplete.ParcelableLoadContactGroupFieldsOptions;
import com.google.android.gms.people.model.AvatarReference;
import java.util.List;

public interface hve extends IInterface {
    Bundle mo2961a(Uri uri);

    Bundle mo2962a(hvb hvb, boolean z, String str, String str2, int i);

    Bundle mo2963a(String str, String str2);

    Bundle mo2964a(String str, String str2, long j);

    Bundle mo2965a(String str, String str2, long j, boolean z);

    Bundle mo2966a(String str, String str2, long j, boolean z, boolean z2);

    gws mo2967a(hvb hvb, DataHolder dataHolder, int i, int i2, long j);

    gws mo2968a(hvb hvb, AccountToken accountToken, ParcelableListOptions parcelableListOptions);

    gws mo2969a(hvb hvb, AvatarReference avatarReference, ParcelableLoadImageOptions parcelableLoadImageOptions);

    gws mo2970a(hvb hvb, String str, int i);

    gws mo2971a(hvb hvb, String str, ParcelableLoadAutocompleteResultsOptions parcelableLoadAutocompleteResultsOptions);

    gws mo2972a(hvb hvb, String str, ParcelableLoadContactGroupFieldsOptions parcelableLoadContactGroupFieldsOptions);

    gws mo2973a(hvb hvb, String str, String str2, boolean z, String str3, String str4, int i, int i2, int i3, boolean z2);

    void mo2974a(hvb hvb, long j, boolean z);

    void mo2975a(hvb hvb, Bundle bundle);

    void mo2976a(hvb hvb, AccountToken accountToken, List<String> list, ParcelableGetOptions parcelableGetOptions);

    void mo2977a(hvb hvb, String str);

    void mo2978a(hvb hvb, String str, int i, int i2);

    void mo2979a(hvb hvb, String str, String str2);

    void mo2980a(hvb hvb, String str, String str2, int i);

    void mo2981a(hvb hvb, String str, String str2, int i, int i2);

    void mo2982a(hvb hvb, String str, String str2, Uri uri);

    void mo2983a(hvb hvb, String str, String str2, Uri uri, boolean z);

    void mo2984a(hvb hvb, String str, String str2, Bundle bundle);

    void mo2985a(hvb hvb, String str, String str2, String str3);

    void mo2986a(hvb hvb, String str, String str2, String str3, int i, String str4);

    void mo2987a(hvb hvb, String str, String str2, String str3, int i, String str4, boolean z);

    void mo2988a(hvb hvb, String str, String str2, String str3, int i, boolean z, int i2, int i3, String str4);

    void mo2989a(hvb hvb, String str, String str2, String str3, int i, boolean z, int i2, int i3, String str4, boolean z2);

    void mo2990a(hvb hvb, String str, String str2, String str3, int i, boolean z, int i2, int i3, String str4, boolean z2, int i4, int i5);

    void mo2991a(hvb hvb, String str, String str2, String str3, String str4);

    void mo2992a(hvb hvb, String str, String str2, String str3, String str4, int i, String str5);

    void mo2993a(hvb hvb, String str, String str2, String str3, String str4, boolean z);

    void mo2994a(hvb hvb, String str, String str2, String str3, List<String> list);

    void mo2995a(hvb hvb, String str, String str2, String str3, List<String> list, int i, boolean z, long j);

    void mo2996a(hvb hvb, String str, String str2, String str3, List<String> list, int i, boolean z, long j, String str4, int i2);

    void mo2997a(hvb hvb, String str, String str2, String str3, List<String> list, int i, boolean z, long j, String str4, int i2, int i3);

    void mo2998a(hvb hvb, String str, String str2, String str3, List<String> list, int i, boolean z, long j, String str4, int i2, int i3, int i4);

    void mo2999a(hvb hvb, String str, String str2, String str3, List<String> list, List<String> list2);

    void mo3000a(hvb hvb, String str, String str2, String str3, List<String> list, List<String> list2, FavaDiagnosticsEntity favaDiagnosticsEntity);

    void mo3001a(hvb hvb, String str, String str2, String str3, boolean z);

    void mo3002a(hvb hvb, String str, String str2, String str3, boolean z, int i);

    void mo3003a(hvb hvb, String str, String str2, String str3, boolean z, int i, int i2);

    void mo3004a(hvb hvb, String str, boolean z, String[] strArr);

    void mo3005a(hvb hvb, boolean z, boolean z2, String str, String str2);

    void mo3006a(hvb hvb, boolean z, boolean z2, String str, String str2, int i);

    void mo3007a(boolean z);

    boolean mo3008a();

    Bundle mo3009b(String str, String str2);

    gws mo3010b(hvb hvb, long j, boolean z);

    gws mo3011b(hvb hvb, String str);

    gws mo3012b(hvb hvb, String str, int i, int i2);

    gws mo3013b(hvb hvb, String str, String str2, int i, int i2);

    gws mo3014b(hvb hvb, String str, String str2, Bundle bundle);

    void mo3015b(hvb hvb, Bundle bundle);

    void mo3016b(hvb hvb, String str, String str2);

    void mo3017b(hvb hvb, String str, String str2, int i);

    void mo3018b(hvb hvb, String str, String str2, String str3, int i, String str4);

    void mo3019b(hvb hvb, String str, String str2, String str3, boolean z);

    gws mo3020c(hvb hvb, String str, String str2, int i);

    void mo3021c(hvb hvb, String str, String str2);

    void mo3022d(hvb hvb, String str, String str2);
}
