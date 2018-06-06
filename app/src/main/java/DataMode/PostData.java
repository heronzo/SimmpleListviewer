package DataMode;

import io.objectbox.annotation.Entity;

@Entity
public class PostData {
 public String postTitle;
 public String postContent;
 public String postDate;

 public String getPostContent() {
  return postContent;
 }

 public void setPostContent(String postContent) {
  this.postContent = postContent;
 }

 public String getPostTitle() {
  return postTitle;
 }

 public void setPostTitle(String postTitle) {
  this.postTitle = postTitle;
 }
 public String getPostDate(){return postDate;}
 public void setPostDate(String postDate){this.postDate=postDate;}
}
