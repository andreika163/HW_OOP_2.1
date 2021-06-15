package ru.netology.domain;

public class Post {
    private int id;
    private int ownerId;
    private int fromId;
    private int createdBy;
    private int date;
    private String text;
    private int replyOwnerId;
    private int replyPostId;
    private boolean friendsOnly;
    private int signerId;
    private boolean canPin;
    private boolean canDelete;
    private boolean canEdit;
    private boolean isPinned;
    private boolean markedAsAds;
    private boolean isFavorite;
    private int postponedId;


    private CommentInfo commentInfo;
    private CopyrightInfo copyrightInfo;
    private LikesInfo likesInfo;
    private RepostInfo repostInfo;
    private ViewsInfo viewsInfo;
    private PostTypeInfo postTypeInfo;
    private PostSourceInfo postSourceInfo;
    private GeoInfo geoInfo;
    private DonutInfo donutInfo;
}
