package awais.instagrabber.repositories.responses;

import androidx.annotation.NonNull;

import java.util.List;

import awais.instagrabber.models.Comment;

public class CommentsFetchResponse {
    private final int commentCount;
    private final String nextMinId;
    private final List<Comment> comments;

    public CommentsFetchResponse(final int commentCount,
                                 final String nextMinId,
                                 final List<Comment> comments) {
        this.commentCount = commentCount;
        this.nextMinId = nextMinId;
        this.comments = comments;
    }

    public int getCommentCount() {
        return commentCount;
    }

    public String getNextMinId() {
        return nextMinId;
    }

    public boolean hasNext() {
        return nextMinId != null;
    }

    public List<Comment> getComments() {
        return comments;
    }

    @NonNull
    @Override
    public String toString() {
        return "CommentsFetchResponse{" +
                "commentCount=" + commentCount +
                ", nextMinId='" + nextMinId + '\'' +
                ", comments=" + comments +
                '}';
    }
}
