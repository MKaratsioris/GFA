package BlogPost;

import java.util.List;

public class Blog {

    List<BlogPost> blogPosts;

    public void add(BlogPost blogPost) {
        blogPosts.add(blogPost);
    }

    public void delete(int index) {
        blogPosts.remove(index);
    }

    public void update(int index, BlogPost blogPost) {
        blogPosts.remove(index);
        blogPosts.add(index, blogPost);
    }

}
