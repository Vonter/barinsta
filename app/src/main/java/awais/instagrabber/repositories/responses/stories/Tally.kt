package awais.instagrabber.repositories.responses.stories

import java.io.Serializable
import awais.instagrabber.repositories.responses.Hashtag
import awais.instagrabber.repositories.responses.Location
import awais.instagrabber.repositories.responses.User

data class Tally(
    val text: String?,
    val count: Int?
) : Serializable