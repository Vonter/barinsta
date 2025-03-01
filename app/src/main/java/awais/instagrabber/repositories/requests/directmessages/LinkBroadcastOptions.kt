package awais.instagrabber.repositories.requests.directmessages

import awais.instagrabber.models.enums.BroadcastItemType
import org.json.JSONArray

class LinkBroadcastOptions(
    clientContext: String,
    threadIdOrUserIds: ThreadIdOrUserIds,
    val linkText: String,
    val urls: List<String>
) : BroadcastOptions(
    clientContext,
    threadIdOrUserIds,
    BroadcastItemType.LINK
) {
    override val formMap: Map<String, String>
        get() = mapOf(
            "link_text" to linkText,
            "link_urls" to JSONArray(urls).toString()
        )
}