package awais.instagrabber.repositories.responses.stories

import awais.instagrabber.models.enums.MediaItemType
import awais.instagrabber.utils.TextUtils
import awais.instagrabber.repositories.responses.ImageVersions2
import awais.instagrabber.repositories.responses.User
import awais.instagrabber.repositories.responses.VideoVersion
import java.io.Serializable
import java.util.*

data class StoryMedia(
        // inherited from Media
        val pk: String? = null,
        val id: String? = null,
        val takenAt: Long = -1,
        val user: User? = null,
        val canReshare: Boolean = false,
        val imageVersions2: ImageVersions2? = null,
        val originalWidth: Int = 0,
        val originalHeight: Int = 0,
        val mediaType: MediaItemType? = null,
        val isReelMedia: Boolean = false,
        val videoVersions: List<VideoVersion>? = null,
        val hasAudio: Boolean = false,
        val videoDuration: Double = 0.0,
        val viewCount: Long = 0,
        val title: String? = null,
        // story-specific
        val canReply: Boolean = false,
        val linkText: String? = null, // required for story_cta
        // stickers
        val reelMentions: List<StorySticker>? = null,
        val storyHashtags: List<StorySticker>? = null,
        val storyLocations: List<StorySticker>? = null,
        val storyFeedMedia: List<StorySticker>? = null,
        val storyPolls: List<StorySticker>? = null,
        val storyQuestions: List<StorySticker>? = null,
        val storyQuizs: List<StorySticker>? = null,
        val storyCta: List<StorySticker>? = null,
        val storySliders: List<StorySticker>? = null,
        // spotify/soundcloud button, not a sticker
        val storyAppAttribution: StoryAppAttribution? = null
) : Serializable {
    private var dateString: String? = null

    // TODO use extension once all usages are converted to kotlin
    // val date: String by lazy {
    //     if (takenAt <= 0) "" else Utils.datetimeParser.format(Date(takenAt * 1000L))
    // }
    val date: String
        get() {
            if (takenAt <= 0) return ""
            if (dateString != null) return dateString ?: ""
            dateString = TextUtils.epochSecondToString(takenAt)
            return dateString ?: ""
        }
}