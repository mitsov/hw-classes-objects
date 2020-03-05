package social

import social.model.Post

fun main (){

    val post = Post(id=1, ownerId=2, fromId=3, createdBy=4, text="text", replyOwnerId=5, replyPostId=6, friendsOnly=1, postType="post",
    singerId=7, canPin=1, canDelete=1, isPinned=1, markedAsAds=1, isFavorite=true, postponedId=8
    )
    println(post)
}