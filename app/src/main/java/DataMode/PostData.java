package DataMode;

import io.objectbox.annotation.Entity;
import io.objectbox.annotation.Id;

@Entity
public class PostData {
 @Id(assignable = true)
 public long Id;
 public String postTitle;
 public String postContent;

 public long getId() {
  return Id;
 }

 public void setId(long id) {
  Id = id;
 }

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
}
