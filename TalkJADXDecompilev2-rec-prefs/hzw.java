package p000;

import android.os.IInterface;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.wearable.internal.AddLocalCapabilityResponse;
import com.google.android.gms.wearable.internal.ChannelReceiveFileResponse;
import com.google.android.gms.wearable.internal.ChannelSendFileResponse;
import com.google.android.gms.wearable.internal.CloseChannelResponse;
import com.google.android.gms.wearable.internal.DeleteDataItemsResponse;
import com.google.android.gms.wearable.internal.GetAllCapabilitiesResponse;
import com.google.android.gms.wearable.internal.GetCapabilityResponse;
import com.google.android.gms.wearable.internal.GetChannelInputStreamResponse;
import com.google.android.gms.wearable.internal.GetChannelOutputStreamResponse;
import com.google.android.gms.wearable.internal.GetCloudSyncOptInOutDoneResponse;
import com.google.android.gms.wearable.internal.GetCloudSyncOptInStatusResponse;
import com.google.android.gms.wearable.internal.GetCloudSyncSettingResponse;
import com.google.android.gms.wearable.internal.GetConfigResponse;
import com.google.android.gms.wearable.internal.GetConfigsResponse;
import com.google.android.gms.wearable.internal.GetConnectedNodesResponse;
import com.google.android.gms.wearable.internal.GetDataItemResponse;
import com.google.android.gms.wearable.internal.GetFdForAssetResponse;
import com.google.android.gms.wearable.internal.GetLocalNodeResponse;
import com.google.android.gms.wearable.internal.OpenChannelResponse;
import com.google.android.gms.wearable.internal.PutDataResponse;
import com.google.android.gms.wearable.internal.RemoveLocalCapabilityResponse;
import com.google.android.gms.wearable.internal.SendMessageResponse;
import com.google.android.gms.wearable.internal.StorageInfoResponse;

public interface hzw extends IInterface {
    void mo3056a(Status status);

    void mo3057a(DataHolder dataHolder);

    void mo3058a(AddLocalCapabilityResponse addLocalCapabilityResponse);

    void mo3059a(ChannelReceiveFileResponse channelReceiveFileResponse);

    void mo3060a(ChannelSendFileResponse channelSendFileResponse);

    void mo3061a(CloseChannelResponse closeChannelResponse);

    void mo3062a(DeleteDataItemsResponse deleteDataItemsResponse);

    void mo3063a(GetAllCapabilitiesResponse getAllCapabilitiesResponse);

    void mo3064a(GetCapabilityResponse getCapabilityResponse);

    void mo3065a(GetChannelInputStreamResponse getChannelInputStreamResponse);

    void mo3066a(GetChannelOutputStreamResponse getChannelOutputStreamResponse);

    void mo3067a(GetCloudSyncOptInOutDoneResponse getCloudSyncOptInOutDoneResponse);

    void mo3068a(GetCloudSyncOptInStatusResponse getCloudSyncOptInStatusResponse);

    void mo3069a(GetCloudSyncSettingResponse getCloudSyncSettingResponse);

    void mo3070a(GetConfigResponse getConfigResponse);

    void mo3071a(GetConfigsResponse getConfigsResponse);

    void mo3072a(GetConnectedNodesResponse getConnectedNodesResponse);

    void mo3073a(GetDataItemResponse getDataItemResponse);

    void mo3074a(GetFdForAssetResponse getFdForAssetResponse);

    void mo3075a(GetLocalNodeResponse getLocalNodeResponse);

    void mo3076a(OpenChannelResponse openChannelResponse);

    void mo3077a(PutDataResponse putDataResponse);

    void mo3078a(RemoveLocalCapabilityResponse removeLocalCapabilityResponse);

    void mo3079a(SendMessageResponse sendMessageResponse);

    void mo3080a(StorageInfoResponse storageInfoResponse);

    void mo3081b(CloseChannelResponse closeChannelResponse);
}
