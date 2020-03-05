package social.model

data class Post (
    val id: Int,
    val ownerId: Int,
    val fromId: Int,
    val createdBy: Int,
    val text: String,
    val replyOwnerId: Int,
    val replyPostId: Int,
    val friendsOnly: Int,
    val postType: String,
    val singerId: Int,
    val canPin: Int,
    val canDelete: Int,
    val isPinned: Int,
    val markedAsAds: Int,
    val isFavorite: Boolean,
    val postponedId: Int
)
{

    class Comments (
        val count: Int,
        val canPost: Int,
        val groupsCanPost: Int,
        val canClose: Boolean,
        val canOpen: Boolean
    )
 { }

  class Likes (
    val count: Int,
    val userLikes: Int,
    val canLike: Int,
    val canPublish: Int
)
{}

    class Response(
        val count: Int,
        val userLikes: Int,
        val canLike: Int,
        val canPublish: Int
    )
    {}

    class Reports (
        val count: Int,
        val userReposted: Int
    )
    {}

    class Views (
        val count: Int
    )
    {}

    class Geo (
        val type: String,
        val coordinates: String
    )
    {
        companion object place
    }


}